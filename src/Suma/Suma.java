package Suma;

import java.util.ArrayList;
import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();
        do {
            input.add(sc.nextInt());

        } while (!sc.nextLine().equals("end"));
        int out = 0;
        for (Integer integer : input) {
            out += integer;
        }
        System.out.println(out);
    }
}
