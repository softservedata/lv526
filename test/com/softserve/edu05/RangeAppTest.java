package com.softserve.edu05;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RangeAppTest {
	
	@Test
	public void testCheckIsTrue() {
		float f = 2;
		Assert.assertTrue("Number is in range [-5,5]",RangeApp.check(f));
		
	}
	
	@Test
	public void testCheckIsFalse() {
		float f = 8.3f;
		Assert.assertFalse("Number is not in range [-5,5]", RangeApp.check(f));
	}
	
	@Test	
	public void testCheckIncludeBounds() {
		float f = 5;
		Assert.assertTrue("Bound number is in range [-5,5]",RangeApp.check(f));
		
	}

}
