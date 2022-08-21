package practice;

import java.time.LocalDate;

public class Task implements Comparable<Task> {

	private LocalDate date;
	private String task;

	public Task(LocalDate date, String task) {
		this.date = date;
		this.task = task;
	}

	public int compareTo(LocalDate date_1, LocalDate date_2) {

		return date_1.compareTo(date_2);
	}

}
