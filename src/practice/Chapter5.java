package practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter5 {
	public static void main(String[] args) {
	    // プログラムを作成
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task(2021-10-21,"牛乳を買う。"));
        taskList.add(new Task(2021-9-15,"○○社面談。"));
        taskList.add(new Task(2021-12-4,"手帳を買う。"));
        taskList.add(new Task(2020-8-10,"散髪に行く。"));
        taskList.add(new Task(2020-11-9,"スクールの課題を解く。"));
        Collections.sort(taskList, new Task());
        taskList.forEach(date -> {
            System.out.println(Task);
        });
		
		

	  }

}
