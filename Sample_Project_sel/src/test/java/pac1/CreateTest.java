package pac1;

import org.testng.annotations.Test;

public class CreateTest {
	@Test
	public void createContactTest() {
		String URL = System.getProperty("url");
		String Browser = System.getProperty("browser","Chrome");
		String UserName = System.getProperty("username");
		String Password = System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(Browser);
		System.out.println(UserName);
		System.out.println(Password);
		System.out.println("execute createContactTest");
	}

	@Test
	public void modifyContactTest() {
		System.out.println("execute modify ContactTest");
	}
	
	@Test
	public void deleteContactTest() {
		System.out.println("Delete Contact Test");
	}
}
