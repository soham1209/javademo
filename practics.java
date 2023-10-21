import java.util.Scanner;

class practics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        sc.close();
        int j = s.length()-1;
        boolean flag = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == s.charAt(j)) {
                flag= true;
            } 
            else {
                flag = false;
                break;
            }
            j = j- 1;
        }
        if(flag==true) System.out.println("yes");
        else System.out.println("No");
    }
}