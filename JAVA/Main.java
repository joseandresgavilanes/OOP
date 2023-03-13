package JAVA;

class Main {
    public static void main(String[] args) {
        System.out.println("All ready");

        UberX uberX = new UberX("AMQ123", new Account("Michelle Jackson", "123456789"), "Toyota", "TXT");
        uberX.setPassengers(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("FGH123", new Account("Hugo Sanz", "123456789"));
        uberVan.setPassengers(6);
        uberVan.printDataCar();

    }
}
