package com.company;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static LittleGuy x = new LittleGuy();
    static LittleGuy y = new LittleGuy();
    static int levels=0;
    public static void main(String[] args) {
        boolean firstNum= true;
        String nxt="";

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        for (int i=0; i<3; i++) {
            nxt = reader.nextLine();
            String[] integers = nxt.split("\\s+");
            for (String integer : integers) {
                int num = Integer.parseInt(integer);
                if(i==0) {
                    if(num<=100 && num>0)
                        levels = num;
                    else
                        return;
                }
                else if(i==1) {
                    if(num>levels)
                        return;
                    else {
                        if (firstNum) {
                            x.setPossibleLevels(num);
                            firstNum = false;
                        } else
                            x.addLevel(num);
                    }
                }
                else {
                    if(num>levels)
                        return;
                    else {
                        if (firstNum) {
                            y.setPossibleLevels(num);
                            firstNum = false;
                        } else
                            y.addLevel(num);
                    }
                }
            }
        }
        reader.close();
        check();
    }
    private static void check() {
        HashSet<Integer> combined = new HashSet<Integer>();
        for(Integer level: x.getLevels()) {
            combined.add(level);
        }
        for(Integer level: y.getLevels()) {
            combined.add(level);
        }
        if(combined.size() == levels)
            System.out.println("I become the guy.");
        else
            System.out.println("Oh, my keyboard!");
    }
}
