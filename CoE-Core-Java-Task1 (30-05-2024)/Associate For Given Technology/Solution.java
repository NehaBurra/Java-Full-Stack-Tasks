import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Associate[] associates = new Associate[5];
        for(int i=0; i<5; i++) {
            associates[i] = new Associate(Integer.parseInt(sc.nextLine()),sc.nextLine(),sc.nextLine() ,Integer.parseInt(sc.nextLine()));
        }
        String searchTechnology = sc.nextLine();
        Associate[] associates2 = associatesForGivenTechnology(associates, searchTechnology);
        System.out.println();
        for (Associate associate : associates2) {
            if(associate != null)
                System.out.println(associate.getId());
        }
    }
    public static Associate[] associatesForGivenTechnology(Associate[] associates, String searchTechnology){
        Associate[] associates2 = new Associate[associates.length];
        int i = 0;
        for (Associate associate : associates) {
            if(searchTechnology.equals(associate.getTechnology()) && associate.getExperienceInYears()%5==0) {
                associates2[i] = associate;
                i++;
            }
        }
        return associates2;
    }
}
/* 
101
Alex
Java
15
102
Albert
Unix
20
103
Alferd
Testing
13
104
Alfa
Java
15
105
Almas
Java
29
Java
*/