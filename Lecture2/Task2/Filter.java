import java.util.List;
import java.util.Map;

public interface Filter {
	List<Student> getStudentsM(List<Student> students);
	double getAverageAge(List<Student> students);
	Map<Integer, Student> getStudentsListToMap(List<Student> students);
	Map<Integer, Student> getStudentMapAboveKey(List<Student> studentsMap);
}