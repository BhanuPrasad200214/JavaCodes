package date21nov;

public class Sports 
{
		private String sportName;
		private int teamSize;
		private String sportType;
		
		public Sports()
		{
			this.sportName=null;
			this.teamSize=0;
			this.sportType=null;
		}
		public Sports(String sportName,int teamSize)
		{
			this("Hockey",7,"Cricket");
			this.sportName=sportName;
			this.teamSize=teamSize;
		}
		public Sports(String sportName,int teamSize,String sportType)
		{
			if(teamSize<=0)
			{
				this.teamSize=0;
				System.err.println("Error,Team Size must be positive");
			}
			else
			{
				this.teamSize=teamSize;
				displayInfo();
			}
			this.sportName=sportName;
			
			this.sportType=sportType;
		}
		public void displayInfo()
		{
			System.out.println("Sport Name:"+sportName);
			System.out.println("Team Size:"+teamSize);
			System.out.println("Sport Type:"+sportType);
		}
}

