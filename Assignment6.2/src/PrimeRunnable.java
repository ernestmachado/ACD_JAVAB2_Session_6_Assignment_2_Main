import java.util.Scanner;

//PrimeRunnable class implements the Runnable Interface.
public class PrimeRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		//Imput the Integer from user
		System.out.println("Enter an Integer :");
		Scanner s=new Scanner(System.in);
		int no=s.nextInt();
		s.close();
	
		// Check if the no is prime or not
		int cnt = 0;
		// Check if the number is divisible by all numbers less that itself except 1
			for (int i = 2; i < no; i++)	 
				if (no % i == 0) {
					cnt++;//If the no entered is divisible cnt flag is set
					break;
				}
			
			if (cnt == 0)
				System.out.println(no + " Number is prime");
			else
				System.out.println(no + " Number is not prime");
		}
}
