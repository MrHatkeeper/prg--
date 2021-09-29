package Aoe2;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/Aoe2/input.txt");
        ArrayList<String> input = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            input.add(st);

        System.out.println("Part one: " + partOne(input));
        System.out.println("Part two: " + outPTwo(input));
    }

    static int outPTwo(ArrayList<String> input) {
        int out = 0;
        for (String s : input) {
            String[] prismVals = s.split("x");

            int[] values = {Integer.parseInt(prismVals[0]), Integer.parseInt(prismVals[1]), Integer.parseInt(prismVals[2])};
            int[] sortedVals = sortNumbers(values);

            out += (sortedVals[0] * sortedVals[1] * sortedVals[2]) + 2 * (sortedVals[0] + sortedVals[1]);
        }
        return out;
    }

    static int partOne(ArrayList<String> input) {
        int out = 0;
        for (String s : input) {
            String[] prismVals = s.split("x");

            int l = Integer.parseInt(prismVals[0]) * Integer.parseInt(prismVals[1]);
            int w = Integer.parseInt(prismVals[1]) * Integer.parseInt(prismVals[2]);
            int h = Integer.parseInt(prismVals[0]) * Integer.parseInt(prismVals[2]);
            int[] values = {l, w, h};
            int[] sortedVals = sortNumbers(values);

            out += 2 * (l + w + h) + sortedVals[0];
        }
        return out;
    }

    static int[] sortNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] <= numbers[j]) {
                    int holder = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = holder;
                }
            }
        }
        return numbers;
    }
}
