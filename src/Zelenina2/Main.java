package Zelenina2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> input = new HashMap<>();
        Scanner sc = new Scanner(System.in);


        System.out.println("Kolik věcí");
        int count = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < count; i++) {
            System.out.println("Přidat zeleninu");
            String word = sc.nextLine();
            if (input.get(word) != null) {
                System.out.println("už tam jendou je");
                count++;
            }
            else input.put(word, "zelenina");
        }

        System.out.println("Kolik věcí");
        count = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < count; i++) {
            System.out.println("Přidat ovoce");
            String word = sc.nextLine();
            if (input.get(word) != null) {
                System.out.println("už tam jendou je");
            }
            else input.put(word, "ovoce");
        }

        while(true){
            System.out.println("Co hledáš");
            String word = sc.nextLine();
            if(word.equals("END")) break;

            if(input.get(word) == null){
                System.out.println("ostatní");
            }
            else System.out.println(input.get(word));

        }

    }
}
