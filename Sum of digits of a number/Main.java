import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    
int sum = 0;
      Scanner in = new Scanner(System.in);
      int m = in.nextInt();
      while(m >0)
      {
        int n = m%10;
        sum = sum + n;
        m = m/10;
}
      System.out.println(sum);
}
}