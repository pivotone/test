package lab5;

import java.util.ArrayList;
import java.util.Arrays;

public class Alphabetizer {
    public ArrayList<String> ls;
    Alphabetizer(ArrayList<String> ls){ this.ls=ls; }
    public void alpha(){
        String[] tmpArray = new String[ls.size()];
        ls.toArray(tmpArray);
        Arrays.sort(tmpArray);
        for(int i=0;i<ls.size();i++){
            ls.set(i, tmpArray[i]);
        }
    }
}
