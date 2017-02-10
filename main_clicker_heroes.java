import java.util.Scanner; 
public class main_clicker_heroes {
	public static void main(String[] args) {

		System.out.println("Welcome To Clicker Heroes");
		spacer space = new spacer();
		space.spacerDoSomething();
    System.out.println("Whats your name?:");
		space.spacerDoSomething();
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
    System.out.println("Your name is: " + name + "!");
		space.spacerDoSomething();


	}
}

