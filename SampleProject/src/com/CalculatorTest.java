package com;
import java.util.Arrays;
import java.util.Collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Parameterized;
import junit.framework.Assert;
public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator obj =new Calculator();
		int actual =obj.add(12,23);
		int expected=35;
		Assert.assertEquals(expected,actual);
	}
	@Test
	public void testSub() {

	}
	@Test
	public void testMul() {
		Calculator obj =new Calculator();
		int actual =obj.mul(6,6);
		int expected=36;
		Assert.assertEquals(expected,actual);
	}
	@Test
	public void testDivide() {
		Calculator obj =new Calculator();
		float actual=obj.divide(12,7);
		float expected=1.714f;
	}
	@Test
	public void testGetNameLenght() { 
		Candidate obj = new Candidate(); 
		int actual =obj.getNameLenght("Alex");
		int expected =4; 
		Assert.assertEquals(expected,actual); }

}
