package classroom_vacancy_monitoring_system;
import java.util.Scanner;


public class classroom_vacancy_monitoring_system {
	
	// TO ASSIGN WHETHER THE CREATED ROOM IS AVAILABLE OR UNAVAILABLE
	public static class RoomState {
		String sun;
		String mon;
		String tue;
		String wed;
		String thu;
		String fri;
		String sat;
		
		public RoomState(char sun, char mon, char tue, 
						char wed, char thu, char fri, char sat) {
			this.sun = "[" + sun + "]";
			this.mon = "[" + mon + "]";
			this.tue = "[" + tue + "]";
			this.wed = "[" + wed + "]";
			this.thu = "[" + thu + "]";
			this.fri = "[" + fri + "]";
			this.sat = "[" + sat + "]";
		}
	}

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Create ROOMS
        RoomState[] roomStates = new RoomState[4];
        roomStates[1] = new RoomState(' ', 'V', ' ', ' ', ' ', ' ', ' '); // ROOM 1
        roomStates[2] = new RoomState(' ', ' ', 'V', ' ', ' ', ' ', ' '); // ROOM 2
        roomStates[3] = new RoomState(' ', ' ', ' ', 'V', ' ', ' ', ' '); // ROOM 3
	
        
		// Viewing of the Classroom
		System.out.println("    " + "Sun  "+ "Mon  " + "Tue  " + "Wed  " + 
							"Thu  " + "Fri  "+ "Sat  ");
		for (int i = 1; i < roomStates.length; i++) {
			String roomNum = String.format("%02d", i);
            System.out.println( 
            		roomNum + "  "
					+ roomStates[i].sun + "  " + roomStates[i].mon + "  "
					+ roomStates[i].tue + "  " + roomStates[i].wed + "  "
					+ roomStates[i].thu + "  " + roomStates[i].fri + "  "
					+ roomStates[i].sat + "  ");
        }
		
		
		// CHANGING STATUS AREA
		// Change Status
		System.out.println("\n\nSelect an option:\r\n"
						+ "1. Change status for a specific classroom\r\n"
						+ "2. Exit\n");
		
		System.out.print("Input Room Number: ");
		int roomNum = scanner.nextInt();
		
		// Show the instructions
		System.out.println("Input Instructions:"
				+ "\n- Type X to change into AVAILABLE"
				+ "\n- Type V to change into unavailable"
				+ "\n- Press Enter to Skip\n\n");
	
		System.out.println("Sun  "+ "Mon  " + "Tue  " + "Wed  " + 
				"Thu  " + "Fri  "+ "Sat  ");
		
		roomStates[roomNum] = new RoomState(' ', 'V', ' ', ' ', ' ', ' ', ' ');
	}

}
