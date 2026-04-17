# JAVA
1. Why did JAVA came?
=>  1. Portability problem in C and C++:
        - If we want to run C and C++ code anywhere we need a compiler (converts high level language into machine code).
        - Compilers of C and C++  are platform specific. 
        Example : 
        Let us consider two platforms P1 and P2, a C++ code compiled by compiler on P1 platform will generate some machine code let's say M1, now this
        machine code cannot be run on platform P2, we will have to recompile the code written on platform P1 using the compiler present on platform P2.
        Hence increasing the compiling time and making it non portable.

    a) What is a platform?
    => platform is the combination of Processor and OS 
       Example (Intelx86 + Windows)

    Hence we can say that C and C++ are platform dependant.

    b) Why do different platforms generate different binary codes?
    => 1. Different OS have different functions to interact with OS therefore the machine code generated will be different.
       2. On hardware level there might be different transistors per processor and that would require different binary combinations to interact with them.

    c) ISA (Instruction Set Architecture):
    => This tells the processor how to perform small small command, like add jump etc.

    So since the processors are different there ISA will also be different and hence the binary code generated will also be different.

    Conclusion: Therefore the C and C++ are platform dependent

    2. Simplicity
    3. Security

    This are the reasons that JAVA came into existence.

**** SUMMARY ******
JAVA IS: 
 1. PORTABLE
 2. SIMPLE
 3. SECURE
********************


CONCEPT OF BYTE CODE
- Byte code fixed the problem of C and C++


Byte Code:
- It is an intermediate code between high level code and machine level code
- When we compile the java code it creates the bite code with the name file_name.class
- It is same for all the platforms


JVM (Java Virtual Machine):
- This will help convert byte code to machine code
- Now this byte code can be converted to any machine code wherever the JVM for that machine is present
- Now there is no need to recompile the byte code everytime.
- JVM is platform dependent.


ISSUES IN C AND C++
= pointers
- multiple inheritance
- Manual memory allocation and deallocation


HOW IS JAVA SECURE?
- JVM runs byte code in secure environment.
- This model of java is called as sandbox model.


***************************************** JVM IN DEPTH *******************************************
--------------------
|        JDK       |
|  --------------- |
|  |     JRE     | |
|  | ----------- | |
|  | |   JVM   | | | 
|  | ----------- | |
|  --------------- |
--------------------

JRE -> JAVA RUNTIME ENVIRONMENT
JDK -> JAVA DEVELOPMENT KIT
JVM -> JAVA VIRTUAL MACHINE

Q.1) How does JVM runs bytecode?
=> There are two types of software present to convert bytecode to machine code
   a) Compiler -> Converts one type of code to another type of code. (Reads full code first and then converts it to another code)
   b) Interpreter -> Same as compiler. (Converts code line by line and executes it line by line)

   In early ages JAVA used interpreter
   because we wanted early execution of the program.
   - Slow Hardware : due to this using compiler was time consuming
   - less RAM
   - Disc slow
   Therefore we used the interpreter

   In modern times we added an JIT compiler with Interpreter
   - So now it became Interpreter + JIT

   Now what does JVM do to optimize it?
   - The ByteCode which will be used frequently is compiled by the compiler to Machine Code and at the same time the interpreter keeps on converting
     and executing the code line by line, this makes the repeated code run fast as it is already in machine code. Hence making it faster.


JVM functionalities:
- Convert ByteCode to MC
- Security (Runs code in a sandbox environment)
- Garbage Collection


***************************************** JRE (JAVA RUNTIME ENVIRONMENT) *******************************************
JRE = JVM + Class Libraries

Class Libraries : This are the class libraries implemented internally by JAVA


***************************************** JDk (JAVA DEVELOPMENT KIT) *******************************************
*JDK
=> JDK consist of everything that is required to run th java program.
   It consists of:
   - Compiler
   - Debugger
   - JavaDocs
   It consists compiler that converts source code to byte code.



***************************************** Some Important Terms Asked in Interviews *******************************************
JSE -> Java Standard Edition (It is our core JAVA)
JEE -> Java Enterprise Edition (More libraries Added, used to create webapps), It is also called Jakarta Enterprise Edition
JME -> Java Micro Edition (It is a lightweight Java edition), It was used for creating the mobile apps



# VARIABLES
Variables are named storage location in a computer that can hold some value. It is also called as an identifier
The value stored inside the variable is called as literal.

How to declare variables in java?
-> data_type variableName = data (optional);

Java is Staticaly Typed (we need to specify what type of data is going to be stored beforehand)

# DATATYPES IN JAVA
There are two types of data types in Java:
1. Primitive
2. Non-Primitive

1. Primitive:
   a) Integer -> byte, short, int, long (this all have different ranges as how large of a number can be stored)
   b) Real Number -> float, double
   c) Character -> char
   d) Boolean ->  boolean

a) Integer
   i) byte: A byte can store number x where range of x is (-128, 127) that is 8 bit.
  ii) short: A short can store 16 bit.  
 iii) int: It can store 32 bit. 
  iv) long: It can store 64  bit.

  NOTE: Every number is signed in JAVA. It means that both positive and negative number can be stored in any variable.

b) Real Number (Floating point numbers):
   i) float: It can contain up to 32 bits. Range(1.4e-0.45 to 3.4e+0.38)
             we need to explicitly specify keyword "f" when using float
  ii) double: It can contain up to 64 bits. Range(4.9e-324 to 1.8e+308)

  float is also called as single precision and double is also called as double precision.
  In production always prefer to use double. 
  Why?
  -> It has much more precision.
  -> The hardware previously were good for doing calculation using float, but now the hardware are optimized for double.
  -> Also builtin avg, sin(), cos() return double values.

c) Characters:
   i) char: They can represent unicode characters (They follow ASCII standard). It has the storage value of 16 bits.

   We need to store it using single quotes so that the JAVA compiler knows that it is a character
   Example : char d = 'a';
   internally the character 'a' is stored as its ASCII number that is 65 and inside the memory that is stored in binary form of that number.
   Whenever a user tries to retrieve that character based on the data type the compiler converts 65 to 'a';

   Java uses unicode, which consists of all the characters around the world.


d) Boolean:
   i) boolean: It consists of only two values that are 0 and 1. 
   -> in JAVA we can't write 0 or 1 for true or false, we can just write true and false unlike c and c++.


1) Problem with java storing decimal numbers.
  Example : float f =  0.7f;
            System.out.printf("%.20f");

            output : 0.698975.... 
            this kind of output is not given when we write soutp because it rounds of the number and gives the output. 


# Storing binary, octal, and hexadecimal numbers in JAVA.

1) Binary Number: Add "0b" in front of the number
   example  int a = 0b101;

2) Octal Number: Add "0" in front of the number
   example int a = 023;

3) Hexadecimal number: Add "0x" in front of the number.
   example int a = 0xA;

# How negative numbers and decimal numbers are stored internally in JAVA?

1) Negative Number:
   In JAVA the negative number is stored in the form 2's complement of that number.
   For example:

   byte a = -2;

   1's complement of 2 =  0 | 0 | 0 | 0 | 0 | 0 | 1 | 0 |
   2's complement of 2 =  1 | 1 | 1 | 1 | 1 | 1 | 0 | 1 | +  1  =  1 | 1 | 1 | 1 | 1 | 1 | 1 | 0 |

   But how will java know if the number is positive or negative?
   - It will look at the numbers most significant bit.
   - If the MSB is 1 then the number is considered -ve. 
     Else it is considered positive.
   
  a) Why byte can store only from -128 to 127?
    - Byte can store 8 bits of memory, if we consider the first bit to be sign bit then :
      If the first bit is 0 for +ve numbers:
      - Even if we make all the remaining bits as 1 still the maximum number comes to be 127.
      - Example:
        0 1 1 1 1 1 1 1 = 127 (In this 0 is the sign bit).
      if the first bit is 1 for -ver numbers:
      - If we consider the rest of the numbers to be 0. Then the 2's complement of that number will come 128 and attaching -ve sign it becomes -128.
      -  Example:
         1 0 0 0 0 0 0 0 (1 is the sign bit here, so the number is negative)
         2's complement of above number is = (10000000) = -128 

   This is how we store negative numbers in java.

   b) Why do we take 2's complement to store -ve number we could've used the 1's complement?
   - This was done to handle a specific condition
   - If someone tries to store -0 in byte, then the 1's complement will be (11111111)
     in this case we have a negative 0 stored in our memory and that is wrong.
   - If we use 2's complement then still -0 has 2's complement as 00000000 hence storing the number as 0 and not -0.

2. Floating Number:
   If we have number stored like:
   float f = 8.125
   What happens internally?
   => The float takes 32 bit of memory which is divided into 3 parts
      1. Sign bit: 1bit (MSB) is a sign bit.
      2. Exponent: Following 8 bit after sign bit are exponent.
      3. Mantissa: The remaining 23 bits are called as mantissa.
   
   Now how does the "8.125" gets stored internally?
   => STEP 1:
      first "8" is converted to binary i.e  1000
      then  ".125" is converted to binary i.e 001

      so the binary now looks like 1000.001

      STEP 2: Make it in the form of (1.xx * 2^exp).
      => So the number becomes: 1.000001 * 2^3

      STEP 3: Add Bias to the exponent.
      => for float bias = 127;
         so exponent = 127 + 3 = 130
         Convert the exponent to binary so we get: exp = (10000010)

      STEP 4: Place value in memory.
      => 1. Sign Bit: 
            - Since the number is positive the sign bit is 0
         2. Exponent Bits:
            - Exponent we have took out i.e 10000010
         3. Mantisaa:
            - The "xx" in (1.xx * 2^exp) is the mantissa
            - i.e 000001
            - since we have the space of 23 bits we make the remaining spaces to "0"

   3) How does retrieval takes place?
      => Let's use our previous number as an example: 0|10000010|00000100...00
      
         The formula for that is : (-1)^sign * (1 + Mantissa) * 2^exp-Bias
         => So replacing the value accordingly we get: (-1)^0 * (1 + 2^-6) * 2^(130-127)
                                                       = 1 * (1.56125) * 8 = 8.125

   
   4) Now let's look at the edge case:
      Consider the number 0.7.
      a) Express the number to binary
         i.e 0.1011001100110... the number after decimal goes on repeating infinitely
      
      b) Express the above number in the format : (1.xx * 2^exp)
         1.01100110... * 2^-1
         Exponent = 127 +  (-1) = 126
         Binary form of exponent =  01111110
      
      c) Express it in memory
         0|01111110|0110 0110 0110 0110 0110 011
         - Since we are storing trucated data, when we try to extract it back we get the wrong value.

   5) What is Bias and why it's value is 127?
      - Bias is the number that we add to exponent so that we don't have to store negative exponents.
      - To know the exact value of bias we have the formula: 
        2^(Number of exp bits - 1) -1;
      - This is an IEEE format

   6) But how do we store the floating numbers in double:
      - In double we have 64 bits
      - MSB (1bit) = Sign bit
      - Following 11 (bit) = Exponent
      - Following 52 (bit) = Mantissa

      The bias for double will be 1023.


# Type Conversion in JAVA
  
  There are two types of type conversion in JAVA:
  1. Implicit : 
      Type conversion done by JAVA itself is called as Implicit conversion
      Example:
        byte b = 24:
        int i;
        i = b;
      
      A) Rules for implicit Conversion
      - Destination data type should be wider than source data type. (This are also called as widening conversion)


  2. Explicit:
     This needs to be done by using casting.
     Example int i = 300;
             byte b = i; -> this will give error because bytes range is short
         We need to do explicit casting to do this
             byte b = (byte) i; we tell compiler intentionally that we want to convert our integer to byte

             Since byte range is only 8 bit, the first 8 bit will be taken from the integer 300's binary form
             so the number stored in "b" will be 44.
         - This type of conversion are also called as narrowing conversion


   3. Truncating Conversion:
      - float to int
         float f = 16.25f;
         int a - f;
         we get the value in "a" as 16
      
      - double to int

   4. Boolean to any data type conversion:
         NOTE: This conversion are not possible in JAVA
   
   5. Automatic Type Promotion
       JAVA internally converts the type while doing some calculations or writing some expression.
       Example:
         byte b = 50;
         b = b*2; This will give error because  the number while calculating are converted to int
         So we need to explicitly specify the type to be inferred as byte

      ** Type Promotion Rules **
      1. byte, short  and char values are promoted to int.
      2. If one operand is long, the while expression will become long
      3. If one operand is float, entire expression will become float
      4. If one operand is double, entire expression is double
      
       