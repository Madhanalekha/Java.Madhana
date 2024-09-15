/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string;


public class RecreatingBuiltIn {
     public static int customLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }
  public static char customCharAt(String str, int index) {
        if (index < 0 || index >= customLength(str)) {
            throw new StringIndexOutOfBoundsException("Invalid index");
        }
        char[] chars = str.toCharArray();
        return chars[index];
    }
   public static boolean customEquals(String str1, String str2) {
        if (customLength(str1) != customLength(str2)) {
            return false;
        }
        for (int i = 0; i < customLength(str1); i++) {
            if (customCharAt(str1,i) != customCharAt(str2,i)) {
                return false;
            }
        }
        return true;
    }
   public static String customToUpperCase(String str) {
        String result = "";
        for (int i = 0; i < customLength(str); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 'a' + 'A');
            }
            result += ch;
        }
        return result;
    }
    public static String customToLowerCase(String str) {
        String result = "";
        for (int i = 0; i < customLength(str); i++) {
            char ch = customCharAt(str,i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch - 'A' + 'a');
            }
            result += ch;
        }
        return result;
    }
    public static String customSubstring(String str, int beginIndex, int endIndex) {
        if (beginIndex < 0 || endIndex > customLength(str) || beginIndex > endIndex) {
            throw new StringIndexOutOfBoundsException("Invalid indices");
        }
        String result = "";
        for (int i = beginIndex; i < endIndex; i++) {
            result += customCharAt(str,i);
        }
        return result;
    }
     public static void main(String[] args) {
        String str = "Hello World";

        System.out.println(" Custom Length: " + customLength(str));
        System.out.println(" Custom CharAt: " + customCharAt(str,6));       
        System.out.println(" Custom Equals: " + customEquals("Hello", "Hello"));      
        System.out.println(" Custom ToUpperCase: " + customToUpperCase(str));
        System.out.println(" Custom ToLowerCase: " + customToLowerCase(str));
        System.out.println(" Custom Substring: " + customSubstring(str, 2, 7));
        
    }
}
   
    
