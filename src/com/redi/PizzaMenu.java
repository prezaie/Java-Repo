package com.redi;

import java.util.*;

public class PizzaMenu {

    public static void main(String[] args) {

        //ingredients for Margherita
        Set<String> margheritaIngredients = new HashSet<>();
        margheritaIngredients.add("Tomato");
        margheritaIngredients.add("Mozzarella");

        //ingredients for Tuna
        Set<String> tunaIngredients = new HashSet<>();
        tunaIngredients.add("Tomato");
        tunaIngredients.add("Mozzarella");
        tunaIngredients.add("Tuna");


        //define margherita and tuna pizza
        Pizza margherita = new Pizza("Margherita",margheritaIngredients,5.0,"Vegetarian Pizza");
        Pizza tuna = new Pizza("Tuna",tunaIngredients, 6.5, "Tuna pizza");

        //Put all the pizzas in the menu
        //Map is interface so we can't initialize interface we have to initialize class of Hash map
        Map<String, Pizza> pizzas=new HashMap<>();
        pizzas.put(margherita.getName(),margherita );
        pizzas.put(tuna.getName(),tuna );


        //iterate over pizzas
        for (Map.Entry<String, Pizza> entry : pizzas.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue().printIngredients());
        }

        //let the user choose pizza
        System.out.println("Please select a pizza");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //Pizza pizza1= pizzas.get(input);
        //System.out.println(pizza1.printIngredients());
        System.out.println(pizzas.get(input).printIngredients());



    }
}
