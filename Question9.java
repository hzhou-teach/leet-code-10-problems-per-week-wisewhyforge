class Solution {
    public boolean isPalindrome(int x) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        if(x< 0){
            return false;
        }
        while(x > 0){
            al.add(x%10);
            x/=10;
        }
        System.out.println(al);
        int y = 0;
        for(int i = 0; i < al.size()/2; i++){
            if(al.get(i) != al.get(al.size()-i-1)){
                return false;
            }
        }
        return true;
    }
}