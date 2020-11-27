package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SaveFive {
        String path = "practic23.4\\src";
        ArrayList<String> files = new MyDirectory(path).getDirectoryContent();
        System.out.println(path + ":");
        for (int i = 0; i < 5 && i < files.size(); i++)
            System.out.println(files.get(i));

        path = "practic23.4\\src";
        files = new MyDirectory(path).getDirectoryContent();
        System.out.println(path + ":");
        for (int i = 0; i < 5 && i < files.size(); i++)
            System.out.println(files.get(i));
    }
}