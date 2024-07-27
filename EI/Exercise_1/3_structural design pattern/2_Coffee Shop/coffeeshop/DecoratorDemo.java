package coffeeshop;

public class DecoratorDemo {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        System.out.println(coffee.getDescription() + " $" + coffee.cost());

        Beverage coffeeWithMilk = new MilkDecorator(coffee);
        System.out.println(coffeeWithMilk.getDescription() + " $" + coffeeWithMilk.cost());

        Beverage coffeeWithMilkAndSugar = new SugarDecorator(coffeeWithMilk);
        System.out.println(coffeeWithMilkAndSugar.getDescription() + " $" + coffeeWithMilkAndSugar.cost());
    }
}
