import java.util.Scanner;
public class prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.next();
		System.out.println("the length of string  "+str.length());
		System.out.println("enter the string to concat");
		String str1=s.next();
		String str2=str.concat(str1);
		System.out.println("the concated string is "+str2);
	}

}
