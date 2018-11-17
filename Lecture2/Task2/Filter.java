import java.util.ArrayList;
import java.util.List;

public class Filter {
	public static void getStudentsM(List<Student> students, String FIRST_LETTER) {
		List<Student> studentsM = new ArrayList<>();
		for (Student student : students) {
			if (student.getName().startsWith(FIRST_LETTER)) {
				studentsM.add(student);
				System.out.println(String.format("%d %s %s",
						student.getId(),
						student.getName(),
						student.getLastName()
				));
			}
		}
	}
}