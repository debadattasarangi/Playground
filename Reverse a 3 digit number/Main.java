import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i=3;
    for(int j=0;j<i;j++)
    {
    int a=n%10;
    System.out.print(a);
    n=n/10;
    }
  }
}