public class StringConverter
{
    public static void main (String[]args) 
    {
        
        public static String reverse(String str)
        {
            
            for(int i = str.length() - 1; i>= 0; i--)
            {
                return str.charAt(i);
            }
        }
        public static boolean checkPalindrome(String str)
        {
            reverseStr = "";
            
            for(int i = str.length() - 1; i>= 0; i--)
            {
                reverseS = tr.charAt(i);
            }
            
            str.toLowerCase();
            str.replace(" ", "");
            
            reverseStr.toLowerCase();
            reverseStr.replace(" ","");
            
            if (str == reverseStr)
            {
                return str + "is a palindrome";
            }
        }
        
        public static String pigLatinate(String str)
        {
            englishWord = str;
            
            englishWord.toLowerCase();
            
            for (int i = 0, n = englishWord.size(); i < n; i++)
            {
                
                if (englishWord.contains("a")||englishWord.contains("e")englishWord.contains("i")||englishWord.contains("o")||englishWord.contains("u"))
                {
                    if (englishWord.startsWith("a")||englishWord.contains("e")englishWord.contains("i")||englishWord.contains("o")||englishWord.contains("u"))
                    {
                        return englishWord + "ay";
                    }
                    else
                    {
                        return  substring(englishWord.lenght()/2, englishWord.lenght) + substring(0, englishword.length()/2) + "ay";
                    }
                }
                else 
                {
                    return englishWord + "ay";
                }
            }
        }
        
        public static String shorthand(String str)
        {
            shortStr = str;
            shortStr.toLowerCase();
             
            shortStr.replace(" you " , " U ");
            shortStr.replace(" for " , " 4 ");
            shortStr.replace(" and " , " & ");
            shortStr.replace(" to " , " 2 ");
            
            for (int i = shortStr.lenght() - 1; i >=0; i--)
            {
                if (shortStr.contains("a")||shortStr.contains("e")||shortStr.contains("i")||shortStr.contains("o")||shortStr.contains("u"))
                
        }
    }
}