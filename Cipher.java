import org.w3c.dom.Text;
import java.util.Scanner;
import jdk.tools.jlink.builder.ImageBuilder;

/*
Carmine Attanasio
3.28.21
Ceaser Cipher Encryptor/Decryptor
The objective of this program is to use the Ceaser Cipher
to encrypt and decrypt user input
*/

public class Cipher{


public static void main(String[] args)

    {   
        Scanner userIn = new Scanner(System.in); 

        System.out.println("Please enter what you would like to encrypt");
        String Input = userIn.nextLine();

        System.out.println("Please enter a key for encryption");
        int key=userIn.nextInt();
        
        
        
        System.out.println(Input);
        
        char[] inputConv = Input.toCharArray(); //converts input string to char array

        //using input converted to string, char array is shifted x number to encrypt using ascii
        for(char  c : inputConv) //c is key for shifting
        {
            c += key;
            System.out.print(c);
            
        }
        
        System.out.println();

        for(char c : inputConv)
        {
            c +=key;
            c-=key;
            System.out.print(c);
        }

        
        

        
    }
} 
