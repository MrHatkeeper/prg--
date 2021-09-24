package Den1;

import java.util.Scanner;

public class SmollHigh {
    public int[] highSmall(Scanner sc){
        int[] out = new int[2];

        int input = sc.nextInt();
        out[0] = input;

        while(sc.hasNext()){
            input = sc.nextInt();
            if(input < out[0]){
                out[0] = input;
            }
            if(input > out[1]){
                out[1] = input;
            }
        }
        return out;
    }
}
