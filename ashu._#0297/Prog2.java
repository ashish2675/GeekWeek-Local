public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
		if (s.length() <= 1) {
			return s;
		}
		if (s.charAt(0) == s.charAt(1)) {
			return removeConsecutiveDuplicates(s.substring(1));
		} else {
			String small = removeConsecutiveDuplicates(s.substring(1));
			return s.charAt(0) + small;
		}
	}

}
