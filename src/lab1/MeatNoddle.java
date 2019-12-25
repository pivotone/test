package lab1;

public class MeatNoddle extends Noddle {
    private String num;
    protected MeatNoddle(String num){
        this.num = num;
        System.out.println("产品 MeatNoddle 制作，份量为"+num);
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
