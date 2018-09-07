package org.letter;

import java.io.File;
import java.util.Arrays;

public class FolderTest {

    public static void main(String[] args) {

        File folder = new File("c:\\zzz\\img");

        String[] fileNames = folder.list();
        for (String fileName:fileNames      ) {
            System.out.println(fileName);
        }
        int idx = (int)(Math.random() * fileNames.length);
        System.out.println(idx);

    }
}
