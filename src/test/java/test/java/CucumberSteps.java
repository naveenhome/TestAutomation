package test.java;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;
import main.java.Job;
import main.java.JobBLL;

public class CucumberSteps extends TestCase{
	Job job = new Job();
	String buttonName;
	@Given("^recruiter has entered all correct date$")
	public void InputData() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		job.setTitle("Scrum Master");
		job.setDesc("PSM Pass");
		job.setSkills("Java");
	}

	@When("^click on button Submit after data entry$")
	public void ActionMethod() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		buttonName="Submit";
	}

	@Then("^systen display success message$")
	public void ExpectedOutput() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		JobBLL obj = new JobBLL();
		assertEquals("Success", obj.Validate(job));
		
	}

	@Given("^recruiter has title \"([^\"]*)\", Description \"([^\"]*)\"$")
	public void recruiter_has_title_Description(String title, String desc) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		job.setTitle(title);
		job.setDesc(desc);
		job.setSkills("java");
	}

	@When("^click on button \"([^\"]*)\" after data entry$")
	public void click_on_button_after_data_entry(String button) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		buttonName = button;
	}

	@Then("^systen display \"([^\"]*)\" with \"([^\"]*)\" button$")
	public void systen_display_with_button(String message, String popupButton) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		JobBLL obj = new JobBLL();
		assertEquals(message, obj.Validate(job));
	}

	@Then("^clicking on \"([^\"]*)\" will take user on \"([^\"]*)\" page$")
	public void clicking_on_will_take_user_on_page(String arg1, String arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		JobBLL obj = new JobBLL();
		assertEquals(arg1, obj.Validate(job));
	}
	@Then("^systen display \"([^\"]*)\" message and \"([^\"]*)\" button$")
	public void systen_display_message_and_button(String arg1, String arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		JobBLL obj = new JobBLL();
		assertEquals(arg1, obj.Validate(job));
	}

}
