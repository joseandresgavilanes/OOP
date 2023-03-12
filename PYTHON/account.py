class Account:
    id = int
    name = str
    last_name = str
    email = str
    password = str
    document = str
    
    def __init__(self, name, document):
        self.name = name
        self.document = document