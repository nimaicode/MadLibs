/**
 * MadLibs.java
 * 
 * Parses a template containing <tag> placeholders and replaces each with user input.
 */
import java.util.Scanner;

public class MadLibs {

    private String template;

    /** CONSTRUCTOR: stores the template string */
    public MadLibs(String initTemplate)
    {
        template = initTemplate;
    }
    
    /** 
     * the method helps extract a specific tag signifying part of speech 
     * @params template should be a string

     *@return gives full phrase without tags and has the part of speech replaced by player 2(user input)
    
    */
    public void play()
    {

        
        Scanner input = new Scanner(System.in);
        
        String phrase = template;
        
        
        // While loop tutorial gotten from: https://www.w3schools.com/java/java_while_loop.asp
        // learned proper format while (condition ) {this is where the information inside the loop)       }
        
        while (phrase.indexOf("<") != -1) {
            
            // Defining the start of the tag and end
            
            int startOfTag = phrase.indexOf("<");
            
            int endofTag = phrase.indexOf(">");
            
            // extracting the tag
            
            String tag = phrase.substring(startOfTag +1 , endofTag);
            
            // asks user to input the replacement of the tag
            
            System.out.println("Please enter the part of speech which is a " + tag + ": ");
            
            
            String userInput = input.nextLine();
            
            
            // returns the replaced tag at the end of each cycle and then keeps replacing the new tags until the no tags are present
            phrase = phrase.substring(0,startOfTag) + userInput + phrase.substring(endofTag+1);
            
            
        }
        
        
        // input closes and returns final phrase
        input.close();

        System.out.println(phrase);
        
        
        
    }

}
