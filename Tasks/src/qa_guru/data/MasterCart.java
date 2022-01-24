package qa_guru.data;

public class MasterCart extends Cart {

    public MasterCart(PaymentSystem paymentSystem) {
        super(PaymentSystem.MASTER_CARD);

    }

    @Override
    public void payInCountry(Country country, int sum) {

    }
}
