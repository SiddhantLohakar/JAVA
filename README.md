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


# EXPRESSION: 
In programming, an expression is a combination of literals, variables, operators, and function calls that the language interprets and computes to produce a single value.

# OPERATORS IN JAVA
1) Arithmetic Operators (+, -, *, /, %, ++, --)
2) Relational Operators (==, !=, <, >, <=, >=)

3) Bitwise Operators
   This operators work on the bit level
   &, |, ^, ~, >>, <<, >>>, &=, |=, ^=, >>=, <<=, >>>=


   A B A&B A|B A^B ~A
   0 0  0   0   0  1
   0 1  0   1   1  1
   1 0  0   1   1  0
   1 1  1   1   0  0



   a) & (AND operator): Outputs 1 when both the binary bits are 1, otherwise returns 0
   b) ^ (XOR operator): This operator gives 1 whenever there are odd number of 1's in the operands
   c) | (OR operator) : Output is 1 when any one of the operand is 1
   d) ~ (NOT Operator): Inverts the bits


Bitwise Shift Operators in Java
   1. Key Concept: Type Promotion
            In Java, byte and short are promoted to int (32 bits) before any bitwise operation.
            This means all shift operations (<<, >>, >>>) are actually performed on 32-bit integers, even if the variable is byte or short.
   
   2. Left Shift (<<) on byte / short
            Process:
            Value is promoted to 32-bit int
            Left shift operation is performed
            Result is truncated back to 8 bits (byte) or 16 bits (short)
            Final value is stored
            
            Important Observation:
               During computation → number is 32-bit (no sign issue yet)
               After truncation → only LSB bits remain
               If the MSB (sign bit) of the truncated result = 1, the number becomes negative
            
            Example Insight:
               You may get a positive intermediate result
               But after truncation → it can become negative
               Storage Difference:
               If stored in byte → truncation happens → possible negative value
               If stored in int → full 32-bit value preserved → different result

   3. Left Shift (<<) on int
         Operates directly on 32 bits
         Shift count is capped using modulo 32
         
         Rule:
         shift = shift % 32
         
         Examples:
            x << 35 → same as x << 3
            Prevents overflow of shift range
   4. Why byte and short Support Shifts
         Even though they are smaller types:
         Java promotes them to int internally
         That’s why shift operators work without errors
  
   5. Negative Numbers and Sign Bit
         Key Idea:
         In signed numbers, MSB (Most Significant Bit) represents the sign
         0 → positive
         1 → negative

         For Negative Numbers:
         The sign bit must be preserved to maintain negativity
        
         Behavior:
            Left shift (<<):
            Shifts bits left, fills 0 on the right
            May change sign if MSB changes after shift

            Right shift (>>):
            Preserves sign bit (sign extension)
            Used for signed numbers

            Unsigned right shift (>>>):
            Does NOT preserve sign
            Always fills with 0
   
   6. Key Takeaways
      All shift operations are performed on 32-bit integers
      byte/short results are truncated after operation
      Sign may change due to truncation
      Shift count for int is modulo 32
      
      Always be careful when:
         Storing results in smaller data types
         Working with negative numbers
      
# Short Circuit:
- Short circuit is when the second operation doesn't get executed because the first expression resulted in true or false while using logical operator
Example (a>b && a>c) (In this case if a>c results in false we don't have to check the other operation)

To prevent short circuit from happening we can use a bitwise and or bitwise OR operation, it works similarly but doesn't give the short circuit and checks every condition

# What is flow of Control?
- Flow of control is how the bytecode gets executed line by line while converting it to machine code.
- In JAVA the statements are executed line by line but there are some keywords that can change this flow.

# Three types of flow of control:
1. Selection
2. Iteration 
3. Jumps

1. Selection: 
   a) if() : 
      -Executes the inner block if the condition specified in the bracket is true.
      -Example: a = 20;
                 if(a>18)
                 {
                   system.out.println("Age above 18);
                 }
                 else
                 {
                     <!-- Some code -->
                 }
         If the "if" statement is true then execute the code inside the "if" block else, go to "else" block and execute that statement


   b) if-else()
         Multiple choices we can use if-else if ladder
         Example:
           if(a==1)
           {
            //
           }
           else if()
           {

           }
           else
           {

           }

   c) switch()
      Before JDK7:
      - Switch is optimized for some cases, but it has limited use cases
      - It can evaluate only on byte, short, int, char, enumeration.
      - two cases can not be duplicated
      After JDK-7:
      - Strings can also be used at switch expression
      After JDK-14: switch is enhanced too much


      Switch can only test equality but if-else can test both equality & unequality.

      Why is it more optimized?
            in switch statement if we have code like this
            int i = 2;
            switch(i){
               case 1:
                  // do something
                  break;
               case 2:
                  // do something
                  break;
               case 3:
                  // do something
                  break;
               default:
                  // do something
                  break;
            }

            In this case the JVM doesn't evaluate cases 1 by 1. It sees that i is storing 2 and directly executes case 2, so the execution happens
            in one step only.

      How does JVM achieve it?
      => It uses jump table internally
        - Jump table provide us random access, so that we can directly jump to any testCase
        - The jump table are not always efficient, so compiler doesn't create it always
        - When there are sparse values (Values that are too far from each other) the JAVA doesn't make Jump table.

      Jump Table are of two types:
      Table-Switch : this creates and stores value for each test cases, used whhen there are dense values.
      lookup-Switch: This can do binary search to search lookup in log(N) time. Created when value is sparse.

      We can also have nested switch 


# Iteration Statement in JAVA
- Loops a certain block of code for a certain number of time
Types of loops in JAVA:
 - While loop
 - For loop
 - do - while loop

1) While loop :
   Runs the block of code till the expression specified inside the while condition is true.
   Example:
   while(i>10)
   {
      // Block of code
   }
   This will run till "i" value is greater than 10

2) Do while loop:
   do-while loop runs atleast once then check conditions afterwards
   Example:
   do{

   }while();


3) for loop:
   1. First assignment statement is executed
   2. Then second condition statement is evaluated
   3. If true flow will evaluate the body of the loop
   4. If false then it will go to the following code after the for loop

# JUMP STATEMENTS
1) break: Breaks the execution of the iteration statement
2) continue: breaks a current iteration and goes to next iteration
3) Labels : we can give name to loops using labels, we can use them to break a particular loop by specifying its name

   Example :
   outer : for(int i=0; i<n; i++)
   {
      inner: for(int j=o; j<m; j++)
      {
         if(j==5)
         {
            break outer;
         }
      }
   }

# ARRAY:
Array is a contigious storage space allocated where we can store elements of similar data type

* Declaration:
  int []      rollNumber                   =    new                               int[3];
  datatype    identifier for the array          allocate memory in heap          size of array

* Why do we need to specify the datatype?
  By specifying the data type we tell the compiler how much memory we need for our elements.
  For example: If we are using "int" datatype and wanting to store 4 elements then we would require 32 bits.
               hence we need to specify the datatype

* We can get  the size of array using : rollNumber.length

* Assigning number:
  - rollNumber[index] = value;

* retrieving number:
  - soutp(rollNumber[index]);

* indexOutOfBoundException: 
  - If we try to access the element at a certain index which is greater than the size of array the compiler will give this exception.

# Multidimensional Arrays:
   Array of arrays is called as multidimensional Array.
   1) 2d Array:
   
   * Declaration:
     int [][] marks = new int[3][3];

   * Assigning values:
     marks[0][0] = 3;  

   * Representation of 2d Array in memory
      int [][] marks = new int [3][3];
      how will it be actually present in the memory:

      It will be something like this
         [][][]
         /  |  \
        []  [] [] 
        []  [] []
        []  [] []

   * Giving the number of rows is compulsary while declaring but columns are optional.
     -> then we can declare it later like this:
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[5];
     -> We can give different lengths like this


# How does random access work internally.

For a 1D Array:
-> The identifier of the 1D array stores the base address of that array. As each next element is stored at contiguous memory location. We can create a formula that is like this:
   base_address + (size_of_datatype * index);

For a 2D Array:
-> In a 2D array arr[0] holds the address of the array that is going to be present at that index so the formula becomes:
  (base_address + (size_of_datatype * index)) + (col_index * size_of_datatype);

For a boolean:
The official JAVA docs specifies, they have specified that the boolean size should be handled by the JDK for the particular platform
-> Usually most of the JVMs  keep it to 1byte 

Caching:
Java performs caching while reading the memory from the RAM so it doens't have to fetch the memory again and again from the RAM.
If it reads 8 bytes of memory, then it can store two integers present at arr[0] and arr[1] if it reads arr[0] since the next location is arr[1],
so it can cache that data, so the next time someone tries to access it, the data can be given directly from the cache.

# FUNCTIONS IN JAVA:
Function is a block  of code that executed whenever that function is called for. It increases the reusability.  
Compiler calls the main function and starts executing block of code line by line.

* Boilerplate
  static return_type function_name(parameters){

      return value_of_same_datatype;

  }
 
  Example: 
  static int Sum(int a, int b)
  {
      int result = a + b;
      return result;
  }

* Arguments:
  Arguments are the actual value that is passed while calling the function.


# Types of Functions in JAVA (Code in functions.java file)
1) No Input No output
2) Input but no Output
3) No Input but gives output
4) Both Inpht and Output

* NOTE: Number of parameters can be anything

# Function Overloading (Code in Overloading.java)
Function Overloading is a thing where two or more functions can have same name but must differ on the following things:
- number of parameters
- data_types of the parameter
- order of parameter (for different datatype parameter);

We cant do overloading based on the return_type.
Why?
=> The answer is, it is optional to store the value returned by function inside any variable, so how would compiler know when you just call the function with same name and not storing the value in any variable. How will compiler know if you are calling the function with int return type, float return type.

# Chaining of Function:
  A function calling another function and that function is calling another function and so on. It is called as chaining of function.

# Scope of variable:
  1) Local Scope:
      Scope of variable is limited to the block they are defined inside.
  2) Global scope:
      The variable are defined outside the main function inside the class. They are accessible till we are working on the same file.


# Problems in functional programming
-  Need a lot of independant variable to represent a similar group of entities like, Student, Vehicles etc.1
-  If we pass the Entitiy to function we need to pass all the variables related to that entity
-  We need to create new set of variables for new students.
-  No authority over data.

# Object Oriented Programming:(Code present in OOP.java)
-  Object-Oriented Programming (OOP) is a programming paradigm that structures software design around objects, which are instances of classes, and         encapsulates data and behavior together.

* Class:
  It is an blue print of the object. It shows how an object would look like.
  Example: 
  class Student{
      String name;
      int age;
      int marks;
  }

* Object:
   Object is an instance of Class. They are type of non-primitive data type, and it is also called as user-defined datatype.
   Example:
   Student s1;
   s1 = new Student();

   We can also define it as:
   Student s1 = new Student();

   - The new keyword tells the compiler to assign the memory in heap for the Student object. It will take enough memory to which can actually store
     every characteristics and methods present in the class for that object.
   - s1 here is a reference variable that will be containing the base address for that object.
   - s1 is stored in stack, and actual object is present in the heap.

* Assigning Values
  s1.age = 30;
  s1.name = "Vedant"

* Behaviour:
  This are the functions that an object can perform. Like Student can study, talk etc. In class if we define functions, we call them methods.


# Naming Convention
  - Variables (primitive/ reference Variables) -> They should be in camel Case.
  - Classes -> Starting with capital letter
  - Functions -> They should be in camelCase
This are not manditory but a good coding practice.



# Instance Variable:
- The variables declared inside a class are called as instance variables.
- Instance variables have some default values:
  Integer --> 0
  floating --> 0.0
  Boolean --> false
  String --> null (nothing)

  *  NOTE: Local variables dont have default values.

# Instance Methods:
- Instance methods are those functions that are defined inside the class.

# Constructors: (Code in OOP2.java)
-  Constructor is a special member function that is called during the creation of any object.

   Example
   Student s1 = new Student(); -> this Student() is calling the constructor.

  * Rules of Constructors
  -  Same name as class.
  -  No return type. Not even void
  -  Automatically called during object creation
  -  Used to initialize an object
  -  Can be overloaded

# Different types of Constructors in JAVA:
1) Default Constructor:
   - JAVA says that constructor is mandatory. 
   - If we dont make any constructor, JAVA adds a constructor while the code gets compiled.

2) User defined Constructor:
   - Users can create there own constructor.
   - When users creates there own constructor, java doesn't add there own constructor.

   * Parameterized Constructor:
   - We can take parameters inside the constructor like any other function.
   Example of parameterized Constructor for a Student class:
   --> Student(string n, int a){ name = n; age = a;}

# Overloading of a constructor:
- Constructor can be overloaded similarly to the functions.

# this keyword in JAVA:
- this keyword refers to the current object. Basically it is a reference to the current object, hence it has access to all the data members and member function.
- If we are calling the constructor using this, it should always be the first line.

# Chaining in Constructor:
- Calling bigger constructor using this constructor, and that constructor itself calls another constructor is called as constructor chaining.
  Example: Constructor chaining for a student class:
  Student() { this("unknown")};
  Student(string name) {this(name, 0)}
  Student(String name, int age) {this(name, age, 0)}
  Student(String name, int age, int rollNumber)
  {
      this.name = name;
      this.age = age;
      this.rollNumber = rollNumber;
  }

  * Can we call constructors manually?
    - No we cannot call constructors manually, it can be only called when creating an object, or it can be called using this inside the class itself.
   
  * What happens when the memory in heap is full and there is no space remaining to allocate for the object being created using the constructor?
    => At that time we get the runtime exception.


# Objects Deep Dive :
 
 * How much memory does reference variable take?
 => It takes either 4byte or 8byte. It varies from JVM to JVM. The JVM which uses compression takes 4 bytes rest takes 8 bytes.

 * How much memory does object takes?
   Let us understand with an example, consider the object of the class
   class Student{
      String name; 4 bytes
      int age; 4 bytes
      int rollNo; 4 bytes
      String college; 4 bytes
   }

   By looking at it we can think that it would take 16 bytes, but it is wrong, because there are more things apart from the exact fields that are present in the class.
  
   * What are some of the other things?
   - Header size
   - Exact fields
   - Padding

   1) Headers: This contains the metadata of the object.
      The metadata can be divided into two subparts:
      a) Mark Words: This contains
         - lock info
         - Synchronization info
         - Garbage collection infor
        This takes around 8 bytes.
      b) Class Pointers:
         this keyword: 4bytes/8 bytes
   
   2) Exact Data: 
      Considering the Student class example, the exact fields are name, age, rollNo, college, this will take around 16 bytes of memory.

   3) Padding:
      Since modern CPUs work by fetching 8bytes of data at once we want are object size to be the multiple of 8. So the size of the Object is rounded off to multiple of 8 bytes using padding.

      Now considering the Student class example:
      - We had header size of 12 bytes
      - Exact field size of 16 bytes
     Adding those two we have total size of 28 bytes so the nearest multiple of 8 to 28 is 32, so we add 4bytes of padding and we get the size of our object as 32 byte.

# IS JAVA LANGUAGE CALL BY VALUE OR CALL BY REFERENCE:
  - It is call by value. There is no call by reference in JAVA.

# Deep Copy vs Shallow Copy in JAVA: (Code present in ShallowDeep.java)
  - Let us understand this by an example.
  Consider a class Student:
   ** Student s1 = new Student(); **
  In the above case the s1 is the object of class Student

  - Now there are two ways that we can get the values of this object to be stored in the another object of "Student" class.

  1) The first way is to do direct assigning:
     Student s2 = s1; // This is called as shallow copy
     Since s1 is a reference variable that is storing the reference of the object. The s2 will also get the reference of the same object.
     So the changes made in s2 will reflect in s1 also as both are pointing to the same object.
     This is called as shallow copy.

  2) The second method is using the constructor.
     Create a constructor inside the "Student" class that can copy the values of passed "Student" object to the current object
     Example:
     class Student {

         Student (Student s)
         {
            this.name = s.name;
            this.age = s.age;
         }
     }

     <!-- Assigning Values -->
     Student s1 = new Student("Siddhant", 20);
     Student s2 = new Student(s1);

     In the above example the s2 and s1 will point to seperate object memory, since s2 is also getting its own memory space because new keyword has been used.
     Now changes made in s2 will not reflect in s1, for the starting part the value of s1 and s2 will remain same.

     * This is called as Deep Copy

# Static and Final Keyword:
  1) Static
     - The static keyword in Java is used to declare class-level members (variables, methods, blocks, or nested classes) that belong to the class itself rather than any specific instance of the class, meaning they are shared among all objects of that class.
     - This can be accessed using Class Name and also the Object Name
       Example:
        - Student.college is also valid and also s1.college is also valid. (here Student is the className, s1 is instance of student class and college is the static variable of Student class).
     - Static variables are also called as class variables.

   * Rules for static:
     - One static method can only call other static method. 
     - Static method can only access static variables.
     - Static method doesn't have "this" reference.

   * static block:
     It is used to assing values to static variables
     Example:
     class Student{
        static String college;
        static{
            college = "SVPCET";
        }
     }

   * NOTE: Even before the creation of the object the static memebers gets memory allocated and assigned.
           Parameters cannot be static
           class cannot be static if it is not an nested class

# Final Keyword:
   - "final" keywords fixes the value for a variable.
   - All the letters for the variable which uses "final" keyword must be Capital, it is a naming convention, more than one word are seperated by underscore.
   - "final" can be applied on
      - Variable
      - Method
      - Class
      - Parameters

# Why main is static in JAVA.
- if it was not static then JVM would have to create an object of class for calling the main method. But JVM cannot create the object hence main method is static in JAVA

# Pillars of OOP:

1) Encapsulation: 
   Encapsulation in Object-Oriented Programming is the mechanism of wrapping data (variables) and the methods (functions) that operate on that data into a single unit (class), while restricting direct access to the data and allowing it only through controlled interfaces.

 * Principles of Encapsulation
   -  Both data and behaviours should be encapsulated within and object.
   -  We should not provide unrestricted access of the data.


 # ACCESS OF MODIFIERS:
 This are the keywords to define who has access to variables, class, method and constructor.

 * There are four access modifiers in JAVA:
   1) Private: 
      - The variable, method, or class which are private cannot be accessed out of the class in which it is defined.
   2) default:
      - Any field declared with default access modifiers can be accessed inside the same package (Groups similar classes and interfaces together) and not outside the package.
      - By default every field is default.
   3) protected:
       - Anyone can access them within the same package or inherited class which are even present in the other package.
   4) public:
       - Can be accessd by anyone.


   This can be added in the front of variable, Method, constructor, class

* NOTE: We can't use private or protected in front of our main class.
   Why?
   Because, our main class is the class, out of which there is nothing, so we can't determine what the private is in rellation to.
   We can't use protected to a class because the protected mmakes the variables, and instance methods available in the child class, but we cant use inheritance on the class itself hence we can't use it.

* Getters and Setters:
  - Getters: used to get the value of instance variables.
  - Setters: used to set the value of instance variables.

  # PACKAGES in JAVA (Code are present in School folder)
  - Packages are just folders, in which we can store differenct classes. The files stored inside the same folder belong to that package.
  
  * Importing classes presnt in packages:
    - To import classes present in packages, we use the import statement the syntax is as follows:
    - import package_name.class_name
  * Importing all classes present in the packages
    - We use the syntax:
    - import package_name.* (This imports all the classes presnt inside that package).

  * There are two types of packages in JAVA:
  - User  defined package
  - In-Built package (java.util, java.lang, java.io)

  * How does it work on JVM level:
    - Internally the JVM adds the bytecode of the classes imported from certain packages and adds it in our code while compiling.

2) Inheritance
  Inheritance is a mechanism in Java by which one class (called the subclass or derived class) acquires the properties (fields) and behaviors (methods) of another class (called the superclass or base class), enabling code reusability and establishing a hierarchical relationship between classes.

  Example:
  class Vehicle{
    void start(){

    }
  }


  class Car extends  Vehicle{
      void setGear(){

      }
  }

  - Now the object of class Car can use the methods of class Vehicle, but if we redefine the "start" method inside the Car class then the method present inside the Car class will be called. We can say that the method "start" inside the Car class has shadowed the method "start" present in the "Vehicle" class.

  * Properties of Inheritance:
   - Code Reusability.
   - Supports polymorphism.

# TYPES OF INHERITANCE:
1) Simple Inheritance. A -> B
2) MultiLevel Inheritance.  A -> B -> C
3) Hierarchical Inheritance.  
         A
        / \
       B   C
4) Multiple Inheritance: (Java doesn't support multiple inheritance using classes)
      A  B
      \ /
       C


 * Why multiple inheritance is not supported in JAVA?
   Let us understand it with an example:
           A  show()
          / \
  show() B   C  show()
          \ /
           D

   Consider the above example where the class A has a method named as show, and class B and class C which are inheriting from class A write there own method "show".
   If calss D which inherits from both B and C tries to call the method "show" the compiler won't be  able to decide which method it should call, from class B or from class C, so this is called as "Diamond problem", hence multiple inheritence is not supported in JAVA for classes.


# SUPER KEYWORD
  - "super" keyword stores the reference of the parent object
 
  * Uses of Super:
     - To access parent class Variable
     - Can call parent class method using Super
     - Call parent class constructor.

   * NOTE: A parent class reference variable can refer to child class object.

3) Abstraction:

   - The process of focusing on what something does while ignoring how it does that.

   * Principle of Abstraction:
     - To represent whaterver necessary.
     - Even what we model, we don't want everyone to know how everything works, but they can still use it.
   
   * Two types of abstraction ways in JAVA:
     - Low level abstraction: (Hiding implementation detail)
        i) Java achieves this through classes.

     - High Level Abstraction: ( Seperate What from how)
        
         class Car{
            start()  {

            }
            accelerate(){

            }
         }

         - The above type of classes are called concrete classes.
         - The reference variable for the object of this class will be tightly coupled to the concrete classes.
         - This introduces a problem that everytime the new feature comes or new type of implementation comes, we need to make another class. For example, if in future a new car comes, that is Electric Car then I would have to make another class called Electric Car where I would have to implement the start() function seperately as it would be different for the electric car. 
         - Our what was same but how was different. This made the object strongly coupled to the Electric Car class, or Fuel Car class.

         * We can remove this tight coupling using inheitance.
           - We can define similar methods in the parent class. For example walk, it is same in all Animals, so we can define it in parent class Animal. The method makeSound will be different for each animals so that can be defined in individual animal classes.
           - Now using the Animal class object, we can point to any derived class object. Hence there is no tight coupling the compiler decides at runtime which object to point to.
           - Using this we seperated what we can do, and how we do it.


        It is implemented using two things:
        a) Abstract Class:
            - An abstract class is a class declared with the keyword abstract that cannot be instantiated and is designed to be extended by other classes. It may contain abstract methods (methods without implementation) as well as concrete methods (methods with implementation), and serves as a base class to provide a common definition and enforce a contract for its subclasses.

            - If there are any abstract methods within a class then that class should also be made abstract.
              Why?
              => Because the abstract methods doesn't provide any implementation, so if someone tries to call the abstract method using that class object, it will give error. Hence we must make a class abstract if it has any abstract methods.
            - Second thing is all the subclasses of abstract class must define the abstract methods, or they should become the abstract class themselves for the similar reason as above.

            * @Override:
              This keyword is specifically for telling that we have made our own method and haven't used the parent class method. It is not compulsory but a good coding practice.

      * Some important knowlege points for Abstraction:
        - Cannot be instantiated directly.
        - Can contain abstract method (method without implementation)
        - Can also contain normal methods
        - Is meant to be extended

      * Questions:
      1) Can abstract class have constructors?
        => Yes constructors are allowed. Because child class constructor can call the constructor of the parent class.
      2) Can abstract classes be made final?
        => No final keyword is not allowed because it will block the class from being inherited and we don't want that.
      3) Can abstract class have static method?
        => Yes they can have static method, variable and block.
      4) Can abstract classes have private method?
        => private methods are allowed, but they should not be abstract.
      5) Can abstract classes have final method?
        => Yes, just that they cannot be overrided in the child class and they cannot be abstract.
      6) Can abstract classes have no abstract method?
        => Yes, because we might want a situation where we dont want the class to have any object but want to provide a default implementation for every method present in that class. 
           Those method can be overrided in the child class if wanted otherwise the base class method will be called.
       
   
   # Interface
     - An interface is a reference type in Java that defines a set of abstract methods (and constants) which a class must implement. It provides a way to achieve full abstraction and multiple inheritance, allowing different classes to follow a common contract without specifying implementation details.
     - We need to use "implements" keyword for performing inheritance using inerface.
     - Interface supports multiple inheritance.

     * Why do we need interface?
       - When java implemented interface, there thought process was that interface should tell pure what. It should not tell how.
       - Before JAVA 8 interfaces used to provide full abstraction.
       
     * What are intentions of interface?
       - First it is a contract between the interface and its child classes. The child classes are bound to implement the methods present in the interfaces.
       - It tells the responsibilites of the class. Example: interface flyable { void startFlying() {}}, Any class becoming the subclass of this interface must have to implement the startFlying method. That's why interfaces tell the responsibility to the child class, that if you want to be my child class you have to implement this methods.

      * Abstract class and Interface
        - Abstract class shows the family of similar objects whereas interface defines a contract.

      * Marker Interafces:
         - Empty interfaces that act as marker for something.

    # ABSTRACTION VS ENCAPSULATION
      - Encapsulation talks about data security, by providing access modifiers
      - Abstraction talks abot data/implementation hiding, it just wants to reduce complexity by hiding the complex implementation and still making it usable


# POLYMORPHISM:
  - Poly means many, morph means forms.
  - Same object behaves differently on same command if one of the param is changed.

  Example:
  * Compile Time Polymorphism:
  - We do function overloading by changing the function signature. This is called compile time polymorphism, because the function to be called is decided in compile time only.

  * Runtime Polymorphism:
    - We achieve this using method overriding. When we create an abstract class, and inherit from it, we can implement different kinds of method in every subclass. 
    - Consider an example of class "Animal" this class is abstract class with a mehod "makeSound" in it, this is inherited by a Dog class, a Duck class, a Cat class.
    - Now those classes will override the makeSound method. When we will be creating an object like the example given below:
      Animal A = new Duck();
      A.makeSound();
      So at the runtime we will be deciding which makeSound() method we have to call for, whether od Dog, Duck or Cat. Hence it is called the runtime polymorphism.


  * FEW KEYWORDS
   - Static:
     - The static methods doesn't get overrided. Because static method are class methods they belong to class. So what object we are refering to doesn't matter.
   - Private:
     - Private methods they can't be overridden.
   - final:
     - final methods also cannot be overridden.
     - If we add final keyword in front of the class, then no subclass of that class can be created.

  * NOTE: Fields and variable cannot be overridden. They are not polymorphic, they depend on the reference variable.
      class A {
         int x = 20;
      }

      class B extends B {
         int x = 30;
      }

      A a = new B();
      soutp(a.x);

      // This will print 20, because the reference variable is of type class A.

      B b = new B();
      soutp(b.x);

      // This will print 30 now.

# IN DEPTH KNOWLEDGE OF CLASSES:

1) Why one public class per file?
   => Every code is executed using JVM and it calls the main function. That's why we make our main function as static and our class as public so that JVM doen't have to create any object of that file and can execute the main method. Also the main method should be public, so that it can be accessible outside the package.

   - If JAVA allowed more than one public class, JVM would not know in which class the main method exists. So to make it simple for JVM Java allowed only one public class per file.

2) Now why does the class name should be same as the file name?
   => Because it becomes easy for JVM to find the class which will be having the main method directly as the file name and the class name is same.


3) What are wrapper classes?
   - Wrapper classes are those classes that are based on primitive datatypes with more functionality.
     For example:
     int  -> Integer (Wrapper class for int)
     float -> Float ( Wrapper class for float)

4) Why does wrapper classes exist?
   - Java has something called as collection frameword which works only on objects.
   - JAVA is OOP based language so JAVA wants a substitutable way od using primitive datatypes in the form of object

5) Then why does primitive datatypes exists till now?
   - Because of Legacy. To maintain legacy of previous language like C/C++.
   - This are fast.

# Autoboxing and Unboxing

1) Autoboxing:
   - Automatic conversion of primitive datatype to wrapper class is called as Autoboxing.
     Example:
      int x = 10;
      Integer y = x; // x value gets stored in y.value

   - How does it happen internally:
      Older versions : Integer y = new Integer(x);
      Newer versions : Integer y = Integer.valueof(x);  // This uses caching to make it better and more optimized

2) Unboxing:
   -  Automatic conversion of Wrapper class object into premitive datatype is called Unboxing.
      Example:
      Integer x = 10;
      int y = x;

   - Internally:
     int y = x.intValue();

* Autoboxing and Unboxing work automatically on the following things:
  - Assignment
  - Method Calls
  - Arithmetic Operations

* Null pointer exception that  can happen while using autoboxing and unboxing.
      Integer x = null;
      int y = x;
      soutp(y);

   If we do something like this this will throw the null pointer exception, because a primitive datatype like int cannot have a null value.
   Internally the JVM is calling the method Integer.valueof(x) while assigning the value of object X to y. So that is not possible, hence the null pointer exception.

* Comparing two wrapper classes objects:
  Example:
   Integer x = 100;
   Integet y = 100;

   Now if we do something like this
   soutp(x == y) // this will return false

   Why?
   => Since both x and y are different references variable pointing to different object address, and "==" compares the reference variables for the objects.
      Since bothe the both the reference variables are storing different addresses we get false.

   - If we want the values to be compared we have two ways:
     1) Use x.intValue() so that we can get the value and then we can compare.
     2) Or use x.equals(y) this compares the value present in the x and y

* How does Integer class looks like? Conceptual overview
  public final calss Integer {
      private int value;

      public Integer(int value){
         this.value = value;
      }

      public int intValue(){
         return value;
      }

      public static Integer valueOf(int x){

      }

      public boolean equals(Integer x){
         return (value == x.intValue())
      }
  }

 * If we try to compare two objects of "Integer" class storing the value in range of -128 to 127 it will give true.
   - This is because, internally Integer.valueOf() method has cached values for this range, it has already created the object for this range so it directly returns the address of that object. Hence any object created within this range using Integer share same memory location hence giving the true output.

# POJO Classes (Plain Old Java Object):
  - Simple class that doesn't use any external frameworks.
  - It has simple variables and methods, getters, setters and basic business logic.

  * Why POJO Classes exist?
    - Consider an example where we want to represent a "Student" class, with fields like name, age, rollNo, college. We can represent it using a simple POJO class.

   * Types of POJO classes:
     1) Anemic model: It consists of only getter/setter, constructor, fields.
     2) Rich Domain Model: Business logic added a little bit.

# Nested Classes in JAVA:
-  A class declared inside other class is called as Nested class.

 * Why do we need nested class?
   - Logical Grouping:
      - In Java, logical grouping (in the context of nested classes) means placing a class inside another class when they are closely related and only make sense together.
      - Book is logically part of Library
      - It doesn’t make sense to use Book while creating a library management system.
   - Better access to Outer Class:
      - Inner class has access to private methods and variables.
 
 * This are divided into 4 parts:
   1) Static Nested
   2) Inner Class
   3) Local Class
   4) Anonymous class

   - Static Nested Class:
     - Inner class will be defined using static keyword.
     - The object of this class can be directly created using the name of the Outer class.
       For example:
       class A{
         static class B{

         }
       }
       - Consider the above example where B is the nested static class. The object of class B can be created like below:
         A.B inner = new A.B();

      * Properties of Static Nested Classes:
        - It can't access the non-static method or variable present inside the outer class.
        - It can inherit some class, or implement an interface.
        - Static nested class can have static members and functions.
        - It can also use access modifiers.

      * Use cases of Static Nested Class:
        - As helper class for any outer class.
        - Builder design pattern.
        - If you want to have static methods inside a nested class.
        - Request/Response DTO.
   
   - Inner Class:
     - A simple nested class within a class is called as Inner class.
     - Example:
        class Outer {
            class Inner{

            }
        }

    


# Standard Input Output in JAVA

* Types of Input Output:
   - Console based Input Output.
   - File Input Output.
   - Network Input Output.
   - Memory Input Output.


* Console Input Output:
   - System.out.println(): In this we can see that:
      - System is a class which has a static variable "out", that static variable is reference varible for some class, which has the method println.
      - The out is the reference variable for class PrintStream.

   * How did we get the access of the System class without importing it?
      - The System class belongs to "java.lang" package, and it is imported by default by the compiler.

# Streams:
   - Flow of data is called as stream.
   - In JAVA all of them are stream of bytes.

   * Two type of Stream:
    1) Input Stream: Data flow into program.
    2) Output Stram: Data flow outside the program

    This are both abstract classes. Since they provide only with the methods that should be implemented by their child class for different purpose. The methods are read and write.

    * Heirarchy of InputStream (Abstract):
      - FileInputStream
      - ByteArrayInputStream
      - BufferedInputStream
      - DataInputStream
    
    * Heirarchy of OutputStream (Abstract):
      - FileOutputStream
      - ByteArrayOutputStream
      - BufferOutputStream
      - PrintStream
   


* How to take input from user?
   - There is a "in" named variable present in the System class which is of type InputStream.
   * Older method:
      - int data = System.in.read() // Returns int value
         soutp((char) data); // Converting to char

   * Problem in above method is:
     - The read method only reads 1 byte at time, so if I enter my name "Siddhant", it will read only S, and rest of the letters will go in a input buffer (It is a kind of array for letters input using keyboard).
     - So what we can do is use while loop till we find the nextline character, and keep reading till then.
     - Example:

     String s = "";
     int c;
     while(c != '\n'){
         c = system.in.read();
         s += (char) c;
     }

   * Updated Method (Reader class)

    - Heirarchy of Reader class:
       - BufferReader
       - InputStreaReader
       - FileReader

    - This reads stream of characters.

   * BufferReader
    - BufferReader does something interesting, it reads a chunk of data at once from the OS and keeps it in its program buffer, so that it doesn't have to go again and again to the OS for the data. It doesn't read byte by byte improving speed and efficiency.
    - FLOW : Keyboard -> OS Buffer -> Java Buffer -> Program

   
   * InputStreamReader:
     - The input from the keyboard can be accessed by the class InputStream which reads 1 byte of data at a time. 
     - Our BufferedReader reads stream of character.
     - So the BufferedReader(stream of char)  and InputStreamI(stream of bytes) are not compatible with each other.
     - Here comes the role of InputStreamReader, this class converts the stream of bytes into stream of characters. So that BufferReader can access the stream of character from OS and place it in the program buffer.

     - Byte Stream -> Character Stream

   * How do we combine this now
     InputStreamReader isr = new InputStreamReader(System.in)  // this will convert byte stream to character stream
     BufferedReader br = new BufferedReader(isr); // Reads the chuck of stream
     br.readLine();

   * Entire flow:
   1. Reading from console. Let's say we read "Aditya".
   2. OS Buffer will store: [65, 100, 105, 116, 121, 97]
   3. System.in (InputStream object) recieves bytes.
   4. InputStreamReader -> converts stream of bytes into stream of characters
   5. BufferedReader -> This will read entire stream of characters inside the program buffer using readLine and make an entire string out of it,  store it in the variable.
   6. Then whenever we will print  that variable we will get string as output.

   * Limitations of BufferedReader:
     - It can only read String. If we want to read integer we will have to convert it into int by Integer.parseInt() method.
     - Complex code.

# To address this issues JAVA introduced Scanner class:
   - Simplified (Input)
   - provide various method for reading different datatype values.
   
   * NOTE: this class is not present within the JAVA.io class. This comes under package called java.util.

   - It works on the basis of tokenization, it breaks string based on whitespaces.

   * Methods of Scanner:
     - sn.next() -> reads only word
     - sc.nextLine() -> reads entire sentence till nextline character is encountered
     - sc.nextInt() -> Reading integer value
     Similarly we have all the other methods
   
   * NOTE: Scanner class is slow compared to BufferedReader. Because Scanner class does multiple things.

# Immutable Class in JAVA:
- Immutable classes are those classes, where the methods and variables present in the object of this class cannot be changed once defined.
- Immutable objects are those objects whose methods and instance variables cannot be changed once they are defined, and the class which this object belongs to is called as immutable class.

* Rules of Immutable Object:
  - Mark my class as final.
  - Mark my instance variable as private and final.
  - No setters.
  - Defensive copy in costructors and getters.

* Deep Copy:
  - It means that never return a direct reference of any object, return a new object storing the same values as the object to be returned.

* Example of how we will make immutable class:
  class Student {
      private final College college;

      Student(College college){
         this.college = new College(college.name, college.address);
      }

      College getCollege(){
         return new College(this.college.name, this.college.address);
      }
  }

  class College {
      string name;
      string address;

      College(String name, String address){
         this.name = name;
         this.address = address;
      }
  }

  Here the class student is a complete immutable class, because every primitive and non-primitive members in this class can never be changed by the user.

# Object Class in JAVA:
- It is present inside java.lang package.
- Every class in JAVA inherits from Object class directly or indirectly.

* Why did we needed this class?
  - To add common behaviours to all the classes that are pre-built or build by user.
  - We can store any class object in the reference variable of this Object class.
    Example:
      Object obj = new Student();
    Even if the Student class is a seperate class still directly or indirectly it inherits from the Object class. Hence we can store the Object of "Student" class in "Object" class reference.

* What are the common behaviours present in this?
  - Core Methods
    - toString()
    - equals()
    - hashCode()
    - getClass()
  - Cloning:
    -  clone()
  - Garbage Collection
    - finalize()
  - Thread
    - wait()
    - notify()
    - notifyAll()

 * toString() method:
    - Convert anything to String.
    - Signature:
       public String toString() {

       }

       This returns String representation of any object
    - Default Implementation
    - It returns output like this => class_name@hexa_value
    - The returned hexa value is unique.
    - When we try to print an object like "soutp(object_name)" then internally the "println" function calls the "toString()" method on that provided object.

 * equals() method:
   - Compares two object and returns true or false
   - Signature:
     public boolean equals(Object obj){

     }
   - This compares two  references

* hashCode() method:
   - Return an integer of an Object in hexadecimal format.
   - Used in collection frameworks.

   * Rule:
     - If two objecs are equal then their hashCode must be equal.
     - Reverse might not be true.

* getClass()  method:
   - Return runtime class of an Object.
   - Student s1 = new Student();
   - s1.getClass() -> this will return Class type object.
   - s1.getClass().getName() -> Now this will return the Student

   * This is a final method in Object so it cannot be overrided

   - Signature:
     class Object {
         public final Class <?>  getClass(){
            //default method
         }
     }
 
* instanceOf operator:
  - Checkks if an object is instance od a class or any of its subclass

* clone() method:
  - Creates copy of any object.
  - Our class must implement clonable interface to use this method

  - Signature
    - class Object{
       protected Object clone() throws classNotSupportedException{

       }
    }

   - this gives the shallow copy.
  
  * Why do we need to implement Cloneable interface for using clone.
     - We dont want someone to clone database, or Threads, hence JAVA makes it mandatory to implement the Cloneable Class.


  * finalize() method:
   - this was use earlier by Garbage Collection, now this has been depricated.
   - This was too unpredictable, unsaffe and unreliable.