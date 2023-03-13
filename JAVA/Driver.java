package JAVA;

class Driver extends Account {
    public Driver(String name, String document) {
        super(name, document);
    }

    void printDriverData() {
        System.out.println("Your driver's name is: " + name + " and  document is: " + document);
    }

}
