//3
//why to use interface with example
interface Computer{
    void compileCode();
}
class Laptop implements Computer{
    public void compileCode(){
        System.out.println( "do compile code");
    }
}
class Desktop implements Computer{
    public void compileCode(){
        System.out.println( "Do compile code faster");
    }
}
class Devloper{
    public void buildApp(Computer com){
        System.out.println( "devloping app");
        com.compileCode();
    }
    
}
public class Interface2 {
    public static void main(String[] args) {
        // Laptop lap = new Laptop();
        Computer com = new Desktop();
        Devloper dev = new Devloper();
        dev.buildApp(com);
    }
}
