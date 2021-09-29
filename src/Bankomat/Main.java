package Bankomat;

public class Main {
    public static void main(String[] args){
        int input = 5443;

        int[] bankovky = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2,1};
        int out = 0;


        for (int j : bankovky) {
            boolean possible = true;
            while (possible) {
                if (input / j >= 1) {
                    out += 1;
                    input -= j;
                } else {
                    possible = false;
                }
            }
        }
        System.out.println(out);
    }
}
