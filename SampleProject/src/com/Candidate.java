package com;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class Candidate {

	@Test 
	public void test() { 
		Candidate obj = new Candidate(); 
		int actual =obj.getNameLenght("Hello"); 
		int expected =5; 
		Assert.assertEquals(expected,actual); }

	public int getNameLenght(String string) {
		return string.length();
	}

}
