import java.util.*;
import java.math.*;
class Solution {
    public int solution(int[] citations) {
        int max = 0;
        
        for(int cite: citations){
            max = Math.max(max, cite);
        }
       
        
        for(int i = max;i>=0; i--){
        int hUp = 0;
        int hDown = 0;
            
           for(int cite: citations){
               if(cite >= i){
                   hUp ++;
               }
               
               if(cite <= i){
                   hDown ++;
               }
           }
            
           if(hUp >= i && hDown <=i)  {
              return i; 
           }
        }
        return 0;
    }
}