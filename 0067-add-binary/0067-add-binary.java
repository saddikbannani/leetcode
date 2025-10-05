class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
      
        // Initialize pointers to the last digits of both strings
        int indexA = a.length() - 1;
        int indexB = b.length() - 1;
        int carry = 0;
      
        // Continue while there are digits to process or carry exists
        while (indexA >= 0 || indexB >= 0 || carry > 0) {
            // Get current digit from string a (0 if index out of bounds)
            int digitA = (indexA >= 0) ? a.charAt(indexA) - '0' : 0;
          
            // Get current digit from string b (0 if index out of bounds)
            int digitB = (indexB >= 0) ? b.charAt(indexB) - '0' : 0;
          
            // Calculate sum of current digits plus carry
            int sum = digitA + digitB + carry;
          
            // Append the remainder (0 or 1) to result
            result.append(sum % 2);
          
            // Update carry for next iteration (0 or 1)
            carry = sum / 2;
          
            // Move to next digits (right to left)
            indexA--;
            indexB--;
        }
      
        // Reverse the result since we built it backwards
        return result.reverse().toString();
    }
}
