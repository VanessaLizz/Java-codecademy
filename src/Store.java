public class Store {
    public String productType;
    int inventoryCount;
    double inventoryPrice;

    // constructor method
    public Store(String product, int count, double price) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }

    public void advertise(){
        System.out.println("Come spend some money!");
        System.out.println("Selling " + productType + "!");

}
