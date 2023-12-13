public abstract class Pizzeria {
    Pizza orderPizza(String pizzaName) {
        Pizza pizza;

        pizza = createPizza(pizzaName);

        pizza.prepare();
        pizza.bake();
        pizza.slice();
        pizza.pack();

        return pizza;
    }

    abstract Pizza createPizza(String pizzaName);
}
