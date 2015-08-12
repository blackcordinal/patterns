package decorator;

/**
 * Класс для наследования напитками
 */
public abstract class Beverage {
     String description="Dont hae description";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
