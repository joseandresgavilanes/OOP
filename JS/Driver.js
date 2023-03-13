class Driver extends Account{

    constructor(name, document){
        super(name, document);
    }

    getDriverData(){
        console.log("Your driver is: " + this.name + "and his id is " + this.document);
    }


}