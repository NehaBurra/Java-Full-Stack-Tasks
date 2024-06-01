package AutonomousCar;
/*
Create a class AutonomousCar with the below attributes:
carld – int
brand – String
noOfTestsConducted – int
noOfTestsPassed- int
environment – String
grade – String
 */

 public class AutonomousCar {
    private int carId;
    private String brand;
    private int noOfTestsConducted;
    private int noOfTestsPassed;
    private String environment;
    private String grade;

    public String getEnvironment() {
        return environment;
    }
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public AutonomousCar(int carId, String brand, int noOfTestsConducted, int noOfTestsPassed, String environment,
            String grade) {
        this.carId = carId;
        this.brand = brand;
        this.noOfTestsConducted = noOfTestsConducted;
        this.noOfTestsPassed = noOfTestsPassed;
        this.environment = environment;
        this.grade = grade;
    }
    public int getCarId() {
        return carId;
    }
    public String getBrand() {
        return brand;
    }
    public int getNoOfTestsConducted() {
        return noOfTestsConducted;
    }
    public int getNoOfTestsPassed() {
        return noOfTestsPassed;
    }
    public String getGrade() {
        return grade;
    }
    public void setCarId(int carId) {
        this.carId = carId;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setNoOfTestsConducted(int noOfTestsConducted) {
        this.noOfTestsConducted = noOfTestsConducted;
    }
    public void setNoOfTestsPassed(int noOfTestsPassed) {
        this.noOfTestsPassed = noOfTestsPassed;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

 }