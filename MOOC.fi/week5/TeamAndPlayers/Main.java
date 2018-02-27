public class Main {
    public static void main(String[] args) {
        // test your code here

        Team j = new Team("RAGE");

        Player p = new Player("Jaakko");
        Player o = new Player("Oakko");
        Player q = new Player("Quu");

        j.addPlayer(p);
        j.addPlayer(o);
        j.addPlayer(q);

        j.printPlayers();

//
//        Team barcelona = new Team("FC Barcelona");
//
//        Player brian = new Player("Brian");
//        Player pekka = new Player("Pekka", 39);
//        barcelona.addPlayer(brian);
//        barcelona.addPlayer(pekka);
//        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above
//
//        System.out.println("Total goals: " + barcelona.goals());

    }
}
