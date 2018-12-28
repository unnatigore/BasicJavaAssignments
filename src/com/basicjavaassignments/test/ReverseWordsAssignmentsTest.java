package com.basicjavaassignments.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.basicjavaassignments.ReverseWordsAssignment;
public class ReverseWordsAssignmentsTest {
		
		@Before
		public void setUp() throws Exception {
		}
		
		@Test
		public void Test() {
				ReverseWordsAssignment reverse = new ReverseWordsAssignment();
				String input="Let's take LeetCode contest";
				
				
				String actual=reverse.reverseWords(input);
				
				String expected="s'teL ekat edoCteeL tsetnoc ";
				assertEquals(expected, actual);
		}
}

