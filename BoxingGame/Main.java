package BoxingGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create two fighters
        Fighter BadrHari = new Fighter("Badr Hari", 15, 100, 90, 30, 50);
        Fighter RemyBonjasky = new Fighter("Remy Bonjasky", 10, 90, 100, 30, 50);

        // Create a match between the fighters with weight constraints
        Match match = new Match(BadrHari, RemyBonjasky, 90, 100);

        // Run the match
        match.run();
    }
}