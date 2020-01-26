import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int b=sc.nextInt();
      int e=sc.nextInt();
      int res=pow(b,e);
      System.out.println(res);
    }
  public static int pow(int b,int e)
  {
  int i=1,res=1;
    for(;i<=e;i++)
    {
    res=res*b;
    }
    return res;
  }
}