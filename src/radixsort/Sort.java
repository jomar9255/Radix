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
    int[][] nums;
    
    public Sort(ArrayList<String> l){
        list = new ArrayList(l);
        nums = new int[list.size()][getMax(l)];
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
        return max;
    }
   
    public int[][] getNum(){
        String tempStr1;
        int ret;
        int[][] last;
        int tempInt = 0;
        int tempLength;
        String tempStr2;
        char tempChar;
 
        last = new int[list.size()][getMax(list)];//indices represent the number of words and digit number respectively
        
        for(int f = 0; f < list.size(); f++){
            tempStr1 = list.get(f);
            tempLength = tempStr1.length();
            for(int g = 0; g < tempLength; g++){
                tempInt = tempStr1.charAt(g);//finds and stores each char as a codepoint 
                tempStr2 = Character.toString((char) tempInt);//codepoint is conveted to string
                ret = Integer.parseInt(tempStr2);//string is converted to int
                System.out.println(ret);
                last[f][g] = ret;
            }
        }
        return last;
    }
    
    public ArrayList<String> sort(){
        ArrayList<String> out = new ArrayList();
         for(int i = 0; i < list.size(); i++){
             for(int j = 0; j < getMax(list); j++){       
            switch(){
                case 0:
                    break;
                    
                case 1:
                    break;
                    
                case 2:
                    break;
                    
                case 3:
                    break;
                    
                case 4:
                    break;
                    
                case 5:
                    break;
                    
                case 6:
                    break;
                    
                case 7:
                    break;
                    
                case 8:
                    break;
                    
                case 9:
                    break;
                    
                default:
            }
        }
         }
         return out;
    }
}
