# Today I Learned  

## 03/01/2021
Java Object-Oriented Programming, OOP (by [YouTube-newLecture](https://www.youtube.com/watch?v=yGBmRdgc1Ic&list=PLq8wAnVUcTFV4ZjRbyGnw6T1tgmYDLM3P&index=54))

* **Encapsulation** is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. Therefore, it is also known as **data hiding**.
  * Better control of class attributes and methods
  * Class attributes can be made **read-only** (if you only use the `get` method), or **write-only** (if you only use the `set` method)
  * Flexible: the programmer can change one part of the code without affecting other parts
  * Increased security of data
  
* **Static method** vs **Instance method** (by [Geeks for Geeks](https://www.geeksforgeeks.org/static-methods-vs-instance-methods-java/#:~:text=Instance%20method%20can%20access%20static,must%20use%20reference%20to%20object.) )
	* Static methods can’t access instance methods and instance variables directly. They must use reference to object. And static method can’t use [this](http://quiz.geeksforgeeks.org/this-reference-in-java/) keyword as there is no instance for ‘this’ to refer to.
  * Instance method can access the instance methods and instance variables directly.
  
* Constructor is a **special method** that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:
```java
public ExamList() { // instead of init()
	/* exams = new Exam[3];
	current = 0; */ 
  this(3); //Constructor Overload
}

public ExamList(int size) { //instance constructor
	exams = new Exam[size];
	current = 0;
}
```



## 02/01/2021
 Java Structured Programming (by [YouTube-newLecture](https://www.youtube.com/watch?v=tvciu9_jHjQ&list=PLq8wAnVUcTFV4ZjRbyGnw6T1tgmYDLM3P))

* How to name a function (ex. `genLotto()`, `printLotto()` - Camel case)
* Top-down programming (problem -> small problem -> function)
* **Method overriding** is used to provide the specific implementation of a method which is already provided by its superclass. 
* JVM 's memory structure (Method Area, Heap, Call Stack) (by [pridiot.tistory.com](https://pridiot.tistory.com/39?category=869931))



## 01/01/2021  
Java Classes and Objects (by [w3schools.com](https://www.w3schools.com/java/java_classes.asp))  
* Java `Interface `, `BufferedReader`, `readLine()`  
* The `final` keyword is useful when I want a variable to always store the same value, like PI (3.14159...)  
* A class must have a matching filename (`Main` and **Main.java**).  
* An `abstract` method belongs to an `abstract` class, and it does not have a body. The body is provided by the subclass(inherit from Main).  
 * To achieve security - hide certain details and only show the important details of an object.  
* **subclass** (child) - the class that inherits from another class  
* **superclass** (parent) - the class being inherited from  
* `interface` is a completely "**abstract class**" that is used to group related methods with empty bodies:  
* `enum` is a special "class" that represents a group of **constants** (unchangeable variables, like `final` variables).  
 * `enum` is short for "enumerations", which means "specifically listed".  
* `Iterator` is an object that can be used to loop through collections, like [ArrayList](https://www.w3schools.com/java/java_arraylist.asp) and [HashSet](https://www.w3schools.com/java/java_hashset.asp). It is called an "iterator" because "iterating" is the technical term for looping.  
* Java `Threads` allows a program to operate more efficiently by doing multiple things at the same time.  
  


## 30/12/2020  
* Build `ToDoList` (Create, Read, Update, Delete)  
* MVC Pattern stands for "Model-View-Controller" Pattern  
* How to use Git (by [opentutorials.org](https://opentutorials.org/course/3838))  

   * `add`, `commit`, `push`, `branch`  
   * make repository on GitHub
