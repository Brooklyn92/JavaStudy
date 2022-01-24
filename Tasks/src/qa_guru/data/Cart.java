package qa_guru.data;

public abstract class Cart {
    private String cardHolder;
    private int balance;
    private String cardNumber;
    private PaymentSystem paymentSystem;

    public Cart(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public PaymentSystem getPaymentSystem() {
        return paymentSystem;
    }

    public void setPaymentSystem(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public abstract void payInCountry(Country country, int sum);
}
