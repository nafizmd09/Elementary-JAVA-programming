import java.util.Scanner;
public class Palindrome{
	
	public static void main(String[] args){

		Scanner obj = new Scanner(System.in);
		int sum = 0, temp;//
		System.out.println("Enter any number:");
		int num = obj.nextInt();

		temp = num;

		while(temp != 0)
		{
			int r= temp%10;
			sum=sum*10+r;
			temp = temp/10;
		}
		if(num==sum)
		
			System.out.println("This is Palindrone number");
		else
			System.out.println("Not Palindrone");

	

		//System.out.println("So the result is "+sum);

	}
}