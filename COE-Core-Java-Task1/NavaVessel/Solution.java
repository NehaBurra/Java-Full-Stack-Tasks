package Vessel;
import java.util.*;
public class Solution {
	public static double findAvgVoyagesByPct(NavalVessel[] vessels, int percentage) {
        int count = 0;
        int totalCompleted = 0;
        for (NavalVessel vessel : vessels) {
            double pct = (double) (vessel.getNoOfVoyagesCompleted() * 100) / vessel.getNoOfVoyagesPlanned();
            if (pct >= percentage) {
                totalCompleted += vessel.getNoOfVoyagesCompleted();
                count++;
            }
        }
        return count > 0 ? (double) totalCompleted / count : 0;
    }

    public static NavalVessel findVesselByGrade(String purpose, NavalVessel[] vessels) {
        for (NavalVessel vessel : vessels) {
            if (vessel.getPurpose().equalsIgnoreCase(purpose)) {
                double pct = (double) (vessel.getNoOfVoyagesCompleted() * 100) / vessel.getNoOfVoyagesPlanned();
                if (pct == 100) {
                    vessel.setClassification("Star");
                } else if (pct >= 80 && pct <= 99) {
                    vessel.setClassification("Leader");
                } else if (pct >= 55 && pct <= 79) {
                    vessel.setClassification("Inspirer");
                } else {
                    vessel.setClassification("Striver");
                }
                return vessel;
            }
        }
        System.out.println("No Naval Vessel is available with the specified purpose");
        return null;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NavalVessel[] vessels = new NavalVessel[4];

        for (int i = 0; i < 4; i++) {
            int vesselId = sc.nextInt();
            sc.nextLine(); // Consume newline
            String vesselName = sc.nextLine();
            int noOfVoyagesPlanned = sc.nextInt();
            int noOfVoyagesCompleted = sc.nextInt();
            sc.nextLine(); // Consume newline
            String purpose = sc.nextLine();
            vessels[i] = new NavalVessel(vesselId, vesselName, noOfVoyagesPlanned, noOfVoyagesCompleted, purpose);
        }

        int percentage = sc.nextInt();
        sc.nextLine(); 
        String purpose = sc.nextLine();

        double avgVoyagesByPct = Solution.findAvgVoyagesByPct(vessels, percentage);
        System.out.println((int) avgVoyagesByPct); // Print as integer

        NavalVessel vesselByGrade = Solution.findVesselByGrade(purpose, vessels);
        if (vesselByGrade != null) {
            System.out.println(vesselByGrade.getVesselName() + "%" + vesselByGrade.getClassification());
        }
    }
}
