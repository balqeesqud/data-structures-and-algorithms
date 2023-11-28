package challenge.cc42;

public class UrlSanitizer {

    public static String sanitizeUrl(String url) {
        // Count the number of spaces in the original URL
        int spaceCount = 0;
        for (char c : url.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }

        // Calculate the new length of the URL after encoding spaces
        int newLength = url.length() + (spaceCount * 2);
        char[] sanitizedUrl = new char[newLength];

        // Iterate through the original URL in reverse order and replace spaces with '%20'
        int index = newLength - 1;
        for (int i = url.length() - 1; i >= 0; i--) {
            if (url.charAt(i) == ' ') {
                sanitizedUrl[index--] = '0';
                sanitizedUrl[index--] = '2';
                sanitizedUrl[index--] = '%';
            } else {
                sanitizedUrl[index--] = url.charAt(i);
            }
        }

        return new String(sanitizedUrl);
    }

}
