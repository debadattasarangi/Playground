import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		// Type your code here
      int year=in.nextInt();
      int b=0;
      if(year%4==b){
        if(year%100==b)
        {
          if(year%400==b)
            {
              System.out.println("Leap year");
             }
          else
          {
          System.out.println("Non Leap year");
          }
         
        }
      }
      else
      {
      System.out.println("Not Leap year");
      }
    }
}