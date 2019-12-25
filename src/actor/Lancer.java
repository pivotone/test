package actor;

public class Lancer implements Actor {
    @Override
    public void showJob() {
        System.out.println("职业-电光龙骑");
    }

    @Override
    public String showEquipment() {
        return "武器： 长枪\n防具： 重装甲\n";
    }
}
