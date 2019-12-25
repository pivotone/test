package lab4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Input extends Filter {
    private File infile;

    Input(File file, Pipe output) {
        super(null, output);
        this.infile = file;
    }

    @Override
    protected void transform() throws IOException {
        Scanner sc = new Scanner(infile);
        String templine;
        while((templine = sc.nextLine()).equals( "null")){
            output.writeLine(templine);
        }
        output.closeWriter();
        sc.close();
    }
}
