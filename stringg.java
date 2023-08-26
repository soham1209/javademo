public class stringg {
    public static void main(String[] args) {
        String brand = "soham";
        System.out.println(brand);
        brand.concat("pagal");// concat used for adding string
        System.out.println(brand);// this can change so it is unmutebale

        StringBuilder brand1 = new StringBuilder("new soham");
        System.out.println(brand1);
        brand1.append("hushar");// append used for adding string in string builder
        System.out.println(brand1);// this can change so it is mutebale

        // type of writing string
        String str = "anda";
        String str1 = new String("anda");
        System.out.println(str);
        System.out.println(str1);

        // refrance check
        String s1 = "pw";
        String s2 = "pw";
        System.out.println(s1 == s2);// check address

        String s3 = new String("skill");
        String s4 = new String("skill");
        System.out.println(s3 == s4);// check address

        // compare string
        String s5 = "pw";
        String s6 = new String("pw");
        System.out.println(s5 == s6);// false due to check address
        System.out.println(s5.equals(s6));// true due to check value

        // ex2
        String s7 = "pwjava";
        String s8 = "pwjava";
        String s9 = "pwJava";
        System.out.println(s7 == s8);
        System.out.println(s7 == s9);// refrance
        System.out.println(s7.equals(s8));
        System.out.println(s7.equals(s9));// value

        // ex3
        s7 = "pwskill";
        String s10 = new String("pwskill");
        String s11 = new String("pwskill");
        System.out.println(s7 == s10);
        System.out.println(s10 == s11);// refrance
        System.out.println(s7.equals(s10));// value
        System.out.println(s10.equals(s11));

        String s12 = new String("SKILL");
        s7 = "skill";
        System.out.println(s12.equals(s7));
        System.out.println(s12.equalsIgnoreCase(s7));// ingore the case sensetiveness

        String s13 = new String("pw");
        // s13.concat("skill");// this will not give cocatded string
        s13 = s13.concat("skill");
        System.out.println(s13);

        String s14 = "pwjava";
        String s15 = s14.concat("skill");
        String s16 = new String("pwjava");
        s16 = s16.concat("skill");
        System.out.println(s14);
        System.out.println(s15);
        System.out.println(s16);

        String s17 = "pw";
        String s18 = "pw" + "java";
        String s19 = "pw" + "java" + "blr";
        String s20 = s17 + s18;
        System.out.println(s17);
        System.out.println(s18);
        System.out.println(s19);
        System.out.println(s20);

        str = "pw" + 100 + 3;
        // str.concat(50); // not allowed
        System.out.println(str);

        // inbuild method in string class

        str = "pw java";
        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.charAt(1));
        System.out.println(str.substring(3, 7));
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));

        // mutable string
        StringBuffer sb = new StringBuffer("virat");
        System.out.println(sb);
        // StringBuffer sb= "so"; this is not allowed
        sb.append("kohali");
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("virat");
        System.out.println(sb1);
        sb1.append("kohali");
        System.out.println(sb1);

        // final vs buffer
        // final String st= "soham";
        // st= st.concat("Sonawane");// this is not allowed due to final becouse it
        // change the address of st
        final StringBuffer st = new StringBuffer("soham");
        st.append("sonawane");// this is allowed becouse it dis not change address
        // st= new StringBuffer("virat")// this is not allowed due to final becouse it
        // change the address of st

        StringBuffer sa = new StringBuffer();
        StringBuilder sa1 = new StringBuilder();
        System.out.println(sa.capacity());// how many caracters you can put in
        // System.out.println(sa.length())//how many caractors you put in
        System.out.println(sa1.capacity());
        sa.append("abcdefghijklmnop");
        System.out.println(sa.capacity());// capacity is 16
        sa.append("abcdefghijklajdklfjalksdjf");
        System.out.println(sa.capacity());// as the stirng increse than 16 capacity dubles

        // inbuld methods
        StringBuffer sb2 = new StringBuffer("sachin");
        String sb3 = "sachina";

        System.out.println(sb2.capacity());
        System.out.println(sb2.charAt(1));
        // System.out.println(sb3.setCharAt(1,'S'));
        sb2.setCharAt(1, 'A');
        System.out.println(sb2);
        StringBuffer sb4 = new StringBuffer(150);
        System.out.println(sb4.capacity());
        sb4.append("java");
        System.out.println(sb4);
        sb4.trimToSize();
        System.out.println(sb4.capacity());
        System.out.println(sb4.reverse());
    }

}
