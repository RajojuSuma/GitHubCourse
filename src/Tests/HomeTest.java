package Tests;

import Pages.HomePage;

public class HomeTest {

	public static void main(String[] args) {
		
		System.out.println("print Homepage test");

		HomePage hm = new HomePage();
		hm.hello();
		hm.sum(100, 200, 30);
		
	}

}
