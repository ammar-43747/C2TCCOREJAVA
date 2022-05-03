import java.util.Scanner;
public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("enter the number ");
       Scanner s=new Scanner(System.in);
       int x=s.nextInt();
       int temp=x;
       int rem,rev=0;
       while(x>0) 
       {
    	  rem=x%10;
    	  rev=rev*10+rem;
    	  x=x/10;
       }
       if (temp==rev)
       {
    	   System.out.println(temp+" is palindrome ");
       }
    	  else
    		   System.out.println(temp+" is not palindrome ");
}

}
