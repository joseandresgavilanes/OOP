package JAVA;

class PayPal extends Payment {
    String direction;

    public PayPal(Integer id, Integer amount, String direction) {
        super(id, amount);
        this.direction = direction;
    }

}
