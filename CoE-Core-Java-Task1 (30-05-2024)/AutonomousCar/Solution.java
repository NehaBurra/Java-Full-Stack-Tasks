package AutonomousCar;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AutonomousCar[] autonomousCars = new AutonomousCar[4];
        for(int i=0;i<autonomousCars.length;i++) {
            autonomousCars[i] = new AutonomousCar(
                Integer.parseInt(sc.nextLine()),
                sc.nextLine(), 
                Integer.parseInt(sc.nextLine()),
                Integer.parseInt(sc.nextLine()),
                sc.nextLine(),
                null
            );
        }
        System.out.println();
        int testPassedByEnv = findTestPassedByEnv(autonomousCars, sc.nextLine());
        if (testPassedByEnv > 0) {
            System.out.println(testPassedByEnv);
        }
        else {
            System.out.println("There are no tests passed in this particular environment");
        }
        AutonomousCar autonomousCar = updateCarGrade(sc.nextLine(), autonomousCars);
        if(autonomousCar != null) {
            System.out.println(autonomousCar.getBrand()+"::"+autonomousCar.getGrade());
        }
        else {
            System.out.println("No Car is available with the specified brand");
        }
    }    

    public static int findTestPassedByEnv(AutonomousCar[] autonomousCars, String environment) {
        int sum = 0;
        for (AutonomousCar autonomousCar : autonomousCars) {
            if (environment.equals(autonomousCar.getEnvironment())) {
                sum += autonomousCar.getNoOfTestsPassed();
            }
        }
        return sum;
    }

    public static AutonomousCar updateCarGrade(String brand,AutonomousCar[] autonomousCars) {
        for (AutonomousCar autonomousCar : autonomousCars) {
            if(brand.equals(autonomousCar.getBrand())) {
                autonomousCar.setGrade(calculateGrade(autonomousCar));
                return autonomousCar;
            }
        }
        return null;
    }

    public static String calculateGrade(AutonomousCar autonomousCar) {
        double rating = ( autonomousCar.getNoOfTestsPassed() * 100) / autonomousCar.getNoOfTestsConducted();
        if(rating >= 80) {
            return "A1";
        }
        else {
            return "B2";
        }
    }
}

/*
Input:


100
Tesla
1000
500
Hills
200
Ford
2000
1500
Desert
300
Royce
3000
1700
Hills
400
Mercedez
1000
400
Desert
Desert
Mercedez

 */
