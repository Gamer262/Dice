import java.util.Random;

public class Dice {
    private int Sides;
    private int Role;
    public Dice(int sides){
        setSides(sides);
        setRole(1);
    }
    //Sets and gets
    public void setSides(int sides) {
        Sides = sides;
    }
    public int getSides() {
        return Sides;
    }
    public int getRole() {
        return Role;
    }

    public void setRole(int role) {
        Role = role;
    }
    //Roll function
    public int rollDice(){
        //Creat new random obj
        Random random = new Random();
        //Generate rand numb between 1 and sides of dice
        setRole(random.nextInt(Sides) + 1);
        return Role;
    }
}
