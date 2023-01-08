
import java.util.ArrayList;

class PizzaOO {

    static class ChicagoPizzaStore extends PizzaStore {
        Pizza createPizza(String item) {
            if (item.equals("cheese")) {
                return new ChicagoStyleCheesePizza();
            } else
                return null;
        }
    }

    static class ChicagoStyleCheesePizza extends Pizza {
        public ChicagoStyleCheesePizza() {
            name = "Chicago Style Deep Dish Cheese Pizza";
            dough = "Extra Thick Crust Dough";
            sauce = "Plum Tomato Sauce";
            toppings.add("Shredded Mozzarella Cheese");
        }

        void cut() {
            System.out.println("Cutting the pizza into square slices");
        }
    }

    static class DependentPizzaStore{
      
        public Pizza createPizza(String style, String type) {
            Pizza pizza = null;
            if (style.equals("NY")) {
                if (type.equals("cheese")) {
                    pizza = new NYStyleCheesePizza();
                }
            }
            if (style.equals("Chicago")) {
                if (type.equals("cheese")) {
                    pizza = new ChicagoStyleCheesePizza();
                }
            } else {
                System.out.println("Error: invalid type of pizza");
                return null;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
            return pizza;
        }
    }

    static class NYPizzaStore extends PizzaStore {
        Pizza createPizza(String item) {
            if (item.equals("cheese")) {
                return new NYStyleCheesePizza();
            } else
                return null;
        }
    }

    static class NYStyleCheesePizza extends Pizza {
        public NYStyleCheesePizza() {
            name = "NY Style Sauce and Cheese Pizza";
            dough = "Thin Crust Dough";
            sauce = "Marinara Sauce";
            toppings.add("Grated Reggiano Cheese");
        }

    }

    abstract class Pizza {
        String name;
        String dough;
        String sauce;
        ArrayList toppings = new ArrayList();

        void prepare() {
            System.out.println("Preparing " + name);
            System.out.println("Tossing dough...");
            System.out.println("Adding sauce...");
            System.out.println("Adding toppings: ");
            for (int i = 0; i < toppings.size(); i++) {
                System.out.println(" " + toppings.get(i));
            }
        }

        void bake() {
            System.out.println("Bake for 25 minutes at 350");
        }

        void cut() {
            System.out.println("Cutting the pizza into diagonal slices");
        }

        void box() {
            System.out.println("Place pizza in official PizzaStore box");
        }

        public String getName() {
            return name;
        }

        public String toString() {
            StringBuffer display = new StringBuffer();
            display.append("---- " + name + " ----\n");
            display.append(dough + "\n");
            display.append(sauce + "\n");
            for (int i = 0; i < toppings.size(); i++) {
                display.append((String) toppings.get(i) + "\n");
            }
            return display.toString();
        }
    }

    abstract class PizzaStore {
        abstract Pizza createPizza(String item);

        public Pizza orderPizza(String type) {
            Pizza pizza = createPizza(type);
            System.out.println("--- Making a " + pizza.getName() + " ---");
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
            return pizza;
        }
    }

    public class Pizza {
        public static void main(String[] args) {
            PizzaStore nyStore = new NYPizzaStore();
            PizzaStore chicagoStore = new ChicagoPizzaStore();
            Pizza pizza = nyStore.orderPizza("cheese");
            System.out.println("Poonam ordered a " + pizza.getName() + "\n");
            pizza = chicagoStore.orderPizza("cheese");
            System.out.println("Kadambari ordered a " + pizza.getName() + "\n");
            pizza = nyStore.orderPizza("cheese");
        }
    }
}
