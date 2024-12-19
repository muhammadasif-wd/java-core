# JAVA Programming Language

## Java Installation and Run Process for Windows

### Step 1: Download and Install JDK

1. Go to the [Oracle JDK download page](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Download the JDK installer for Windows.
3. Run the installer and follow the on-screen instructions to install the JDK.

### Step 2: Set Up Environment Variables

1. Open the Start Menu and search for "Environment Variables".
2. Click on "Edit the system environment variables".
3. In the System Properties window, click on the "Environment Variables" button.
4. Under "System variables", click "New" and add a new variable:
   - Variable name: `JAVA_HOME`
   - Variable value: `C:\Program Files\Java\jdk-<version>` (replace `<version>` with your JDK version)
5. Find the `Path` variable in the "System variables" section, select it, and click "Edit".
6. Click "New" and add `%JAVA_HOME%\bin` to the list.

### Step 3: Verify Installation

1. Open Command Prompt.
2. Type `java -version` and press Enter. You should see the installed Java version.
3. Type `javac -version` and press Enter. You should see the installed Java compiler version.

### Step 4: Write and Run a Java Program

1. Open a text editor and write your Java code. Save the file with a `.java` extension.
2. Open Command Prompt and navigate to the directory where you saved your Java file.
3. Compile your Java program by typing `javac YourProgram.java` and press Enter.
4. Run your Java program by typing `java YourProgram` and press Enter.

You should see the output of your Java program in the Command Prompt.

## What is Java?

Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let application developers write once, run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.

## Java Creation Team and Developer

Java was originally developed by James Gosling at Sun Microsystems and released in 1995 as a core component of Sun Microsystems' Java platform. The original team included Mike Sheridan and Patrick Naughton.

## Java Recent Team for Management

After Oracle Corporation acquired Sun Microsystems in 2010, the Java platform has been managed and maintained by Oracle's Java development team.

## What is an IDE?

An Integrated Development Environment (IDE) is a software application that provides comprehensive facilities to computer programmers for software development. An IDE typically consists of a source code editor, build automation tools, and a debugger. Popular Java IDEs include IntelliJ IDEA, Eclipse, and NetBeans.

## What is an JDK?

The Java Development Kit (JDK) is a software development environment used for developing Java applications and applets. It includes the Java Runtime Environment (JRE), an interpreter/loader (Java), a compiler (javac), an archiver (jar), a documentation generator (Javadoc), and other tools needed for Java development.

## What is a JVM?

The Java Virtual Machine (JVM) is an abstract computing machine that enables a computer to run a Java program. The JVM performs the following main tasks:

- Loads Java bytecode
- Verifies bytecode
- Executes bytecode
- Provides a runtime environment (JRE)

The JVM is platform-independent, meaning that Java programs can run on any device or operating system that has a compatible JVM implementation.

## What is a JRE?

The Java Runtime Environment (JRE) is a part of the Java Development Kit (JDK) that provides the libraries, Java Virtual Machine (JVM), and other components to run applications written in Java. The JRE does not include development tools such as compilers or debuggers. It is designed to provide a runtime environment for Java applications.

## Java Run Flowchart

Below is a flowchart that illustrates the process of running a Java program:

```plaintext
+------------------+
|  Write Java Code |
+--------+---------+
         |
         v
+--------+---------+
|  Compile with    |
|  javac Compiler  |
+--------+---------+
         |
         v
+--------+---------+
|  Generate Bytecode|
|  (.class file)   |
+--------+---------+
         |
         v
+--------+---------+
|  Execute with    |
|  Java Virtual    |
|  Machine (JVM)   |
+------------------+
```
