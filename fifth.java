public class fifth {
    public static void main(String[] args) {
        //first
        int n = 21;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j||i+j==n-1||i==0||j==0||i==n-1||j==n-1||i+j==(n-1)/2||i-j==(n-1)/2||j-i==(n-1)/2||j+i==((n-1)+(n-1)/2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if(i+j==(n-1)/2||i-j==(n-1)/2||j-i==(n-1)/2||j+i==((n-1)+(n-1)/2)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if(i==j||i+j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("  ");

        }
        //second
        System.out.println("\n\n\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j <= (n - 1) / 2 || j == 0 && i <= (n - 1) / 2||i+j<=(n-1)/2||
                    i== 0&&j>=(n-1)/2||j==n-1&&i<=(n-1)/2||j-i>=(n-1)/2||
                    j==0 &&i>=(n-1)/2||i==n-1&&j<=(n-1)/2||i-j>=(n-1)/2||
                    j==n-1&&i>=(n-1)/2||i==n-1&&j>=(n-1)/2||i+j>=n-1+(n-1)/2) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            } System.out.println(" ");

        }
        //third
        System.out.println("\n\n\n");
        // int n= 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n*2-1; j++) {
                if (i+j>=n-1 && j-i<=n-1) {
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
