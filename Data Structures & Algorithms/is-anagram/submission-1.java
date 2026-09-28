class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int hash1[]=new int[26];
        for(int i=0;i<s.length();i++){
            hash1[s.charAt(i)-'a']++;
            hash1[t.charAt(i)-'a']--;
        }
        for(int num:hash1){
            if(num!=0){
                return false;
            }
        }
        return true;

    }
}
