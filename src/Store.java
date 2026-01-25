public class Store {
    public String productType;
    public double price;
    int inventoryCount;
    double inventoryPrice;

    // constructor method
    public Store(String product, int count, double price) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }

    public void advertise() {
        System.out.println("Come spend some money!");
        System.out.println("Selling " + productType + "!");


    }

    public void greetCustomer (String customerName){
        System.out.println("Welcome to the store, " + customerName + "!");

    }

    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    public double getPriceWithTax() {
        double totalPrice = price + price * tax;
        return totalPrice;
    }

    public String toString(){
        return "This store sells " + productType + " at a price of " + price + ".";
    }
}