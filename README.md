# JAVA
1. Why did JAVA came?
=>  Portability problem in C and C++:
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