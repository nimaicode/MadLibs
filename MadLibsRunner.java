/**
 * MadLibsRunner.java
 * 
 * Creates MadLibs objects with different templates and calls play() to test.
 * 
 * @author: Nimai
 * @version: Oct 16, 2025
 */
 
public class MadLibsRunner
{
    public static void main(String[] args)
    {
        // TODO: Test your program here.
        
        String phrase = " Roses are <adjective>, violets are <noun>, dont come to my <proper noun> anymore.";

        MadLibs setence = new MadLibs(phrase);
        
        setence.play();
    }
}
