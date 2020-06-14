class Solution {
    public String longestCommonPrefix(String[] strs) {
        int m = 0;
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        while(true){
            if(strs[0].length() <= m){
                return strs[0].substring(0,m);
            }
            char c = strs[0].charAt(m);
            for(String s: strs){
                if(s.length() <= m){
                    return s.substring(0,m);
                }
                if(s.charAt(m) != c){
                    return s.substring(0,m);
                }
            }
            m++;
        }
    }
}