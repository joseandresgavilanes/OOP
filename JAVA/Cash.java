package JAVA;

class Cash extends Payment {
    String currency;

    public Cash(Integer id, Integer amount, String currency) {
        super(id, amount);
        this.currency = currency;
    }
}
