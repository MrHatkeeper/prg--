package lambda;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.DoubleFunction;
import java.util.function.IntPredicate;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputInString = sc.nextLine().split(" ");

        ArrayList<Integer> input = new ArrayList<>();

        for (String s : inputInString) {
            input.add(Integer.parseInt(s));
        }


        while(true){
            String command = sc.nextLine();

            switch (command) {
                case "Eleven":
                    System.out.println(filter(input, i -> i % 11 == 0));
                    break;
                case "Power":
                    System.out.println(filter(input, i -> Integer.toString(i * i * i).charAt(Integer.toString(i * i * i).length() - 1) == '3'));
                    break;
                case "Multiply":
                    System.out.println(apply(input, i -> i * 2));
                    break;
                case "Percentage":
                    System.out.println(apply(input, i -> (double) (Math.round(i / 1000 * 80) * 10)));
                    break;
            }
        }



    }

    private static ArrayList<Integer> filter(ArrayList<Integer> input, IntPredicate by){
        ArrayList<Integer> output = new ArrayList<>();
        for(Integer i : input){
            if(by.test(i)) output.add(i);
        }
        return output;
    }

    private static ArrayList<Double> apply(ArrayList<Integer> input, DoubleFunction<Double> by){
        ArrayList<Double> output = new ArrayList<>();
        for(Integer i : input){
            output.add(by.apply(i));
        }
        return output;
    }
}
