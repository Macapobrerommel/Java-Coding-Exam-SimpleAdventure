
public class Person {
    private String name;
    private int health;

    public Person(String name){
        this.name = name;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nHealth: "+ health + "\n";
    }

    public boolean isAlive(){
        return health !=0;
    }
    public boolean heal(int boost){
        if (isAlive()){
            health += boost;

            if (health > 100){
                health = 100;
            }
            return  true;
        }
        return false;
    }

    public boolean defends(int damage){
        health -= damage;

        if (health < 0){
            health = 0;
        }
        return  isAlive();
    }
}
