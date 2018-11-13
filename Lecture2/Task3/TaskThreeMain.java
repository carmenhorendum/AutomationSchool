import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskThreeMain {
	public static void main(String[] args) {
		final String FIRST_LETTER = "M";
		List<Student> students = new ArrayList<>();

		students.add(new Student(1, 60, "Rudolf", "Schenker"));
		students.add(new Student(2, 75, "Klaus", "Meine"));
		students.add(new Student(3, 55, "Matthias", "Jabs"));
		students.add(new Student(4, 58, "Paweł", "Mąciwoda"));
		students.add(new Student(5, 64, "Mikkey", "Dee"));

		System.out.println("List sorted by Age:");
		students = getSortByAge(students);
		for (Student student : students) {
			System.out.println(student.getAge() + " " + student.getName());
		}

		System.out.println(String.format("First letter of the name is %s:", FIRST_LETTER));
		List<Student> studentsM = getStudentsM(students, FIRST_LETTER);
		for (Student student : studentsM) {
			System.out.println(student.getName());
		}

		System.out.println(String.format("Average age of students is:\n%s",
				getAverageAge(students)));

		System.out.println("Names from the Map:");
		Map<Integer, Student> studentsMap = getStudentsListToMap(students);
		for (Student key : studentsMap.values()) {
			System.out.println(key.getId() + " " + key.getName());
		}

		studentsMap = getMapAboveThree(students);
		System.out.println("Names from the Map (id > 3):");
		studentsMap.forEach((integer, student) ->
				System.out.println(integer + " " + student.getName()));
	}

	private static List<Student> getSortByAge(List<Student> students) {
		Comparator<Student> byAge = Comparator.comparingInt(Student::getAge);
		return students.stream().sorted(byAge).collect(Collectors.toList());
	}

	private static List<Student> getStudentsM(List<Student> students, String FIRST_LETTER) {
		return students.stream().filter(name -> name.getName().startsWith(FIRST_LETTER))
				.collect(Collectors.toList());
	}

	private static double getAverageAge(List<Student> students) {
		return students.stream().mapToInt(Student::getAge).average().getAsDouble();
	}

	private static Map<Integer, Student> getStudentsListToMap(List<Student> students) {
		return students.stream().collect(Collectors.toMap(Student::getId, student -> student));
	}

	private static Map<Integer, Student> getMapAboveThree(List<Student> students) {
		return students.stream().filter((id) -> id.getId() > 3)
				.collect(Collectors.toMap(Student::getId, student -> student));
	}
}