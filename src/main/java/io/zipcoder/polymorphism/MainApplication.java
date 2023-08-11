package io.zipcoder.polymorphism;

import java.util.*;
import io.zipcoder.polymorphism.Pet;
import io.zipcoder.polymorphism.Dog;
import io.zipcoder.polymorphism.Cat;

public class MainApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many pets do you own?");
        int numPets = input.nextInt();
        List<Pet> petList = new ArrayList<Pet>();

        for (int i = 0; i < numPets; i++) {
            String petType;
            if (i == 0) {
                System.out.println("What kind of pet is your first one? (Enter one of the following: 'dog' or 'cat'");
            } else {
                System.out.println("What kind of pet is your second one? (Enter one of the following: 'dog' or 'cat'");
            }

            petType = input.next();

            if (petType.equals("dog")) {
                System.out.println("Enter your dog's name:");
                String name = input.next();
                Dog dog1 = new Dog(name);
                petList.add(dog1);
            } else if (petType.equals("cat")) {
                System.out.println("Enter your cat's name:");
                String name = input.next();
                Cat cat1 = new Cat(name);
                petList.add(cat1);

            }
        }

            for (int i = 0; i < petList.size(); i++) {
                System.out.print("This pet is " + petList.get(i).getName() + ". ");
                System.out.println("They respond '" + petList.get(i).speak() + "'!");
            }

        }

    }

