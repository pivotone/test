package lab5;

import java.util.ArrayList;

public class Main {
    public static void main(String []arg){
        ArrayList<String> al=new ArrayList<String>();
        InputStore inputStore=new InputStore(al);
        inputStore.input("D:\\idea_folder\\lab\\src\\lab5\\kwic.txt");
        CircularShifter cs=new CircularShifter(al);
        cs.shift();
        Alphabetizer alp=new Alphabetizer(cs.ls);
        alp.alpha();
        Output output=new Output(alp.ls);
        output.output("D:\\idea_folder\\lab\\src\\lab5\\kwic_1.txt");
        System.out.println("执行结束");
    }
}
