package qa_guru.data;

public class UnionCart extends Cart {

    public UnionCart() {
        super(PaymentSystem.UNION_PAY);
    }

    @Override
    public void payInCountry(Country country, int sum) {

    }
}
