class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> answer = new ArrayList<>();
        
        int len1 = s.length();
        int len2 = p.length();
        
        int[] arr = new int[26];
        for(int i = 0; i < len2; i++){
            arr[p.charAt(i)-'a']++;
        }
        
        int start = 0;
        
        for(int i = 0; i < len1; i++){
            arr[s.charAt(i)-'a']--;
            
            if(i-start >= len2) arr[s.charAt(start++)-'a']++;
             
            if(isAllZero(arr)) answer.add(start);
            
        }
        
        return answer;
        
    }
    
    public boolean isAllZero(int[] arr){
        for(int i = 0; i < 26; i++){
            if(arr[i] > 0) return false;
        }
        
        return true;
    }
}