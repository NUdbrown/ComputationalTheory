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
			String input = scan.nextLine();
			index = 0;
			int inputCount = input.length();
			MachineStates state = MachineStates.StateA;
			while (index < inputCount) {
				String currentChar = nextChar(input.toLowerCase());
				System.out.println("currentChar: "+ currentChar + " next-index: " + index); 
				switch (state) {
				case StateA:
					if(currentChar.equals("h")){
						state = MachineStates.StateB;
					}
					else if(currentChar.equals("b")){
						state = MachineStates.StateV;
					}
					else{
						state = MachineStates.StateA;
					}
					break;
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
					break;
				case StateC:
					System.out.println("Hello");				
					break;
				case StateD:
					if(currentChar.equals("w")){
						state = MachineStates.StateE;
					}else if(currentChar.equals(" ")){
						state = MachineStates.StateH;
					}
					else{
						state = MachineStates.StateD;
					}
					break;
				case StateE:
					if(currentChar.equals("d")){
						state = MachineStates.StateF;
					}else if(currentChar.equals(" ")){
						state = MachineStates.StateN;
					}
					else{
						state = MachineStates.StateE;
					}
					break;
				case StateF:
					if(currentChar.equals("Y")){
						state = MachineStates.StateG;
					}else{
						state = MachineStates.StateF;
					}
					break;
				case StateG:
					System.out.println("Let's ride buckaroo!");					
					break;
				case StateH:
					if(currentChar.equals("h")){
						state = MachineStates.StateI;
					}else{
						state = MachineStates.StateH;
					}
					break;
				case StateI:
					if(currentChar.equals("o")){
						state = MachineStates.StateJ;
					}else{
						state = MachineStates.StateI;
					}	
					break;
				case StateJ:
					if(currentChar.equals(" ")){
						state = MachineStates.StateK;
					}else{
						state = MachineStates.StateJ;
					}
					break;
				case StateK:
					if(currentChar.equals("h")){
						state = MachineStates.StateL;
					}else{
						state = MachineStates.StateK;
					}
					break;
				case StateL:
					if(currentChar.equals("o")){
						state = MachineStates.StateM;
					}else{
						state = MachineStates.StateL;
					}
					break;
				case StateM:
					System.out.println("Who do you think you are, Santa?");
					break;
				case StateN:
					if(currentChar.equals("a")){
						state = MachineStates.StateO;
					}else{
						state = MachineStates.StateN;
					}
					break;
				case StateO:
					if(currentChar.equals("r")){
						state = MachineStates.StateP;
					}else{
						state = MachineStates.StateO;
					}
					break;
				case StateP:
					if(currentChar.equals("e")){
						state = MachineStates.StateQ;
					}else{
						state = MachineStates.StateP;
					}
					break;
				case StateQ:
					if(currentChar.equals(" ")){
						state = MachineStates.StateR;
					}else{
						state = MachineStates.StateQ;
					}
					break;
				case StateR:
					if(currentChar.equals("y")){
						state = MachineStates.StateS;
					}else{
						state = MachineStates.StateR;
					}
					break;
				case StateS:
					if(currentChar.equals("o")){
						state = MachineStates.StateT;
					}else{
						state = MachineStates.StateS;
					}
					break;
				case StateT:
					if(currentChar.equals("u")){
						state = MachineStates.StateU;
					}else{
						state = MachineStates.StateT;
					}
					break;
				case StateU:
					System.out.println("Fine, and you?");
					break;	
				case StateV:
					if(currentChar.equals("y")){
						state = MachineStates.StateW;
					}else{
						state = MachineStates.StateV;
					}
					break;
				case StateW:
					if(currentChar.equals("e")){
						state = MachineStates.StateX;
					}else{
						state = MachineStates.StateW;
					}
					break;
				case StateX:
					System.out.println("Bye");	
					done = !done;
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
		StateA, StateB, StateC, StateD, StateE, StateF, StateG, 
		StateH, StateI, StateJ, StateK, StateL, StateM, StateN, 
		StateO, StateP, StateQ, StateR, StateS, StateT, StateU,
		StateV, StateW, StateX, StateY, StateZ, StateA2, StateB2
	}

}
