//Implement a class that checks whether a given number is a prime using both the Thread class and Runnable interface
public class Primemain {
public static void main(String[] args) {
	// TODO Auto-generated constructor stub
	
	//Create object of Class implementing the Runnable Interface
	PrimeRunnable pr=new PrimeRunnable();
	//Create a thread using the object of the Class implementing the Runnable Interface
	Thread p=new Thread(pr);
	//Initiate the Thread
	p.start();
}
}
