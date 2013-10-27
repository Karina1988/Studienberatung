import java.util.*;

 class Studienberatung{
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hast du eine Berufsausbildung?");
		String antwort = scanner.next();
		if (antwort.equalsIgnoreCase("n")){
			System.out.println("Besser noch studieren.");
		}
		else if (answer.equalsIgnoreCase("j")){
			System.out.println("Du kannst ja später noch studieren.");
		}
	}
}