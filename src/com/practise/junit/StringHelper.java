package com.practise.junit;

public class StringHelper {

	public String truncateAInFirst2Positions(String str) {

		if (str.length() <= 2) {
			return str.replaceAll("A", "");
		}

		String firstTwoCharacters = str.substring(0, 2);
		String remainingCharacters = str.substring(2);
		return firstTwoCharacters.replaceAll("A", "") + remainingCharacters;
	}

	public boolean areFirstAndLastTwoCharactersTheSame(String str) {
		if (str.length() <= 1) {
			return false;
		}

		if (str.length() == 2) {
			return true;
		}

		String firstTwoCharacters = str.substring(0, 2);
		String lastTwoCharacters = str.substring(str.length() - 2, str.length());

		return firstTwoCharacters.equals(lastTwoCharacters);

	}

	public void concatWithString() {
		String str1 = "Value1";
		String str2 = "Value2";

		for (int i = 0; i < 100000; i++) {
			str1 = str2 + str1;
		}

	}

	public void concatWithStringBuffer() {
		StringBuffer str1 = new StringBuffer("Value1");
		String str2 = "Value2";

		for (int i = 0; i < 100000; i++) {
			str1.append(str2);
		}
	}

	public void concatWithStringBuilder() {
		StringBuilder str1 = new StringBuilder("Value1");
		String str2 = "Value2";

		for (int i = 0; i < 100000; i++) {
			str1.append(str2);
		}
	}

}
