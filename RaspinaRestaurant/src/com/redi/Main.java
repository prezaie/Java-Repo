package com.redi;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Starter[]  starters = new Starter[3];
        Starter salad = new Starter("1)Salad",5);
        Starter soup = new Starter("2)Soup",6);
        Starter fries =  new Starter("3)Fries",3);
        starters[0]=salad;
        starters[1]=soup;
        starters[2]=fries;
        MainCourse[]  mainCourses = new MainCourse[3];
        MainCourse steak = new MainCourse("4)Steak",15);
        MainCourse curry = new MainCourse("5)Curry",13);
        MainCourse pasta = new MainCourse("6)Pasta",14);
        mainCourses[0]=steak;
        mainCourses[1]=curry;
        mainCourses[2]=pasta;
        Dessert[]  desserts = new Dessert[3];
        Dessert tiramisu = new Dessert("7)Tiramisu",7);
        Dessert icecream = new Dessert("8)Icecream",4);
        Dessert baclava = new Dessert("9)Baclava",6);
        desserts[0]=tiramisu;
        desserts[1]=icecream;
        desserts[2]=baclava;

        System.out.println("==================================");
        System.out.println("Welcome to Raspina Restaurant Menu");
        System.out.println("==================================");
        System.out.println("------------ Starter -------------");

        for (Starter starter: starters) {
            starter.dishPrint();
        }
        System.out.println("----------- Main Course ----------");
        for (MainCourse mainCourse: mainCourses) {
            mainCourse.dishPrint();
        }
        System.out.println("------------- Dessert ------------");
        for (Dessert dessert: desserts) {
            dessert.dishPrint();
        }
        System.out.println("----------------------------------");

        System.out.print("Enter an item number between 1 to 3 for Starter: ");
        Scanner input1 = new Scanner(System.in);
        int starterNumber = input1.nextInt();
        System.out.print("Enter an item number between 4 to 6 for Main Course: ");
        Scanner input2 = new Scanner(System.in);
        int maincourseNumber = input2.nextInt();
        System.out.print("Enter an item number between 7 to 9 for Dessert: ");
        Scanner input3 = new Scanner(System.in);
        int dessertNumber = input3.nextInt();

        int bill= starters[starterNumber-1].price + mainCourses[maincourseNumber-4].price+desserts[dessertNumber-7].price;
        System.out.println("----------------------------------------------------");
        System.out.print("Your total bill is: "+bill);


    }
}
