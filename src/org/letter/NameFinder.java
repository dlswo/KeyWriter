package org.letter;

import java.io.File;

public class NameFinder {

    private String[] fileNames;

    public NameFinder() {
        File folder = new File("c:\\zzz\\img");

        this.fileNames = folder.list();
    }

    public String getName() {
        int idx = (int)(Math.random() * fileNames.length);
        return fileNames[idx];

    }
}
