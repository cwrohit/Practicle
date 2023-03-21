package Exception;

import mypackage.Main;

public class Exception_ex {
	public void display () {
		//before try = catch block
		String a = "error is there";
		System.out.println(a);
		try {
			int i =50/2;
		   System.out.println(i);
		   //after exception can't execute the other lines
		   String s = "Rohit";
		   System.out.println(s.length());
		}
		catch(Exception e){
			System.out.println(e);
			}
		 //after try -catch block 
		String b = "error can nit be handle";
		System.out.println(a + " "+b);}
		public static void main(String[]args){
			 Exception_ex ep = new  Exception_ex();
			 ep.display();
			
			}
		}

