public class UserInput {
	static String b="",c="";
    
    public static class TextInput {
    	
    	public void add(char a)
    	{
    		if(Character.isLetter(a))
                c=c+a;
					
				
    	}
    	

	public String getValue() {
		// TODO Auto-generated method stub
		return b;
	}
        
    }

    public static class NumericInput extends TextInput {
        
    	
        
        public void add(char a)
        {
           if(Character.isDigit(a))
         	  
     	   b=b+a;
     	   
        }
        
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}