import java.util.*;

public class StudentFactory {
	public enum Name {
		RUDOLF,
		KLAUS,
		MATTHIAS,
		PAWEŁ,
		MIKKEY
	}

	public enum LName {
		SCHENKER,
		MEINE,
		JABS,
		MĄCIWODA,
		DEE
	}

	public static List<Student> createStudents(int AMOUNT) {
		List<Student> students = new ArrayList<>();
		Map<Integer, Name> indexedNames = new HashMap<>();
		indexedNames.put(0, Name.KLAUS);
		indexedNames.put(1, Name.MATTHIAS);
		indexedNames.put(2, Name.MIKKEY);
		indexedNames.put(3, Name.PAWEŁ);
		indexedNames.put(4, Name.RUDOLF);
		Map<Integer, LName> indexedLNames = new HashMap<>();
		indexedLNames.put(0, LName.MEINE);
		indexedLNames.put(1, LName.JABS);
		indexedLNames.put(2, LName.DEE);
		indexedLNames.put(3, LName.MĄCIWODA);
		indexedLNames.put(4, LName.SCHENKER);
		for (int i = 0; i < AMOUNT; i++) {
			Random random = new Random();
			int randomAge = 18 + random.nextInt(15);
			String randomName = indexedNames.get(random.nextInt(Name.values().length)).toString();
			String randomLName = indexedLNames.get(random.nextInt(LName.values().length)).toString();
			Student student = new Student(i + 1, randomAge, randomName, randomLName);
			students.add(i, student);
		}
		return students;
	}
}
