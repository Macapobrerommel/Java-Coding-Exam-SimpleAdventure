public class SimpleAdventure {

    public static void printPerson(Person p){
        System.out.println("The health of " + p.getName() + " is " + p.getHealth());
        if (p.isAlive()){
            System.out.println(p.getName() +  " is alive.");
        } else {
            System.out.println(p.getName() +  " has passed on. ");
        }
        System.out.println(p);
    }
    public static void printItem(Item item){
        System.out.println("The item " + item.getName() + " has weight " + item.getWeight());

        if (item instanceof Food food){
            System.out.println("It also heals " + food.getHealth() );
        } else if (item instanceof Weapon weapon){
            System.out.println("It also does " + weapon.getDamage() + " damage");
        }



        System.out.println(item);

    }
    public static void main(String[] args) {



        Person frodo = new Person("Frodo Baggins");
        Person sam = new Person("Samwise Gamgee");
        Person gollum = new Person("Smeagol");

        printPerson(frodo);
        printPerson(sam);
        printPerson(gollum);

        Item sword = new Weapon("Sting", 1.5, 30);
        Item taters = new Food("Taters", 0.3, 45);
        Item book_1 = new Item("There and Back Again", 5.3);
        Item glowingString = new Weapon("Glowing Sting", 1.4, 60);
        Item potatoes = new Food("POTATOES" , 0.2, 56);
        Item book_2 = new Item("There and Back Again: And What happened After", 15.7);

        printItem(sword);
        printItem(taters);
        printItem(book_1);
        printItem(glowingString);
        printItem(potatoes);
        printItem(book_2);




        System.out.println("Use book on sword...");
        System.out.println("Can use? " + book_1.use(sword));
        System.out.println();

        System.out.println("Use book on Frodo...");
        System.out.println("Can use? " + book_1.use(frodo));
        System.out.println();

        System.out.println("Use book on null...");
        System.out.println("Can use? " + book_1.use(null));
        System.out.println();

        System.out.println("Use sword on gollum...");
        System.out.println("Can use? " + glowingString.use(gollum));
        System.out.println();

        printPerson(gollum);

        System.out.println("Use sword on book...");
        System.out.println("Can use? " + sword.use(book_1));
        System.out.println();

        System.out.println("Use sword on null...");
        System.out.println("Can use? " + sword.use(null));
        System.out.println();

        System.out.println("Use taters on null...");
        System.out.println("Can use? " + taters.use(null));
        System.out.println();

        System.out.println("Use taters on book...");
        System.out.println("Can use? " + taters.use(book_1));
        System.out.println();

        System.out.println("Use taters on gollums...");
        System.out.println("Can use? " + potatoes.use(gollum));
        System.out.println();

        printPerson(gollum);

        System.out.println("Use sword on gollum...");
        glowingString.use(gollum);
        printPerson(gollum);
        System.out.println();

        System.out.println("Use sword on gollum again...");
        glowingString.use(gollum);
        printPerson(gollum);
        System.out.println();

        System.out.println("Use taters on gollum...");
        taters.use(gollum);
        System.out.println("Can use? " + sword.use(book_1));
        System.out.println();
    }
}