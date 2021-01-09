# Today I Learned  

## 09/01/2021

### 1. Abstract vs Interface

| Abstract class                                               | Interface                                                    |
| :----------------------------------------------------------- | :----------------------------------------------------------- |
| 1) Abstract class can **have abstract and non-abstract** methods. | Interface can have **only abstract** methods. Since Java 8, it can have **default and static methods** also. |
| 2) Abstract class **doesn't support multiple inheritance**.  | Interface **supports multiple inheritance**.                 |
| 3) Abstract class **can have final, non-final, static and non-static variables**. | Interface has **only static and final variables**.           |
| 4) Abstract class **can provide the implementation of interface**. | Interface **can't provide the implementation of abstract class**. |
| 5) The **abstract keyword** is used to declare abstract class. | The **interface keyword** is used to declare interface.      |
| 6) An **abstract class** can extend another Java class and implement multiple Java interfaces. | An **interface** can extend another Java interface only.     |
| 7) An **abstract class** can be extended using keyword "extends". | An **interface** can be implemented using keyword "implements". |
| 8) A Java **abstract class** can have class members like private, protected, etc. | Members of a Java interface are public by default.           |
| 9)**Example:** public abstract class Shape{ public abstract void draw(); } | **Example:** public interface Drawable{ void draw(); }       |

### 2. Try-with-resource

![image-20210109021520109](/Users/jeongminhyeong/Library/Application Support/typora-user-images/image-20210109021520109.png)

Before code																		After code

* Advantages : makes the code concise, short, clear

### 



## 08/01/2021

### 1.TDD(Test Driven Development) : 테스트 주도적 개발
```java
import junit.framework.TestCase;

public class SubDateTest extends TestCase {
    public static void main(String[] args) {
        junit.textui.TestRunner.run(SubDateTest.class);
    }
    public void test1() {
        ...
    }
}
```

* You need to extends `TestCase` from `junit.framework.TestCase`

  * `assertEquals(a, b)` - Investigate whether 'a' and 'b' are the `same`.
  * `assertTrue(a)` - Investigate whether 'a' is `true`.
  * `assertFalse(a)` - Investigate whether 'a' is `false`.

  

* More assert examples

  * `assertArrayEquals(a,b)` - Compare the values of arrays a and b
  * `assertEquals(a,b)` - Compare the values of objects a and b
  * `assertSame(a,b)` - Verify that objects a and b are the same objects.
  * `assertTrue(a)` - Verify that a is true
  * `assertNotNull(a)` - Confirm that object a is not null

### 2. Business Logic

* In computer [software](https://en.wikipedia.org/wiki/Software), **business logic** or **domain logic** is the part of the program that encodes the real-world [business rules](https://en.wikipedia.org/wiki/Business_rule) that determine how data can be [created, stored, and changed](https://en.wikipedia.org/wiki/Create,_read,_update_and_delete). It is contrasted with the remainder of the software that might be concerned with lower-level details of managing a [database](https://en.wikipedia.org/wiki/Database) or displaying the [user interface](https://en.wikipedia.org/wiki/User_interface), system infrastructure, or generally connecting various parts of the program.

* There is an opposite word. It is a User Interface




## 06/01/2021

### 1. How to Install "IntelliJ IDEA Ultimate"

* Student account authentication
* Information about `themes`, `fonts`
* How to set JDK, fix error from Eclipse

### 2. Java Collections Framework - `HashMap`, `Set` (by [YouTube-남궁성의 정석코딩](https://www.youtube.com/watch?v=RscGmop2Bzo&list=PLW2UjW795-f6xWA2_MUhEVgPauhGl3xIp&index=119))

* A `HashMap`  store items in "**key**/**value**" pairs, and you can access them by an index of another type (e.g. a `String`).
* A `HashSet` is a collection of items where every item is unique, and it is found in the `java.util` package:

```java
// Create a HashSet object called numbers
HashSet<Integer> numbers = new HashSet<Integer>();

// Add values to the set
numbers.add(4);
numbers.add(7);
numbers.add(8);

// Show which numbers between 1 and 10 are in the set
for(int i = 1; i <= 10; i++) {
  if(numbers.contains(i)) {
    System.out.println(i + " was found in the set.");
  } else {
    System.out.println(i + " was not found in the set.");
  }
}
```

### 3. Enumeration is the old version of Iterator

### 4. Comparator and Comparable

* **Comparable** and **comparator** both are an interface that can be used to sort the elements of the collection. 
* **Comparator** interface belongs to `java.util package` while **Comparable** belongs to` java.lang package`.
*  **Comparator** interface sort collection using two objects provided to it, whereas **Comparable** interface compares" this" refers to the one objects provided to it. 

| Sr. No. |       Key        |                          Comparable                          |                          Comparator                          |
| ------- | :--------------: | :----------------------------------------------------------: | :----------------------------------------------------------: |
| 1       |     Methods      |  The comparable interface has a method compareTo(Object a )  |  The comparator has a method compare(Object o1, Object O2)   |
| 2       |   Sorting uses   | `Collection.sort`(List) method can be used to sort the collection of Comparable type objects. | `Collection.sort`(List, Comparator) method can be used to sort the collection of Comparator type objects. |
| 3       | Sorting sequence |         Comparable provides single sorting sequence.         |     The comparator provides a multiple sorting sequence.     |
| 4       |     Package      |     Comparable interface belongs to `java.lang package`.     |     Comparator interface belongs to `java.util package`.     |

### 5. Java Collections Framework - TreeSet 

Advantages: range search (from~to, sort)

Disadvantages: Time-consuming to add and delete

* **TreeSet** is one of the most important implementations of the [SortedSet interface](https://www.geeksforgeeks.org/sortedset-java-examples/) in Java that uses a [Tree](https://www.geeksforgeeks.org/binary-tree-data-structure/) for storage. 
* The ordering of the elements is maintained by a set using their natural ordering whether or not an explicit [comparator](https://www.geeksforgeeks.org/comparator-interface-java/) is provided. 
* This must be consistent with equals if it is to correctly implement the [Set interface](https://www.geeksforgeeks.org/set-in-java/). 
* It can also be ordered by a Comparator provided at set creation time, depending on which constructor is used. 



## 03/01/2021
### Java Object-Oriented Programming, OOP (by [YouTube-newLecture](https://www.youtube.com/watch?v=yGBmRdgc1Ic&list=PLq8wAnVUcTFV4ZjRbyGnw6T1tgmYDLM3P&index=54))

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
### Java Structured Programming (by [YouTube-newLecture](https://www.youtube.com/watch?v=tvciu9_jHjQ&list=PLq8wAnVUcTFV4ZjRbyGnw6T1tgmYDLM3P))

* How to name a function (ex. `genLotto()`, `printLotto()` - Camel case)
* Top-down programming (problem -> small problem -> function)
* **Method overriding** is used to provide the specific implementation of a method which is already provided by its superclass. 
* JVM 's memory structure (Method Area, Heap, Call Stack) (by [pridiot.tistory.com](https://pridiot.tistory.com/39?category=869931))



## 01/01/2021  
### Java Classes and Objects (by [w3schools.com](https://www.w3schools.com/java/java_classes.asp))  

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
