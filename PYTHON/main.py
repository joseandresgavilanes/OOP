from car import car
from account import Account

if __name__ == "__main__":
    print("all ready")
    
    
    car = car("AMS234", Account("Andrew Garfield", "AND876"))
    print(vars(car))
    print(vars(car.driver))
