public class PaymentService {

    public PaymentResult processPayment(Customer customer) {

        System.out.println("Processing payment for customer");

        String customerName = customer.getName();

if (customerName == null) {
    return new PaymentResult(false, "Customer name missing");
}

customerName = customerName.trim();

        if (customerName == null) {
            return new PaymentResult(false, "Customer name missing");
        }

        return new PaymentResult(true, "Payment processed");
    }
}