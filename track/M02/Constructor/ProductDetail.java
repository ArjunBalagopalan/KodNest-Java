
import java.util.Scanner;

class Product {

    String name;
    double price;

    // Parameterized constructor
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
    }
}

public class ProductDetail {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read product name and price
        String name = scanner.nextLine();
        double price = scanner.nextDouble();

        // Create Product object
        Product p1 = new Product(name, price);

        // Display product details
        p1.display();
    }
}
