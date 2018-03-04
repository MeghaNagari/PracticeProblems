public class PalindromeString {
    public static boolean isPalindrome(String word) {
    	int length=word.length();
    	char[] a=word.toCharArray();
    	int j=length-1;
    	int i;
    	for(i=0;i<j;i++)
    	{
    		if(a[i]==a[j])
    			j--;
    		else
    			break;
    		
    	}
    	if(i==j)
    		return true;
    	else
    		return false;
        
   
    
    
    
    
    }
    
    public static void main(String[] args) {
        System.out.println(PalindromeString.isPalindrome("example"));
    }
}