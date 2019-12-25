package lab4;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Pipe {
    private Scanner pipeReader;
    private PrintWriter pipeWriter;

    protected Pipe() throws IOException {
        PipedWriter pipedWriter = new PipedWriter();
        PipedReader pipedReader = new PipedReader();
        pipedWriter.connect(pipedReader);
        pipeWriter = new PrintWriter(pipedWriter);
        pipeReader = new Scanner(pipedReader);
    }
    public String readerLine(){
        return pipeReader.nextLine();
    }
    public void writeLine(String line){
        pipeWriter.println(line);
    }
    public void closeReader(){
        pipeReader.close();
    }

    public void closeWriter(){
        pipeWriter.flush();
        pipeWriter.close();
    }
}
