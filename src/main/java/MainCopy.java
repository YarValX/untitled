import java.util.Random;
import java.util.Scanner;
public class MainCopy {
    int r;

    public static void main(String[] args){
        int i = 'f';
        long l;
        float f = .234f;
        double d = .346;
        short s;
        byte b;
        char c = '0';
        boolean b1 = false;
        //-------------------------
        int[] ints = new int[5];

        Random random = new Random();
        for (int j = 0; j < ints.length; j++) ints[j] = random.nextInt( 12, 128);

        int[] tmp = new int[ints.length + 1];
        for (int j=0;j<ints.length;j++){
            tmp[j] = ints[j];
        }
        ints = tmp;

        String s1 = "РџСЂРёРІРµС‚!";
        s1 += "?";
        System.out.println(s1.repeat(4));
        System.out.println("!".repeat(32));
        System.out.println(Integer.toBinaryString(123));

        if ( 1>2 & (i >= 2 || i<100) ) System.out.println(true);

        Scanner scanner = new Scanner(System.in);
        String s2 = scanner.nextLine();
        System.out.println(s2);

    }

    public int setI(int i){
        int h=i;
        return h;
    }

}
