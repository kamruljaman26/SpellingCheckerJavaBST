#Practice using binary trees.

###The Problem

This program requires you to build a spell checker. A spell checker, as the name suggests, checks the spellings in a given text. The simplest idea to build a spell checker is to have a big list of words stored in an appropriate data structure (i.e. BST here). Checking for correct spellings involves matching the words in the input text against the list (i.e. BST). If a word is found in the list, it has the correct spellings, otherwise the spelling is considered to be incorrect.

###Implementation Details:

The data structure that you will need to store words in this program is a BST (binary search tree). You will write methods to insert words (given in the words_list.txt file) in the nodes of BST and search for a word in this BST to know whether its spellings are correct or not.

The UML Diagrams for required Java classes are at the end of this write-up. Input File Specifications

You will read input from two files, "SpellChecker.in" and “words_list.txt”. Have this AUTOMATED.

The words_list.txt file contains a list of around 235K words while the SpellChecker.in file contains the text for spell checking:

###Output File Specifications

Your program must print output in a file, called "SpellChecker.out". You must follow the program specifications correctly. You will lose points for formatting errors and spellings.

The output will be the same as the SpellChecker.out file, except that incorrect spellings are surrounded by double quotes. (Incorrect spellings are of those words which are not present in the file words_list.txt). Note that words are case sensitive.

See sample input and output files for examples.

***WARNING***

Your program MUST adhere to this EXACT format (spacing capitalization, use of colons, periods, punctuation, etc). The graders will use very large input files, resulting in very large output files. As such, the graders will use text comparison programs to compare your output to the correct output. If, for example, you have two spaces between the output when there should be only one space, this will show up as an error even through you may have the program correct. You WILL get points off if this is the case, which is why this is being explained in detail. Minimum deduction will be 10% of the grade, as the graders will be forced to go to text editing of your program in order to give you an accurate grade.
Grading Details

Your program will be graded upon the following criteria:

1)	Adhering to the implementation specifications listed on this write-up.
2)	Your algorithmic design.
3)	Correctness.

4)	Use of stacks and queues. If your program does not use stacks and queues, you will NOT get credit for the assignment. Period.

5)	The frequency and utility of the comments in the code, as well as the use of white space for easy readability. (If your code is poorly commented and spaced and works perfectly, you could earn as low as 85-90% on it.)

6)	Compatibility to the newest version of NetBeans and Java. (If your program does not compile in NetBeans, you will get a sizable deduction from your grade.)

7)	Your output MUST follow to the EXACT output format shown in the sample output file.

8)	Your program should include a header comment with the following information: your name, course number, section number, assignment title, date, AND EMAIL ADDRESS.
9)	You should include comments throughout your code, when appropriate.

Deliverables
You should submit a zip file with Four files inside:
1.	Concept.docx or Concept.pdf
File containing the solution of Concept and Algorithm part
2.	englishWord.java

Class to create a BST node of type englishWord
3.	englishWords.java

Class to create the BST with insert, search and other methods
4.	SpellChecker.java

This is your main program.

NOTE: your name, ID, section and EMAIL should be included as comments in all files!

***Helpful Suggestions***

•	Read and FULLY understand this write-up BEFORE trying to write the code.


•	You will need to study the sample output file provided to try to figure out how you will display the output.


Here are the UML Diagrams for the required classes:

 

