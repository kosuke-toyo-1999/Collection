package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task implements Comparable<Task> {
	private LocalDate date;
	private String task;

	public Task(LocalDate date, String task) {
		this.date = date;
		this.task = task;
	}
	// compareToメソッドをオーバーライドする
	// 日付で並び替えるため、LocalDateのcompareToを使う

	@Override
	public int compareTo(Task t){
		
		return //比較する内容を実装してください;
			
	}
}
