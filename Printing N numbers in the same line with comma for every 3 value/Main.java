import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i=1,j=1;
    //System.out.print(i);
    for(;i<=n;i++)
    {if(j>3){
    System.out.print(",");
      System.out.print(i);
      
      j=1;
    }
     else
     {
     System.out.print(i);
     }
      j++;
      //if()
    }
  }
}