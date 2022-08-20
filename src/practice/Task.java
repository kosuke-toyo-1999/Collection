package practice;

import java.time.LocalDate;
import java.util.Comparator;


public class Task implements Comparable<Task> {
	private LocalDate date;
	private String task;

	public Task(LocalDate date, String task) {
		this.date = date;
		this.task = task;
	}
}
	// compareToメソッドをオーバーライドする
	// 日付で並び替えるため、LocalDateのcompareToを使う
	
	static class Date implements Comparator<Task> {
        @Override
	public int compareTo(Task t,Task a){
		
		return t.date.compareTo(a.date);
				//比較する内容を実装してください;
        }
			
	}

