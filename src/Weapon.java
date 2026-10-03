public class Weapon extends Item{
    private int damage;

    public Weapon(String name, double weight, int damage) {
        super(name, weight);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String toString(){
        return "Name: " + getName() + "\n"
                + "Weight: " + getWeight() + "\n"
                + "Damage: " + damage + "\n";
    }
    public boolean use(Object target){
        if (!(target instanceof  Person)){
            return  false;
        }
        Person p = (Person) target;

        System.out.println("Attack " + p.getName() + " with " + getName() + " for " + damage + " damage");

        if (p.defends(damage)){
            System.out.println(p.getName() + " lives!");
        } else {
            System.out.println(p.getName() + " is dead!");
        }
        return  true;
     }
}
