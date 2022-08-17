class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hp = new HashMap<Character, Integer>();
        for(int i = 0;i<s.length();i++)
        {
            if(!hp.containsKey(s.charAt(i))){
                hp.put(s.charAt(i),1);
            }
            else{
                hp.put(s.charAt(i),hp.get(s.charAt(i))+1);
            }
        }
        boolean flag = false;
        for(int i = 0;i<s.length();i++){
            if(hp.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
