package com.practise.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.practise.junit.StringHelper;

public class StringHelperTest {

	StringHelper stringHelper = null;

	@Before
	public void before() {
		stringHelper = new StringHelper();
	}

	@After
	public void after() {
		stringHelper = null;
	}

	@Test
	public void testTruncateAInFirst2Positions() {

		System.out.println("testing 1");

		assertEquals("RTAA", stringHelper.truncateAInFirst2Positions("RTAA"));
		assertEquals("BB", stringHelper.truncateAInFirst2Positions("AABB"));
		assertEquals("BBB", stringHelper.truncateAInFirst2Positions("BABB"));

	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {

		System.out.println("testing 2");

		StringHelper stringHelper = new StringHelper();

		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame(""));
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("A"));
		assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("AB"));
		assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("AAA"));
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("AAB"));
	}

	@Test
	public void testArraySort() {

		int[] numbers = { 5, 6, 4, 3, 2, 1 };
		int[] expectedOutput = { 1, 2, 3, 4, 5, 6 };
		Arrays.sort(numbers);
		assertArrayEquals(expectedOutput, numbers);

	}

	@Test(expected = NullPointerException.class)
	public void testArraySortWithNullCondition() {

		int[] numbers = null;
		Arrays.sort(numbers);

	}

	@Test(timeout = 27)
	public void testArraySortPerformance() {
		for (int i = 0; i < 1000000; i++) {
			int[] numbers = { i, i - 1, i + 2 };
			Arrays.sort(numbers);
		}
	}

	@Test
	public void concatWithString() {
		String str1 = "Value1";
		String str2 = "Value2";

		for (int i = 0; i < 100000; i++) {
			str1 = str2 + str1;
		}

	}

	@Test
	public void concatWithStringBuffer() {
		StringBuffer str1 = new StringBuffer("Value1");
		String str2 = "Value2";

		for (int i = 0; i < 100000; i++) {
			str1.append(str2);
		}
	}

	@Test
	public void concatWithStringBuilder() {
		StringBuilder str1 = new StringBuilder("Value1");
		String str2 = "Value2";

		for (int i = 0; i < 100000; i++) {
			str1.append(str2);
		}
	}

}
