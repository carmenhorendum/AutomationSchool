import java.util.*;

public class TaskTwoMain {
	public static void main(String[] args) {
		final String FIRST_LETTER = "M";
		List<Student> students = new ArrayList<>();

		students.add(new Student(1, 60, "Rudolf", "Schenker"));
		students.add(new Student(2, 75, "Klaus", "Meine"));
		students.add(new Student(3, 55, "Matthias", "Jabs"));
		students.add(new Student(4, 58, "Paweł", "Mąciwoda"));
		students.add(new Student(5, 64, "Mikkey", "Dee"));

		Collections.sort(students);
		System.out.println("List sorted by Age:");
		for (Student student : students) {
			System.out.println(student.getAge() + " " + student.getName());
		}

		System.out.println(String.format("First letter of the name is %s:", FIRST_LETTER));
		List<Student> studentsM = getStudentsM(students, FIRST_LETTER);
		for (Student student : studentsM) {
			System.out.println(student.getName());
		}

		double average = 0;
		System.out.println(String.format("Average age of students is:\n%s",
				getAvarageAge(average, students)));

		System.out.println("Names from the Map:");
		Map<Integer, Student> studentsMap = getStudentsListToMap(students);
		for (Student key : studentsMap.values()) {
			System.out.println(key.getName());
		}

		System.out.println("Names from the Map (id > 3):");
		Map<Integer, Student> studentMapAboveThree = new HashMap<>();
		for (Student key : studentsMap.values()) {
			if (key.getId() > 3) {
				studentMapAboveThree.put(key.getId(), key);
				System.out.println(key.getName());
			}
		}
	}

	private static List<Student> getStudentsM(List<Student> students, String FIRST_LETTER) {
		List<Student> studentsM = new ArrayList<>();
		for (Student student : students) {
			if (student.getName().startsWith(FIRST_LETTER)) {
				studentsM.add(student);
			}
		}
		return studentsM;
	}

	private static double getAvarageAge(double average, List<Student> students) {
		if (students.size() > 0) {
			double sum = 0;
			for (Student student : students) {
				sum += student.getAge();
			}
			average = sum / students.size();
		}
		return average;
	}

	private static Map<Integer, Student> getStudentsListToMap(List<Student> students) {
		Map<Integer, Student> studentsMap = new HashMap<>();
		for (Student student : students) {
			studentsMap.put(student.getId(), student);
		}
		return studentsMap;
	}
}
