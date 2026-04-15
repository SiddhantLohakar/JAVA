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

How to declare variables in java?
-> data_type variableName = data (optional);

Java is Staticaly Typed (we need to specify what type of data is going to be stored beforehand)

# DATATYPES IN JAVA
There are two types of data types in Java:
1. Primitive
2. Non-Primitive

1. Primitive:
   a) Integer -> byte, short, int, long
   b) Real Number -> float, double
   c) Character -> char
   d) Boolean ->  boolean

