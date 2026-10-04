public abstract class ToppingDecorator extends BasePizza {
    // We can also have an abstract method here if we want to force decorators to implement it
    // But since it extends BasePizza, cost() is already required to be implemented
}
