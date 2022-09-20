class Solution {

    public String longestCommonPrefix(String[] strs) {
	        
	        String answer = "";
	        int n = strs.length;

	        if(n==1) return strs[0];
	        char[] carr1 = strs[0].toCharArray();      
	        char[] carr2 = strs[1].toCharArray();
	        String str1 = strs[0];
	        String str2 = strs[1];
	        int a = str1.length();
	        int b = str2.length();
	        if(a <= b){
	            for(int i = 0; i < a; i++){
	                if(carr1[i] == carr2[i]) answer+= carr1[i];
	                 else break;
	            }
	        }else {
	            for(int i = 0; i < b; i++){
	                if(carr1[i] == carr2[i]) answer+= carr1[i];
	                 else break;
	            }
	        }
	        
	        char[] carr3 = null;
	        for(int j = 2; j < n; j++){
	            String tmp = "";
	            carr3 = answer.toCharArray();
	            int c = answer.length();
	            String str3 = strs[j];
	            int d = str3.length();
	            char[] carr4 = strs[j].toCharArray();
	            if(c <= d){
	                for(int i = 0; i < c; i++){
	                    if(carr3[i] == carr4[i]) tmp+= carr3[i];
	                    else break;
	                }
	            }else {
	                for(int i = 0; i < d; i++){
	                    if(carr3[i] == carr4[i]) tmp+= carr3[i];
	                    else break;
	                }
	            }
	            answer = tmp;
	            
	        }
	        
	        return answer;
	    
 
    }
}