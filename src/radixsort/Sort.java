/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radixsort;
import java.util.ArrayList;

/**
 *
 * @author Joshua
 */
public class Sort {
    ArrayList<String> list;
     
    public Sort(ArrayList<String> l){
        list = new ArrayList(l);
        this.addZeroes();
        
    }
     
    /**
      The highest digit amount is calculated by running through the given
      ArrayList indices and comparing each int to see which is larger. If the
      index is greater than the previous maximum, an int is set to the length
      of the current element.
    */
    private static int getMax(ArrayList<String> l){
        int max = 0;
        int count = 0;
        String tempStr;
        int tempInt;
        
        for(int k = 0; k < l.size(); k++){
           tempStr = l.get(k);
           tempInt = Integer.parseInt(tempStr);
          
           if(max < tempInt){
               max = tempInt;
               count = tempStr.length();
               
         }
        }
        return count;
    }
   
    public void sort(){
        String tempStr = null;
        int ret = 0;
        int dig = 0;
        int maxLngth = getMax(list)-1;
        int[] eval = new int[list.size()];
        
            for(int i = maxLngth; i >= 0; i--){
                int lowestDig = 9;
                for(int j = 0; j < list.size(); j++){
                    System.out.println("\nIteration: "+ i);
                    
                    tempStr = list.get(j);
                     
                    System.out.println("Current String: " + tempStr);
                    
                    dig = tempStr.charAt(i);
                    dig = convertNum(dig);
                    
                    list.set(j,tempStr);
                    if(dig < lowestDig){
                        lowestDig = dig;
                        System.out.println("lowestDig: " + dig);
                         
                    }
                }
                System.out.println("\n------------");
            } 
           System.out.println(list.toString());
    }
     
    /**
     * Adds "0"'s to the object's indices if a number is less than the maximum
     * count of digits
     */
    private void addZeroes(){
        String tempStr = null;
        int maxLngth = getMax(list);
        int tempLngth;
            for(int j = 0; j < maxLngth-1; j++){
                for(int i = 0; i < list.size(); i++){
                  
            tempStr = list.get(i);
            tempLngth = tempStr.length();
            
                //System.err.println("String index exceeded: " + e.getMessage());
            if(tempLngth < maxLngth){
                tempStr = tempStr.substring(0,0) + "0" +tempStr;
   
                list.set(i, tempStr);
            }  
            }
        }  
    }
    /**
     * Converts the
     * @param str
     * @param n
     * @return 
     */
    private int convertNum(int n){
        int ret;
        String tempStr;
       
        tempStr = Character.toString((char) n);//codepoint is conveted to string
        ret = Integer.parseInt(tempStr);//string is converted to int
        return ret;
    }
    
    @Override
    public String toString(){
       return list.toString();
    }
}
