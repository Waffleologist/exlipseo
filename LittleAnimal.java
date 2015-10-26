import java.util.Scanner;
public class LittleAnimal {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is your name?: ");
		String name = keyboard.next();
		System.out.print("What kind of animal do you have?: ");
		String animal = keyboard.next();
		// verse 1
		System.out.println(name + " had a little " + animal);
		System.out.println("little " + animal);
		System.out.println("little " + animal);
		System.out.println(name + " had a little " + animal);
		System.out.println("its fleece was white as snow");
		//verse 2
		//Iadded a new repo to test this
		System.out.println("And everywhere that " + name + " went");
		System.out.println(name + " went,");
		System.out.println(name + " went,");
		System.out.println("And everywhere that " + name + " went");
		System.out.println("The " + animal + " was sure to go");
		//verse 3
		System.out.println("It followed her to school one day");
		System.out.println("school one day");
		System.out.println("school one day");
		System.out.println("It followed her to school one day");
		System.out.println("which was against the rules");
		//verse4
		System.out.println("It made the children laugh and play");
		System.out.println("laugh and play");
		System.out.println("laugh and play");
		System.out.println("it made the children laugh and play");
		System.out.println("to see a " + animal + " at school");
		
	}
}
