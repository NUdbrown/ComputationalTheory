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
			System.out.println("Enter Message: ");
			index = 0;
			String input = scan.nextLine();
			MachineStates state = MachineStates.StateA;
			while (index != input.length()-1) {
				String currentChar = nextChar(input.toLowerCase());
				System.out.println("currentChar: "+ currentChar); 
				switch (state) {
				case StateA:
					if(currentChar.equals("h")){
						state = MachineStates.StateB;
					}else{
						state = MachineStates.StateA;
					}
					//break;
				case StateB:
					if(currentChar.equals("i")){
						state = MachineStates.StateC;
					}
					else if(currentChar.equals("o")){
						state = MachineStates.StateD;
					}
					else{
						state = MachineStates.StateB;					
					}
					//break;
				case StateC:
					System.out.println("Hello");				
					break;
				case StateD:
					if(currentChar.equals("w")){
						state = MachineStates.StateE;
					}else if(currentChar.equals("/w")){
						state = MachineStates.StateH;
					}
					else{
						state = MachineStates.StateD;
					}
				case StateE:
					if(currentChar.equals("D")){
						state = MachineStates.StateF;
					}else{
						state = MachineStates.StateE;
					}
				case StateF:
					if(currentChar.equals("Y")){
						state = MachineStates.StateG;
					}else{
						state = MachineStates.StateF;
					}
				case StateG:
					System.out.println("Let's ride buckaroo!");					
					break;
				case StateH:
					if(currentChar.equals("h")){
						state = MachineStates.StateI;
					}else{
						state = MachineStates.StateH;
					}
				case StateI:
					
					break;
				case StateJ:

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

	enum MachineStates {
		StateA, StateB, StateC, StateD, StateE, StateF, StateG, StateH, StateI, StateJ, StateP
	}

}
