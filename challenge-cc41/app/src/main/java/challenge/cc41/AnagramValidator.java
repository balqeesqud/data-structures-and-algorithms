package challenge.cc41;

import java.util.HashMap;
import java.util.Map;

public class AnagramValidator {

    public static boolean areAnagrams(String s1, String s2) {
        // Removing spaces and convert to lowercase for case-insensitive comparison
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // If lengths are different, they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Used a map to count occurrences of each character in the first string
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences in the first string
        for (char c : s1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Check if the second string matches the character counts
        for (char c : s2.toCharArray()) {
            if (!charCountMap.containsKey(c)) {
                // Character not found in the first string
                return false;
            }

            // Decrease the count of the character in the map
            int count = charCountMap.get(c);
            if (count == 1) {
                charCountMap.remove(c);
            } else {
                charCountMap.put(c, count - 1);
            }
        }

        // If the map is empty, both strings are anagrams
        return charCountMap.isEmpty();
    }


}