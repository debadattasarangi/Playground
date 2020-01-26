import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int o=sc.nextInt();
      int res=gre(n,m);
      if(res>o)
      {
      System.out.println(res);
        
      }
      else{
      System.out.println(o);
      }
                             
	}
  public static int gre(int n,int m)
  {
  if(n>m)
      {
     return n;
        
      }
      else{
      return m;
      }
  }
}