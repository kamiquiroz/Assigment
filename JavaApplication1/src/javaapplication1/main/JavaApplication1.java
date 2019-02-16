/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author kamiquiroz
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
       //Item 1
        Scanner input=new Scanner(System.in);
              
        
        List<String> request = new ArrayList<>();
        int continue1=0;
        String val;

        do{
            System.out.println("Please insert value:");
            val = input.next();
            request.add(val);         
            
            System.out.print("Continue 1.Yes 2.No:");
            continue1 = input.nextInt();
            
        }while(continue1==1);
       
        System.out.println("Input String : "+ request); 

        Collections.sort(request, Collections.reverseOrder());
               
        System.out.println("Output String : " + request); 
        
                
        //Item 2
         final String[] countries = {"United States", "England", "Germany",
                "Netherlands", "Slovenia"};
        //suggested letter
         final String letter = "a";
         
          //new ArrayList is only needed if you absolutely need an ArrayList
        List<String> stringList = new ArrayList<>(Arrays.asList(countries));

        stringList.forEach(item->System.out.println(item.indexOf(letter.charAt(0))));
	
    }
    
   
   
    
}
