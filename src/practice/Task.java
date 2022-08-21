package practice;

public class Task implements Comparable<Task> {
	private int date;
	private String task;

	public Task(int date, String task) {
		this.date = date;
		this.task = task;
	}

	public int compareTo(int date_1,int date_2){
		return date_1.date.compareTo(date_2.Task);
	}


}
