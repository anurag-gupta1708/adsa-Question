class Solution {
    public int smallestSubstring(String str) {
        // Code here
        
        int n = str.length() ;
        
        // 1. zero , two , one 
        int zero = 0 , one = 0 , two = 0 ;
        
        // 2. 
        int i = 0 , j = 0 ;
        int ans = n+1 ;
        
        // 3. Variable size sliding window 
        while( j < n ){
            
            if( str.charAt(j) == '0' )
                zero++ ;
            else if( str.charAt(j) == '1' )
                one++ ;
            else
                two++ ;
            
            // If the window is valid -> find the answer 
            while( zero>0 && one>0 && two>0 ){
                int currWindowLength = j-i+1 ;
                
                ans = Math.min( ans , currWindowLength ) ;
                
                // Shrink the current window 
                if( str.charAt(i) == '0' )
                    zero-- ;
                else if( str.charAt(i) == '1' )
                    one-- ;
                else
                    two-- ;
                
                i++ ;
                
            }
            
            // When the window is invalid 
            j++ ;
            
        }
        
        return (ans==(n+1) ? -1 : ans) ;
        
    }
};