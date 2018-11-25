import java.util.*;

public class TaskTwoMain {
	private final static String FIRST_LETTER = "M";
	private final static int AMOUNT = 15;

	public static void main(String[] args) {
		List<Student> students = StudentFactory.createStudents(AMOUNT);
		System.out.println(students);
		NonStream nonStream = new NonStream();

		Collections.sort(students);
		System.out.println("List sorted by Age:");
		for (Student student : students) {
			System.out.println(student.getAge() + " " + student.getName()
					+ " " + student.getLastName());
		}

		System.out.println(String.format("First letter of the name is %s:", FIRST_LETTER));
		List<Student> studentsM = nonStream.getStudentsM(students);
		for (Student student : studentsM) {
			System.out.println(student.getName());
		}

		double average = nonStream.getAverageAge(students);
		System.out.println(String.format("Average age of students is:\n%s", average));

		System.out.println("Names from the Map:");
		Map<Integer, Student> studentsMap = nonStream.getStudentsListToMap(students);
		for (Student key : studentsMap.values()) {
			System.out.println(key.getName());
		}

		System.out.println("Names from the Map (id > 13):");
		Map<Integer, Student> studentMapAboveThree = nonStream.getStudentMapAboveKey(students);
		for (Student key : studentMapAboveThree.values()) {
			System.out.println(key.getName());
		}
	}
}
