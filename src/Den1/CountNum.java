package Den1;

import java.util.Scanner;

public class CountNum {
    public int countNum(Scanner sc) {
        int out = 0;

        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            boolean chara = false;
            for (char j = 'A'; j <= 'Z'; j++) {
                if (input.charAt(i) == j) {
                    chara = true;
                    break;
                }
            }
            if (!chara) {
                out += Character.getNumericValue(input.charAt(i));
            }
        }
        return out;
    }
}
