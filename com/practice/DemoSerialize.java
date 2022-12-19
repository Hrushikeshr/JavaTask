package com.practice;

import java.io.*;

public class DemoSerialize {
    public static void main(String[] args) throws IOException {
        Save obj = new Save();
        obj.i = 10;

        File f = new File("obj.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);

    }

}

class Save implements Serializable{
    int i;
}
