package actor;

import java.util.Scanner;

public class Main {
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择你的职业：\n 1. 卧龙军师 \t 2. 惊雷剑圣 \t 3. 电光龙骑 \n");
        int choice = sc.nextInt();
        Actor actor = null;
        if(choice==1){
            actor = new Witch();
        }else if(choice==2){
            actor = new Saber();
        }else if(choice==3){
            actor = new Lancer();
        }
        while(choice!=0){
            System.out.println("请选择你的操作： \n 1. 强化武器 \t 2. 强化装备 \t 3. 使用经验药剂 \t 4. 结束");
            choice = sc.nextInt();
            if(choice==1){
                actor = new AttackMedicine(actor);
            }else if(choice==2){
                actor = new DefenseMedicine(actor);
            }else if(choice==3){
                actor = new PerMedicine(actor);
            }else if(choice==4) break;
        }
        actor.showJob();
        System.out.println(actor.showEquipment());
    }
}
