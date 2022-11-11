package org.forloop;

public class ForLoop{
public void forLoop()

{
	for(int i =1;i<=50;i++) {
		if(i%2 != 0) {
			System.out.println(i);
		}
	}
	
	}
public static void main(String[] args)
{
ForLoop f =new ForLoop();
f.forLoop();

}
}
