package week1.day2;

public class Findtypes {
	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;

		for(int i=0;i<test.length();i++)
		{
			if(Character.isLetter(i))
			{
				letter++;
			}
			else if(Character.isSpaceChar(i))
			{
				space++;
			}
			else if(Character.isDigit(i))
			{
				num++;
			}
			else 
			{
				specialChar++;
			}
		}
		
		System.out.println("letter = " + letter);
		System.out.println("space= " + space);
		System.out.println("number = " + num);
		System.out.println("specialCharcter = " + specialChar);

	}


}
