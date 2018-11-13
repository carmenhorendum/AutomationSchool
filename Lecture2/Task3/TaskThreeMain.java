import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskThreeMain {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();

		students.add(new Student(1, 60,"Rudolf","Schenker"));
		students.add(new Student(2, 75,"Klaus","Meine"));
		students.add(new Student(3,55,"Matthias","Jabs"));
		students.add(new Student(4,58,"Paweł","Mąciwoda"));
		students.add(new Student(5,64,"Mikkey","Dee"));

		students = getSortByAge(students);
		System.out.println("List sorted by Age:");
		for (Student student : students) {
			System.out.println(student.getAge() + " " + student.getName());
		}

		System.out.println("Names from the Map:");
		Map<Integer, Student> studentsMap = getStudentsListToMap(students);
		for (Student key: studentsMap.values()) {
			System.out.println(key.getName());
		}

		System.out.println("Names from the Map (id > 3):");
		studentsMap = getMapAboveThree(students);
		for (Student key: studentsMap.values()) {
			System.out.println(key.getName());
		}

	}

	private static List<Student> getSortByAge(List<Student> students) {
		Comparator<Student> byAge = Comparator.comparingInt(Student::getAge);
		students = students.stream().sorted(byAge).collect(Collectors.toList());
		return students;
	}

	private static Map<Integer, Student> getStudentsListToMap(List<Student> students) {
		return students.stream().collect(Collectors.toMap(Student::getId, student -> student));
	}

	private static Map<Integer, Student> getMapAboveThree(List<Student> students) {
		return students.entrySet().stream()
				.filter(map -> map.getKey() > 3)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	}
}
