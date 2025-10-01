# Permutation Combination Calculator

This program calculates both permutation (nPr) and combination (nCr)

I built this program because I took discrete math twice and I'm currently taking probabilities and thought it would be a good way to 
practice for loops in Java.

## About This Project

I used only 2 files (permutation, combination) to both set the formula and test the formula before calling the methods into the main file.

At first I used regular multiply and divide operators because I didn't really know about BigInteger and as a result, my program would break
once n would pass 12. It would either give me the wrong number or raise an error.

Once I used BigInteger, no errors happened and I would get correct calculations as I would compare them to the answers I'd get on a graphing
calculator

I also decided to use Integer.parseInt() instead of just doing scanner.nextInt() so I wouldn't have to worry about clearing the scanner.

## How does it work?

You will need all three files (permutation.java, combination.java and main.java) for you to be able to use this program

- Open the files on an IDE such as eclipse, JGrasp or IntelliJ and run the main.java file.
- Choose either permutation or combination
- You will be prompted to add n and r to get your calculations.
- You could run the program as many times as you like until you tell it that you don't want to do another calculation.

consolse example:

Would you like to do permutation or combination? (type p for permutation type c for combination type): p
What would you like n to be?: 5
What would you like r to be?: 2
Calculated permutation: 20
Would you like to make a new calculation? Yes or No: yes
Would you like to do permutation or combination? (type p for permutation type c for combination type): c
What would you like n to be?: 50
What would you like r to be?: 3
Calculated Combination: 19600
Would you like to make a new calculation? Yes or No: no
Thank you for using my app


## Thank You

Thank you for using my program and thank you for reading.
