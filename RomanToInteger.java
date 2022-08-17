class Solution {
    public int romanToInt(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        int ans = 0;
        for(int i = 0;i<len;i++){
            if(arr[i] == 'M'){
                ans+=1000;
            }
            else if(arr[i] == 'D'){
                ans+=500;
            }
            else if(arr[i] == 'C'){
                if(i!=len-1 && (arr[i+1] == 'D' || arr[i+1] == 'M'))
                {
                    ans-=100;
                }
                else
                {
                    ans+=100;
                }
                
            }
            else if(arr[i] == 'L'){
                ans+=50;
            }
            else if(arr[i] == 'X'){
                if(i!=len-1 && (arr[i+1] == 'L' || arr[i+1] == 'C'))
                {
                    ans-=10;
                }
                else{
                    ans+=10;
                }
                
            }
            else if(arr[i] == 'V'){
                ans+=5;
            }
            else if(arr[i] == 'I')
            {
                if(i!=len-1 && (arr[i+1] == 'V' || arr[i+1] == 'X'))
                {
                    ans-=1;
                }
                else{
                    ans+=1;
                }
                
            }    
    }
        return ans;
    }
}
