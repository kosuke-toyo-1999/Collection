package practice;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter5 {
	public static void main(String[] args) {
	    // プログラムを作成
        List<Task> list = new ArrayList<>();
        list.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う"));
        list.add(new Task(LocalDate.of(2021, 9, 15), "○○社面接"));
        list.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う"));
        list.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く"));
        list.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く"));
        Collections.sort(list, new Task());
        list.forEach(date -> {
            System.out.println(Task.task);
            
        });
        
        
		
		

	  }

}
