# jptest


Instructions:

Please solve the below two programs in any programming language you are most comfortable(preferably Python) and add unit test cases. Create a github repo and email back the link within 7 days of receiving this email.

Please make any assumptions you want and state them clearly. Ensure that you have handled any edge case scenarios carefully. Emphasize will be given to accuracy, performance and readability aspects as well.

 

Problem 1:

Given a long statement and a input letter, find the word which contains the most number of the given character. If more than one word has the exact same number of the given letter, it should return the word with the most number of total letters, if more than one words have equal number of given character and total number of characters return the word that appeared first in the given statement.

 

Examples:

Statement : This is a very long sentence and I want to educate everyone in this whole crazy world….

 

Case 1:

Input character : z

Expected result : crazy

Explanation: z is only present in the word crazy

 

Case 2:

Input character : I

Expected result : I

Explanation: case sensitive letter I comes only once

 

Case 3:

Input character : e

Result : sentence

Explanation: Both sentence and everyone have 3 occurrences of letter e and total length of the words are 8, but sentence occurred first in the input so the expected result is sentence.

 

Problem 2:

Write a function that accept a number and returns the starting position of the longest continuous sequence of 1s in its binary format.

 

Examples:

Case 1:

Input : 156

Output : 4

Explanation: 156 when converted to binary, the result will be 10011100 and the maximum continuous 1s are starting at 4th position

 

Case 2:

Input : 88

Output : 3

Explanation : 88’s binary representation is 1011000 and the maximum continuous 1s occur at position 3.

 
