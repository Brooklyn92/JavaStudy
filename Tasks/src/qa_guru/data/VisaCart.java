package qa_guru.data;

public class VisaCart extends Cart {

    public VisaCart() {
        super(PaymentSystem.VISA);
    }

    @Override
    public void payInCountry(Country country, int sum) {

    }
}
