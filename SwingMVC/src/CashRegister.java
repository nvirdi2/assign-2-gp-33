public class CashRegister {
    private String productName;
    private double productPrice;

    public void scanProduct(int upcCode){


        // Check the UPC code
            if (upcCode == 12345) {
                // Set the product name and price when the UPC code is 12345
                productName = "Coffee";
                productPrice = 8.32;
            } else if (upcCode == 23456) {
                productName = "Cheese Cake";
                productPrice = 5.99;
            } else {
                // Handle other UPC codes if needed
                productName = "unknown Product";
                productPrice = 0.00;
            }
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }
}
