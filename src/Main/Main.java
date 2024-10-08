package Main;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		fighter ken = new fighter("Ken", 15, 100, 90, 0);
		fighter ryan = new fighter("Ryan", 1, 100, 100, 5);
		
		Ring r = new Ring(ken,ryan , 90 , 100);
		r.run();
		
	}
}
