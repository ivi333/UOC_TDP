package uoc.edu.tdp.common.util;



public class Nif
{
	public static boolean validar (String pnif)
	{
		boolean ret = false;
		char a,b;
		long num = Long.parseLong(pnif.substring(1,7));
		if (pnif.length()==0) ret = true;
		else
		{
			if (pnif.length()== 9)
			{ a=pnif.charAt(8);
			if (Character.isLetter(a))
			{ if (num <= 99999999 & num >=1) ret = true; }
			else ret = false;
			}
		}
		return ret;
	}
}


