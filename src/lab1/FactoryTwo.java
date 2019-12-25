package lab1;

public class FactoryTwo extends Factory {
    //生产梨味的披萨
    @Override
    public Pizza pizzaCreate(int redius) {
        return new PeerPizza(redius);
    }

    //生产炸酱面
    @Override
    public Noddle noddleCreate(String num) {
        return new FixedNoddle(num);
    }
}
