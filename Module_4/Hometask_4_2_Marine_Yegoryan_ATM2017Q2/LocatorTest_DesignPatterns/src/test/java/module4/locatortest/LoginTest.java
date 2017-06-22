package module4.locatortest;

import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest extends InputOutputInitialization {

//	private String baseUrl;

	@Test
	 @Parameters("baseUrl")
	public void loginTest(String baseUrl) {
//		baseUrl = "https://gmail.com/";
		InputPassword emailLogin = new InputUsername(driver).open(baseUrl).inputUserName("marineyegoryan0884").goNext()
				.inputPassword("marinetest").goNext();

		// Verify, that the login is successful
		Assert.assertEquals("Gmail", emailLogin.gmailIcon.getText());
	}

	@Test
	@Parameters("baseUrl")
	public void logoutTest(String baseUrl) {
//		baseUrl = "https://gmail.com/";
		new InputUsername(driver).open(baseUrl).inputUserName("marineyegoryan0884").goNext()
				.inputPassword("marinetest").goNext().signOff();
	}

}
