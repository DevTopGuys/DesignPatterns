public class ItalianPizzeria extends Pizzeria{
    @Override
    Pizza createPizza(String pizzaName) {
        Pizza pizza = null;

        if (pizzaName.equals("ItalianCheese")) {
            pizza = new ItalianCheese();
        } else if (pizzaName.equals("ItalianPepperoni")) {
            pizza = new ItalianPepperoni();
        } else if (pizzaName.equals("ItalianVegetarian")) {
            pizza = new ItalianVegetarian();
        } else if (pizzaName.equals("ItalianSeafood")) {
            pizza = new ItalianSeafood();
        } else if (pizzaName.equals("ItalianGreece")) {
            pizza = new ItalianGreece();
        }

        return pizza;
    }
}
