public class Anagram{
    public static boolean areAnagrams(String str1, String str2){
        if( str1.length() != str2.length() ){
            return false;
        }  
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        int[] charCount = new int[26]; // Assuming ASCII character set
        for(int i= 0; i< str1.length(); i ++){
            charCount[str1.charAt(i)- 65]++;
            charCount[str2.charAt(i)- 65]--;
        }
         for(int j : charCount){
            if(j != 0){
                return false; 
            }
            else
             return true;
        }
        return false;
        
    }
    public static void main(String[] args) {
        String str1 = "aq";
        String str2 = "qr";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}