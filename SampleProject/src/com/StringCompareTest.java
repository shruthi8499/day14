/*package com;
import org.junit.Parameterized;
import org.junit.Before;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.Parameterized;
import junit.framework.Assert;
import org.junit.Test;
@RunWith(Parameterized.class)
public class StringCompareTest {
	String f_string; 
	String s_string; 
	int expected;
	StringCompare comp;
	public StringCompareTest(String f_s, String s_s, int ex)
	{
		f_string=f_s;
		s_string=s_s;
		expected=ex;
	}
	@Before
	public void init()
	{
		StringCompare strcomp=new StringCompare();
	}
	public static Collection input() {
		return Arrays.asList(new Object[][]{{"Shruthi","Hello",1},{"Alex","Hi",1}});
	}

	@Test
	public void testCompare() {
		assertEquals(expected,StringCompare.strcompare);
	}

}*/
