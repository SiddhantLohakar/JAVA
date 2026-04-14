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