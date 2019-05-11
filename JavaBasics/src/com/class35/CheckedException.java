package com.class35;


		
		/*Notes: 
		 * Exception - unexpected/unwanted event that disrupts the flow of your program execution.
		 * 
		 * The parent of all exception is a Throwable class:
		 * Error - something we cannot fix
		 * Exception: something that can be handled by a programmer
		 * 
		 * Handling an exception doesn't mean fixing it, we are just providing an alternative way to complete
		 * program execution
		 * 
		 * Exceptions are 2 types:
		 * 1. Checked E - checked during compile time that Exception might occur and what would like to do with it. 
		 * Checked Exception must be handled otherwise your code wont compile.
		 * 
		 * Thread.sleep(2000)
		 * 
		 * Unchecked E: exception that might occur but it is not checked by a compiler. Unchecked E=RunTime E.
		 * 
		 * int a=10;
		 * int b=0; 
		 * 
		 * System.out.println(a/b); 
		 * 
		 * ALL exceptions
		 */
		public class CheckedException {

			public static void main(String[] args) throws InterruptedException {
				//checked exception
				Thread.sleep(2000);

			}
		}
