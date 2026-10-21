import java.util.Arrays;
import java.util.List;

public class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }

    static void main() {

  
        Animal animal = new Animal();
        animal.makeSound();
        // 1 - extending existing Class
        Animal dog = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Bark sound");
            }
        };
        // 2 - inner anonymous implementing interface
        Runnable runnable = () -> System.out.println("In runnable");
        runnable.run();
        dog.makeSound();
    }
}
