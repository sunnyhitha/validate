/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		char d;
       Scanner s=new Scanner(System.in);
       d=s.next().charAt(0);
       if(d>='0'&&d<='9'){
           System.out.println("Yes");
       }
      else{
           System.out.println("no");
      }
      // your code goes here
	}
}
