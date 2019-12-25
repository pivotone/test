package lab5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputStore {
    private ArrayList<String> ls;
    InputStore(ArrayList<String> ls){ this.ls=ls; }
    void input(String inputFile){
        FileReader fr=null;
        try {
            fr=new FileReader(inputFile); } catch
        (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br=new BufferedReader(fr);
        try {
            while(br.ready()){
                ls.add(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
