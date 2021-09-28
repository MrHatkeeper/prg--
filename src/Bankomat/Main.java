package Bankomat;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new FileReader("src/Bankomat/input.txt"));

        System.out.println(br.readLine());



    }
}
