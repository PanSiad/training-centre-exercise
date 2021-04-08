import abstractclassplayer.*;
import interfacetypecoach.*;

import java.util.Scanner;

public class TrainingCentre {

    public static void main(String[] args) {

        //interfacetypecoach.Coach implemented with interfacetypecoach.Coach Interface

        Coach coach = null;

        Scanner input = new Scanner(System.in);
        String selectedSport = input.nextLine();

        switch (selectedSport) {
            case "Football":
                coach = new FootballCoach();
                break;
            case "Basketball":
                coach = new BasketballCoach();
                break;
            case "Tennis":
                coach = new TennisCoach();
                break;
            case "Crossfit":
                coach = new CrossfitCoach();
                break;
            default:
                System.out.println("There isn't any coach for sport: " + selectedSport);
        }

        if (coach != null) {
            coach.warmUp();
            coach.train();
            coach.recover();
        }

        //Player implemented with abstract Player class

        Player player = null;

        switch (selectedSport) {
            case "Football":
                player = new FootballPlayer();
                break;
            case "Basketball":
                player = new BasketballPlayer();
                break;
            case "Tennis":
                player = new TennisPlayer();
                break;
            case "Crossfit":
                player = new CrossfitPlayer();
                break;
            default:
                System.out.println("There isn't any player for sport: " + selectedSport);
        }

        if (player != null) {
            player.warmUp();
            player.train();
            player.recover();
        }
    }
}
