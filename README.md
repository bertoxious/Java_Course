# Java_Course
### Superfast java
😎
## Key notes:

#### Abstract class
We cannot create object of an abstract class and an abstract method is the method which is declared without its implementation. eg abstract String Method();
#### Constructor Chaining
In java everytime we create an object of class it calls the parent class constructor even if you don't specify. This is called constructor chaining.
#### Super
we cannot use super keyword from a static method.
Use cases of super keyword : 1. Accessing parent class variables i.e. super.VARIABLE_NAME 2. Accessing parent class methods i.e. super.METHOD_NAME() 3. Accessing parent class constructor i.e. super(PARAMETERS)
#### Inheritance
A super class can never access members of a subclass 
#### The 3P's
private - not inherited
public - anyone can access i.e. also accessible outside package.
protected - allow access to package members only.
#### String Pool
Strign pool is a storage area in Java Heap where string literals gets stored. By default it is empty and privately maintained by Java String Class.
Whenever we create a string the string occupies some space in heap memory. Creating a number of strings ay increase the cost and memory too which may reduce the performance also.
String Pool :: String a = "Python"; String b = "Data Science"; String c = "Python"; 
things stored in String Pool :: Python, Data Science
Java Heap :: String a = new String("Java");String b = new String("C++");String c = new String("Data Science"); 
stored in heap :: Java, C++, Data Science
this will be stored in String Pool :: String d = new String("Data Science").intern();
#### Constructors
this must be the first statement inside constructor and there should be only one this statement per constructor.
If constructors are defined manually then no automatic constructor or no Args Constructor will be created.
Constructors cannot be private.
A constructor cannot be abstract, static, final, native, strictftp or synchronized.
Constructors do not return a value.
Constructors do not have a return type not even void.
#### Static 
Memory allocation is done only once for a static variable. Since memory is allocated for the static variables or functions, these can be called without using objects.
Static variables are stored in static memory. A static int variable remains in the memory while the program is running. A normal or auto variable is destroyed when a function stops. A static function can be invoked without the use of object.
A static function can't be overridden. A static variable can't be defined inside a method as it would generate a compile time error. A static variable is shared among all the instances of a class. It like a global variable available to all methods.
