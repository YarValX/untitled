public class seminar1 {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        for (int n = 0; n <= 1000; n++) {
            if (i * i <= n && j != 1)
                if (n % 1 == 0) {
                    System.out.println(n + "Составное");
                }
        }
    }
}
