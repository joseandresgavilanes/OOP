from payment import Payment

class Cash(Payment):
    currency = str
    
    def __init__(self, id, amount, currency=None):
        super().__init__(id, amount)
        self.currency = currency