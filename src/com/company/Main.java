package com.company;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code her
        Scanner input = new Scanner(System.in);
        String userChoice =null;
        System.out.println("WELCOME TO Zola'S TINY ADVENTURE!");
        System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\"?");
        userChoice = input.nextLine();
        if(userChoice.equalsIgnoreCase("kitchen")){
            System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side\n" +
                    "there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\n" +
                    "or look in a \"cabinet\".");
            userChoice = input.nextLine();
            if(userChoice.equalsIgnoreCase("refrigerator")){
                System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n" +
                        "Would you like to eat some of the food? (\"yes\" or \"no\")");
                userChoice = input.nextLine();
                if(userChoice.equalsIgnoreCase("no")){
                    System.out.println("You die of starvation... eventually.");
                }else {
                    System.out.println("Enjoy your meal");

                }
            }else if (userChoice.equalsIgnoreCase("cabinet")){
                System.out.println("what you see in there is all yours");
            }
        }else if(userChoice.equalsIgnoreCase("upstairs")){
            System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\n" +
                    "\"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like\n" +
                    "to go?");
            userChoice = input.nextLine();
            if(userChoice.equalsIgnoreCase("bedroom")){
                System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The\n" +
                        "bed is unmade.  In the back of the room, the closet door is ajar.  Would you\n" +
                        "like to open the door? (\"yes\" or \"no\")");
                userChoice = input.nextLine();
                if(userChoice.equalsIgnoreCase("yes")){
                    System.out.println("welcome boy");
                }
                else if (userChoice.equalsIgnoreCase("no")){
                    System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing,\n" +
                            "I'm tired of making nested if statements.");
                }
            }
        }
    }
}
