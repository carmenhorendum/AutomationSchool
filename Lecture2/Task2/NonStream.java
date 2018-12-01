import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonStream implements Filter {

	@Override
	public List<Student> getStudentsM(List<Student> students) {
		final String FIRST_LETTER = "M";
		List<Student> studentsM = new ArrayList<>();
		for (Student student : students) {
			if (student.getName().startsWith(FIRST_LETTER)) {
				studentsM.add(student);
			}
		}
		return studentsM;
	}

	@Override
	public double getAverageAge(List<Student> students) {
		double average = 0;
		if (students.size() > 0) {
			double sum = 0;
			for (Student student : students) {
				sum += student.getAge();
			}
			average = sum / students.size();
		}
		return average;
	}

	@Override
	public Map<Integer, Student> getStudentsListToMap(List<Student> students) {
		Map<Integer, Student> studentsMap = new HashMap<>();
		for (Student student : students) {
			studentsMap.put(student.getId(), student);
		}
		return studentsMap;
	}

	@Override
	public Map<Integer, Student> getStudentMapAboveKey(List<Student> students) {
		Map<Integer, Student> studentMapAboveKey = new HashMap<>();
		for (Student key : students) {
			if (key.getId() > 13) {
				studentMapAboveKey.put(key.getId(), key);
			}
		}
		return studentMapAboveKey;
	}
}
