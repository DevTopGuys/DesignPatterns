public class SimplePizzaFactory {
    public Pizza createPizza(String pizzaName) {
        Pizza pizza = null;

        if (pizzaName.equals("Cheese")) {
            pizza = new ItalianCheese();
        } else if (pizzaName.equals("Pepperoni")) {
            pizza = new ItalianPepperoni();
        } else if (pizzaName.equals("Vegetarian")) {
            pizza = new ItalianVegetarian();
        } else if (pizzaName.equals("Seafood")) {
            pizza = new ItalianSeafood();
        } else if (pizzaName.equals("Greece")) {
            pizza = new ItalianGreece();
        }

        return pizza;
    }
}

