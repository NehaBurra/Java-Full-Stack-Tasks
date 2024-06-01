package Device_Management;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone[] phones = new Phone[4];
        for (int i = 0; i < phones.length; i++) {
            phones[i] = new Phone(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
        }
        String brand = sc.nextLine();
        String os = sc.nextLine();
        
        System.out.println();
        int price = findPriceForGivenBrand(phones, brand);
        if (price > 0) {
            System.out.println(price);
        }
        else {
            System.out.println("The given Brand is not available");
        }
        Phone phone = getPhoneIdBasedOnOs(phones, os);
        if (phone != null) {
            System.out.println(phone.getPhoneId());
        }
        else {
            System.out.println("No phones are available with specified os and price range");
        }
    }

    public static int findPriceForGivenBrand(Phone[] phones, String brand) {
        int sum = 0;
        for (Phone phone : phones) {
            if(brand.equalsIgnoreCase(phone.getBrand())) {
                sum += phone.getPrice();
            }
        }
        return sum;
    }

    public static Phone getPhoneIdBasedOnOs(Phone[] phones, String os) {
        for (Phone phone : phones) {
            if(os.equalsIgnoreCase(phone.getOs()) && phone.getPrice() >= 5000) {
                return phone;
            }
        }
        return null;
    }
}


/*
111
iOS
Apple
30000
222
android
Samsung
50000
333
Symbian
HTC
12000
444
Paranoid
HTC
89000
Blackberry
aNdRoid
 */