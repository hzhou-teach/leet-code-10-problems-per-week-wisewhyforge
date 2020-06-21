class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<String,Integer>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        System.out.println(s);
        int n = s.length();
        int ans = 0;
        int prevValue = Integer.MAX_VALUE;
        //General Case
        for(int i = 0; i < n; i++){
            if(i != 0){
                prevValue = map.get(s.substring(i-1,i));
            }
            int value = map.get(s.substring(i,i+1));
            if(prevValue < value){
                ans -= prevValue;
                ans += value - prevValue;
            }else{
                ans += value;
            }
            
            System.out.println(value);
        }
        return ans;
    }
}