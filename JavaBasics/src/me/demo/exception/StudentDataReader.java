package me.demo.exception;

public class StudentDataReader {

	public void read(int age, String usn) throws InvalidAgeException {

		age = 26;
		// age = 25;
		if (age == 25) {
			throw new InvalidAgeException();
		} else {
			System.out.println("Process entered data i.e. age.");
		}
		try {
			usn = "1DS14TE001";
			// usn = "1";
			if (usn.contains("DS") && usn.contains("TE")) {
				System.out.println("Valid usn");
			} else {
				throw new InvalidUsnException();
			}
		} catch (InvalidUsnException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Continue safe shut down logic");
		}

	}

}
