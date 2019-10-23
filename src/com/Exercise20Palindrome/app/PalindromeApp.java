package com.Exercise20Palindrome.app;

import com.Exercise20Palindrome.model.StringApplications;

public class PalindromeApp {

	public static void main(String[] args) {
	
		String cadPalindrome1 = "Anita lava la tina.";
		String cadPalindrome2 = "Yo dono rosas, oro no doy!!!";
		String cadPalindrome3 ="añlsdfjañlkjdfñalkjdf";
		
		System.out.println(StringApplications.isPalindrome(cadPalindrome1));
		System.out.println(StringApplications.isPalindrome(cadPalindrome2));
		System.out.println(StringApplications.isPalindrome(cadPalindrome3));
		
		System.out.println(StringApplications.isPalindromeStack(cadPalindrome1));
		System.out.println(StringApplications.isPalindromeStack(cadPalindrome2));
		System.out.println(StringApplications.isPalindromeStack(cadPalindrome3));
		

	}

}
