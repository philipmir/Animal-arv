import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Hyena h1 = new Hyena("Hyena");
        Hyena h2 = new Hyena("Hyenette");

        Lion l1 = new Lion("Lion");
        Lion l2 = new Lion("Lionette");

        ArrayList<Animal> safari = new ArrayList<>();

        safari.add(h1);
        safari.add(h2);
        safari.add(l1);
        safari.add(l2);

        h1.eat();
        h2.laugh();
        l1.roar();

        //for (Animal a : safari) {
        //    System.out.println(a.getName());  //loopar genom listan safari och skriver ut
        //}










    }
}






/*Övning1:

        Skapa lite olika klasser, som använder arv

        Animal:
            instansvariabel name
            Animal(String name) - konstruktor
            eat(String food) - skriver ut “‘name’ eating banana”
        Hyena:
            Hyena(String name) - konstruktor
            laugh(): skriver ut “name: hahahaha!”
        Lion:
            Lion(String name) - konstruktor
            roar(): skriver ut “name: roooar”, och anropar sedan eat()
*/
