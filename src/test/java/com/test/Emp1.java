package com.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class Emp1 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String a = driver.getTitle();
		
		System.out.println(a);
		
		
		
		
	}

}
