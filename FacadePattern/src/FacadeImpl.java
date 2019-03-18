public class FacadeImpl {

    private Product product;

    public FacadeImpl(Product product){
        this.product = product;
    }

    // This method has many objects which when combined together would successfully place an order
    // One object does not need to know about the other in this pattern

    public boolean placeOrder(){
        InventoryService inventoryService = new InventoryService();
        if (inventoryService.isAvailable(product)){
            PaymentService paymentService = new PaymentService();
            if (paymentService.hasPaid()){
                OrderService orderService = new OrderService();
                if (orderService.isOrderPlaced(product)){
                    System.out.println("Congrats! Order has been placed successfully!");
                    return true;
                }
            }
        }

        return false;
    }
}
