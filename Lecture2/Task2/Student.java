public class Student implements Comparable<Student> {

	private int id, age;
	private String name, lastName;

	public Student(int id, int age, String name, String lastName) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int compareTo(Student other) {
		return(age - other.age);
	}
}
