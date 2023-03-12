package JAVA;

class Account {
    Integer id;
    String name;
    String lastName;
    String email;
    String password;
    String document;

    public Account(String name, String document) {
        this.name = name;
        this.document = document;
    }
}
