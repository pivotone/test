package lab1;

public class PeerPizza extends Pizza{
    private int redius;

    PeerPizza(int redius){
        this.redius = redius;
        System.out.println("产品 PeerPizza 制作。大小为 "+redius+"寸");
    }

    @Override
    public int getRedius() {
        return redius;
    }

    @Override
    public void setRedius(int redius) {
        this.redius = redius;
    }
}
