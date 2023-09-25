//1
//final key word
// final class Animal{
//     void sleep(){
//         System.out.println("Animal is sleeping");
//     }
// }
class Animal{
    final void sleep(){
        System.out.println("Animal is sleeping");
    }
}
class Tiger extends Animal{

}
public class FinalKewordInJava {
    public static void main(String[] args) {
        Tiger t= new Tiger();
        t.sleep();
    }
}
