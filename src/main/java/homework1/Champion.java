package homework1;

public class Champion {
    private final String name;
    private final int strenght;
    private final int agility;
    private final int intelligence;

    public Champion(String name, int strenght, int agility, int intelligence) {
        this.name = name;
        this.strenght = strenght;
        this.agility = agility;
        this.intelligence = intelligence;
    }

    public static void printWinner(Champion champion1, Champion champion2){
        int diff = champion1.power()-champion2.power();
        if (diff>0){
            System.out.println(champion1.name+" win");
        }else if(diff<0){
            System.out.println(champion2.name+" win");
        } else {
            System.out.println("Champions "+champion1.name +
                    " and "+champion2.name +" are the same");
        }
    }

    private int power(){
        return strenght*agility*intelligence;
    }


}
