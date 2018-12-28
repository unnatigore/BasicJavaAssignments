package com.basicjavaassignments.test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.basicjavaassignments.RemoveDuplicateCharactersAssignment;

public class RemoveDuplicateCharactersTest {

	RemoveDuplicateCharactersAssignment removeDuplicateCharacters;
	@Before
	public void setUp() throws Exception {
		removeDuplicateCharacters=new RemoveDuplicateCharactersAssignment();
	}

	@Test
	public void test1() {
		String input1="abcabcabc";
		
		String actual=removeDuplicateCharacters.removeDuplicates(input1);
		String expected="abc";
		assertEquals(expected, actual);
		
	}
	@Test
	public void test2() {
		String input2="javaforschool";
		
		String actual=removeDuplicateCharacters.removeDuplicates(input2);
		String expected="javforschl";
		
		assertEquals(expected, actual);
	}
	@Test
	public void test3() {
		String input3="Mississippi";
		
		String actual=removeDuplicateCharacters.removeDuplicates(input3);
		String expected="Misp";
		
		assertEquals(expected, actual);
		
	}

}