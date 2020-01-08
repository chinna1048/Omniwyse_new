//str_length_class
class str_length_class
{
	int lengthOfString(String str)
	{
		int i=0;
		try
		{
			while(str.charAt(i)!='\0')
			{
				i=i+1;			
			}
		}
		catch(IndexOutOfBoundsException e){}
		return i;
	}
}