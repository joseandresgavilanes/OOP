class PayPal extends Payment{
    constructor(id, amount, direction){
        super(id, amount);
        this.direction = direction;
    }
}