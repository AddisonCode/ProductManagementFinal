/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product.inventory.project; // project name
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileWriter;  
import java.io.IOException;
// Import the FileWriter class
public class ProductInventoryProject {

public static boolean running = true;
    
    public static int amount = 4; // adjustment to how many products you want

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
         File myObj = new File("Arrays.txt");
      int counter = 0;
        String[] products = new String[amount]; // all the prodcuts
        double price[] = new double[amount];
        int[] id = new int[amount]; 
        int[] quan = new int[amount];
        
         try {
     
      Scanner myReader = new Scanner(myObj); 
        
      while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                     String parts[] = data.split("\t"); 
                        products[counter] = parts[0];
                        price[counter] = Double.parseDouble(parts[1]);
                        id[counter] = Integer.parseInt(parts[2]);
                        quan[counter] = Integer.parseInt(parts[3]);
            counter++;
//        System.out.println(parts.length + " :: " +data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
            
        System.out.println("Hello! Welcome to Addison's Grocery Store!\nWould you like to look at the current products?\nYes or No?");
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
                    case "Oranges":
                        System.out.println("Price: $"+price[0]+"\nId: "+id[0]+"\nQuanitiy: "+quan[0]);
                        break;
                    case "Bananas":
                        System.out.println("Price: $"+price[1]+"\nId: "+id[1]+"\nQuanitiy: "+quan[1]);
                        break;
                    case "Apples":
                        System.out.println("Price: $"+price[2]+"\nId: "+id[2]+"\nQuanitiy: "+quan[2]);
                        break;
                    case "Fish":
                        System.out.println("Price: $"+price[3]+"\nId: "+id[3]+"\nQuanitiy: "+quan[3]);
                        break;
                }       
            running = false;
        }
        else{
            System.out.println("Okay! have a good day!");
            running = false;
        }
    } while(running == true);
   
    try { 
      FileWriter myWriter = new FileWriter("Arrays.txt");
        for (int i = 0; i < products.length; i++){ // for loop that prints all the products  
        myWriter.write( products[i] + "\t" + price[i] + "\t" + id[i] + "\t" + quan[i] +"\n");
        }
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred when writing to file.");
      e.printStackTrace();
    } 


    }
}
