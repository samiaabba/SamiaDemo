package stepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	public class stepDenition {

	    @Given("^user is on NetBanking Landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {
	        System.out.println("navigate to url");
	       
	    }

	    @When("^user login into application with username and password$")
	    public void user_login_into_application_with_username_and_password() throws Throwable {
	    	System.out.println("login succuss");
	    }
	    @When("^user login into application with\"([^\"]*)\" and password\"([^\"]*)\"$")
	    public void user_login_into_application_withsomething_and_password_something(String strArg1, String strArg2) throws Throwable {
	       System.out.println("strArg1");
	       System.out.println("strArg2");
	    }

	    @Then("^cards are displayed$")
	    public void cards_are_displayed1() throws Throwable {
	    	System.out.println("validate home page");
	    }

	    @And("^cards are displayed$")
	    public void cards_are_displayed() throws Throwable {
	    	System.out.println("validate cards");
	    }
	    @When("^user login into application with\"([^\"]*)\" and password\"([^\"]*)\"$")
	    public void user_login_into_application_with_and_password(String arg1, String arg2) throws Throwable {
	        System.out.println("arg1");
	        System.out.println("arg2");
	    }

	    @Then("^cards displayed are \"([^\"]*)\"$")
	    public void cards_displayed_are1(String arg1) throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	       System.out.println("arg1");
	    }    

	    @Then("^cards displayed are \"([^\"]*)\"$")
	    public void cards_displayed_are(String arg1) throws Throwable {
	    	System.out.println("arg1");  
	       
	    }
	}
