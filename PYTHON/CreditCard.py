from payment import Payment

class CreditCard(Payment):
    cvv = int
    date = str
    bank = str
    
    def __init__(self, id, amount, cvv, date, bank):
        super.__init__(id, amount)
        self.cvv = cvv
        self.date = date
        self.bank = bank
        