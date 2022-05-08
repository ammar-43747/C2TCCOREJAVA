import java.util.Scanner;
public class prog5 {
	static int count=0;
 public static int count_digit(int n)
 {
	  if(n<9)
	  {
		  count++;
	  }
	  else 
	  {
		  count++;
	 count_digit(n/10);  
	  }
	return count;
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	System.out.println("enter the digit");
	int n=s.nextInt();
	prog5 ob=new prog5();
    System.out.println("the no of digit is" +ob.count_digit(n));
	}
}
