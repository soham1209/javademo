public class patten_of_name {
    public static void main(String[] args) {
        //printing name in java
        System.out.println("\n Hear is my name in patten");
        int soham= 9;
        for (int i = 0; i < soham; i++) {
            for (int j = 0; j < soham; j++) {
                if (i == 0 || i == (soham- 1) / 2 || i == soham- 1 || j == 0 && i < (soham- 1) / 2
                        || j == soham- 1 && i > (soham- 1) / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            for (int j = 0; j < soham; j++) {
                if (i == 0 || j == 0 || i == soham- 1 || j == soham- 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            for (int j = 0; j < soham; j++) {
                if (j == 0 || i == (soham-1) /2 || j == soham- 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            for (int j = 0; j < soham; j++) {
                if (i == 0 || j == 0 || i == (soham- 1) / 2 || j == soham- 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
             for (int j = 0; j < soham; j++) {
                if (i == 0 || j == 0 || j == (soham- 1) / 2 || j == soham- 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
// System.out.println("fouth pattern");
// int a = 6;
// for (int i = 0; i < a; i++) {
// for (int j = 0; j < a; j++) {
// if (i == 0 || j == 0 || i == (a - 1) / 2 || j == a - 1) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// int h= 6;
// for (int i = 0; i < h; i++) {
// for (int j = 0; j < h; j++) {
// if (j == 0 || i == (h / 2) - 1 || j == h - 1) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// public class practics {
// public static void main(String[] args) {
// int s = 7;
// for (int i = 0; i < s; i++) {
// for (int j = 0; j < s; j++) {
// if (i == 0 ||i == (s-1)/2|| i == s - 1 || j == 0 && i < (s - 1) / 2 || j == s
// - 1 && i > (s - 1) / 2) {
// System.out.print("*");

// } else {
// System.out.print(" ");
// }
// }
// System.out.println(" ");
// }
// }
// }
// int s = 7;
// for (int i = 0; i < s; i++) {
// for (int j = 0; j < s; j++) {
// if (i==0||j==0||j==(s-1)/2||j==s-1) {
// System.out.print(" *");

// } else {
// System.out.print(" ");
// }
// }
// System.out.println(" ");
// }