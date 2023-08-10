/*package com;
import java.util.Arrays;
import java.util.Collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Parameterized;
import junit.framework.Assert;
@RunWith(Parameterized.class)
public class Parameter {
	int f_num;
	int s_num;
	int expected;
	Parameter par;
	public Parameter(int f, int s, int ex)
	{
		f_num=f;
		s_num=s;
		expected=ex;
	}
	@Before
	public void init()
	{
		par=new Parameter();
	}
	@Parameterized.Parameters
	public static Collection input()
	{
		return Arrays.asList(new Object[][]){{
			12,11,23
		},{
			11,10,24
		},{
			13,10,23
		}}};
	}

	@Test
	public void addtest() {
		assertEquals(expected,par.add(f_num,s_num));
	}

}*/
