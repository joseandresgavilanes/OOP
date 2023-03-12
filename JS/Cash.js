class Cash extends Payment{
    constructor(id, amount, currency){
        super(id, amount)
        this.currency = currency
    }
}