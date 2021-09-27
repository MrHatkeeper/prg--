package Ovoce;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> ovoce = new ArrayList<String>();
        ArrayList<String> zelenina = new ArrayList<String>();

        System.out.println("Počet ovoce:");
        int addOvoce = Integer.parseInt(sc.nextLine());
        System.out.println("Počet zeleniny:");
        int addZelenina = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < addOvoce;i++){
            System.out.println("Přidej ovoce");
            ovoce.add(sc.nextLine());
        }
        for(int i = 0; i < addZelenina;i++){
            System.out.println("Přidej zeleninu");
            zelenina.add(sc.nextLine());
        }

        while(true){
            System.out.println("Co hledáš");
            String search = sc.nextLine();

            if(search.equals("END")){
                break;
            }
            for (String s : ovoce) {
                if (search.equals(s)) {
                    System.out.println("Je to ovoce");
                    break;
                }
            }
            for (String s : zelenina) {
                if (search.equals(s)) {
                    System.out.println("Je to zelenina");
                    break;
                }
            }
        }

    }
}
