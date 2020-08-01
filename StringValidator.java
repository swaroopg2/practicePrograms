package org.jiyumana;

public class StringValidator {

	public static void main(String[] args) {
		String inputString = "123";
		Boolean result;
		Boolean result2;
		
		//convert String to char array
        char[] charArray = inputString.toCharArray();
        
        
        for(int i=0; i < charArray.length; i++){           
            //if any character is lower case, return true
            result = ( Character.isAlphabetic( charArray[i] )) ? true : false;
            result2 = ( Character.isDigit( charArray[i] )) ? true : false;
            if(result.equals(true)) {
            break;
            }
            if(result2.equals(true)) {
                break;
            }
            System.out.println("Contains any alpha numeric? : "+result);
        }
        
        for(int i=0; i < charArray.length; i++){           
            //if any character is lower case, return true
            result = ( Character.isAlphabetic( charArray[i] )) ? true : false;
            if(result.equals(true)) {
            System.out.println("Contains any alphabets? : "+result);
            break;
            }else if(result.equals(false) && (inputString.indexOf(charArray[i]) == charArray.length -1) ) {
            	System.out.println("Contains any alphabets? : "+result);  
            }
        }
        
        for(int i=0; i < charArray.length; i++){           
            //if any character is lower case, return true
            result = ( Character.isDigit( charArray[i] )) ? true : false;
            if(result.equals(true)) {
            System.out.println("contains any digit? : "+result);
            break;
            }else if(result.equals(false) && (inputString.indexOf(charArray[i]) == charArray.length -1) ) {
            	System.out.println("Contains any digit? : "+result);  
            }
        }
        
        for(int i=0; i < charArray.length; i++){           
            //if any character is lower case, return true
            result = ( Character.isLowerCase( charArray[i] )) ? true : false;
            if(result.equals(true)) {
            System.out.println("contains any lowercase char? : "+result);
            break;
            }else if(result.equals(false) && (inputString.indexOf(charArray[i]) == charArray.length -1) ) {
            	System.out.println("Contains any lowercase? : "+result);  
            }
        }
        
        for(int i=0; i < charArray.length; i++){           
            //if any character is in upper case, return true
            result = ( Character.isUpperCase( charArray[i] )) ? true : false;
            if(result.equals(true)) {
            System.out.println("Contains any uppercase char? : "+result);
            break;
            }else if(result.equals(false) && (inputString.indexOf(charArray[i]) == charArray.length -1) ) {
            	System.out.println("Contains any uppercase : "+result);  
            }
        }
        
        

	}

}
