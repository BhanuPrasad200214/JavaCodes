package date13nov;       //---------ELC---------

public class Task2 
{
	public static void main(String[] args) 
	{	
        Task task = new Task("Finish Project", "Complete documentation", "High", false);
    
		 System.out.println("Task Title: " + task.getTitle());
		 System.out.println("Task Description: " + task.getDescription());
		 System.out.println("Task Priority: " + task.getPriority());
		 System.out.println("Is Task Completed? " + task.isCompleted());

		 task.updateDescription("Complete all project documentation");
		 task.updatePriority("Medium");
		 task.markasCompleted();

		 System.out.println("\nAfter updates:");
		 System.out.println("Task Title: " + task.getTitle());
		 System.out.println("Task Description: " + task.getDescription());
		 System.out.println("Task Priority: " + task.getPriority());
		 System.out.println("Is Task Completed? " + task.isCompleted());
      }
}


