package player;
import java.util.*;
public class Solution {
	public static int findPointsForGivenSkill(Player[] players, String skill) {
        int sum = 0;
        for (Player player : players) {
            if (player.getSkill().equalsIgnoreCase(skill)) {
                sum += player.getPoints();
            }
        }
        return sum;
    }

    public static Player getPlayerBasedOnLevel(String level, String skill, Player[] players) {
        for (Player player : players) {
            if (player.getLevel().equalsIgnoreCase(level) && player.getSkill().equalsIgnoreCase(skill) && player.getPoints() >= 20) {
                return player;
            }
        }
        return null;
    }


//public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player[] players = new Player[4];

        // Read player details
        for (int i = 0; i < 4; i++) {
            int playerId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            String skill = scanner.nextLine();
            String level = scanner.nextLine();
            int points = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            players[i] = new Player(playerId, skill, level, points);
        }

        String skill = scanner.nextLine();
        String level = scanner.nextLine();

        int pointsForSkill = Solution.findPointsForGivenSkill(players, skill);
        if (pointsForSkill > 0) {
            System.out.println(pointsForSkill);
        } else {
            System.out.println("The given Skill is not available");
        }

        Player playerBasedOnLevel = Solution.getPlayerBasedOnLevel(level, skill, players);
        if (playerBasedOnLevel != null) {
            System.out.println(playerBasedOnLevel.getPlayerId());
        } else {
            System.out.println("No player is available with specified level, skill and eligibility points");
        }
    }
}
/*
101
Cricket
Basic
20
102
Cricket
Intermediate
25
111
Football
Intermediate
50
113
BaseBall
Advanced
100
Cricket
Intermediate
*/
