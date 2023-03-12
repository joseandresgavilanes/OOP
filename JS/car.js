class Car {
  constructor(license, driver) {
    this.id;
    this.license = license;
    this.driver = driver;
    this.passengers;
  }


  printDataCar(){
    console.log(this.license + " " + this.driver + " " + this.driver.name + " " + this.driver.document);
  }
}

