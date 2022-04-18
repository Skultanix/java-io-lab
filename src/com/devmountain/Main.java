package com.devmountain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        //Text files
        File cases = new File("./data/txt/Case.txt");
        File cpus = new File("./data/txt/CPU.txt");
        File cpuCoolers = new File("./data/txt/CPU_COOLER.txt");
        File gpus = new File("./data/txt/GPU.txt");

        //CSV files
        File motherboards = new File("./data/csv/motherboard.csv");
        File psus = new File("./data/csv/psu.csv");
        File ram = new File("./data/csv/ram.csv");
        File storage = new File("./data/csv/storage.csv");


        openFileAndPrint(psus);
    }

    //Simple open and print to console
    private static void openFileAndPrint(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] values = line.split("\\|");
            System.out.println(Arrays.toString(values));
        }
    }
}

