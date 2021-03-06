package com.company;
import java.io.File;
import java.util.ArrayList;

public class MyDirectory {
    private String path;
    private ArrayList<String> directoryContent;

    public MyDirectory(String path) throws SaveFive {
        if (!new File(path).exists())
            throw new SaveFive(path);

        this.path = path;
        directoryContent = new Converter().fromArrayToList(new File(path).list());
    }

    public String getPath(){
        return path;
    }

    public void setPath(String path) throws SaveFive {
        if (!new File(path).exists())
            throw new SaveFive(path);

        this.path = path;
        directoryContent = new Converter().fromArrayToList(new File(path).list());
    }

    public ArrayList<String> getDirectoryContent() {
        return directoryContent;
    }
}
