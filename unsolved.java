class Parent {
    void makePizza() {
        System.out.println("Mix dough, add sauce, sprinkle cheese, and bake.");
    }
}

class Child extends Parent {
    @Override
    void makePizza() {
        System.out.println("Mix dough, add spicy sauce, lots of cheese, and bake with extra pepperoni.");
    }
}

class AnotherChild extends Parent {
    @Override
    void makePizza() {
        System.out.println("Mix dough, add creamy sauce, sprinkle veggies, and bake until golden.");
    }
}

public class unsolved {
    public static void demonstratePizzaMaking(Parent person) {
        person.makePizza();
    }
    public static void main(String[] args) {
        Child alexPizza = new Child();
        AnotherChild emmaPizza = new AnotherChild();
        demonstratePizzaMaking(alexPizza);
        demonstratePizzaMaking(emmaPizza);
    }
}
