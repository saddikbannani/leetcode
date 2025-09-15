class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        // Create a boolean array to mark which letters are broken
        // Index represents letter position (0 for 'a', 1 for 'b', etc.)
        boolean[] isBrokenLetter = new boolean[26];
      
        // Mark all broken letters as true in the array
        for (char letter : brokenLetters.toCharArray()) {
            isBrokenLetter[letter - 'a'] = true;
        }
      
        // Counter for words that can be typed
        int typableWordCount = 0;
      
        // Split the text into words and check each word
        for (String word : text.split(" ")) {
            // Assume the word can be typed initially
            boolean canTypeWord = true;
          
            // Check each character in the current word
            for (char character : word.toCharArray()) {
                // If any character is a broken letter, the word cannot be typed
                if (isBrokenLetter[character - 'a']) {
                    canTypeWord = false;
                    break;
                }
            }
          
            // Increment count if the word can be typed
            if (canTypeWord) {
                typableWordCount++;
            }
        }
      
        return typableWordCount;
    }
}
