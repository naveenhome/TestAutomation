package main.java;

public class JobBLL {
	
	public String Validate(Job job)
	{
		if(job.title.equals(" "))
		{
			return "Failed";
		}
		
		else if (job.desc.equals(" "))
		{
			return "failed";
		}
		else
		{
			return "Success";
		}
	}

}
