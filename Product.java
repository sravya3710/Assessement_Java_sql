package Assessment;

import java.util.*;

class Product implements Comparable<Product> {
	private int productId;
	private String productName;
	private String productType;
	private String productCategory;
	private double productPrice;

	public Product(int productId, String productName, String productType, String productCategory, double productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
	}

	@Override
	public int compareTo(Product other) {
		return Double.compare(this.productPrice, other.productPrice);
	}

	@Override
	public String toString() {
		return String.format("ID: %d, Name: %s, Type: %s, Category: %s, Price: %.2f", productId, productName,
				productType, productCategory, productPrice);
	}
}

public class ProductSortDemo {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Product> productsByCategory = new TreeSet<>(Comparator.comparing(Product::getProductCategory));
        Set<Product> productsByPrice = new TreeSet<>();

        while (true) {
            System.out.println("Enter the product details:");
            System.out.print("Enter product id: ");
            int productId = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter product name: ");
            String productName = scanner.nextLine();

            System.out.print("Enter product type: ");
            String productType = scanner.nextLine();

            System.out.print("Enter product category: ");
            String productCategory = scanner.nextLine();

            System.out.print("Enter product price: ");
            double productPrice = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            Product product = new Product(productId, productName, productType, productCategory, productPrice);
            productsByCategory.add(product);
            productsByPrice.add(product);

            System.out.print("Do you want to enter more products? (yes/no): ");
            String continueInput = scanner.nextLine();
            if (!continueInput.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("\nSorted Products by Category:");
        productsByCategory.forEach(System.out::println);

        System.out.println("\nSorted Products by Price:");
        productsByPrice.forEach(System.out::println);
    }
}
