package JAVA;

class Main {
    public static void main(String[] args) {
        System.out.println("All ready");

        Car car = new Car("AMQ123", new Account("Michelle Jackson", "123456789"));
        car.passengers = 3;
        car.printDataCar();
    }
}
