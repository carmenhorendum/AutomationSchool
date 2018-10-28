package com.dh.examresults;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application {
	public static void main(String[] args) {

		System.out.println("==============================");

		List<Student> students = new ArrayList<>();
		students.add(new Student("Rudolf","Schenker"));
		students.add(new Student("Klaus","Meine"));
		students.add(new Student("Matthias","Jabs"));
		students.add(new Student("Paweł","Mąciwoda"));
		students.add(new Student("Mikkey","Dee"));

		List<Ticket> tickets = new ArrayList<>();
		tickets.add(new Ticket("T-01","What is the Meaning of Life?"));
		tickets.add(new Ticket("T-02","Who am I?"));
		tickets.add(new Ticket("T-03","Could I be living in a Matrix?"));
		tickets.add(new Ticket("T-04","What is Right / Wrong?"));
		tickets.add(new Ticket("T-05","What is Time?"));
		tickets.add(new Ticket("T-06","What happens after death?"));
		tickets.add(new Ticket("T-07","Are human beings just machines?"));
		tickets.add(new Ticket("T-08","Does God Exist?"));
		tickets.add(new Ticket("T-09","Destiny? Free Will?"));
		tickets.add(new Ticket("T-10","What is Philosophy?"));

		int[] grades = new int[]{1,2,3,4,5};

		List<Integer> results = new ArrayList<>();

		for (Student student : students) {

			int idx = new Random().nextInt(grades.length);
			int randomGrd = grades[idx];
			results.add(randomGrd);

			idx = new Random().nextInt(tickets.size());
			Ticket randomTkt = tickets.get(idx);

//			System.out.print(results);
//			System.out.println(results.size());

			System.out.println(randomTkt.getId() + ": " + randomTkt.getQuestion());
			System.out.println(student.getName() + " " + student.getLastName() + ", " + "Result:" + " " + randomGrd);
			System.out.println();

		}

		double average = 0;

		if (results.size() > 0)	{
			double sum = 0;
			for (int j = 0; j < results.size(); j++) {
				sum += results.get(j);
			}
			average = sum / results.size();
		}

		System.out.println("===================");
		System.out.println("Average result:" + " " + average);

	}
}
