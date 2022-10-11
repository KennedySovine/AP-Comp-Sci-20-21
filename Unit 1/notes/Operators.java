public class Operators{
   public static void main (String [] args){
   
/*
Math can be done with numbers or variables using the following operators:
    +          -              *             /
(addition, subtraction, multiplication, division)

Testing equivalence:
   ==           !=
(equal to, not equal to)

*ALWAYS REMEBER PEMDAS

Math can be done with numbers and only Strings to Strings and Strings to Numbers.
*/
System.out.println("Hello"+"World"); //HelloWorld
//The minute you add parentheses, it takes over
System.out.println("Hello"+42); //Hello42
System.out.println("Hello"+1+2); //Hello12
System.out.println(1+"Hello"+2); //1Hello2
System.out.println("Hello"+(3+4)); //Hello7
System.out.println(1+2+"Hello"); //3Hello

//Example 1
int x=3;
int y=2;
System.out.print(x);
System.out.print(y);
x=y; //x=2
System.out.print(x);
System.out.print(y);
y=5;
System.out.println(x);
//same line. Print then move
System.out.println(y);
/*
32222
5
*/

//Example 2
int a=0;
int b=1;
int c=2;
a=a+3; //a=3
b=b*2; //b=6
c=3; //c=3
System.out.println(a);
System.out.println(b);
System.out.println(c);

//Example 3
System.out.println(2+3); //5
System.out.println(2-3); //-1
System.out.println(2*3); //6
System.out.println(2==3); //false
System.out.println(2!=3); //true

/*
You cannot divide by 0. If you do, it will be an "Arithmetic Exception".
   !!May need to code in an exception!!
   
If you are dividing two int variables or integers, the return you will get is the number of times
   your divisor fits evenly into the greater number
   
Int x and int y
   Any math done with these two variables will return a type int and if you do division, it will be 
   an integer division.
Int x and double y
   Any math done with these two variables will return a double and if you do division, you will get
   the true answer.
Double x and double y
   Any math done with these two variables will return a type double and if you do division, you will
   get the true answer.
   
Casting a variable means changing the type of a variable.
   int x=5;
   int y=2:
If you want true division, one must be cast as a double.
(double)x/y //Casts x varible as a double
x/(double)y //Casts y variable as a double.
*/

int d=5;
int e=2;
//(double)(d/e); Makes 2 because PEMDAS

//If you cast a double as an int, it will just chop off the decimals, EVEN IF
//THE NUMBER SHOULD ROUND UP.
double f=5.6;
int g=(int)f; //Makes f the double and g the int version.
System.out.println(g);
//Cannot do "x=(int)x because you cannot cast a varible as itself again.

/*
Modules funtion is used with %
Modules returns the remainder of any division problem.

5%2==1;
6%3==0;
5%10==5;

The modulus function is very helpful when you want to pick off digits in a number.
KEY: %10
*/
//How to get the last digit of 59?
System.out.println(59%10);

//How to get the 5 in 59?
System.out.println((59/10)%10);

//To tell if a number is odd or even, do %2
//If it returns a 1, its odd. If it returns 0, it is even.

/*
x=x+5 -> x+=5
x=x-5 -> x-=5
x=x*5 -> x*=5
x=x/5 -> x/=5
x=x%5 -> x%=5
x++ INCREASE BY 1
x-- DECREASE BY 1
*/
   }
}