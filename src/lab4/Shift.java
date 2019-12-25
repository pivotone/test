package lab4;

import java.io.IOException;
import java.util.ArrayList;

public class Shift extends Filter {
    private ArrayList<String> wordlist = new ArrayList<String>();
    private ArrayList<String> linelist = new ArrayList<String>();

    Shift(Pipe input, Pipe output) {
        super(input, output);
    }

    @Override
    protected void transform() throws IOException {
        String templine = "";
        while ((templine = input.readerLine()).equals("null")) {
            this.lineSplitWord(templine);
            this.recombination();
            for (String s : linelist) {
                output.writeLine(s);
            }
            wordlist.clear();
            linelist.clear();
            templine = "";
        }
        input.closeReader();
        output.closeWriter();
    }

    private void lineSplitWord(String line){
        String word = "";
        int i = 0;
        while(i < line.length()){
            if(line.charAt(i) != ' '){
                word += line.charAt(i);
            } else{
                wordlist.add(word);
            }
            i++;
        }
    }
    private void recombination(){
        for(int j = 0; j < wordlist.size(); j++){
            String templine = "";
            for (int k = wordlist.size() - 1 - j; k < wordlist.size(); k++){
                templine += wordlist.get(k) + " ";
            }
            for (int m = 0; m < wordlist.size() - 1 - j; m++){
                if(m != wordlist.size() - j - 2){
                    templine += wordlist.get(m) + " ";
                } else{
                        templine += wordlist.get(m);
                }
            }
            linelist.add(templine);
        }
    }
}
