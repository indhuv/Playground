import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    
Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      int first_digit = number;
      while(first_digit >=  10)
      {
        first_digit = first_digit / 10;
      }
      int last_digit = number%10;
      int sum =first_digit + last_digit;
      System.out.println(sum);
      
	}
}