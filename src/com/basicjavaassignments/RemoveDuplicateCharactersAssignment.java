package com.basicjavaassignments;

public class RemoveDuplicateCharactersAssignment 
{
	public String removeDuplicates(String input)
	{
		String uniqueCharactersString = new String();  
		for (int index = 0; index< input.length(); index++) 
		{
			if(!uniqueCharactersString.contains(String.valueOf(input.charAt(index)))) 
			{ 
				uniqueCharactersString+= String.valueOf(input.charAt(index));  
		    }
		}
	return uniqueCharactersString;
	}

}


