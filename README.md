# IntroToJava
Learning Java. Practices and plans for future projects.

Java is: Object Oriented, Platform Independent, Simple, Secure, Architecture-neutral,
Portable, Robust, Multithreaded,Interpreted, High Performance, Distributed, Dynamic.

Java Source Code (mycode.java) --> Java Compiler (javac) --> Java bytecode (mycode.class) -->bytecode compiler&interpreter -->machine code  

```Java
public class HelloWorld {
  /* This is my first Java Program.
  This will print 'HelloWorld' as the output*/
  public static void main (String[] args) {
        System.out.println("HelloWorld");
  }
}

```
* public class HelloWorld{}: define a class named HelloWorld.
* public: anyone can access, static: you can run this method without creating an instance of main
* void: no return value , main: the name of method
* System: a pre-defined class
* out: a static variable within System
* println: a method of out
