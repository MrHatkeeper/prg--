package Den1;

import java.util.Scanner;

public class CountEvenNumbers {
    public int countNumbers(Scanner sc) {

        int out = 0;
        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                if (Character.getNumericValue(input.charAt(i)) % 3 == 0) {
                    out += Character.getNumericValue(input.charAt(i));
                }
            }
        }

        return out;
    }

}
