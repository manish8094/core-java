package Loop;

import java.util.ArrayList;
import java.util.Scanner;

public class AutoReply2 {
	public static void main(String[] args) {
		System.out.println("your message hii/hello");
	
	Scanner scan = new Scanner(System.in);

	int i = 0;
	while (i < 1) {
		String hii = scan.nextLine();

		String message;
		message = hii;

		switch (message) {
		case "hii": {
			System.out.println("How can i help you..");
			System.out.println("this is summary to related to over servise...");
			System.out.println("Talk to Over expert...");
			System.out.println("Hospitals..");
			System.out.println("medicine...");
			break;
		}
		case "hello": {
			System.out.println("How can i help you..");
			System.out.println("this is summary to related to over servise...");
			System.out.println("Talk to Over expert...");
			System.out.println("Hospitals...");
			System.out.println("medicine...");

			break;

		}

		case "hospitals": {
			ArrayList<String> list = new ArrayList<>();
			list.add("...THE CITY HOSPITALS ...");
			list.add("ADDRESS =  SAKINAKA WEST MUMBAI ");
			list.add("CONTECT = 09090909099");
			for (int i1 = 0; i1 <= list.size() - 1; i1++) {
				System.out.println(list.get(i1));
			}
			break;
		}
		case "medicine": {
			System.out.println("kilndy tell me whats happan ?");
			System.out.println("(seasonal illness,fever,headache,body pain)");
			int i1 = 0;

			while (i1 < 1) {
				String answer = scan.nextLine();
				String a = "hospitals";

				if (answer.equals(a))

					break;

				switch (answer) {
				case "seasonal illness": {
					System.out.println("kindly visit over hospitals and nearest medical");
				}
					break;
				case "fever": {
					System.out.println("if you face high fever , this is recomended suppliments");
					System.out.println("1. paracitamall " + "2. dollo500" + "3.vics500");
					System.out.println("kindly visit over hospitals");
				}
					break;
				case "headeche": {
					System.out.println("1. saridon advance ");
				}
					break;

				case "body pain": {
					System.out.println("Allopathic flutivate cream , pacimol active tablets");
				}
					break;

				default: {

					throw new IllegalArgumentException(" speeling mistake in... " + answer);
				}

				}
			}
		}
			break;
		default:
			throw new IllegalArgumentException("i cant reach ............... " + message);
		}
	}

}
}
