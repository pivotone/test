package lab4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Alphabet extends Filter{
    private ArrayList<String> al = new ArrayList<String>();
    Alphabet(Pipe input, Pipe output) {
        super(input, output);
    }

    @Override
    protected void transform() throws IOException {
        String templine = null;
        while((templine = input.readerLine()) != null){
            al.add(templine);
        }
        Collections.sort(al);
        for (String s : al) {
            output.writeLine(s);
        }
        input.closeReader();
        output.closeWriter();
    }
}
