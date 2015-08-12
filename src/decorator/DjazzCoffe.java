package decorator;

/**
 * Мейн класс для коффе
 */
public class DjazzCoffe {
    public static void main(String[] args){
        Beverage coffe =new Expresso();
        Beverage coffemilk=new Mocha( new Milk(new HouseBlend()));
        System.out.println(coffemilk.cost());
    }
}
