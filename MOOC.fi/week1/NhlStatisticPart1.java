

import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.top(10);

        System.out.println(System.lineSeparator() + "Top ten by goals: ");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println(System.lineSeparator() + "Top 25 by penalties: ");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println(System.lineSeparator() + "Sidney Crosby stats: ");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println(System.lineSeparator() + "PHiladelphia Flyers stats: ");
        NHLStatistics.teamStatistics("PHI");

        System.out.println(System.lineSeparator() + "Anaheim Ducks Players sorted by points: ");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
