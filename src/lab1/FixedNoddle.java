package lab1;

public class FixedNoddle extends Noddle {
    private String num;

    FixedNoddle(String num){
        this.num = num;
        System.out.println("产品 FixedNoddle 制作，份量为"+num);
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
