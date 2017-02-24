import java.util.Scanner; 
public class main_clicker_heroes {
	public static void main(String[] args) {
		
		//define spacers, methods, and scanners here
		Scanner scan = new Scanner(System.in);
		spacer space = new spacer();
		space.spacerDoSomething();
		//define variables here
			//define Strings here
			String answer = "";
			//define chars here
			//define ints here
		//code so far and name input
		System.out.println("Welcome To Clicker Heroes");
		space.spacerDoSomething();
		System.out.println("Do you want a tutorial? Type 'yes' or no'");
		answer=scan.next();
		//tutorial
		if (answer.equals("yes") || answer.equals("Yes"))
		{
			space.spacerDoSomething();
			System.out.println("The name of the game is to click!");
			System.out.println("Click to damage enemy health. The faster you click, the faster you progress.");
			System.out.println("Each enemy has a time limit, they won't stick around forever.");
			System.out.println("If you don't defeat them before the time limit is over, you must retry from their srtarting health.");
			System.out.println("Enemies drop coins. Harder enemies drop the most coins");
			System.out.println("You can buy items from the shop with coins to make your clicks do more damage or to increase time limits!");
			space.spacerDoSomething();
		}
    System.out.println("Whats your name?:");
		space.spacerDoSomething();
    String name = scan.next();
    System.out.println("Your name is: " + name + "!");
		space.spacerDoSomething();

	}
}

