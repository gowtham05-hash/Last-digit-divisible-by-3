import java.util.Scanner;

public class last_digit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int last = n%10;
		if(last%3==0) {
			System.out.println("Number is divisible by 3");
		}
		else {
			System.out.println("Number is not divisible by 3");
		}

	}

}