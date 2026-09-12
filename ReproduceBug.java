public class ReproduceBug {

    public static void main(String[] args) {

        Customer customer = new Customer(null);

        System.out.println("Customer name: " + customer.getName());

        String customerName = customer.getName().trim();

        System.out.println("Trimmed name: " + customerName);
    }
}