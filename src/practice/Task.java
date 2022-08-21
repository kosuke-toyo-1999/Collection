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
	
	
	public int compareTo(int a,int b){
		
		return a.Task.compareTo(b.Task);
				//比較する内容を実装してください;
        }
			
	}

