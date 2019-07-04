import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class AboutHrisTest {
	AboutHris obj;
  @Test
  public void AboutHrisClick() throws InterruptedException {
	  obj.HrisClick();
	obj.AboutHrisCheck();
	Thread.sleep(2000);
	obj.CelebrationsClick();
	obj.CelebrationsLinkCheck();
	Thread.sleep(2000);
	obj.QAITUpdateClick();
	obj.QAITUpdateCheck();
	  Thread.sleep(2000);
	  obj.HRPolicyClick();
	  obj.HRPolicyCheck();
	  Thread.sleep(2000);
	  obj.FoodMenuClick();
	  obj.FoodMenuCheck();
	  Thread.sleep(2000);
	  obj.DidYouKnowClick();
	  obj.DidYouKnowCheck();
  }
  @BeforeClass
  public void intiatesession() {
	  obj=new AboutHris();
	  obj.initializeWebDriver();
	  
	  obj.LaunchUrl();
  }

}
