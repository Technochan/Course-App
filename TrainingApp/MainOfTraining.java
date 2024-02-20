package TrainingApp;
import java.util.Scanner;
public class MainOfTraining {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Training Centers");
		System.out.println("***************************");
		System.out.println("Choose the center");
		System.out.println("1.Qspiders\n2.Udemy\n3.Unacademy\n4.Groww");
		System.out.println("***************************");
		int choice = scan.nextInt();
		Factory f =new Factory();
		switch(choice) {
			case 1: f.get(new Qspiders());
					break;
			case 2: f.get(new Udemy());
					break;	
			case 3: f.get(new Unacademy());
					break;
			case 4: f.get(new Groww());
					break;
			default:System.out.println("Invalid choice");
		}
	}
}
