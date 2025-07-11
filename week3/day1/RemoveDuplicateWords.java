package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		
		String text = "We learn Java basics as part of java sessions in java week1";

        String[] words = text.split(" ");
        
        String remdup;
        
        
        int i , j, count=0;
        for(i=0;i<words.length;i++) {
        	
        	for(j=i+1;j<words.length;j++) {
        		
        		if(words[i].equalsIgnoreCase(words[j]))
        		{
        			words[j]=" ";
        			count++;
        			remdup = words[j].toString();
        		}
        	else
        	{
        		 remdup = words[j].toString();
        	}
        	}
        }
	if(count>1)
	{
		System.out.println(remdup);
	}
	else {
		System.out.println(remdup);
	}

}
}
