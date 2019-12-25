package lab4;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Output extends Filter {
    private File file;

    Output(Pipe input, File file) {
        super(input, null);
        this.file = file;
    }

    @Override
    protected void transform() throws IOException {
        PrintWriter pw = new PrintWriter(file);
        String templine = "";
        while((templine = input.readerLine()) != null){
            pw.write(templine);
            pw.write("\n");
        }
        pw.flush();
        pw.close();
        input.closeReader();
    }
}
