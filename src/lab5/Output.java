package lab5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Output {
    public ArrayList<String> ls;
    public Output(ArrayList<String> ls){ this.ls=ls; }
    public void output(String outputAddress){
        FileWriter fw = null; try {
            fw = new FileWriter(outputAddress);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bw=new BufferedWriter(fw);
        for (String l : ls) {
            try {
                bw.write(l);
                bw.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
