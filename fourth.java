public class fourth {
    public static void main(String[] args) {
        // pattern printing
        System.out.println("first pattern");
        System.out.println("printing pattern");
        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
        System.out.println("\nsecond pattern");

        for (int i = 0; i < 4; i++) {
            System.out.println("");
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
        }

        System.out.println("\n thired patten");
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("fouth pattern");
        int m = 6;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || j == 0 || i == (m - 1) / 2 || j == m - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("fifth pattern");
        int o = 6;
        for (int i = 0; i < o; i++) {
            for (int j = 0; j < o; j++) {
                if (j == 0 || i == (o / 2) - 1 || j == o - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // do your name soham for practice

        int s1= 7;
        for (int i = 0; i < s1; i++) {
            for (int j = 0; j < s1; j++) {
                if (i == 0 ||i == (s1-1)/2|| i == s1 - 1 || j == 0 && i < (s1 - 1) / 2 || j == s1 - 1 && i > (s1 - 1) / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
            }   
        
        // now some more complex program and pattern
        System.out.println("next one pattern");
        int s = 10;
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                if (i == 0 && j > 0 && j < (s - 1) / 2
                        || j == 0 && i > 0
                        || i == (s- 1) / 2 && j <= (s - 1) / 2
                        || j == (s - 1) / 2 && i > 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("next two  pattern");
        int z = 10;
        for (int i = 0; i < z; i++) {
            for (int j = 0; j < z; j++) {
                if (i==0&&j<(z-1)/2||j==0||j==(z-1)/2&&i>0&&i<z-1||i==z-1&&j<(z-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("next three pattern");
        int h = 10;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                if (i==0&&j<(h-1)/2||j==0||j==(h-1)/2&&i>0&&i<h-1||i==h-1&&j<(h-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (int j = 0; j < h; j++) {
                if (i==0&&j<(h-1)/2||j==0||j==(h-1)/2&&i>0&&i<h-1||i==h-1&&j<(h-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        /*
         * // using array
         * int arr[]={5,5,6,7,8,9,10,45};
         * System.out.println("\nprinting even numbers");
         * for (int j = 0; j < arr.length; j++) {
         * if (arr[j]%2==0) {
         * System.out.println(arr[j]);
         * }
         * }
         * System.out.println("Odd Array Elements:");
         * for (int j2 = 0; j2 < arr.length; j2++) {
         * if(arr[j2 ]%2!=0)
         * {
         * System.out.println(arr[j2]);
         * }
         * }
         */
    }
}
