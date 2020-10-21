package com.softserve.eduProject;

import org.junit.Assert;
import org.junit.Test;

public class CaesarTest {

	Caesar  c1 = new Caesar(25);
	Caesar  c2 = new Caesar(0);
	Caesar  c3 = new Caesar(392);

	String smallLetters = "abcdefghijklmnopqrstuvwxyz";

	@Test
	public void signEncryptTestEnd() {
		Assert.assertEquals('w', c1.signEncrypt('x', c1.getSmallLetters(), c1.getN()));
	}

	@Test
	public void signEncryptTestBeginning() {
		Assert.assertEquals('e', c3.signEncrypt('c', c3.getSmallLetters(), c3.getN()));
	}

	@Test
	public void signEncryptTestZero() {
		Assert.assertEquals('z', c1.signEncrypt('z', c2.getSmallLetters(), c2.getN()));
	}

	@Test
	public void signDecryptTestEnd() {
		Assert.assertEquals('a', c1.signDecrypt('z', c1.getSmallLetters(), c1.getN()));
	}

	@Test
	public void signDecryptTestBeginning() {
		Assert.assertEquals('y', c3.signDecrypt('a', c3.getSmallLetters(), c3.getN()));
	}

	@Test
	public void signDecryptTestZero() {
		Assert.assertEquals('z', c1.signDecrypt('z', c2.getSmallLetters(), c2.getN()));
	}

//	@Test
//	public void signEncryptTest() {
//		Assert.assertEquals('w', c1.signEncrypt('x', c1.getSmallLetters(), c1.getN()));
//	}
	
	@Test
	public void charTransformTest() {
		Assert.assertEquals(',', c1. charTransform(',', '-', '-'));
	}
	
	@Test
	public void charTransformTestCapLetter() {
		Assert.assertEquals('Z', c1. charTransform('A', '-', 'Z'));
	}
	
	@Test
	public void charTransformTestSmallLetter() {
		Assert.assertEquals('a', c1. charTransform('b', 'a', '-'));
	}
	
	@Test
	public void encryptTest() {
		Assert.assertEquals("H rstcx Izuz" ,c1.encrypt("I study Java"));
	}
		
	@Test
	public void decryptTest() {
		Assert.assertEquals("I study Java" ,c1.decrypt("H rstcx Izuz"));	
	}
	
}
