import java.util.Scanner;

public class StateMachine implements Runnable {

	private int index = 0;

	public static void main(String[] args) {
		StateMachine sm = new StateMachine();
		sm.run();

	}
	
	@Override
	public void run() {
		boolean done = false;
		Scanner scan = new Scanner(System.in);
		MachineStates state = MachineStates.StateA;
		System.out.println("Start Convo!");
		while (!done) {
			if (state == MachineStates.StateC) {
				System.out.println("Hello");
				state = MachineStates.StateA;
			} else if (state == MachineStates.StateG) {
				System.out.println("Let's ride buckaroo!");
				state = MachineStates.StateA;
			} else if (state == MachineStates.StateM) {
				System.out.println("Who do you think you are, Santa?");
				state = MachineStates.StateA;
			} else if (state == MachineStates.StateU) {
				System.out.println("Fine, and you?");
				state = MachineStates.StateA;
			} else if (state == MachineStates.StateX || state == MachineStates.StateB2) {
				System.out.println("Bye");
				done = !done;
				break;
			}

			System.out.println("Enter Message: ");
			String input = scan.nextLine();
			index = 0;
			int inputCount = input.length();
			while (index < inputCount) {
				String currentChar = "" + input.toLowerCase().charAt(index++);
				//System.out.println("currentChar: " + currentChar + " next-index: " + index);
				switch (state) {
				case StateA:
					if (currentChar.equals("h")) {
						state = MachineStates.StateB;
					} else if (currentChar.equals("b")) {
						state = MachineStates.StateV;
					} else if(currentChar.equals("e")){
						state = MachineStates.StateY;
					}
					else {
						state = MachineStates.StateA;
					}
					break;
				case StateB:
					if (currentChar.equals("i")) {
						state = MachineStates.StateC;
					} else if (currentChar.equals("o")) {
						state = MachineStates.StateD;
					} else {
						state = MachineStates.StateB;
					}
					break;
				case StateD:
					if (currentChar.equals("w")) {
						state = MachineStates.StateE;
					} else if (currentChar.equals(" ")) {
						state = MachineStates.StateH;
					} else {
						state = MachineStates.StateD;
					}
					break;
				case StateE:
					if (currentChar.equals("d")) {
						state = MachineStates.StateF;
					} else if (currentChar.equals(" ")) {
						state = MachineStates.StateN;
					} else {
						state = MachineStates.StateE;
					}
					break;
				case StateF:
					if (currentChar.equals("Y")) {
						state = MachineStates.StateG;
					} else {
						state = MachineStates.StateF;
					}
					break;
				case StateH:
					if (currentChar.equals("h")) {
						state = MachineStates.StateI;
					} else {
						state = MachineStates.StateH;
					}
					break;
				case StateI:
					if (currentChar.equals("o")) {
						state = MachineStates.StateJ;
					} else {
						state = MachineStates.StateI;
					}
					break;
				case StateJ:
					if (currentChar.equals(" ")) {
						state = MachineStates.StateK;
					} else {
						state = MachineStates.StateJ;
					}
					break;
				case StateK:
					if (currentChar.equals("h")) {
						state = MachineStates.StateL;
					} else {
						state = MachineStates.StateK;
					}
					break;
				case StateL:
					if (currentChar.equals("o")) {
						state = MachineStates.StateM;
					} else {
						state = MachineStates.StateL;
					}
					break;

				case StateN:
					if (currentChar.equals("a")) {
						state = MachineStates.StateO;
					} else {
						state = MachineStates.StateN;
					}
					break;
				case StateO:
					if (currentChar.equals("r")) {
						state = MachineStates.StateP;
					} else {
						state = MachineStates.StateO;
					}
					break;
				case StateP:
					if (currentChar.equals("e")) {
						state = MachineStates.StateQ;
					} else {
						state = MachineStates.StateP;
					}
					break;
				case StateQ:
					if (currentChar.equals(" ")) {
						state = MachineStates.StateR;
					} else {
						state = MachineStates.StateQ;
					}
					break;
				case StateR:
					if (currentChar.equals("y")) {
						state = MachineStates.StateS;
					} else {
						state = MachineStates.StateR;
					}
					break;
				case StateS:
					if (currentChar.equals("o")) {
						state = MachineStates.StateT;
					} else {
						state = MachineStates.StateS;
					}
					break;
				case StateT:
					if (currentChar.equals("u")) {
						state = MachineStates.StateU;
					} else {
						state = MachineStates.StateT;
					}
					break;
				case StateV:
					if (currentChar.equals("y")) {
						state = MachineStates.StateW;
					} else {
						state = MachineStates.StateV;
					}
					break;
				case StateW:
					if (currentChar.equals("e")) {
						state = MachineStates.StateX;
					} else {
						state = MachineStates.StateW;
					}
					break;
				case StateY:
					if (currentChar.equals("x")) {
						state = MachineStates.StateZ;
					} else {
						state = MachineStates.StateY;
					}
					break;
				case StateZ:
					if (currentChar.equals("i")) {
						state = MachineStates.StateA2;
					} else {
						state = MachineStates.StateZ;
					}
					break;
				case StateA2:
					if (currentChar.equals("t")) {
						state = MachineStates.StateB2;
					} else {
						state = MachineStates.StateA2;
					}
					break;
				}
			}

		}

	}

	public enum MachineStates {
		StateA, StateB, StateC, StateD, StateE, StateF, StateG, StateH,
		StateI, StateJ, StateK, StateL, StateM, StateN, StateO, StateP, 
		StateQ, StateR, StateS, StateT, StateU, StateV, StateW, StateX, 
		StateY, StateZ, StateA2, StateB2
	}

}
