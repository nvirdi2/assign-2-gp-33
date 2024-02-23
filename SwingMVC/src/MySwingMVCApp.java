import javax.swing.*;

public class MySwingMVCApp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Assemble all the pieces of the MVC
        Model m = new Model("Sylvain", "Saurel");
        View v = new View("MVC with SSaurel");
        Controller c = new Controller(m, v);

        // create scanner
        Scanner scanner = new Scanner();
        c.initController();
        CashRegister cashRegister = new CashRegister();


        scanner.getScanButton().addActionListener(e -> {
            // Prompt the user to enter the UPC code
            String upcCodeInput = JOptionPane.showInputDialog("Enter UPC code:");
            try {
                int upcCode = Integer.parseInt(upcCodeInput);
                cashRegister.scanProduct(upcCode);
                System.out.println("Product: " + cashRegister.getProductName());
                System.out.println("Price: " + cashRegister.getProductPrice());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid UPC code. Please enter a number.");
            }
        });
    }
}
