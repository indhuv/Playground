import java.util.Scanner;
class Main{
	public static void main (String[] args){
	      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp,sum =0;
      temp = n;
      while(n>0)
      {
        int r = n%10;
       int fact =1;
        for(int i=1 ;i<=r;i++)
        {
          fact = fact*i;
        }
        sum =sum +fact;
        n=n/10;
      }
      if(sum == temp)
        System.out.println("Yes");
      else
        System.out.println("No");
        
    }
}
      