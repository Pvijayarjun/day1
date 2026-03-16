package studentpackage;

public class Laptop {
	String brand;
    int price;

    Laptop(String brand, int price) {

        // this keyword refers to current object
        this.brand = brand;
        this.price = price;
    }

    void show() {
        System.out.println(brand + " " + price);
    }

    public static void main(String[] args) {

        Laptop l = new Laptop("HP", 60000);

        l.show();
    }
}
