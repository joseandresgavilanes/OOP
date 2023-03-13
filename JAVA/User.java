package JAVA;

class User extends Account {

    public User(String name, String document) {
        super(name, document);
    }

    void printUserData() {
        System.out.println("User: " + name + "Document: " + document);
    }

}
