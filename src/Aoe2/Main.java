package Aoe2;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/Aoe2/input.txt");
        ArrayList<String> input = new ArrayList<String>();

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            input.add(st);

        int out = 0;
        for (String s : input) {
            String[] prismVals = s.split("x");

            int l = Integer.parseInt(prismVals[0]) * Integer.parseInt(prismVals[1]);
            int w = Integer.parseInt(prismVals[1]) * Integer.parseInt(prismVals[2]);
            int h = Integer.parseInt(prismVals[0]) * Integer.parseInt(prismVals[2]);
            int[] values = {l,w,h};

            out += 2*(l+w+h) + lowestNumber(values);
            int testout = l+w+h + lowestNumber(values);
            System.out.println(l + " + " + w + " + " + h + " + "  + lowestNumber(values) + " = " + testout );
        }
        System.out.println(out);
    }

    static int lowestNumber(int[] numbers){
        int out = numbers[0];
        for (int number : numbers) {
            if (number < out) {
                out = number;
            }
        }
        return out;
    }
}
