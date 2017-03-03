import java.util.Scanner; 
public class main_clicker_heroes {
	public static void main(String[] args) {
		
		//define spacers, methods, and scanners here
		Scanner scan = new Scanner(System.in);
		spacer space = new spacer();
		singleSpace singleSpacer = new singleSpace();
		space.spacerDoSomething();
		//define variables here
			//define Strings here
				String answer = "";
				String spec = "";
			//define chars here
			//define ints here
				int damage = 1;
				int time =1;
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
			singleSpacer.singleSpaceGo();
			System.out.println("Click to damage enemy health. The faster you click, the faster you progress.");
			singleSpacer.singleSpaceGo();
			System.out.println("Each enemy has a time limit, they won't stick around forever.");
			singleSpacer.singleSpaceGo();
			System.out.println("If you don't defeat them before the time limit is over, you must retry from their srtarting health.");
			System.out.println("Enemies drop coins. Harder enemies drop the most coins");
			singleSpacer.singleSpaceGo();
			System.out.println("You can buy items from the shop with coins to make your clicks do more damage or to increase time limits!");
			space.spacerDoSomething();
		}
    System.out.println("Whats your name?:");
		space.spacerDoSomething();
    String name = scan.next();
    System.out.println("You will be known as " + name + " from now on!");
		space.spacerDoSomething();
		System.out.println("What specialization are you?");
		space.spacerDoSomething();
		System.out.println("The Warrior has high time and low damage.");
		singleSpacer.singleSpaceGo();		 
		System.out.println("The Fighter has medium time and medium damage.");
		singleSpacer.singleSpaceGo();		 
		System.out.println("The Mage has low time and high damage.");
		singleSpacer.singleSpaceGo();		 
		System.out.println("Type 'Warrior', 'Fighter', or 'Mage' to chose.");
		singleSpacer.singleSpaceGo();		 
		
		//choosing spec	 
		
		answer=scan.next();
		if (answer.equals("Warrior") || answer.equals("warrior"))
		{
			spec = "Warrior";
			time = 10;
			damage = 3;
			System.out.println("You are a " + spec + " with " + time + " time and " + damage + " damage!");

		}
		else if (answer.equals("Fighter") || answer.equals("fighter"))
		{
			spec = "Fighter";
			time = 5;
			damage = 5;
			System.out.println("You are a " + spec + " with " + time + " time and " + damage + " damage!");

		}
		else if (answer.equals("Mage") || answer.equals("mage"))
		{
			spec = "Mage";
			time = 3;
			damage = 10;
			System.out.println("You are a " + spec + " with " + time + " time and " + damage + " damage!");

		}
		space.spacerDoSomething();
		System.out.println("Time to fight your first enemy!");
		singleSpacer.singleSpaceGo();
		System.out.println("This one looks good!");
		singleSpacer.singleSpaceGo();
		System.out.println("Press any button to engage!");
		space.spacerDoSomething();
		answer=scan.next();
		
	}
}

