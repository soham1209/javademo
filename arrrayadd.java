class cal{
    public int add(int nums[]){
        int result= 0;
        for (int i : nums) {
            result = result+i;
        }
        return result;
    }
}
public class arrrayadd {
    public static void main(String[] args) {
        cal obj = new cal();
        int nums[]={4,6,9,7,8};
        int result=obj.add(nums);
        System.out.println(result);
        
    }
}

