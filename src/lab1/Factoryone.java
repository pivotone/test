package lab1;

public class Factoryone extends Factory {
    // 生产苹果披萨
    @Override
    public Pizza pizzaCreate(int redius) {
        return new ApplePizza(redius);
    }

    //生产肉面
    @Override
    public Noddle noddleCreate(String num) {
        return new MeatNoddle(num);
    }
}
