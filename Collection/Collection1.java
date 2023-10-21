//array list
import java.util.ArrayList;


class Collection1{
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();//this is making a object of arrayList class or making collection
        al1.add(1);
        al1.add(5);
        al1.add(7);
        System.out.println(al1);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        ArrayList al2= new ArrayList();
        al2.add("soham");
        al2.add("j");
        al2.add(1);
        al2.add(1.1);
        System.out.println(al2);
        al2.add("iron");
        System.out.println( al2);
        System.out.println("***********************************************");

        ArrayList al3 = new ArrayList();
        al3.add(5);
        al3.add(2);
        al3.add(4);
        System.out.println(al3);

        System.out.println("after adding collection");
        al3.addAll(al2);//thsi will add whole colection 2 in 3
        System.out.println(al3);
        
        al3.add(2,"pw");//this will add at specific place//this is possible but not preferred//plase use linklist for insertion on index 
        System.out.println(al3);
        

    }
}