package solutionsLett.ReverseVowelsOfAString;

public class Solution {
    public String reverseVowels(String s) {
        int[] position = new int[s.length()];
        char[] vowels  = new char[s.length()];
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if("aeiouAEIOU".indexOf(c) != -1){
                position[count] = i;
                vowels[count++] = c;

            }
        }

        char[] result = s.toCharArray();
        for(int i = 0; i < count; i++){
            result[position[i]] = vowels[count - i - 1];

        }
        return new String(result);
    }
}

