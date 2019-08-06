/**
* @author Huimei Wu
* CIS 36A
*/

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        String address;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your email address: ");
        address = input.nextLine();

        if (!containsAt(address)) { // the method will return true or false so
                                    // we can check in an if statement
            System.out.println("Invalid email. Your email address must contain an @ symbol");
        } else if (!containsSpace(address)) { // replace false with method call here
            System.out.println("Invalid email. Your email address cannot contain a space");
        } else if (!validExtension(address)) { // replace false with method call here
            System.out.println("Invalid email. Your email must contain a .com, .edu or .org extension");
        } else {
            System.out.println("Your email address is valid.");
        }
        input.close();
    }
    
    /**
     * Check if an email address ends with one of the following extension: .com, .org, .ehu
     * @param address the email address
     * @return the email address end with one of the following extension:.com, .org .ehu or not  
     */
    public static boolean validExtension(String address) {
    		String newstr = address.substring(address.length() - 4, address.length());
    		if(newstr.equals(".com") || newstr.equals(".org") || newstr.equals(".edu"))
    			return true;
    		else
    			return false;
    }
    
   /**
    * Check if an email address contains space
    * @param address the email address
    * @return the email address contains space or not
    */
    public static boolean containsSpace(String address) {
        for(int i = 0; i < address.length(); i++) {
        		if(address.charAt(i) == ' ')
        			return false;
        }
        return true;
    }

    /**
     * Check if an email address contains @
     * @param address the email address
     * @return the email address contains @ or not
     */
    public static boolean containsAt(String address) {
    	 for(int i = 0; i < address.length(); i++) {
     	if(address.charAt(i) == '@')
     		return true;
     }
        return false;
    }
}