public class Main {

    public static void main(String[] args) {
        int i = 'f';
        long l;
        float f = .234f;
        double d = .346;
        short s;
        byte b;
        char c = 'd';
        boolean bl;
        //--------------------
        int[] ints = new int[12];
        ints[1] = 0;

        int[] tmp = new int[ints.length + 1];
        for (int j = 0; j < ints.length; j++) {
            tmp[j] = ints[j];
        }
        ints = tmp;

        String s1 = "Привет!";
        s1 += "?";
        System.out.println(s1.repeat(4).length());
        System.out.println("!".repeat(32));

    }


}
