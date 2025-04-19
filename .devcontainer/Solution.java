public  class Solution {
       public int maxScore(String s) {
          int totalones=0;
          int totalzeros=0;
          int total=Integer.MIN_VALUE;
          for(char ch: s.toCharArray()){
           if(ch ==1)
               totalones++;
          } 
          for(int i=0;i<s.length()-1;i++){
           if(s.charAt(i)=='0'){
               totalzeros++;
           }else{
               totalones--;
           }
            total=Math.max(total,totalones+totalzeros);
          }
          
          return total;
       }
    }
     
    

