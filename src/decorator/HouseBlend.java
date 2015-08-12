package decorator;

/**
 * просто кофе
 */
public class HouseBlend extends Beverage {
    public  HouseBlend(){
        description="houseBlend";
    }
    @Override
    public double cost() {
        return 1.29;
    }
}
