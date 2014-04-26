package dropwizard.model;

import java.util.Date;

public abstract class BaseTask implements Task {

	String name;
	String description;
	Date dueDate;
	
	public BaseTask() {
		
	}
	
	public BaseTask(String name, String description, Date dueDate) {
		this.name = name;
		this.description = description;
		this.dueDate = dueDate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
}
