package com.example.Sample.ProjectAndrewJar;

public class Main {

    public static void main(String[] args) {
	// write your code here
     //   new Thread(new CodeToRun()).start();
        //lambda expressition
        new Thread(()-> System.out.println("Printing from the RunnableClass")).start();

    }
}
class CodeToRun implements Runnable{
    @Override
    public void run() {
        System.out.println("printing from the runnable");
    }
}
