class Solution {
     public String multiply(String num1, String num2) {
        if(num1.length() < num2.length()) { //num1 makes bigger than num2
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        StringBuilder result = new StringBuilder();
        for(int i=num2.length() - 1; i>=0; i--) {
            int carry = 0;
            int n2 = num2.charAt(i) - 48;
            StringBuilder sb = new StringBuilder();
            for(int j=i; j<num2.length() - 1; j++) sb.append("0");
            for(int j=num1.length() - 1; j>=0; j--) {
                int n1 = num1.charAt(j) - 48;
                int sum = (n1 * n2 + carry);
                int rest = sum % 10;
                carry = sum / 10;
                sb.append(rest);
            }
            
            if(carry != 0) sb.append(carry);
            String temp = sb.toString();
            String ret = result.toString();

            if(ret.length() == 0) {
                result.append(temp);
                continue;
            }
            
            //Add each number
            StringBuilder next = new StringBuilder();
            carry = 0;
            for(int m=0; m<temp.length(); m++) {
                int nn1 = temp.charAt(m) - 48;
                if(m >= ret.length()) {
                    int rest = nn1 + carry;
                    if(rest >= 10) {
                        carry = 1;
                        rest -= 10;
                    } else carry = 0;
                    next.append(rest);
                } else {
                    int nn2 = ret.charAt(m) - 48;
                    int rest = nn1 + nn2 + carry;
                    if(rest >= 10) {
                        carry = 1;
                        rest -= 10;
                    } else carry = 0;
                    next.append(rest);
                }
            }
            
            if(carry != 0) next.append(carry);
            result.delete(0, result.length());
            result.append(next.toString());
        }
        
        return result.reverse().toString().startsWith("0") ? "0" : result.toString();
    }
}