package com.test;

import java.io.FileWriter;
import java.io.IOException;

public class NegativeNumbers implements Observer {

    @Override
    public void notify(int n1, int n2) {
        if(n1 < 0 && n2 < 0) {
            try(FileWriter fileWriter = new FileWriter("negativeNumbers.txt",true)) {
                fileWriter.write(n1 + " " + n2 + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
