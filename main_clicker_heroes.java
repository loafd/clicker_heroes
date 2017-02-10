import java.util.Scanner; 
public class main_clicker_heroes {
	public static void main(String[] args) {

		System.out.println("Welcome To Clicker Heroes");
		spacer.spacerDoSomething();
    System.out.println("Whats your name?:");
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
    System.out.println("Your name is: " + name + "!");
		spacer.spacerDoSomething();


	}
}

public class spacer {
     public static void spacerDoSomething(){
			System.out.println(" ")
   	 	System.out.println("-------------------------");
			System.out.println(" ")
     }
}
