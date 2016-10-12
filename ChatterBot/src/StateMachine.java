import java.io.InputStream;
import java.util.Scanner;

public class StateMachine implements Runnable {

	
	private int index = 0;

	public static void main(String[]args) {
		StateMachine sm = new StateMachine();
		sm.run();
		
	}

	public void run() {
		boolean done = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Start Convo!");
		while (!done) {			
			String input = scan.nextLine();
			States state = States.StateA;
			while (state != States.StateP) {
				String currentChar = nextChar(input.toLowerCase());
				System.out.println("currentChar: "+ currentChar);
				switch (state) {
				case StateA:
					if (currentChar.equals("h")) {
						state = States.StateB;
					} else if (currentChar.equals("")) {
						state = States.StateP;
					} else {
						state = States.StateA;
					}
					break;
				case StateB:
					if (currentChar.equals("i") || currentChar.equals("o")) {
						state = States.StateE;
					} else if (currentChar.equals("h")) {
						state = States.StateB;
					} else {
						state = States.StateA;
					}
					break;
				case StateC:
					break;
				case StateD:
					break;
				case StateE:
					if (currentChar.equals("i")) {
						state = States.StateG;
					}
					break;
				case StateF:
					break;
				case StateG:
					System.out.println("Hello");
					state = States.StateP;
					break;
				case StateH:
					break;
				case StateI:
					System.out.println("Let's ride buckaroo!");
					state = States.StateP;
					break;
				case StateJ:
					System.out.println("Fine, and you?");
					state = States.StateP;
					break;
				case StateP:
					break;
				}
			}

		}

	}

	public String nextChar(String input) {
		char [] theChars = input.toCharArray();
		String currentChar = "";
		if(index <= theChars.length-1){
			currentChar = Character.toString(theChars[index]);
			index++;
		}
		return currentChar;
	}

	enum States {
		StateA, StateB, StateC, StateD, StateE, StateF, StateG, StateH, StateI, StateJ, StateP
	}

}
