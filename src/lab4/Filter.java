package lab4;

import java.io.IOException;

abstract class Filter {
    protected Pipe input;
    protected Pipe output;
    private boolean isStart = false;
    Filter(Pipe input, Pipe output){
        this.input = input;
        this.output = output;
    }

    public void start(){
        if(!isStart){
            isStart = true;
            Thread thread = new Thread();
            thread.start();
        }
    }

    public void run(){
        try{
            this.transform();
        }
        catch (IOException e){
            e.getMessage();
        }
    }

    protected abstract void transform()throws IOException;
}
