package main.java;

public class JobBLL {
	
	public String Validate(Job job)
	{
		if(job.title.equals(" "))
		{
			return "Failed";
		}
		else
		{
			return "Success";
		}
	
	}

}
