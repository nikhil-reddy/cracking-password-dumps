import java.io.*;
import java.util.*;

class eharmony
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br1 =new BufferedReader(new FileReader("list.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("eHarmony.txt"));
		
		String password[]=new String[99999];
		String md5Hash[]=new String[99999];
		int i=0;
		PrintWriter writer = new PrintWriter("eharmonyCracked.txt", "UTF-8");
		
		for(i=0;i<1100;i++)
		{
//			System.out.println(i);
			String s=br1.readLine();
			String tokens[]=s.split(" ");
//			System.out.println(tokens[0]);
//			System.out.println(tokens[1]);
			password[i]=tokens[0];
			md5Hash[i]=tokens[1];
			

			
		}

		String l=br2.readLine();
		while(l!=null)
		{
			for(int j= 0;j<md5Hash.length;j++)
			{
				
				if(l.equals(md5Hash[j]))
				{
					
					writer.println(md5Hash[j]+ " "+ password[j]);
				}
			}
			l=br2.readLine();
		}
		br1.close();
		br2.close();
		writer.close();
	}
}