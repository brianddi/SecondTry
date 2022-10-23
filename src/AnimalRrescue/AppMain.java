package AnimalRrescue;

public class AppMain {

    public static void main(String[] args) {

        Dog Perdita = new Dog();

        System.out.println(" The dog's name is: " + Perdita.name);
        System.out.println(" The dog's age is: " + Perdita.age + " years old" );
        System.out.println(" The dog's weight is: " + Perdita.weight + " kg");
        System.out.println("The dos's breed is:" + Perdita.breed);
        System.out.println("The dog's color is:" + Perdita.color);
        System.out.println("The dog's gender is:" + Perdita.gender);

        Perdita.run();
        Perdita.eat();
        Perdita.speak();
        Perdita.sleep();
        Perdita.tailWagging();


        Adopter Briana = new Adopter();

        System.out.println(" The adopter's name is: " + Briana.name);
        System.out.println(" The adopter's age is: " + Briana.age);
        System.out.println(" The adopter's gender is: " + Briana.gender);
        System.out.println(" The adopter's hair color is: " + Briana.HairColor);


    }

}
