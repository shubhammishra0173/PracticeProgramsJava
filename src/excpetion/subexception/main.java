package excpetion.subexception;

import excpetion.InvalidAgeException;

public class main {
static void validate(int num) throws invalidNumberException
{
if(num<12.34)
{
	 throw new invalidNumberException("age is not valid to vote");    
}  
   else {   
    System.out.println("welcome to vote");   
    }}
}
