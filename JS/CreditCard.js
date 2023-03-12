class CreditCard extends Payment{
    constructor(id, amount, bank, cvv, date){
        super(id, amount)
        this.bank = bank
        this.cvv = cvv
        this.date = date
    }
}