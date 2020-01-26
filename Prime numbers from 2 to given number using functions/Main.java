import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i=2,res,o;
      for(;i<=n;i++){
      o=prime(i);
      if(o==2)
      {
      System.out.println(i);
      }
      }
	}
  public static int prime(int m)
  {
  int j,k=0;
        for(j=1;j<=m;j++)
           {
              if(m%j==0)
                 {
                    k++;
                 }
            }
      return k;
  }
}