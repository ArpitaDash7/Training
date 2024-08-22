class StringB
{
	public static void main(String args[])	{
		StringBuffer str= new StringBuffer();
		str.append("Arpita");
		System.out.println("The Original String is "+str);
        	str.append(" ");
        	str.append("Dash");
		System.out.println("The Appended String is "+str);
		str.insert(7,"Verizon ");
		System.out.println("The inserted String is "+str);
		String a= str.toString();
		System.out.println("The converted string is "+a);
}
}