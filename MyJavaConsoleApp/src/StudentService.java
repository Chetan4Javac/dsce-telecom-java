/**
 * Class to demonstrate<br>
 * 1. Define a java bean<br>
 * 2. static and non static variables and methods <br>
 * Please check {@link Student} class
 * 
 * @author Chetan Gorkal
 *
 */
public class StudentService {

	public static void main(String[] args) {

		// access static method using the class name.
		Student.printDepartment();
		// Student.readDpartment();

		Student shivaKumar = new Student();
		// access non static variables using an instance of Student class
		shivaKumar.name = "shivaKumar";
		shivaKumar.phone = "1479234723";
		// access non static method using an instance
		shivaKumar.readDepartment();
		// access static method using an instance
		shivaKumar.printDepartment();

		// Can't access static method from an instance!
		// shivaKumar.readDepartment();

		shivaKumar.name = "shivaKumar";
		shivaKumar.phone = "1479234723";

		Student ganesh = new Student();
		ganesh.name = "Ganesh";
		ganesh.phone = "1479234723";

		Student ashwini = new Student();
		ashwini.name = "Ashwini";
		ashwini.phone = "1479234723";

		System.out.println(shivaKumar.name);

		// access static variable from an instance
		System.out.println(shivaKumar.department);

		// access static variable from an instance
		System.out.println(ganesh.name);

		// access static variable from using class
		System.out.println(Student.department);
		// System.out.println(ganesh.department);

		System.out.println(ashwini.name);
		System.out.println(ashwini.department);
	}

}
