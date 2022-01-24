package qa_guru;

import qa_guru.data.Cart;
import qa_guru.data.MasterCart;
import qa_guru.data.VisaCart;

public class Main {
    public static void main(String[] args) {
        Cart visaCart = new VisaCart();
        visaCart.setBalance(100);
        System.out.println(visaCart.getPaymentSystem());
    }
}
