import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CountEvenNumbers cen = new CountEvenNumbers();
        //System.out.println(cen.countNumbers(sc));

        SmollHigh sh = new SmollHigh();
        //System.out.println(Arrays.toString(sh.highSmall(sc)));

        CountNum cn = new CountNum();
        //System.out.println(cn.countNum(sc));

        Aoe aoe = new Aoe();
        System.out.println(aoe.adventOfCodePartOne(sc));
        System.out.println(aoe.adventOfCodePartTwo(sc));
    }
}
