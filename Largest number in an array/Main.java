import java.util.*;
class Main{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
     // System.out.println("enetr array element");
      for(int i=0;i<n;i++)
      {
      arr[i]=sc.nextInt();
      }
      Arrays.sort(arr);
      System.out.println(arr[n-1]);
    }
}