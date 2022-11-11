package org.forloop;


public class Nested{
	public void nestedFor(int i,int j,int k) {
		for(i=1;i<=3;i++)
		{
			System.out.print(i+"\n");

			
			for(j=1;j<=i;j++)
			{

				System.out.print(j+" ");
				for(k=1;k<=3;k++) {
				System.out.print(k);
	}
			}
			
		}
	
	}
	public static void main(String[]args) {
		Nested n = new Nested();
		n.nestedFor(1,1,1);
		
		
	}
	
}