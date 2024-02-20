package TrainingApp;

public class Unacademy implements Training{

	@Override
	public void course() {
		System.out.println("Courses offered : React.js and Angular.js");
		
	}

	@Override
	public void timing() {
		System.out.println("Time : 5 to 8 Months");
		
	}

	@Override
	public void price() {
		System.out.println("Price : 30000");
		
	}
 
}
