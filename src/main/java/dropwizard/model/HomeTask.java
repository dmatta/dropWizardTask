package dropwizard.model;

import java.util.Date;

public class HomeTask extends BaseTask implements Task{

	Task taskToDo;
	public HomeTask(Task taskToDo) {
		this.taskToDo = taskToDo;
	}
	
	public HomeTask(String name, String description, Date dueDate) {
		super(name, description, dueDate);
	}
	public HomeTask(String name, String description, Date dueDate, Task taskToDo) {
		this(name, description, dueDate);
		this.taskToDo = taskToDo;
	}
	public void doTask() {
		if(taskToDo != null) {
			taskToDo.doTask();
		}
		System.out.println(String.format("Home Task:"
				+ " %s: %s", getName(), getDescription()));
		
	}

}
