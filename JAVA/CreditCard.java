package JAVA;

class CreditCard extends Payment {
    Integer cvc;
    String date;
    String bank;

    public CreditCard(Integer id, Integer amount, Integer cvc, String date, String bank) {
        super(id, amount);
        this.cvc = cvc;
        this.date = date;
        this.bank = bank;
    }

}
