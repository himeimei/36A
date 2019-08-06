/**
 * 
 * @author Huimei Wu
 * CIS 36A
 */

public class More {
    /**
     * Given a string, take the last char and return a new string with the last char added at the front and back, 
     * so "cat" yields "tcatt". The original string will be length 1 or more.
     * backAround("cat") → "tcatt"
     * backAround("Hello") → "oHelloo"
     * backAround("a") → "aaa"
     */
    
    public static String backAround(String str) {
    		String newstr = str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
        return newstr;
    }
    
    /**
     * Given 2 strings, a and b, return a string of the form short+long+short, 
     * with the shorter string on the outside and the longer string on the inside. 
     * The strings will not be the same length, but they may be empty (length 0).
     * comboString("Hello", "hi") → "hiHellohi"
     * comboString("hi", "Hello") → "hiHellohi"
     * comboString("aaa", "b") → "baaab"
    */
    public static String comboString(String a, String b)
    {	
    		String newstr = "";
    		if(a.length() > b.length())
    			newstr = b + a + b;
    		else
    			newstr = a + b + a;
        return newstr;
    }
    
    /**
     * Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". 
     * The string length will be at least 2.
     * middleTwo("string") → "ri"
     * middleTwo("code") → "od"
     * middleTwo("Practice") → "ct"
     */
    public static String middleTwo(String str){
    		String newstr = "";
    		if(str.length() % 2 == 0)
    			newstr = str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
        return newstr;
    }

    /**
     * Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
     * The string length will be at least 2.
     * extraEnd("Hello") → "lololo"
     * extraEnd("ab") → "ababab"
     * extraEnd("Hi") → "HiHiHi"
     */
    public static String extraEnd(String str) {
    		String newstr = "";
    		newstr = str.substring(str.length() - 2, str.length());
        return newstr + newstr + newstr;
    }
    

    public static void main(String[] args)
    {
        String value;
        System.out.println("***Testing backAround***\n");
        value = backAround("cat");
        System.out.println("Should print tcatt: " + value);
        value = backAround("Hello");
        System.out.println("Should print oHelloo: " + value);
        value = backAround("a");
        System.out.println("Should print aaa: " + value +"\n");
       
        System.out.println("***Testing comboString***\n");
        value = comboString("Hello", "hi");
        System.out.println("Should be hiHellohi: " + value);
        value = comboString("hi", "Hello");
        System.out.println("Should be hiHellohi: " + value);
        value = comboString("aaa", "b");
        System.out.println("Should be baaab: " + value + "\n");
           
        System.out.println("***Testing middleTwo***\n");
        value = middleTwo("string");
        System.out.println("Should be ri: " + value);
        value = middleTwo("code");
        System.out.println("Should be od: " + value);
        value = middleTwo("Practice");
        System.out.println("Should be ct: " + value + "\n");
       
        System.out.println("***Testing extraEnd***\n");
        value = extraEnd("Hello");
        System.out.println("Should be lololo: " + value);
        value = extraEnd("ab");
        System.out.println("Should be ababab: " + value);
        value = extraEnd("feet");
        System.out.println("Should be etetet: " + value + "\n");
       
        System.out.println("***End of Tests***");   
    }
}



