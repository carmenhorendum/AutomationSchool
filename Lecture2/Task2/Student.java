public class Student implements Comparable<Student> {

	private final int id, age;
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

	public int getAge() {
		return age;
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
	
	@Override
    	public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
