package TrainingApp;

public class Udemy implements Training{

	@Override
	public void course() {
		System.out.println("Courses offered : MERN and MEAN");
		
	}

	@Override
	public void timing() {
		System.out.println("Time : 2 to 3 Months");
		
	}

	@Override
	public void price() {
		System.out.println("Price : 25000");
		
	}
 
}
