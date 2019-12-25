package lab1;

public class Main {
    public static void main(String []arg){
        Factory factory = new Factoryone();
        System.out.println("昂贵的生产工厂- - - - - - - - -");
        Pizza pizza = factory.pizzaCreate(1);
//        System.out.println(pizza.getRedius());
        Noddle noddle = factory.noddleCreate("中份");
        Factory factory1 = new FactoryTwo();
        System.out.println("便宜的生产工厂- - - - - - - - -");
        Pizza pizza1 = factory1.pizzaCreate(1);
        Noddle noddle1 = factory1.noddleCreate("小份");
    }
}
