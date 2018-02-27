import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> list = new ArrayList<Player>();
    private int maxSize;

    public Team(String name){
        this.name = name;
    }

    public String getName(){
        return "" + name;
    }

    public void addPlayer(Player player){
        // System.out.println(list.size());
        // System.out.println(maxSize);

        if (maxSize == 0){
            list.add(player);
        } else if (list.size() < maxSize){
            list.add(player);
        }
    }

    public void printPlayers(){
        for (Player player : list){
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }

    public int size(){
        return list.size();
    }

    public int goals(){
        int total = 0;
        for (Player player : list){
            total = total + player.goals();
        }
        return total;
    }

}
