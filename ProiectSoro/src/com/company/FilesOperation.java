package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FilesOperation {
    public static void copyFileFromSourceToDestination(String source, String destination, boolean append) {
        File file = new File(source);
        File copyFile = new File(destination);
        try (PrintWriter writer = new PrintWriter(new FileWriter(destination, append))) {
            try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    writer.println(line);
                }
            }
        } catch (IOException exc) {
            System.out.println("There was an error with file" + source + ": " + exc.getMessage());
        }
    }

    public static List<String> getFiles(String source) {

        File folder = new File(source);
        File[] listOfFiles = folder.listFiles();
        List<String> cocos = new ArrayList();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                cocos.add(file.getAbsolutePath());
            }

        }
        return cocos;
    }

    public static void combine(String source, String dest) {
        List<String> files = getFiles(source);
        for (String file : files) {
            copyFileFromSourceToDestination(file, dest, true);
        }
    }
}
