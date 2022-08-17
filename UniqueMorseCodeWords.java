class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String arr[] = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Set<String> set = new HashSet<String>();
        for(int i = 0;i<words.length;i++){
            StringBuilder s = new StringBuilder();
            for(int j = 0;j<words[i].length();j++){
                s.append(arr[Character.getNumericValue(words[i].charAt(j)) - Character.getNumericValue('a')]);
            }
            
            String str = new String(s);
            
            if(!set.contains(str)){
                set.add(str);
            }
            
        }
        return set.size();
        
    }
    
}
