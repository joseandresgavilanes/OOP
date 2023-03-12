from payment import Payment

class PayPal(Payment):
    direction = str
    
    def __init__(self, id, amount, direction):
        super().__init__(id, amount)
        self.direction = direction