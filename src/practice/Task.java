package practice;

import java.time.LocalDate;

public class Task implements Comparable<Task> {

	private LocalDate date;
	private String task;

	public Task(LocalDate date, String task) {
		this.date = date;
		this.task = task;
	}

	public int compareTo(LocalDate date) {

		return compareTo(date);
	}

}
