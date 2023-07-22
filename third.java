public class third {
    public static void main(String[] args) {
        // if elase stetment
        int a = 7;
        if (a == 10) {
            System.out.println("this is so good");
        }
        else {
            System.out.println("this is not good");
        }
        for (int i = 0; i < a; i++) {
            System.out.println("*");
        }
        while (a<15) {
            System.out.println("#");
            a++;
        }
        do {
            System.out.println("+");
            a++;
        } while (a<17);
int b = 20;
        int ma=(b<19)?a:b;
        System.out.println(ma);

    }
}
