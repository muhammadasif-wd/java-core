# Java Data Types

In Java, data types specify the different sizes and values that can be stored in a variable. Java is a strongly typed language, which means that every variable must have a data type. There are two categories of data types in Java: primitive data types and reference data types.

## Primitive Data Types

Primitive data types are the most basic data types available in Java. There are 8 primitive data types:

1. **byte**

   - Size: 8-bit
   - Range: -128 to 127
   - Explanation: The `byte` type uses 8 bits, where the first bit is the sign bit (0 for positive, 1 for negative). This allows for 2^7 (128) positive values and 2^7 (128) negative values, plus zero.
   - Example: `byte b = 100;`

2. **short**

   - Size: 16-bit
   - Range: -32,768 to 32,767
   - Explanation: The `short` type uses 16 bits, with the first bit as the sign bit. This allows for 2^15 (32,768) positive values and 2^15 (32,768) negative values, plus zero.
   - Example: `short s = 10000;`

3. **int**

   - Size: 32-bit
   - Range: -2^31 to 2^31-1
   - Explanation: The `int` type uses 32 bits, with the first bit as the sign bit. This allows for 2^31 (2,147,483,648) positive values and 2^31 (2,147,483,648) negative values, plus zero.
   - Example: `int i = 100000;`

4. **long**

   - Size: 64-bit
   - Range: -2^63 to 2^63-1
   - Explanation: The `long` type uses 64 bits, with the first bit as the sign bit. This allows for 2^63 (9,223,372,036,854,775,808) positive values and 2^63 (9,223,372,036,854,775,808) negative values, plus zero.
   - Example: `long l = 100000L;`

5. **float**

   - Size: 32-bit
   - Range: approximately ±3.40282347E+38F (6-7 significant decimal digits)
   - Explanation: The `float` type uses 32 bits to represent a floating-point number, following the IEEE 754 standard. The range is determined by the exponent and mantissa.
   - Example: `float f = 10.5f;`

6. **double**

   - Size: 64-bit
   - Range: approximately ±1.79769313486231570E+308 (15 significant decimal digits)
   - Explanation: The `double` type uses 64 bits to represent a floating-point number, following the IEEE 754 standard. The range is determined by the exponent and mantissa.
   - Example: `double d = 10.5;`

7. **char**

   - Size: 16-bit
   - Range: 0 to 65,535 (unsigned)
   - Explanation: The `char` type uses 16 bits to represent a Unicode character. It is an unsigned type, meaning it can only represent positive values.
   - Example: `char c = 'A';`

8. **boolean**
   - Size: not precisely defined (depends on JVM)
   - Values: `true` or `false`
   - Explanation: The `boolean` type represents one bit of information, but its "size" isn't precisely defined. It can only take the values `true` or `false`.
   - Example: `boolean b = true;`

## Reference Data Types

Reference data types are used to refer to objects. They are created using defined constructors of the classes. They are used to access objects. These variables are declared to be of a specific type that cannot be changed. Reference types include:

1. **Classes**

   - Example: `String str = "Hello";`

2. **Interfaces**

   - Example: `Runnable r = new MyRunnable();`

3. **Arrays**
   - Example: `int[] arr = {1, 2, 3};`

Reference variables are created using constructors of the classes. They are used to access objects. These variables are declared to be of a specific type that cannot be changed.

Understanding these data types is fundamental to programming in Java, as they form the building blocks for data manipulation and storage.
