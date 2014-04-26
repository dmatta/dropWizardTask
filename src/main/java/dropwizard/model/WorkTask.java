package dropwizard.model;

import java.sql.Date;

public class WorkTask extends BaseTask implements Task {

	public WorkTask(String name, String description, Date dueDate) {
		super(name, description, dueDate);
	}

	public void doTask() {
		System.out.println(String.format("Work Task: %s: %s", getName(), getDescription()));
	}

}
