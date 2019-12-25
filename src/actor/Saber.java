package actor;

public class Saber implements Actor {
    @Override
    public void showJob() {
        System.out.println("职业-惊雷剑圣");
    }

    @Override
    public String showEquipment() {
        return "武器： 长剑\n防具： 剑士甲胄\n";
    }
}
