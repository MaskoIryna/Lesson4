package com.si;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String firstName = "";
        String secondName = "";
        String animalAbout = "";
        int agePerson = 0;
        int counter = 0;
        Person[] allPeaple = new Person[100];
        Animal[] animals = new Animal[100];
        String[] menuItem = {"Exit", "Enter name", "Enter surname", "Enter year of birth", "Information input to base & output"};
        for (int i = 1; i < menuItem.length; i++) {
            System.out.println((i) + "-" + menuItem[i]);
        }
        System.out.println((0) + "-" + menuItem[0]);
        System.out.println("Select menu item :");
        Scanner scanner = new Scanner(System.in);
        int enterScan = scanner.nextInt();


        while (true) {
            switch (enterScan) {
                case 1:
                    System.out.println(menuItem[1]);
                    firstName = scanner.next();
                    break;
                case 2:
                    System.out.println(menuItem[2]);
                    secondName = scanner.next();
                    break;
                case 3:
                    System.out.println(menuItem[3]);
                    agePerson = scanner.nextInt();
                    break;
                case 4:
                    System.out.println(menuItem[4]);
                    if (firstName.length() == 0 || secondName.length() == 0 || agePerson == 0) {
                        System.out.print("Please fill in all fields ");
                    } else {

                            allPeaple[counter] = new Person(firstName, secondName, agePerson);
                            System.out.println("Name " + allPeaple[counter].getFirstName() + " Surname " + allPeaple[counter].getSecondName() +
                                    " Age " + allPeaple[counter].getAgePerson());
                            System.out.println(("& now tell as about you animal"));
                            System.out.println("breed");
                            String breed = scanner.next();
                            System.out.println("color");
                            String color = scanner.next();
                            System.out.println("nickname");
                            String nickname = scanner.next();
                            animals[counter] = new Animal(breed, color, nickname);
                            counter++;
                    }
                default:
                    break;
            }
            if (enterScan < 0 || enterScan > menuItem.length) {
                System.out.println("Select correct menu item :");
                enterScan = scanner.nextInt();
            } else {
               System.out.println(" 1-Enter name \n 2-Enter surname\n 3-Enter year of birth\n 4-Information input to base & output\n 0-Exit\n Select menu item : ");
                enterScan = scanner.nextInt();
            }
            if (enterScan == 0) {
                break;
            }

        }
        for (int j = 0; j < counter; j++) {
            System.out.println(allPeaple[j].getFirstName() + " " + allPeaple[j].getSecondName() + " " +
                    allPeaple[j].getAgePerson() + " year like a " + animals[j].getBreed() + " color " + animals[j].getColor()
                    + " name is " + animals[j].getNickname());
        }
    }
}


