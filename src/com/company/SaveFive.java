package com.company;

public class SaveFive extends Throwable{
    private String message;

    public SaveFive(String directory) {
        message = "Файл \"" + directory + "\" не найден";
    }

    public String getMessage() {
        return message;
    }
}
