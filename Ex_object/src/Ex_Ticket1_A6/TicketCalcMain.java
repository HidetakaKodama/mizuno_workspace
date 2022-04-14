package Ex_Ticket1_A6;

import java.util.Scanner;

public class TicketCalcMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		TicketCalc.basic = s.nextInt();
		TicketCalc.age = s.nextInt();

		TicketCalc.ticket();
	}
}
