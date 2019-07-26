/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product.inventory.project; // project name
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileWriter;   // Import the FileWriter class

/**
 *
 * @author Education Unlimited
 */
public class ProductInventoryProject {

public static boolean running = true;
    
    static int ammount = 3; // adjustment to how many products you want

    
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 
        
        

        
        // TODO code application logic here
        String[] products = new String[ammount]; // all the prodcuts 
        products[0] = "Fish1";
        products[1] = "Fish2";
        products[2] = "Fish3";
        double price[] = new double[3];
        price[0] = 4.95;
        price[1] = 3.95;
        price[2] = 7.95;
        
        
        System.out.println("Hello! Welcome to Addison's Fish shop!\nWould you like to look at the current products?\nYes or No?");
        String YN = keyboard.nextLine(); // welcoming yes or no question
        
    do{
        if(YN.equals("Yes")){
            System.out.println("Okay! Here it is:");
            for (int i = 0; i < products.length; i++){ // for loop that prints all the products
            System.out.println(products[i]); 
            } 
            System.out.println("Okay What product would you like information on?");
            String choice = keyboard.nextLine();
//            System.out.println("choice: " + choice);
                switch(choice){
                    case "Fish1":
                        System.out.println("Price: $"+price[0]+"\nId:1\nQuanitiy: N/A");
                        break;
                    case "Fish2":
                        System.out.println("Price: $"+price[1]+"\nId:2\nQuanitiy: N/A");
                        break;
                    case "Fish3":
                        System.out.println("Price: $"+price[2]+"\nId:3\nQuanitiy: N/A");
                        break;
                }
            running = false;
            
        }
        else{
            System.out.println("Okay! have a good day!");
            running = false;
            
            
        }
       
    } while(running == true);
    
            
//         try { 
//      FileWriter myWriter = new FileWriter("filename.txt");
//        for (int i = 0; i < products.length; i++){ // for loop that prints all the products  
//        myWriter.write(products[i] + "\n"+ price[i]+"\n"+id[i]);
//        }
//      myWriter.close();
//      System.out.println("Successfully wrote to the file.");
//    } catch (IOException e) {
//      System.out.println("An error occurred.");
//      e.printStackTrace();
//    } 
//       
//    }
//    
//}

    }
}
