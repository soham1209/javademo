import java.util.Scanner;

class slip2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        a=a.toLowerCase();
        for (int i = 0; i < a.length()-1; i++) {
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='u'||a.charAt(i)=='o'||a.charAt(i)=='u')
            System.out.print(a.charAt(i));
        }
        
    }
}