package decorator;

/**
 * молоко
 */
public class Milk extends CodimentDecorator {
    Beverage beverage;
    public Milk(Beverage beverage){
        this.beverage=beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription()+"Milk";
    }

    @Override
    public double cost() {
        return .70+beverage.cost();
    }
}
