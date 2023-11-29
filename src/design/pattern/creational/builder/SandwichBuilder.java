package design.pattern.creational.builder;

/**
 * @author Pramit Karmakar
 * @Date 16/Nov/2023
 */
public class SandwichBuilder {

    public static void main(String[] args) {
        Sandwich vegSandwich = new Sandwich.Builder().bread("white").veggies("tomato").spread("mayonnaise").build();
        System.out.println(vegSandwich.toString());
        Sandwich chickenSandwich = new Sandwich.Builder().bread("Brown").veggies("Lettuce").spread("Mustard").meat("Chicken").build();
        System.out.println(chickenSandwich.toString());
    }
}
