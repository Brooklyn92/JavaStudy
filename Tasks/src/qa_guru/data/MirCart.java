package qa_guru.data;

public class MirCart extends  Cart {


    public MirCart() { // в параметрах констуктора PaymentSystem paymentSystem можно убрать, т.к. используется ключевое слово super
        super(PaymentSystem.MIR);
    }

    @Override
    public void payInCountry(Country country, int sum) {

    }
}
