package TrainingApp;

public class Factory {
	public void get(Training t) {
		if(t instanceof Qspiders) {
			Qspiders q=(Qspiders)t;
			System.out.println("Welcome to Qspider");
			q.course();
			q.timing();
			q.price();
		}
		else if(t instanceof Udemy) {
			Udemy u=(Udemy)t;
			System.out.println("Welcome to Udemy");
			u.course();
			u.timing();
			u.price();
		}
		else  if(t instanceof Unacademy) {
			Unacademy un=(Unacademy)t;
			System.out.println("Welcome to Unacademy");
			un.course();
			un.timing();
			un.price();
		}
		else  if(t instanceof Groww) {
			Groww g=(Groww)t;
			System.out.println("Welcome to Groww");
			g.course();
			g.timing();
			g.price();
		}
	}
}
