package Tests;

import java.io.IOException;

import View.Template;

public class Test_AutoAnim {

	public static void main(String[] args) throws IOException {
		Template template = new Template("Resources/winchester-4x6.png", "Resources/example.ani");
		
		System.out.println("PASSED!");
	}

}