import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int three = 0;
        int four = 0;
        int five = 0;
        int count = 0;
        int temp = 0;
        ArrayList<Dice> Set = new ArrayList<Dice>();
        Dice dice;
        for (int i = 0; i < 5; i++) {
            dice = new Dice(6);
            Set.add(dice);
        }
        for (long i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                Set.get(j).rollDice();
            }
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if(Set.get(j).getRole() == Set.get(k).getRole()){
                        count++;
                    }
                }
                if(temp < count){
                    temp = count;
                }
                count = 0;
            }
            if(temp == 3){
                three++;
            }else if(temp == 4){
                four++;
            }else if(temp == 5){
                five++;
            }
            temp = 0;
        }
        System.out.println("Three of a kind " + three + "\nFour of a kind " + four + "\nFive of a kind " + five);
    }
}