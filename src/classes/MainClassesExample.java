package classes;

public class MainClassesExample {

    public static void main(String[] args){

        System.out.println("*************************Dog Example***********************");

        Dog dog = new Dog("Golden Retriever","Dave", "Blond", 2);

        String output = dog.toString();
        System.out.println(output);

        dog.setDogType("Pitbull");

        System.out.println(dog);

        dog.setDogColor("Black");
        System.out.println(dog.getDogColor());

        System.out.println("*************************PersonRecord Example***********************");

        Person dave = new Person("Dave", "Funnybones", "Comedian");
        Person domi = new Person("Domi", "Grünert", "Product Owner");

        System.out.println(dave);
        System.out.println(domi);

    }
}
