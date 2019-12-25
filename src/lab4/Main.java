package lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File infile = new File("D:\\idea_folder\\lab\\src\\lab4\\kwic.txt");
        File outfile = new File("D:\\idea_folder\\lab\\src\\lab4\\kwic_1.txt");
        Scanner inputfile;
        Scanner outputfile;
        try {
            inputfile = new Scanner(infile);
            outputfile = new Scanner(outfile);
            Pipe pipe1 = new Pipe();
            Pipe pipe2 = new Pipe();
            Pipe pipe3 = new Pipe();
            Input input = new Input(infile, pipe1);
            Shift shift = new Shift(pipe1, pipe2);
            Output output = new Output(pipe3, outfile);
            input.transform();
            shift.transform();
            output.transform();
            System.out.println("----- infile ----- ");
            String str = null;
            while (inputfile.hasNextLine()) {
                str = inputfile.nextLine();
                System.out.println(str);
            }
            System.out.println("input end");
            Thread.sleep(3000);
            System.out.println("----- outfile ----- ");
            while (outputfile.hasNextLine()) {
                System.out.println(str);
            }
            inputfile.close();
            outputfile.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
