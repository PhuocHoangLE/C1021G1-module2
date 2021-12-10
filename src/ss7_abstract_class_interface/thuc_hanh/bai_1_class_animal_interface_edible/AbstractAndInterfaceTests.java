package ss7_abstract_class_interface.thuc_hanh.bai_1_class_animal_interface_edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chiken();


        Fruit []fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }

        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chiken) {
                Edible edibler = (Chiken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
