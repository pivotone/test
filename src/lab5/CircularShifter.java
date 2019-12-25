package lab5;

import java.util.ArrayList;

public class CircularShifter {
    public ArrayList<String> ls;
    public CircularShifter(ArrayList<String> ls){
        this.ls=ls;
    }
    public void shift(){
        ArrayList<String> shiftedLineIndexes=new ArrayList<String>();
        for(int i=0;i<ls.size();i++){
            String inLine=ls.get(i); String array[]=inLine.split(" ");
            for(int j=0;j<array.length;j++){ String newLine=array[j];
                if(array.length>1) {
                    if(j==array.length-1){
                        for(int k=0;k<(array.length-1);k++){
                            newLine=newLine+" "+array[k];
                        }
                    }
                    else{
                        for(int k=j+1;k<array.length;k++){
                            newLine=newLine+" "+array[k];
                        }
                        for(int m=0;m<j;m++){
                            newLine=newLine+" "+array[m];
                        }
                    }
                }
                shiftedLineIndexes.add(newLine);
            }
        }
        ls=shiftedLineIndexes;
    }
}
