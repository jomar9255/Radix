/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radixsort;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Joshua
 */
public class RadixSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File myFile = new File("src\\radixsort\\nums.txt");
        FileReader fIn; 
        BufferedReader in;
        
        String inStr; //temporarily stores each line read from the file
        ArrayList <String> inputList = new ArrayList();//stores each line of string from the file as a seperate indice
                                        
        /* The below code block reads and stores each line of text from the
           pre-specified file, into an ArrayList called inputList. 
        */
        try{
            fIn= new FileReader(myFile);
            in = new BufferedReader(fIn);
            
            try{
                while((inStr = in.readLine()) != null){
                inputList.add(inStr);
                
                if(inStr.equals("")){//removes an accidental space from the arraylist
                    inputList.remove("");
                }
                    
            }
            }catch(IOException e){
                System.err.println("Error reading from file: " + e.getMessage());
            }
        }catch(FileNotFoundException e){
            System.err.println("File not found: " + e.getMessage());
        }
        Sort myNums = new Sort(inputList);
        //System.out.println(myNums.toString());
        myNums.sort();

        }
    
}
