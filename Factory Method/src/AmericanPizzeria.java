public class AmericanPizzeria extends Pizzeria{
    @Override
    Pizza createPizza(String pizzaName) {
        Pizza pizza = null;

        if (pizzaName.equals("AmericanCheese")) {
            pizza = new AmericanCheese();
        } else if (pizzaName.equals("AmericanPepperoni")) {
            pizza = new AmericanPepperoni();
        } else if (pizzaName.equals("AmericanVegetarian")) {
            pizza = new AmericanVegetarian();
        } else if (pizzaName.equals("AmericanSeafood")) {
            pizza = new AmericanSeafood();
        } else if (pizzaName.equals("AmericanGreece")) {
            pizza = new AmericanGreece();
        }

        return pizza;
    }
}
