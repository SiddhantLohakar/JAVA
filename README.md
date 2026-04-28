```md
# JAVA

## 1. Why did Java come into existence?

### 1. Portability problem in C and C++
- In C and C++, code is compiled into machine code.
- Machine code is platform dependent.
- To run the same program on another platform, recompilation is required.

Example:
- Platform P1 → Compile → Machine Code M1
- Platform P2 → M1 cannot run → Recompile required

Hence, C and C++ are platform dependent.

---

### a) What is a platform?
- A platform is a combination of:
  - Processor + Operating System
- Example: Intel x86 + Windows

---

### b) Why do different platforms generate different binary code?
1. Different operating systems have different system-level functions.
2. Different processors have different hardware architectures.

---

### c) ISA (Instruction Set Architecture)
- ISA defines how a processor performs operations like add, jump, etc.
- Different processors have different ISAs.
- Therefore, binary code differs across platforms.

---

### Other reasons for Java:
2. Simplicity  
3. Security  

---

### Summary:
Java is:
1. Portable  
2. Simple  
3. Secure  

---

## 2. Concept of Bytecode

- Bytecode solves the portability problem of C and C++.

### Bytecode:
- Intermediate code between high-level code and machine code.
- Generated when Java code is compiled.
- Stored in `.class` files.
- Same across all platforms.

---

## 3. JVM (Java Virtual Machine)

- Converts bytecode into machine code.
- Makes Java platform independent.
- JVM is platform dependent.

### Advantages:
- No need to recompile for different platforms.
- Bytecode runs anywhere JVM is available.

---

## 4. Issues in C and C++
- Use of pointers
- Multiple inheritance (complexity)
- Manual memory management

---

## 5. How is Java secure?
- JVM runs code in a controlled environment.
- This is called the sandbox model.

---

# JVM IN DEPTH

```

---

| JDK             |             |     |   |   |
| --------------- | ----------- | --- | - | - |
|                 | JRE         |     |   |   |
|                 | ----------- |     |   |   |
|                 |             | JVM |   |   |
|                 | ----------- |     |   |   |
| --------------- |             |     |   |   |

---

```

- JVM: Java Virtual Machine  
- JRE: Java Runtime Environment  
- JDK: Java Development Kit  

---

## 6. How does JVM run bytecode?

There are two approaches:

### a) Compiler
- Converts entire code at once into another form.

### b) Interpreter
- Converts and executes code line by line.

---

### Early Java:
- Used Interpreter
- Reasons:
  - Slow hardware
  - Less RAM
  - Slow disk

---

### Modern Java:
- Uses Interpreter + JIT (Just-In-Time Compiler)

### Optimization:
- Frequently used bytecode is compiled into machine code by JIT.
- Interpreter continues line-by-line execution.
- Improves performance significantly.

---

## 7. JVM Functionalities
- Converts bytecode to machine code
- Provides security (sandbox)
- Performs garbage collection

---

# JRE (Java Runtime Environment)

- JRE = JVM + Class Libraries

### Class Libraries:
- Predefined classes provided by Java

---

# JDK (Java Development Kit)

- JDK contains everything required to develop and run Java programs.

### Includes:
- Compiler (converts source code to bytecode)
- Debugger
- JavaDocs
- JRE (which includes JVM)
```




***************************************** Some Important Terms Asked in Interviews *******************************************

JSE -> Java Standard Edition (Core Java)
JEE -> Java Enterprise Edition (Used for building web applications, now called Jakarta EE)
JME -> Java Micro Edition (Lightweight version, used for mobile/embedded systems)

---

# VARIABLES

- Variables are named storage locations in memory that hold values.
- They are also called identifiers.
- The value stored inside a variable is called a literal.

## Declaration:
data_type variableName = value;  // value is optional

Example:
int a = 10;

- Java is statically typed → data type must be defined at compile time.

---

# DATA TYPES IN JAVA

There are two types:
1. Primitive
2. Non-Primitive

---

## 1. Primitive Data Types

### a) Integer Types
- byte  → 8 bits   → range: -128 to 127
- short → 16 bits
- int   → 32 bits
- long  → 64 bits

Note:
- All numeric types in Java are signed.

---

### b) Real Numbers (Floating Point)

- float  → 32 bits  
  Range: approx 1.4E-45 to 3.4E+38  
  Must use suffix 'f'  
  Example: float f = 3.14f;

- double → 64 bits  
  Range: approx 4.9E-324 to 1.8E+308  

Notes:
- float → single precision  
- double → double precision  
- Prefer double in production because:
  - Higher precision
  - Modern hardware optimized for double
  - Most math functions return double

---

### c) Character

- char → 16 bits
- Stores Unicode characters

Example:
char c = 'a';

Notes:
- Stored using single quotes
- Internally stored as numeric Unicode value
- Example: 'a' → 97 (Unicode)

---

### d) Boolean

- boolean → true or false

Notes:
- Cannot use 0 or 1 like C/C++
- Only allowed values: true, false

---

## Floating Point Precision Issue

Example:
float f = 0.7f;
System.out.printf("%.20f", f);

Output:
0.69999998807907100000 (approx)

Reason:
- Floating point numbers are stored in binary
- Some decimal values cannot be represented exactly

---

# NUMBER SYSTEMS IN JAVA

### 1) Binary
- Prefix: 0b  
Example:
int a = 0b101;   // 5

---

### 2) Octal
- Prefix: 0  
Example:
int a = 023;     // 19

---

### 3) Hexadecimal
- Prefix: 0x  
Example:
int a = 0xA;     // 10

# How negative numbers and decimal numbers are stored internally in JAVA?

## 1) Negative Numbers

- In Java, negative numbers are stored using **2's complement representation**.

### Example:
byte a = -2;

Step:
1. Convert +2 to binary:
   00000010

2. Take 1's complement:
   11111101

3. Add 1 (2's complement):
   11111110

So, -2 is stored as:
11111110

---

### How does Java identify positive or negative?
- It checks the **Most Significant Bit (MSB)**:
  - MSB = 0 → Positive number
  - MSB = 1 → Negative number

---

### a) Why is byte range -128 to 127?

- A byte = 8 bits

#### Positive range:
- MSB = 0
- Max value:
  01111111 → 127

#### Negative range:
- MSB = 1
- Smallest value:
  10000000 → -128 (in 2's complement)

---

### b) Why 2's complement instead of 1's complement?

- 1's complement creates two representations of zero:
  - +0 → 00000000
  - -0 → 11111111  (problem)

- 2's complement solves this:
  - Only one representation of zero → 00000000

---

## 2) Floating Point Numbers (IEEE 754)

### Example:
float f = 8.125;

A float uses **32 bits**, divided into:
1. Sign bit → 1 bit  
2. Exponent → 8 bits  
3. Mantissa (fraction) → 23 bits  

---

### Step-by-step storage:

#### Step 1: Convert to binary
8 → 1000  
0.125 → 0.001  

Combined:
1000.001

---

#### Step 2: Normalize (scientific form)
1.000001 × 2^3

---

#### Step 3: Add bias
- Bias (float) = 127
- Exponent = 127 + 3 = 130
- Binary: 10000010

---

#### Step 4: Store in memory

- Sign bit:
  0 (positive)

- Exponent:
  10000010

- Mantissa:
  00000100000000000000000

Final representation:
0 | 10000010 | 00000100000000000000000

---

## 3) Retrieval Formula

Value is calculated as:

(-1)^sign × (1 + mantissa) × 2^(exponent - bias)

Example:
(-1)^0 × (1 + 2^-6) × 2^(130 - 127)  
= 1 × 1.015625 × 8  
= 8.125

---

## 4) Precision Issue Example (0.7)

- Binary representation:
  0.1011001100110011... (repeating)

- Normalized:
  1.011001100110... × 2^-1

- Exponent:
  127 + (-1) = 126  
  Binary: 01111110

- Stored (truncated):
  0 | 01111110 | 01100110011001100110011

- Since it is truncated, exact value is not stored → leads to precision errors.

---

## 5) What is Bias?

- Bias is added to exponent to avoid storing negative exponents.

### Formula:
Bias = 2^(number of exponent bits - 1) - 1

- For float:
  = 2^(8 - 1) - 1  
  = 127

---

## 6) Double Precision (64-bit)

- Total bits: 64

Breakdown:
- Sign bit → 1 bit  
- Exponent → 11 bits  
- Mantissa → 52 bits  

- Bias for double:
  = 2^(11 - 1) - 1  
  = 1023

# TYPE CONVERSION IN JAVA

There are two types of type conversion in Java:

## 1. Implicit Conversion (Widening)
- Conversion done automatically by Java
- Happens when destination type is larger than source type

Example:
byte b = 24;
int i;
i = b;

### Rule:
- Destination data type must be wider than source data type

---

## 2. Explicit Conversion (Casting / Narrowing)
- Done manually using casting

Example:
int i = 300;
byte b = (byte) i;

### Explanation:
- int = 300 → binary is truncated to 8 bits (byte size)
- Result stored in byte = 44

---

## 3. Truncating Conversion

- When converting floating point to integer, decimal part is removed

Example:
float f = 16.25f;
int a = (int) f;   // a = 16

- Applies to:
  - float → int
  - double → int

---

## 4. Boolean Conversion

- Boolean cannot be converted to any other data type in Java

---

## 5. Automatic Type Promotion

- Java automatically promotes smaller types during expressions

Example:
byte b = 50;
b = b * 2;   // ERROR

### Reason:
- b * 2 → result becomes int

### Fix:
b = (byte)(b * 2);

---

### Type Promotion Rules:
1. byte, short, char → promoted to int
2. If one operand is long → result is long
3. If one operand is float → result is float
4. If one operand is double → result is double

---

# EXPRESSION

- An expression is a combination of:
  - literals
  - variables
  - operators
  - function calls
- It produces a single value

---

# OPERATORS IN JAVA

## 1. Arithmetic Operators
+, -, *, /, %, ++, --

## 2. Relational Operators
==, !=, <, >, <=, >=

---

## 3. Bitwise Operators

- Work at bit level

Operators:
&, |, ^, ~, >>, <<, >>>, &=, |=, ^=, >>=, <<=, >>>=

### Truth Table:

A B | A&B | A|B | A^B | ~A
0 0 |  0  |  0  |  0  |  1
0 1 |  0  |  1  |  1  |  1
1 0 |  0  |  1  |  1  |  0
1 1 |  1  |  1  |  0  |  0

---

### Operator Meaning:

- & (AND) → 1 only if both bits are 1  
- | (OR) → 1 if any one bit is 1  
- ^ (XOR) → 1 if bits are different  
- ~ (NOT) → inverts bits  

---

# BITWISE SHIFT OPERATORS

## 1. Type Promotion
- byte and short are promoted to int (32-bit) before shifting

---

## 2. Left Shift (<<) on byte/short

Process:
1. Value promoted to int
2. Shift applied
3. Result truncated back to original type

### Important:
- Truncation may change sign
- MSB determines sign after truncation

---

## 3. Left Shift (<<) on int

- Operates on full 32 bits

### Rule:
shift = shift % 32

Example:
x << 35 → same as x << 3

---

## 4. Why byte and short support shifts?

- They are promoted to int internally
- Hence shift operations work

---

## 5. Negative Numbers and Sign Bit

- MSB (Most Significant Bit):
  - 0 → positive
  - 1 → negative

### Behavior:

- << (Left Shift)
  - Shifts left, fills 0
  - May change sign

- >> (Right Shift)
  - Preserves sign (sign extension)

- >>> (Unsigned Right Shift)
  - Fills 0 regardless of sign

---

## 6. Key Takeaways

- All shift operations are performed on 32-bit integers
- byte/short results are truncated
- Sign can change after truncation
- Shift count for int is modulo 32

---

# SHORT CIRCUIT

- Short circuit occurs in logical operators (&&, ||)

### Example:
(a > b && a > c)

- If first condition is false → second is NOT evaluated

---

## Prevent Short Circuit

- Use bitwise operators:
  - & instead of &&
  - | instead of ||

- These always evaluate both conditions

# FLOW OF CONTROL IN JAVA

## What is Flow of Control?
- Flow of control defines how the program executes statements step by step.
- In Java, execution is normally sequential (line by line).
- Certain statements and keywords can alter this flow.

---

# TYPES OF FLOW OF CONTROL

1. Selection  
2. Iteration  
3. Jump Statements  

---

# 1. SELECTION STATEMENTS

Used to make decisions in a program.

---

## a) if Statement

- Executes block only if condition is true

Example:
int a = 20;

if (a > 18) {
    System.out.println("Age above 18");
} else {
    // some code
}

---

## b) if-else-if Ladder

- Used for multiple conditions

Example:
if (a == 1) {
    // code
} else if (a == 2) {
    // code
} else {
    // code
}

---

## c) switch Statement

### Before JDK 7:
- Supported:
  - byte, short, int, char, enum
- Case values must be unique

### After JDK 7:
- Supports String

### After JDK 14:
- Enhanced switch (more flexible and powerful)

---

### Key Points:
- switch checks only equality
- if-else can check all types of conditions (>, <, ==, etc.)

---

### Why is switch faster?

Example:
int i = 2;

switch (i) {
    case 1:
        break;
    case 2:
        break;
    case 3:
        break;
    default:
        break;
}

- JVM directly jumps to matching case
- Does not check cases one by one

---

### How does JVM optimize switch?

- Uses Jump Tables internally

#### Jump Table:
- Provides direct access to cases
- Improves performance

---

### Types of Switch Implementation:

1. Table-Switch
   - Used when values are dense (close together)
   - Direct indexing
   - Faster

2. Lookup-Switch
   - Used when values are sparse
   - Uses binary search
   - Time complexity: O(log N)

---

- Nested switch statements are allowed

---

# 2. ITERATION STATEMENTS (LOOPS)

- Used to repeat a block of code multiple times

---

## Types of Loops:

1. while loop  
2. do-while loop  
3. for loop  

---

## a) while Loop

- Executes while condition is true

Example:
while (i > 10) {
    // code
}

---

## b) do-while Loop

- Executes at least once
- Condition checked after execution

Example:
do {
    // code
} while (condition);

---

## c) for Loop

Execution flow:
1. Initialization
2. Condition check
3. Loop body execution
4. Update statement
5. Repeat until condition becomes false

Example:
for (int i = 0; i < 5; i++) {
    // code
}

---


# JUMP STATEMENTS

## 1) break
- Terminates the loop or switch statement immediately
- Control moves to the statement after the loop/switch

---

## 2) continue
- Skips the current iteration
- Moves control to the next iteration of the loop

---

## 3) Labels

- Labels are used to name loops
- Useful in nested loops to break or continue a specific loop

### Example:
outer: for (int i = 0; i < n; i++) {
    inner: for (int j = 0; j < m; j++) {
        if (j == 5) {
            break outer;
        }
    }
}

---

# ARRAY

## Definition
- An array is a contiguous block of memory used to store elements of the same data type

---

## Declaration

int[] rollNumber = new int[3];

### Breakdown:
- int[] → data type of array
- rollNumber → array name
- new int[3] → allocates memory in heap for 3 elements

---

## Why specify data type?

- Helps compiler determine memory allocation

Example:
- int = 4 bytes (32 bits)
- For 4 elements → 4 × 4 = 16 bytes required

---

## Size of Array

- Can be accessed using:
rollNumber.length

---

## Assigning Values

rollNumber[index] = value;

---

## Accessing Values

System.out.println(rollNumber[index]);

---

## IndexOutOfBoundsException

- Occurs when accessing an index outside array size

Example:
int[] arr = new int[3];
arr[3];   // Invalid (valid indices: 0 to 2)

---

## Key Points

- Arrays are stored in heap memory
- Elements are stored in contiguous locations
- Indexing starts from 0
- Fixed size once created

# MULTIDIMENSIONAL ARRAYS IN JAVA

## Definition
- Multidimensional arrays are arrays of arrays.
- Used to represent data in tabular form (rows and columns).

---

## 1. Declaration

int[][] arr;

---

## 2. Memory Allocation

int[][] arr = new int[3][4];

### Meaning:
- 3 → number of rows
- 4 → number of columns

---

## 3. Initialization

int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

---

## 4. Accessing Elements

arr[row][column]

Example:
arr[1][2];  // Accesses element at 2nd row, 3rd column

---

## 5. Traversing 2D Array

### Using nested loops:

for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}

---

## 6. Jagged Arrays (Irregular Arrays)

- Rows can have different column sizes

Example:
int[][] arr = new int[3][];

arr[0] = new int[2];
arr[1] = new int[4];
arr[2] = new int[3];

---

## 7. Key Points

- Stored in heap memory
- Each row is a separate array
- Can have different sizes (jagged arrays)
- Indexing starts from 0

---

## 8. 3D Arrays (Optional Extension)

int[][][] arr = new int[2][3][4];

- 2 → number of 2D arrays
- 3 → rows
- 4 → columns

---
# HOW DOES RANDOM ACCESS WORK INTERNALLY?

## Definition
- Random access means accessing any element directly using its index without traversing previous elements.

Example:
arr[3] → directly accesses the 4th element

---

## How it works internally

- Arrays are stored in **contiguous memory locations**
- Each element occupies fixed size (depends on data type)

---

## Address Calculation Formula

Address of element at index i:

address = base_address + (i × size_of_each_element)

---

## Example

int[] arr = new int[5];

Assume:
- Base address = 1000
- Size of int = 4 bytes

Then:

arr[0] → 1000 + (0 × 4) = 1000  
arr[1] → 1000 + (1 × 4) = 1004  
arr[2] → 1000 + (2 × 4) = 1008  
arr[3] → 1000 + (3 × 4) = 1012  

---

## Key Idea

- No looping required
- Direct calculation → direct access

---

## Time Complexity

- O(1) (Constant time)

---

## Why is it fast?

- Because:
  - Memory is contiguous
  - Element size is fixed
  - Address is computed using a formula

---

## Important Notes

- Works only for:
  - Arrays
  - ArrayList (internally uses array)

- Does NOT work for:
  - Linked List (requires traversal)

---

# FUNCTIONS IN JAVA

## Definition
- A function (method) is a block of code that executes when called.
- It improves code reusability.
- Execution of a Java program starts from the main method.

---

## Boilerplate Syntax

static return_type function_name(parameters) {
    return value;
}

---

## Example

static int sum(int a, int b) {
    int result = a + b;
    return result;
}

---

## Arguments
- Arguments are the actual values passed during function call.

Example:
sum(5, 10);  // 5 and 10 are arguments

---

# TYPES OF FUNCTIONS IN JAVA

1. No Input, No Output  
2. Input, No Output  
3. No Input, Returns Output  
4. Input and Returns Output  

Note:
- Number of parameters can be any.

---

# FUNCTION OVERLOADING

## Definition
- Function overloading allows multiple functions with the same name but different parameters.

## Must differ in:
- Number of parameters
- Data type of parameters
- Order of parameters (if types are different)

---

## Not allowed:
- Cannot overload based only on return type

### Reason:
- Function call may not store return value
- Compiler cannot determine which method to call

---

# FUNCTION CHAINING

- When one function calls another function, which calls another, and so on.

---

# SCOPE OF VARIABLES

## 1. Local Scope
- Variables declared inside a block or function
- Accessible only within that block

---

## 2. Global Scope (Class Level)
- Variables declared inside class but outside methods
- Accessible throughout the class

---

# LIMITATIONS OF FUNCTION-BASED PROGRAMMING

- Requires many independent variables for related data
- Passing multiple variables becomes complex
- Difficult to manage multiple entities (e.g., multiple students)
- No proper data control or security

---

# OBJECT-ORIENTED PROGRAMMING (OOP)

## Definition
- OOP is a programming paradigm that organizes code using objects and classes.
- Combines data and behavior together.

---

## CLASS

- A class is a blueprint for creating objects.

Example:
class Student {
    String name;
    int age;
    int marks;
}

---

## OBJECT

- An object is an instance of a class.
- It is a user-defined (non-primitive) data type.

---

## Object Creation

Student s1 = new Student();

### Explanation:
- new → allocates memory in heap
- s1 → reference variable (stored in stack)
- Object → stored in heap

---

## Assigning Values

s1.age = 30;
s1.name = "Vedant";

---

## BEHAVIOR (METHODS)

- Functions inside a class are called methods.
- They define what an object can do.

Example:
class Student {
    void study() {
        System.out.println("Studying...");
    }
}

# NAMING CONVENTIONS IN JAVA

- Variables (primitive/reference) → camelCase  
- Classes → Start with uppercase (PascalCase)  
- Methods (functions) → camelCase  

Note:
- Not mandatory, but good coding practice

---

# INSTANCE VARIABLES

- Variables declared inside a class (outside methods)
- Also called non-static variables

### Default Values:
- int → 0  
- float/double → 0.0  
- boolean → false  
- reference types (e.g., String) → null  

Note:
- Local variables do NOT have default values

---

# INSTANCE METHODS

- Methods defined inside a class
- Operate on instance variables

---

# CONSTRUCTORS

## Definition
- Special method called when an object is created

Example:
Student s1 = new Student();  
(Student() is the constructor)

---

## Rules of Constructors

- Same name as class  
- No return type (not even void)  
- Automatically called during object creation  
- Used to initialize object  
- Can be overloaded  

---

# TYPES OF CONSTRUCTORS

## 1. Default Constructor
- Provided by Java if no constructor is defined

---

## 2. User-Defined Constructor
- Created by programmer
- If defined, Java does NOT provide default constructor

---

### Parameterized Constructor

Example:
Student(String name, int age) {
    this.name = name;
    this.age = age;
}

---

# CONSTRUCTOR OVERLOADING

- Multiple constructors with different parameters

---

# this KEYWORD

- Refers to current object
- Used to access instance variables and methods

### Rules:
- If used to call constructor → must be first statement

---

# CONSTRUCTOR CHAINING

- One constructor calls another using `this()`

Example:
Student() {
    this("unknown");
}

Student(String name) {
    this(name, 0);
}

Student(String name, int age) {
    this(name, age, 0);
}

Student(String name, int age, int rollNumber) {
    this.name = name;
    this.age = age;
    this.rollNumber = rollNumber;
}

---

## Can constructors be called manually?

- No
- Only called:
  - During object creation
  - Using `this()` inside another constructor

---

## What if heap memory is full?

- JVM throws runtime error:
  - OutOfMemoryError

---

# OBJECTS DEEP DIVE

## Memory of Reference Variable

- Takes:
  - 4 bytes (compressed OOPs)
  - 8 bytes (normal JVM)

---

## Memory of Object

Example:
class Student {
    String name;
    int age;
    int rollNo;
    String college;
}

---

### Components of Object Memory

## 1. Header

Contains metadata:

### a) Mark Word (~8 bytes)
- Lock information  
- Synchronization info  
- Garbage collection data  

### b) Class Pointer (~4/8 bytes)
- Points to class metadata

---

## 2. Actual Data (Fields)

- Example:
  - name → reference (4/8 bytes)  
  - age → 4 bytes  
  - rollNo → 4 bytes  
  - college → reference (4/8 bytes)  

---

## 3. Padding

- Ensures object size is multiple of 8 bytes
- Improves memory alignment and performance

---

### Example Calculation

- Header → 12 bytes  
- Fields → 16 bytes  
- Total → 28 bytes  

Nearest multiple of 8 → 32 bytes  
→ Add 4 bytes padding  

Final object size = 32 bytes

---

# CALL BY VALUE IN JAVA

- Java is strictly call by value

### Key Idea:
- Copy of value is passed to method

- For primitives:
  - Actual value is copied

- For objects:
  - Reference is copied (not object itself)

Note:
- There is no call by reference in Java
# DEEP COPY VS SHALLOW COPY IN JAVA

## Shallow Copy

- Copying reference of an object
- Both variables point to the same object in memory

Example:
Student s1 = new Student();
Student s2 = s1;

### Key Points:
- No new object created
- Changes in s2 affect s1
- Only reference is copied

---

## Deep Copy

- Creating a new object and copying values

Example:
class Student {
    String name;
    int age;

    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }
}

Student s1 = new Student("Siddhant", 20);
Student s2 = new Student(s1);

### Key Points:
- New memory allocated
- Objects are independent
- Changes in s2 do not affect s1

---

# STATIC KEYWORD

## Definition
- Static members belong to the class, not objects
- Shared among all instances

---

## Access

Student.college  
s1.college  

---

## Key Points

- Static variables → class variables
- Stored in Metaspace
- Memory allocated before object creation

---

## Rules for Static

- Static method can access only static members
- Static method cannot use `this`
- Static method can call only static methods

---

## Static Block

- Used to initialize static variables

Example:
class Student {
    static String college;

    static {
        college = "SVPCET";
    }
}

---

## Notes

- Parameters cannot be static
- Only nested classes can be static

---

# FINAL KEYWORD

## Definition
- Used to make something constant / unmodifiable

---

## Can be applied to:

- Variable → value cannot change  
- Method → cannot be overridden  
- Class → cannot be inherited  
- Parameter → cannot be modified  

---

## Naming Convention

- Use uppercase letters
- Use underscore for multiple words

Example:
final int MAX_VALUE = 100;

---

# WHY MAIN METHOD IS STATIC

- JVM calls main method without creating object
- Hence main must be static

---

# PILLARS OF OOP

## Encapsulation

### Definition
- Wrapping data and methods into a single unit (class)
- Restricting direct access to data

---

## Principles

- Combine data and behavior
- Restrict direct access
- Use controlled access methods

---

# ACCESS MODIFIERS

- Define visibility of variables, methods, classes

---

## Types

### 1. Private
- Accessible only within same class

---

### 2. Default (No modifier)
- Accessible within same package only

---

### 3. Protected
- Accessible:
  - Within same package
  - In subclasses (even in different package)

---

### 4. Public
- Accessible from anywhere

---

## Notes

- Cannot use private or protected for top-level class
- Protected is meaningful only with inheritance

---

# GETTERS AND SETTERS

## Getters
- Used to access private variables

Example:
public int getAge() {
    return age;
}

---

## Setters
- Used to modify private variables

Example:
public void setAge(int age) {
    this.age = age;
}
# PACKAGES IN JAVA

## Definition
- Packages are folders used to organize related classes.
- Classes inside the same folder belong to the same package.

---

## Importing Classes

### Import specific class:
import package_name.class_name;

### Import all classes:
import package_name.*;

---

## Types of Packages

1. User-defined packages  
2. Built-in packages  
   - java.util  
   - java.lang  
   - java.io  

---

## JVM Working

- JVM includes bytecode of imported classes during compilation.

---

# INHERITANCE

## Definition
- Mechanism where one class acquires properties and behavior of another class.

---

## Example

class Vehicle {
    void start() {}
}

class Car extends Vehicle {
    void setGear() {}
}

---

## Key Points

- Child class can use parent methods
- Child can override parent methods
- Supports:
  - Code reusability
  - Polymorphism

---

# TYPES OF INHERITANCE

1. Single → A → B  
2. Multilevel → A → B → C  
3. Hierarchical  
       A  
      / \  
     B   C  

4. Multiple (Not supported using classes)

---

## Why Multiple Inheritance is Not Supported?

- Causes ambiguity (Diamond Problem)

Example:

      A
     / \
    B   C
     \ /
      D

- If B and C override same method from A
- D cannot decide which method to use

---

# SUPER KEYWORD

## Definition
- Refers to parent class object

---

## Uses

- Access parent variables  
- Call parent methods  
- Call parent constructor  

---

## Note
- Parent reference can refer to child object

---

# ABSTRACTION

## Definition
- Focus on what an object does instead of how it does it

---

## Principles

- Show only essential details  
- Hide implementation details  

---

## Types of Abstraction

### 1. Low-Level Abstraction
- Hiding internal implementation
- Achieved using classes

---

### 2. High-Level Abstraction
- Separating "what" from "how"

---

## Problem Without Abstraction

- Tight coupling with concrete classes
- Difficult to extend system

---

## Solution

- Use inheritance and abstraction
- Parent class defines common behavior
- Child classes define specific implementation

---

# ABSTRACT CLASS

## Definition
- A class declared with `abstract` keyword
- Cannot be instantiated
- Used as base class

---

## Features

- Can have abstract methods (no body)
- Can have concrete methods
- Must be extended

---

## Rules

- If a class has abstract method → class must be abstract
- Child class must implement abstract methods
  OR be abstract itself

---

## @Override Annotation

- Indicates method is overridden
- Not mandatory but good practice

---

# IMPORTANT POINTS ABOUT ABSTRACT CLASS

- Cannot be instantiated  
- Can have constructors  
- Can have static methods, variables, blocks  
- Can have private methods (not abstract)  
- Can have final methods (cannot be overridden)  
- Can exist without abstract methods  

---

## Restrictions

- Cannot be final (because it must be inherited)

---

## Summary

- Abstraction hides implementation details
- Abstract class provides base structure
- Helps reduce coupling and improve flexibility
# INTERFACE IN JAVA

## Definition
- An interface is a reference type that defines a set of abstract methods and constants.
- It provides full abstraction and supports multiple inheritance.

---

## Key Points

- Classes use `implements` keyword to inherit an interface
- Interfaces support multiple inheritance
- Methods are meant to define "what" not "how"

---

## Purpose of Interface

- Acts as a contract between interface and implementing class
- Forces implementing classes to define required methods

Example:
interface Flyable {
    void startFlying();
}

- Any class implementing Flyable must implement startFlying()

---

## Abstract Class vs Interface

- Abstract Class → Represents "is-a" relationship (family of objects)
- Interface → Defines contract (capabilities)

---

## Marker Interface

- Empty interface used as a marker
- Example: Serializable

---

# ABSTRACTION VS ENCAPSULATION

- Encapsulation → Data hiding using access modifiers
- Abstraction → Hiding implementation details, showing only essential behavior

---

# POLYMORPHISM

## Definition
- One object, many forms

---

## 1. Compile-Time Polymorphism

- Achieved using method overloading
- Method decided at compile time

---

## 2. Runtime Polymorphism

- Achieved using method overriding

Example:
abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

class Duck extends Animal {
    void makeSound() {
        System.out.println("Quack");
    }
}

Animal a = new Duck();
a.makeSound();   // Calls Duck's method

---

## Important Notes

- Static methods → Cannot be overridden
- Private methods → Cannot be overridden
- Final methods → Cannot be overridden
- Final class → Cannot be inherited

---

## Variables and Polymorphism

- Variables are NOT polymorphic
- They depend on reference type

Example:
class A {
    int x = 20;
}

class B extends A {
    int x = 30;
}

A a = new B();
System.out.println(a.x);   // 20

B b = new B();
System.out.println(b.x);   // 30

---

# IN-DEPTH KNOWLEDGE OF CLASSES

## 1. Why one public class per file?

- JVM needs a clear entry point
- Only one public class simplifies lookup of main method

---

## 2. Why class name = file name?

- Helps JVM locate class easily
- Ensures consistency

---

## 3. Wrapper Classes

- Classes that wrap primitive types into objects

Examples:
- int → Integer  
- float → Float  

---

## 4. Why Wrapper Classes?

- Java Collections work only with objects
- Needed for object-based operations

---

## 5. Why Primitive Types Still Exist?

- Faster performance
- Backward compatibility with older languages (C/C++)
# AUTOBOXING AND UNBOXING

## 1) Autoboxing

- Automatic conversion of primitive data type to wrapper class

Example:
int x = 10;
Integer y = x;

---

### Internal Working

- Older versions:
Integer y = new Integer(x);

- Modern versions:
Integer y = Integer.valueOf(x);  // Uses caching

---

## 2) Unboxing

- Automatic conversion of wrapper class to primitive type

Example:
Integer x = 10;
int y = x;

---

### Internal Working

int y = x.intValue();

---

## Where Autoboxing/Unboxing Happens

- Assignment  
- Method calls  
- Arithmetic operations  

---

## NullPointerException Case

Example:
Integer x = null;
int y = x;   // Exception

Reason:
- Primitive types cannot store null
- JVM internally calls x.intValue()

---

## Comparing Wrapper Objects

Example:
Integer x = 100;
Integer y = 100;

System.out.println(x == y);

---

### Why it may return false?

- "==" compares references, not values

---

### Correct Ways to Compare

1. Using value:
x.intValue() == y.intValue();

2. Using equals:
x.equals(y);

---

## Integer Caching

- Range: -128 to 127
- Objects in this range are cached
- Same reference returned → x == y may be true

---

## Conceptual Structure of Integer Class

public final class Integer {
    private int value;

    public Integer(int value) {
        this.value = value;
    }

    public int intValue() {
        return value;
    }

    public static Integer valueOf(int x) {
        // returns cached object if within range
    }

    public boolean equals(Integer x) {
        return value == x.intValue();
    }
}

---

# POJO CLASSES (Plain Old Java Object)

## Definition

- Simple Java class without external framework dependencies
- Contains fields, constructors, getters, setters

---

## Why POJO?

- Used to represent real-world entities

Example:
Student → name, age, rollNo, college

---

## Types

1. Anemic Model  
   - Only fields + getters/setters  

2. Rich Domain Model  
   - Includes business logic  

---

# NESTED CLASSES IN JAVA

## Definition

- A class inside another class

---

## Why use Nested Classes?

- Logical grouping  
- Better encapsulation  
- Access to outer class private members  

---

## Types of Nested Classes

1. Static Nested Class  
2. Inner Class  
3. Local Class  
4. Anonymous Class  

---

## 1) Static Nested Class

Example:
class A {
    static class B {
    }
}

Creation:
A.B obj = new A.B();

---

### Properties

- Cannot access non-static members of outer class  
- Can have static members  
- Can implement interfaces / extend classes  
- Supports access modifiers  

---

### Use Cases

- Helper classes  
- Builder pattern  
- DTO (Data Transfer Objects)  
- Static utilities  

---

## 2) Inner Class

Example:
class Outer {
    class Inner {
    }
}

- Requires outer class object to create

---

# STANDARD INPUT OUTPUT IN JAVA

## Types of I/O

- Console I/O  
- File I/O  
- Network I/O  
- Memory I/O  

---

## Console Output

System.out.println();

---

### Explanation

- System → class  
- out → static variable  
- out → reference to PrintStream object  
- println() → method of PrintStream  

---

## Why no import needed for System?

- System class belongs to java.lang package  
- java.lang is imported by default
# STREAMS IN JAVA

## Definition
- A stream is a flow of data
- In Java, streams are treated as a flow of bytes

---

## Types of Streams

1. InputStream  
   - Data flows into the program  

2. OutputStream  
   - Data flows out of the program  

---

## Important Note

- InputStream and OutputStream are abstract classes  
- They provide basic methods like:
  - read()
  - write()

---

## InputStream Hierarchy

- FileInputStream  
- ByteArrayInputStream  
- BufferedInputStream  
- DataInputStream  

---

## OutputStream Hierarchy

- FileOutputStream  
- ByteArrayOutputStream  
- BufferedOutputStream  
- PrintStream  

---

# TAKING INPUT FROM USER

## Using System.in

- System.in is an InputStream object

---

## Older Method

int data = System.in.read();
System.out.println((char) data);

---

### Problem

- Reads only one byte at a time  
- Remaining input stays in buffer  

---

## Reading Full Input (Manual Way)

String s = "";
int c;

while ((c = System.in.read()) != '\n') {
    s += (char) c;
}

---

# READER CLASSES (Character Stream)

## Hierarchy

- BufferedReader  
- InputStreamReader  
- FileReader  

---

## BufferedReader

- Reads chunks of data (not byte by byte)
- Improves performance

### Flow:
Keyboard → OS Buffer → Java Buffer → Program

---

## InputStreamReader

- Converts byte stream to character stream

### Purpose:
- Makes InputStream compatible with BufferedReader

---

## Combining Them

InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);

String input = br.readLine();

---

## Full Flow

1. User enters input (e.g., "Aditya")  
2. OS buffer stores bytes  
3. System.in reads bytes  
4. InputStreamReader converts to characters  
5. BufferedReader reads full line  
6. Program receives complete string  

---

## Limitations of BufferedReader

- Reads only String  
- Requires manual parsing (e.g., Integer.parseInt())  
- Slightly complex syntax  

---

# SCANNER CLASS

## Purpose

- Simplifies input handling  
- Provides methods for different data types  

---

## Package

- java.util

---

## Working

- Uses tokenization (splits input by whitespace)

---

## Common Methods

- sc.next() → reads single word  
- sc.nextLine() → reads full line  
- sc.nextInt() → reads integer  
- sc.nextDouble() → reads double  

---

## Example

Scanner sc = new Scanner(System.in);

int x = sc.nextInt();
String s = sc.nextLine();

---

## Note

- Scanner is slower than BufferedReader  
- Reason:
  - Performs parsing + tokenization internally
 # IMMUTABLE CLASS IN JAVA

## Definition
- Immutable classes are those whose objects cannot be modified after creation
- Once initialized, their state (data) cannot be changed

---

## Rules to Make Class Immutable

1. Make class `final`  
2. Make all instance variables `private` and `final`  
3. Do not provide setters  
4. Use defensive copying in constructor and getters  

---

## Deep Copy Concept

- Never return direct reference of mutable objects
- Always return a new object with same values

---

## Example

class Student {
    private final College college;

    Student(College college) {
        this.college = new College(college.name, college.address);
    }

    College getCollege() {
        return new College(this.college.name, this.college.address);
    }
}

class College {
    String name;
    String address;

    College(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

---

## Key Idea

- Even if object contains reference types, they should not be modifiable externally

---

# OBJECT CLASS IN JAVA

## Definition

- Present in `java.lang` package  
- Every class in Java inherits from Object class (directly or indirectly)

---

## Why Object Class?

- Provides common functionality to all classes  
- Enables polymorphic behavior  

Example:
Object obj = new Student();

---

## Core Methods

- toString()  
- equals()  
- hashCode()  
- getClass()  

---

## Other Methods

- clone()  
- finalize()  
- wait()  
- notify()  
- notifyAll()  

---

# IMPORTANT METHODS

## 1. toString()

- Converts object to string representation  

### Default Output:
class_name@hexadecimal_value  

- Automatically called in:
System.out.println(object);

---

## 2. equals()

- Compares two objects  

### Default Behavior:
- Compares references (memory address)

---

## 3. hashCode()

- Returns integer hash value of object  

### Rule:
- If two objects are equal → hashCode must be same  
- Reverse is not always true  

---

## 4. getClass()

- Returns runtime class of object  

Example:
Student s1 = new Student();
s1.getClass();  
s1.getClass().getName();  // "Student"

### Note:
- It is final → cannot be overridden  

---

## instanceof Operator

- Checks if object is instance of class or subclass  

Example:
if (obj instanceof Student) {
    // logic
}

---

## 5. clone()

- Creates copy of object  
- Produces shallow copy  

### Requirement:
- Class must implement Cloneable interface  

---

## Why Cloneable Interface?

- Prevents unsafe cloning (e.g., threads, database objects)

---

## 6. finalize()

- Used earlier by garbage collector  
- Now deprecated  

### Reason:
- Unpredictable  
- Unsafe  
- Unreliable  

---
# PROBLEMS WITH USING NORMAL CLASS FOR ENUM-LIKE FUNCTIONALITY

## Example

class PaymentStatus {
    public static final int SUCCESS = 1;
    public static final int PENDING = 2;
    public static final int FAILED = 3;
}

---

## Problems

1. Type Safety Issue  
   - Any integer value can be assigned  
   - Example:
     int status = 100;  // Invalid but allowed at compile time  

---

2. Poor Readability  
   - Values like 1, 2, 3 are not meaningful  

---

3. No Proper Grouping  
   - Related constants are not strongly tied together  

---

4. Duplicate Values Possible  

Example:
class Role {
    public static final int ADMIN = 1;
    public static final int USER = 1;
}

---

# ENUM (ENUMERATION)

## Definition

- Enum is a special class representing a fixed set of constants

---

## Example

enum PaymentStatus {
    SUCCESS,
    FAILED,
    PENDING
}

---

## Usage

PaymentStatus status = PaymentStatus.SUCCESS;

---

## Advantages

- Type safety  
- Better readability  
- No duplicate values  
- Grouped constants  

---

# ENUM IN DEPTH

## Key Points

- Enum is internally converted to a class  
- Extends java.lang.Enum  
- Constants are:
  - static  
  - final  
- Enum class is final → cannot be inherited  

---

## Internal Representation

enum Direction {
    NORTH, SOUTH, EAST, WEST
}

---

Internally becomes:

final class Direction extends Enum<Direction> {
    public static final Direction NORTH = new Direction();
    public static final Direction SOUTH = new Direction();
    public static final Direction EAST  = new Direction();
    public static final Direction WEST  = new Direction();

    private Direction() {}
}

---

## Important Notes

- Each enum constant is an object  
- Constructor is private  
- Cannot create enum objects manually  

---

## Enum with Variables

enum Direction {
    NORTH(0);

    int degree;

    Direction(int degree) {
        this.degree = degree;
    }
}

---

## Enum with Methods

enum Direction {
    NORTH {
        @Override
        void move() {
            System.out.println("Move up");
        }
    };

    abstract void move();
}

---

# BUILT-IN ENUM METHODS

## 1. values()

- Returns array of enum constants

---

## 2. valueOf(String)

- Converts string to enum constant

Example:
Direction d = Direction.valueOf("EAST");

---

## 3. name()

- Returns name of enum constant  
- Cannot be overridden  

---

## 4. ordinal()

- Returns position index (starting from 0)

---

## Why values() and valueOf() are compiler-generated?

- values():
  - Returns cloned array of constants  

- valueOf():
  - Uses internal lookup to match string  

---

# INTERFACES (DEEP DIVE)

## Definition

- Interface defines behavior (what), not implementation (how)
- Acts as contract

---

## Key Points

- Methods are public by default  
- Supports dynamic polymorphism  
- Uses `implements` keyword  

---

## Variables in Interface

- Automatically:
  - public  
  - static  
  - final  

---

## Interface Inheritance

Example:
interface Animal {}
interface Dog extends Animal {}

---

# CHANGES AFTER JAVA 8

## Default Methods

- Methods with implementation  
- Optional to override  

---

## Static Methods

- Can be defined inside interface  

---

## Why Introduced?

- To add methods without breaking existing implementations  

---

# CHANGES AFTER JAVA 9

- Interfaces can have private methods  

---

#  Multiple Inheritance in Java using Interfaces

## 🔹 Why Java does NOT support multiple inheritance with classes

* Java does not allow a class to extend multiple classes to avoid:

  * **Ambiguity problem (Diamond Problem)**
  * Confusion in method resolution

---

## 🔹 How Java supports Multiple Inheritance

Java allows multiple inheritance **through interfaces**

```java
interface A {
    void show();
}

interface B {
    void show();
}

class C implements A, B {
    public void show() {
        System.out.println("Implemented in C");
    }
}
```

###  Key Points

* A class can implement **multiple interfaces**
* Interfaces (before Java 8):

  * Only had **abstract methods**
  * No method body
* Hence, no ambiguity → class provides its **own implementation**

---

## 🔹 After Java 8 (Default Methods)

Java 8 introduced **default methods** in interfaces:

```java
interface A {
    default void show() {
        System.out.println("A");
    }
}
```

---

## 🔹 Problem with Multiple Interfaces having Default Methods

```java
interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}

class C implements A, B {
    // Compilation Error if not overridden
}
```

### Why Error Occurs?

* Both interfaces provide a **default implementation**
* JVM gets **confused** → which method to use?

---

## 🔹 Rule 

 If multiple interfaces provide the **same default method**,
 Then the implementing class **MUST override it**

---

## 🔹 Correct Implementation

```java
class C implements A, B {
    public void show() {
        System.out.println("Resolved in C");
    }
}
```

---

## 🔹 Accessing Specific Interface Method (Optional)

You can explicitly call a specific interface method:

```java
class C implements A, B {
    public void show() {
        A.super.show();  // calls A's version
        B.super.show();  // calls B's version
    }
}
```

---

## Java Resolution Priority Rule

Consider the example like given below:
```java

    interface A{
        default void fun(){
            System.out.println("Inside A interface");
        }
    }


    class B{
        public void fun(){
            System.out.println("Inside B class");
        }
    }

    class C extends B implements A{

    }
```
* Java Resolution Priority Rule states that if  a class extends a certain class and implements a certain interface, and both the interface implemented and class inherited have same function. Then java gives priority to the function present within the class inherited.
* If we want to implement the function present in the interface then we would have to call it using the super keyword.


## After JAVA 8
  * Interfaces can have
    * default methods
    * static methods
    * private methods
    * static and final methods
  
  * Now how can we seperate interfaces from abstract class because abstract classes can have
    * concrete methods
    * static methods
    * private methods
    * abstract methods

  * Gap between Interfaces and Abstract class
    * Intentions of Interfaces
      * Interfaces are used for defining contracts or responsibilities
      * Example : Runnable, Walkable.
      * It shows "can-do" relationship.
    * Interfaces cannot have normal fields which are non static and non final. By default it becomes public static final.
    * Interfaces cannot have constructor.
    * Supports multiple inheritance.
    * By default public method

    * Intentions of Abstract
      * This should be used to group families of similar class.
      * It shows a "is-a" relationship.
    * Abstract class can have normal fields
    * Abstract class can have constructors.
    * Doesn't support multiple inheritance.
    * All access modifiers allowed

## Special Types Of Interfaces
   * Functional Interfaces
     - Interface that have only one method inside it is called as functional interface. 
     - This unlocks functional programming using lambda expression.
   
   * Marker Interfaces:
     - Interfaces that do not have any methods within them are called the marker interfaces
     - Modern Java prefers Annotations over Marker interfaces.
     - Three types of marker interfaces in JAVA
       - Classable
       - Serializable
       - RandomAccess
     - Why do we have this interfaces.
       - To explicitly show that yes we want to do this thing. 

 ## Internally Interfaces:
    - Internally the interfaces are compiled to classes.
    - For compiler to understand the difference between interface and class there is a tag added within a class i.e ACC_interface.

# String in JAVA

* String is a sequence of characters or character array. It is just an abstraction on this character array.

## Why did we have a seperate String datatype.
   - Because it gives more functionalities compared to what we would have gotten using just the character array.

* String belongs to java.lang package. This package is auto imported.

## Properties of String class:
   - String class is an immutable class.
     - String class is immutable because it is the most used class and can store sensitive data like the passwords, url, or hashes and we dont want them to change, hence String classes are immutable.

## Two ways to Declare String in JAVA
   * Literal
   * new

   - Literal:
      - String  s =  "Hello";
      - When we declared a string using this way, JAVA has reserved a memory called as String pool. The object is declared within this memory pool.
      - The benefit of this is  that same strings will be reused if declared again. 
      - Example String s2 = "Hello" , since "Hello" is already present within the String pool the s2 object will directly point to the "Hello" which was created earlier.

   - new:
      - String s1 = new String("Hello");
      - Everytime new object is created.

## Golden Rule for Strings:
- Only compile time constants go to string pool automatically.
- Runtime created string go to heap.
- Any literal goes to the string pool.
  - Example String s2 = s1 + "va";
  - Here "va" string will go to the String pool without any reference variable pointing it and eventually it will be cleared by the garbage collector.
- if we declare the strings like String s1 = new String("Hello");
  - Here the string "Hello" will get created in heap and s1 will point to it, also the "Hello" since being the string literal will also get stored to the String pool without anyone pointing to it.


* String class has overrided the equals method to always compare the values.
* Compile time constants:
  - String s1  =  "ja" + "va";
  - At compile time only this two strings are joined and entire string is stored in the heap.
* Runtime Coonstants:
  - String s1 = "ja"
  - String s2 = s1 +  "va";
  - This will give false when above two are compared together, because when we do something like s2 = s1 + "va", this object will be created in the heap.


## Problems in Strings being immutable:
``` java
    String s  = "";
    for(int i=0; i<5; i++){
        s = s + i;
    }
```
    - The above code will create 4 different objects, and the last string object will be only pointed.

## After Java 9:
   - Before java 9 the String was stored using character array, but that used to consume lot of memory.
   - Afer java 9 Strings use byte array internally.
   - We have three fields present in the String class:
     - private final byte[] values;
     - private final byte coder;
     - private int hash; // Stores the hash
   - The byte array at each index store the unicode of individual characters.
   


* Why did java decided to store the String in character array:
   - Because each character present on the keyboard can be represented using a single byte.
   - So why should we waste an extra 1 byte.

* values[] array:
   - This stores the byte values in an array, for the characters.

* Coder field in String class:
  - The coder field can have two values 0 and 1.
  - 0 here represent that all the characters present in the string can be represented using ASCII values. (Also called latin 1)
  - 1 here reprsents that the characters present in the string include some characters that cannot be represented by the ASCII value and need to be stored using unicode. (Also called UTF16).
  - This will tell whether we need to read two bytes(In case unicode characters are present) from the byte array or single byte(When all characters are under ASCII code).

* hash field in String class:
  - This stores the hashcode of the String. It is used by hashmaps. This is like caching the hashcode for further use whenever possible.

## Optimization in String class:
  - String pool reduced the number of objects created.
  - char array was converted to byte array to prevent extra memory use
  - Caching the hash values


## Constructors in String
* Empty Constructor:
  - String s1 = new String() // empty string.
* Parameterized constructor
  - String s2 = new String("Hello"); // Heap and String pool
* Another way for constructor:
  - String s3 = "Siddhant";
  - String s4 = new String(s3);
  - Heap->s4-> Siddhant
  - string pool -> s3  -> "Siddhant"
* Passing charcter array
  - char[] arr = ['S', 'i', 'd', 'd', 'h', 'a', 'n', 't'];
  - String s5 = new String(arr);
  - s5 will become "Siddhant"
* Giving starting index and count
  - char[] arr = ['S', 'i', 'd', 'd', 'h', 'a', 'n', 't'];
  - String s6 = new String(arr,  0, 6);
* Byte array in constructor:
  - byte[] arr = {97, 98, 99};
  - String s1 = new String(arr);
  - String s2 = new String(arr, 0, 2);

* StringBuilder method:
  ```java
    StringBuilder sb = new StringBuilder("Hello");
    String s8 = new String(sb);
  ```

* StringBuffer method:
  ```java
    StringBuffer sb = new StringBuffer("Hello");
    String s9 = new String(sb);
  ```

## String methods:

* Length/Emptiness
  - length() -> Returns the length of the string.
  - isEmpty() -> true or false if the string is empty or not
  - isBlank() -> Even if there are just spaces in string, isBlank returns true unlike isEmpty()

* Searching
  - contains() -> To check whether a certain string exist within the given string or not.
  - indexOf() -> Returns index of a certain character. We can also give strings.
  - lastIndexOf() ->  Returns the last index of the repeating characters.
  - startsWith() -> If a string starts with a certain string or not
  - endsWith() -> Just the oppposite of startsWith

* Conversion:
  - valueOf() -> String s4 = new String(String.valueOf(10));
  - getBytes() -> Converts string  to byte array and returns it.

* Character Access
  - charAt() -> Returns the character present at the specified index
  - toCharArray() -> Returns character Array of the given string

* Advance
  - intern() -> If we want to bring the string object from heap memory to String pool so  we use the inntern method. 
  - format() -> String.format("Hello %s your age is %s", name , age);

* Comparison
  - equals() -> This checks the value of the String.
  - equalsIgnoreCase() -> Ignore cases and compares the string
  - compareTo() -> lexi cographically comparison. It gives three outputs (-ve (when s1 < s2), 0 (when s1 = s2), +ve (when s1 > s2)). It just takes ascii value of each individual characters sums them and does something like this (sum1 - sum2).

* Extraction/Transformation
  - substring() -> Gives a substring from starting index to ending index - 1. If only one index is given it starts from there and goes to end.
  - toUpperCase() -> 
  - toLowerCase()
  - trim() -> Removes spaces from starting and ending.
  - strip() -> It is unicode friendly, so use it when we have unicode present in string.
  - repeat() -> Repeat method takes a count and prints the string that number of times.
  - replace() -> Replace target character with the specified character, we can also replace substring with another substring.
  - replaceAll() -> Replaces all occurences with specified string.
  - split() -> We can split a string based on a delimeter like comma, whitespaces etc.
  - join() -> Joins strings using some delimeter specified. This is a staic member function
  

## String Builder class
   - This is an immutable class
   - This is not thread safe.
   - This inherits from AbstractStringBuilder
   - Exists in java.lang package 

   * The string Builder assigns more size than required for storing string specified during the creation.
   * Doubles the current capacity and replicates the existing data in that array when size is getting full.
   * It uses the formula : capacity * 2 + 2

   * It consists of:
     - byte[] values -> byte array to store the byte value of the string.
     - int count ->  Tells till which index we have added the characters
     - capacity -> tells the entire capacity of the array. Initially it is 16, increases when the array is getting almost full.
     - append() -> Used to append in the string.

   * Constructor withing StringBuilder
     - new StringBuilder() -> empty srting with 16 spaces
     - new StringBuilder(50) -> creates a 50 size array.
     - new StringBuilder("java") -> 16 Initial size and 4 bytes for storing "java" hence it takes 20 bytes.

    * Methods:
      - append()
      - insert() -> insert a character at specified index.
      - delete() -> takes start index and end index and deletes it.
      - replace() -> replaces a particular substring with another. sb.replace(1, 3, "xy")
      - reverse() -> reverses a string.
      - charAt()  -> gives char present at certain index
      - setCharAt() -> sets character at certain index
      - length() -> gives length of the string
      - capacity() -> gives the size of array.
      - ensureCapacity() -> increases the capacity of the array.
      - trimToSize() -> trims the unused size present inside the array.


## String Buffer class (Mutable + thread safety)
   - This is an immutable class
   - This is thread safe.
   - This inherits from AbstractStringBuilder
   - Exists in java.lang package 

* IMPORTANT NOTE: String builder and String buffer does not overrides equals method hence it compares only the references and not the values



 # Upcasting:
   - Conversion of specific class to generic class is called as upcasting 
   - No casting required

   - Example
    ```java
        class Animal {

        }

        class Dog extends Animal {

        }

        Dog d = new Dog();
        Animal a = d;
    ```
   - In the above example we can see that I have assigned a "Dog class object" to an "Animal class reference variable", here the "a" can only access the methods present within the Animal class. This type of assignment is called as upcasting.
   - The compiler doesn't allow parent class reference variable to access the child class specific methods, because it is unsafe and unpredictable.

# DownCasting:
   - Conversion of general object to specific object.
   - Example:
   ```java
      Object obj = "Hello";
      String s = (String) obj;
    ```
   - In the above example we can see that I have stored a String in "Object" class object (obj). Now when I want to assign it to a "String" class object, I cannot do it directly, so for telling the compiler that I am willingly converting the Object's object to String type object, I need to specify it using the casting.
   * Why does compiler give error?
     - This is because there can be a case where we are getting an Intger type object and trying to store it in String type reference variable hence to prevent this type of errors the compiler wants a reassurance.
     - If at the runtime the types doesn't match we will get the classcastException.


# Problems that lead to Generics:
  - Consider a situation where we want to make a class which can hold all types of values, basically we want to make it type independant, without making multiple classes.
  - We can do something like below
  ```java
    class Box{
        private Object value;

        Box(Object a){
            this.value = a;
        }

        Object getValue(){
           Object a = new Object(this.value);
           return a;
        }

        Object setValue(Object a){
            this.value = a;
        }
    }
  ```

  ## Limitations of this method
    - Type information is lost, anyone can store any value in this tyype of class object. Which makes it very unpredictable.
    - Wrong object could be inserted
    - Casting became unnecessary when reading
    - Many errors shift to runtime instead of compile time.

# Generics
  - Generics in Java are a feature that allows you to write classes, interfaces, and methods with type parameters, so that the type is specified later (at compile time) instead of being fixed.
  
  - Example:
  ```java
    class Box<T>{
        T value;

        Box( T value){
            this.value = value;
        }
    }
  ```

  - The class specified above is a generic class which can hold the value of any type, the type is specified at compile time so no type information is lost.
  - The  value inside the angular bracket while creating the class is type parameter.
  - Defining the object of generic class
  ```java
    Box<Integer> b1 = new Box<>(10);
  ```

  ## Generic Methods:
     - Definition
     ```java
        public static <T> T getResult(T x){
            return x;
        }
     ```
     - Standard format: <T> returnType methodName(T parameter) {}

     * Working with two parameters:
       ```java
        public static <T, U> printPair(T first, U second){
            soutp(first + " , " + second);
        }
       ```

       - Type Inference
         - Type inference in Java is the ability of the compiler to automatically determine the data type of an expression, variable, or method invocation based on the context, without requiring explicit type declaration by the programmer.

    ## Bounds in Genrics.
       * UpperBound:
         - This specifies that the type parameter will be the class specified after the extends or will be its subtype.
         - Example if you want to work only with numbers you will write something like below
         ```java
            class Add<T extends Number> {
                T value;

                public void printDouble(){
                    System.out.println(value.doubleValue());
                }
            }
         ```

         - We can add more bounds like below:
         - <T extends Class & Interface1, Interface2, Interface3>

### Generics in Depth:
-  How does Generics break parent child relationship.
-  We can say that Dog Is-A Animal but we cannot say that list of dogs is a list of animals.
-  Generic<A> is Not a subtype of Generic<B>
-  That means Generics are invariant.



### WildCards (?):
 - It is a list that can store anything.
 - Declared like : List<?>  list   = new ArrayList<Animal>();
 - It is a list of specific type but we dont know what it is till we pass the Argument to it.
 - We can't do something like below in our code:
 - Example :
   ```java
        void fun(List <?> list){
            list.add("Hello");
        }
   ```
 - The above code will give error because at compile time we won't be knowing what List is going to come, whether it will be of Strings, An user defined datatype etc.
 - We can just read from it by using "Object" class  because it is parent of every class.

 * Another type of Wildcard where we get more functionalities is:
   ```java
         static void fun(List<? extends Animal> values){
            for(Animal a : values){
                a.eat();
                
            }
        }
   ```
   - In the above type of code, we can expect that the list will be of type of Animal or atleast its subTypes hence we can actually call the methods which are present in the Animal class.
   - But we can still not add anything because it can generate problems like:
     - Adding Animal object when the List passed is of type Dog
     - Adding Cat object when the List passed is of type Cat

  * To solve this Java provided a keyword called super.
    ```java
         static void fun(List<? super Animal> values){
            values.add(new Dog());
        }
    ```
    - The super keywords tells the compiler that the list passed will be either Animal or its parent class not below.
    - So now we can add object of any of its subtype within the list because we know that the parent can point to its child.
    - But now there will be another type of problem. That we cant read from base class like
      - Animal a = l.get(0); // because the list can be of object  type also
    - So if we use super we cant read, and if we use extends we cant write

    * Covariant , CounterVariant, Invariant:
      - List<? extends T>  : Allows only reading, called covariant
      - List<? Super T> : Allows writing countervariant
      - List<?> : Invariant

    ### PECS Rule  (Producer Extends Consumer Super):
     - It says that if someone is producing we must use extends so that we can read it. 
     - If someone is going to consume something then we must use super to produce it.


### When to use T and when to use Wildcard.
    - Wildcards is allowed only during containers like List.
    - In classes or methods we use the type paramenters


# Type Erasures:
 - Does JVM knows Generics?
   - No. The type parameter is erased till it reaches the runtime and is replaced with Object type.
 - Generics is just the compile time safety
 - Now how does compiler removes it?
   - If there is no bound then directly replace the type with Object
   - If bounded:
      - replace with the bound
   - Insert cast automatically

   * What we cant do with generics:
   - Cant use the instanceOf for meeting a particular condition.
   - Method overloading

   * Compiler generated brdige method:
    - Consider an example like this:
    ```java
        class Parent<T>{
            T get(){
                return null;
            }
        }

        class Child extends Parent<String>{
            @Override
            Strine get(){
                return "Hello";
            }
        }

    ```
    - The above method during the compile, converts into something like this:
     ```java
        class Parent{
            Object get(){
                return null;
            }
        }

        class Child extends Parent{
            @Override
            String get(){
                return "Hello";
            }

            Object get(){
                get();
            }
        }

    ```
    - Since during the compilation time the parent class type parameter is considered as an Object type, we cannot override the method with another type, hence JVM creates a similar method that calls the newly created method
    - This is called as Bridge method.

  * Why is Type Erasure?
    - Generics was introduced after Java 5.
    - Before:
      List l = new ArrayList();
    - After:
      List<Integer> = new ArrayList<>();
    
    - Why did the JVM did not handle it, if JVM would have handled it the previous code would've broken hence it was only limited to the compile time verification

   * Why Generics does not support primitives?
     -  Due to type erasure where the type parameter is replaced with Object class, then if we pass a primitive datatype then that Object class reference variable can't point to the primitive type hence generics doesn't support the primitive datatype.

# JAVA Collection Framework:
 - Java have given support for different Data Structure which are represented in the heirarchical form and the top parent class is called as collection and this entire framework is called as collection framework

 1. Dynamic Array:
 - ArrayList is the class for creating dynamic array.

 2. Linked List:
 - Java has given a class called LinkedList

 3. Set (Duplicates are not allowed):
 - Constant time -> element-> exists or not.
 - Java gives hash-set and linked-hashset.

 4. Stack and Queues 

 5. Maps: Key - Value pair
    - Duplicate keys are not allowed.1

 6. Tree:
    - TreeSet
    - TreeMap

 * List is the parent class for ArrayList and LinkedList.
 * Collection is the parent class for List , Set and Queue.

 * Heirarchy.
   - Object->Iterable->Collection.
   - Collection->List
   - Collection -> Queue
   - Collection->Set

 * Map framework is different from collection framework.


# Limitations of Iterating on any collection:
- If we consider the data structures like linked list,  or stack which does not follow index based searching, we will have to write different logic for iterating over different data structures. That means the developer would require to know the internal implementation of the data structure used, hence making the implementation tightly coupled to the data structure.
- To address this limitation we have the iterable interface which is the parent of collection

# Iterable Interface:
- It is the root interface that represent any object whose element can be traversed one by one.

* Methods:
1. Iterator() : This method returns the Iterator class object. Iterator is a different interface in java,  it is an actual object which  will iterate in our collection and bring individual elements from our collection. It has two methods that are.
   - hasNext() :  Gives boolean value for whether the next element is present or not.
   - next() : Returns the next element present in our data structure.      

# How Different Collection conceptually implement Iterable/Iterator

1. ArrayList:
   - Conceptual view of the class ArrayList.

   ```java

      class ArrayList implements Iterable{
        private Integer[] arr;
        private int size;

        @Override
        public Iterator iterator(){
          return new ArrayListIterator();
        }


        private class ArrayListIterator implements Iterator{

            int pos = 0;

            @Override
            public boolean hasNext(){
              return pos<size;
            }

            @Override
            public Integer next(){
                return arr[pos++];
            }
        }
      }
   ```

   2. Linked List
      - Conceptual overview of Linked List Iterator:
      ```java

          class LinkedList implements Iterable{
              static class Node{
                int data;
                Node next;
              }

              Node head;

              @Override
              Iterator iterator(){
                return new LinkedListIterator();
              }

              private class LinkedListIterator implements Iterator{
                  Node current = head;
                  @Override
                  boolean hasNext(){
                    return current != null;
                  }

                  @Override
                  Integer next(){
                    int data = current.data;
                    current = current.next;
                    return data;
                  }
              }
          }

      ```

* Iterable has following methods:
  - Iterator()
  - forEach()
  - splitIterator()

* Iterator has following methods
  - hasNext()
  - next()
  - remove() 