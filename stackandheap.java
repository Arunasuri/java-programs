package oct16th2024;
 class Pack
 {
        int x=15;//x variable data will store in heap memory//
       public int add(int r,int r1)//add method in heap memory and it sends the address to stack//
       {
           return  r+r1;
       }
 }
public class stackandheap {
    public static void main(String args[])
    {
        int a=10;//a variable data will store in stack//
        Pack p=new Pack();
         int result=p.add(5,6);
        System.out.println(result);
        System.out.println(p.x);
    }
}
