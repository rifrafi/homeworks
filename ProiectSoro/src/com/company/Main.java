package com.company;

import javax.jnlp.FileOpenService;
import java.io.*;
import java.util.Formatter;


public class Main {




    public static void main(String[] args) {

        String source="C:\\Users\\Rares Sarbu\\Desktop\\data";
        String dest="C:\\Users\\Rares Sarbu\\Desktop\\SpanacOut.txt";
        FilesOperation.combine(source, dest);

    }
}
