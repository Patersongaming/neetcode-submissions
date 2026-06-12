class Solution {
    public boolean isAnagram(String s, String t) {
            if(s.length() != t.length()){
                return false;
            }
            int[] alphabet = new int[26];
        for (int i = 0; i < s.length();i++){
            alphabet[s.charAt(i)- 'a']++; // add to the tally
            alphabet[t.charAt(i)-'a']--; // subtractsfrom the tally
        }
        for (int count: alphabet){
        if(count != 0){
            return false;

        }
        }
        return true;
    }
}
