package kln.se.ass2.input;

import java.util.Scanner;

public class CommandLineInput implements Input {


    @Override
    public String readFile() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter log file path");
        String logfilepath = input.nextLine();
        return logfilepath;
    }
}
