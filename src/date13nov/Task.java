package date13nov;        //------BLC----------

public class Task 
{
      private String title;
      private String description;
      private String priority;
      private boolean completed;
      
	public Task(String title, String description, String priority, boolean completed) 
	{
		super();
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.completed = completed;
	}
	
	public void updateDescription(String newDescription)
	{
		this.description=newDescription;
	}
	public void updatePriority(String newPriority)
	{
		this.priority=newPriority;
	}
	public void markasCompleted()
	{
		this.completed=true;	
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getPriority() {
		return priority;
	}

	public boolean isCompleted() {
		return completed;
	}  
}
