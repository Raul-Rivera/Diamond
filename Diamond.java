/*
Name: Raul Rivera Ortiz
Course: CSC 122 001
Project #2
Project description:
	I made a program that greets the user, then asks the user to enter 
	the diagonal of the diamond to be drawn with asterisks.
Purpose:
	1. Become familiar with for loops.
	2. Become familiar with nesting loops.
	3. Use simple math to create desired shape with for loops.
What the program does?:
	The program print: Hello my friend!
	Then print: Enter the diagonal of the Diamond.
	Then the program draw a diamond with asteriks whose size is determinde by the diagonal
	of the diamond, with the variable diagonal.
	NOTE: 
		If the user print 0, the program print: Enter a odd number and different of 0.
		If the user print 1, the program print: Enter a odd number and different of 1.
		If the user print a odd number, the program run to the topDiamond method and 
			to the bottomDiamond method.
		If the user print a even number, the program print: Enter a odd number.
How you tested the program:
	First, I wrote my code on a Notepad.
	Then, I save the file in a folder that I made and call it Java-projects.
	Then, I opened the Command Prompt and moved it to the same Path with the command: cd
	Then I compiled the file with the command: javac Diamond.java and
	a new file was created with the same name but with the class extension.
	Then I ran the program with the command: java Diamond
	NOTE: 
		I use the package java.util to import the Scanner class and make inputs.
		I create a main method to call two methods topDiamond and bottomDiamond.
		I create and if, else if and else conditions for eliminate the limitacions.
		I create a nested loop in the methods topDiamond and bottomDiamond.
Limitations if any in the program:
	No limitations.
*/


import java.util.*;   //Import the Scanner class, for create a input.
public class Diamond {
    public static void main(String[] args) {   //Main method.
		System.out.print("Hello my friend! \n");   //Print text.
		System.out.print("Enter the diagonal of the Diamond: ");   //Print text.		
        Scanner sc= new Scanner(System.in);   //Create a Scanner object.	
		int diagonal = sc.nextInt();   //Constant the control diagonal of the diamond and read the input.
		
		if (diagonal==0) {
			System.out.print("Enter a odd number and different of 0");
		} else if (diagonal==1) {
			System.out.print("Enter a odd number and different of 1");
		} else if (diagonal%2==1) {
			topDiamond(diagonal);
			bottomDiamond(diagonal);
		} else {
			System.out.print("Enter a odd number");
		}
	}   //Close main method
	
	public static void topDiamond(int diagonal) {
		
		
		for (int i = 1; i < diagonal; i += 2) {   //Open outter loop, create top of diamond.
            for (int k = diagonal; k >= i; k -= 2) {   //Open first inner loop.
               System.out.print(" ");   //Creates negative space before asterisks.
            }   //Close first inner loop.
            for (int j = 1; j <= i; j++) {   //Open second inner loop.
                System.out.print("*");
            }   //Close second inner loop.

            System.out.println();
        }   //Close outter loop, top half & axis of symmetry complete.
	}
	
	public static void bottomDiamond(int diagonal) {
		
        
		for (int i = 1; i <= diagonal; i += 2) {   //Open outter loop, create bottom of the diamond.
            for (int k = 1; k <= i; k += 2) {   //Open first inner loop.
                System.out.print(" ");
            }   //Close first inner loop.
            for (int j = diagonal; j >= i; j--) {   //Open first inner loop.
                System.out.print("*");
            }  //Close second inner loop.
            System.out.println();
        }   //Close outter loop, diamond complete
    }
}   //Close the class


/*

Microsoft Windows [Version 10.0.19041.746]
(c) 2020 Microsoft Corporation. All rights reserved.

C:\Users\Owner>cd C:\Users\Owner\Java-projects

C:\Users\Owner\Java-projects>javac Diamond.java

C:\Users\Owner\Java-projects>java Diamond
Hello my friend!
Enter the diagonal of the Diamond: 0
Enter a odd number and different of 0
C:\Users\Owner\Java-projects>java Diamond
Hello my friend!
Enter the diagonal of the Diamond: 1
Enter a odd number and different of 1
C:\Users\Owner\Java-projects>java Diamond
Hello my friend!
Enter the diagonal of the Diamond: 2
Enter a odd number
C:\Users\Owner\Java-projects>java Diamond
Hello my friend!
Enter the diagonal of the Diamond: 3
  *
 ***
  *

C:\Users\Owner\Java-projects>java Diamond
Hello my friend!
Enter the diagonal of the Diamond: 7
    *
   ***
  *****
 *******
  *****
   ***
    *

C:\Users\Owner\Java-projects>java Diamond
Hello my friend!
Enter the diagonal of the Diamond: 69
                                   *
                                  ***
                                 *****
                                *******
                               *********
                              ***********
                             *************
                            ***************
                           *****************
                          *******************
                         *********************
                        ***********************
                       *************************
                      ***************************
                     *****************************
                    *******************************
                   *********************************
                  ***********************************
                 *************************************
                ***************************************
               *****************************************
              *******************************************
             *********************************************
            ***********************************************
           *************************************************
          ***************************************************
         *****************************************************
        *******************************************************
       *********************************************************
      ***********************************************************
     *************************************************************
    ***************************************************************
   *****************************************************************
  *******************************************************************
 *********************************************************************
  *******************************************************************
   *****************************************************************
    ***************************************************************
     *************************************************************
      ***********************************************************
       *********************************************************
        *******************************************************
         *****************************************************
          ***************************************************
           *************************************************
            ***********************************************
             *********************************************
              *******************************************
               *****************************************
                ***************************************
                 *************************************
                  ***********************************
                   *********************************
                    *******************************
                     *****************************
                      ***************************
                       *************************
                        ***********************
                         *********************
                          *******************
                           *****************
                            ***************
                             *************
                              ***********
                               *********
                                *******
                                 *****
                                  ***
                                   *

C:\Users\Owner\Java-projects>dir
 Volume in drive C has no label.
 Volume Serial Number is 9242-0A43

 Directory of C:\Users\Owner\Java-projects

01/29/2021  10:46 PM    <DIR>          .
01/29/2021  10:46 PM    <DIR>          ..
08/16/2019  09:33 AM               395 BMICalculator.java
08/16/2019  09:33 AM               599 BMICalculator2.java
08/16/2019  09:35 AM               118 Bug1.java
08/16/2019  09:35 AM               118 Bug2.java
08/16/2019  09:35 AM               117 Bug3.java
08/16/2019  09:35 AM               112 Bug4.java
08/16/2019  09:35 AM               113 Bug5.java
08/16/2019  09:35 AM               114 Bug6.java
08/16/2019  09:33 AM               400 Dashes.java
02/04/2021  12:02 AM             1,279 Diamond.class          (java compile)
02/04/2021  12:00 AM            11,251 Diamond.java           (java file)
08/16/2019  09:35 AM               428 DrawBoxes.java
08/16/2019  09:35 AM               349 DrawBoxes2.java
08/16/2019  09:35 AM               349 DrawBoxes3.java
08/16/2019  09:33 AM               384 DrawCone.java
08/16/2019  09:33 AM               473 DrawCone2.java
08/16/2019  09:33 AM             1,626 DrawFigure.java
08/16/2019  09:33 AM             1,736 DrawFigure2.java
08/16/2019  09:33 AM             1,627 DrawFigure3.java
08/16/2019  09:35 AM             1,243 DrawFigures1.java
08/16/2019  09:35 AM             1,522 DrawFigures2.java
08/16/2019  09:35 AM             1,196 DrawFigures3.java
08/16/2019  09:35 AM             1,258 DrawFigures4.java
01/22/2021  02:49 PM               654 DrawFiveBoxes.class
08/16/2019  09:35 AM               480 DrawFiveBoxes.java
08/16/2019  09:33 AM               381 DrawV.java
08/16/2019  09:33 AM               902 Equal.java
01/20/2021  10:09 PM               429 Example.class
01/20/2021  10:15 PM               124 Example.java
01/27/2021  11:06 AM             1,008 Figure.class
01/27/2021  10:57 AM             1,202 Figure.java
08/16/2019  09:35 AM               406 FooBarBazMumble.java
01/20/2021  10:17 PM               417 Hello.class
08/16/2019  09:35 AM               119 Hello.java
08/16/2019  09:35 AM               124 Hello2.java
08/16/2019  09:35 AM               256 Hello3.java
01/22/2021  06:20 PM               573 HelloWorld.class
01/22/2021  06:18 PM             3,692 HelloWorld.java
08/16/2019  09:35 AM               207 Infinite.java
08/16/2019  09:35 AM               129 Marty.java
08/16/2019  09:35 AM               198 MissingSemicolon.java
01/27/2021  08:17 PM                 9 new 1.txt
08/16/2019  09:35 AM               271 NewFun.java
08/16/2019  09:33 AM               253 Sample.java
08/16/2019  09:33 AM               340 ScopeExample.java
01/29/2021  10:59 PM               591 Stars.class
01/29/2021  10:59 PM               274 Stars.java
08/16/2019  09:33 AM               357 Time.java
08/16/2019  09:35 AM                99 Ugly.java
08/16/2019  09:35 AM               119 Ugly2.java
08/16/2019  09:33 AM               366 WriteSquares.java
08/16/2019  09:33 AM               192 WriteSquares2.java
08/16/2019  09:35 AM                27 WrongFileName.java
              53 File(s)         41,006 bytes
               2 Dir(s)  909,848,784,896 bytes free

C:\Users\Owner\Java-projects>

*/