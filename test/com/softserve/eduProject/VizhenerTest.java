package com.softserve.eduProject;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class VizhenerTest {
	
	Vizhener vizhener = new Vizhener("Key");
	
	@Test
	public void keyWordTest() {
		List<Integer> expecteds = new ArrayList<Integer>();
		expecteds.add(10);
		expecteds.add(4);
		expecteds.add(24);
		Assert.assertEquals(expecteds, vizhener.keyWord(vizhener.getKey()));
	}
	
	@Test
	public void groupTest() {
		List<String> expecteds = new ArrayList<String>();
		expecteds.add("I s");
		expecteds.add("tud");
		expecteds.add("y J");
		expecteds.add("ava");
		expecteds.add("Cor");
		expecteds.add("e");
		Assert.assertEquals(expecteds, vizhener.group(vizhener.getKey(), "I study JavaCore"));
	}
	
	@Test
	public void testEncrypt() {
		Assert.assertEquals("S qdybi HkzyMspo", vizhener.encrypt("I study JavaCore"));
	}
	
	@Test
	public void destEncrypt() {
		Assert.assertEquals("I study JavaCore", vizhener.decrypt("S qdybi HkzyMspo"));
		
		
	}
}
