import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int key1=in.nextInt();
      int key2=in.nextInt();
       int elem_1_i = -1;
        int elem_2_i = -1;
      for(int i=0;i<n;i++)
      {
        if(a[i]==key1)
        {
          elem_1_i=i;
        }
          
          if(a[i]==key2)
        {
            elem_2_i=i;
          }
      }
         System.out.println(elem_1_i);
        System.out.println(elem_2_i);
        
        }
      }
      
        
  