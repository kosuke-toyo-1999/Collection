package practice;

import java.util.Comparator;

public class Task implements Comparable<Task> {
	private int date;
	private String task;

	public Task(int i, String task) {
		this.date = i;
		this.task = task;

	public int compareTo(int t,Task a){
		return t.Task.compareTo(a.date);
	}


}
