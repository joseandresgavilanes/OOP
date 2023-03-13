class User extends Account{
    
    constructor(name, document){
        super(name, document);
    }

    getUserData(){
        console.log("The user is: " + this.name + "and his/her document is: " + this.document);
    }

}