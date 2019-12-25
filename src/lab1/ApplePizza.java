package lab1;

public class ApplePizza extends Pizza {
    private int redius;

    ApplePizza(int redius) {
        this.redius = redius;
        System.out.println("产品 ApplePizza 制作，大小为"+redius+"寸");
    }

    public int getRedius() {
        return redius;
    }

    public void setRedius(int redius) {
        this.redius = redius;
    }
}
