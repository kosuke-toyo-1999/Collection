package practice;

public class Task implements Comparable<Task> {
	private int date;
	private String task;

	public Task(int i, String task) {
		this.date = i;
		this.task = task;
	}

	// compareToメソッドをオーバーライドする
	// 日付で並び替えるため、LocalDateのcompareToを使う
	
	
	public int compareTo(Task t,Task a){
		
		return t.date.compareTo(a.date);
				//比較する内容を実装してください;
        }
			
	}

