/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment1.techfiree;

/**
 *
 * @author c0682337
 */
public class CSD4464Assignment1TechFirEE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        stringPower("",1);
        stringPower(null,0);
        stringPower("Hell00",1);
    }
    public static String stringPower(String sample,int i)
    {  
        if(sample == null || sample==""){
         return sample;
        }
        else{
            String simpleString = "";
            for(int j=0;j<i;j++){
                simpleString = simpleString+sample;
            }
            return simpleString;
        }
     
    }
    
}
