package day28_encapsulation;

public class Candy {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;
    private String Stringprice;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<1){
            System.err.println("Quantity can not be less than zero or negative");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public String getPrice() {
        if (price>0){
            Stringprice = String.valueOf(price);
        }else {
            Stringprice = "Free";
        }
        return Stringprice;
    }

    public void setPrice(double price) {
        if (price<0){
            System.err.println("Price can not be less than zero");
            System.exit(1);
        }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }





    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setPrice(price);
        setQuantity(quantity);
        setHasPeanuts(hasPeanuts);
    }


    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
/*
5. Create a custom class named Candy
        private variables:
            brand (String), quantity (int), price (double), hasPeanuts (boolean)

        Encapsulate All the private fields
                (price of candy can not be set to negative)
                (quantity of candy can not be set to zero or negative)

        Add a constructor that allows user to set all the fields when the object is created.
                (If the arguments not valid it should not be set to the instances)

        Extra methods:
            toString():
                if the price is zero, print "free" instead of 0

        5.1 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy

 */
