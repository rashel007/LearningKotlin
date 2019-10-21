# Learning Kotlin 

## Key Points in step by step 



#### 1. What is Kotlin

> Kotlin is a cross-platform, [statically typed](https://www.youtube.com/watch?v=8aWvIwtnK4Q) general-purpose programming language with [type interface](https://medium.com/jay-tillu/type-inference-in-kotlin-how-things-exactly-works-behind-the-scenes-8d20730876a0).
Kotlin is designed to interoperate fully with Java, and the JVM version of its standard library depends on the Java Class Library, but [type interface](https://medium.com/jay-tillu/type-inference-in-kotlin-how-things-exactly-works-behind-the-scenes-8d20730876a0) allows its syntax to be more concise. Kotlin Mainly targets the JVM , but also compiles to JavaScript
or native code (via LLVM).

> Kotlin is sponsored by JetBrains and Google through the kotlin foundation. Kotlin is officially supported by google for mobile development on Android. Since the release fo Android Studio 3.0 in 2017, Kotlin is included as an alternative to the standard Java compiler.
Kotlin has been Google's preferred language for Android app development since 2019.   


## Lets Learn Kotlin Language

#### Variables


In Kotlin variables are declared with var or val. var is mutable , that means we can change the value any time. And val is immutable
, means we cannot not change the declared value. For Example


```kotlin
 var personName = "Person Name"
 personName = "Another Person Name"
 
 val placeName = "Place Name"
 // We cannot change placeName
```

Notice that we did not declare data type while creating variables. That's because kotlin type interface automatically detect the type by the declared value.
Here personName and placeName will be String type. But if we want we can declare variable type. For Example

```kotlin
var personName: String = "Person Name"
val placeName: String = "Place Name"
```

If we just want to declare a variable and letter asign a value, then we must have to add the variable data type. For Example

```kotlin
var personName: String
personName = "Person Name"
```

##### Data Type

1. Byte - 8 bit
2. Short - 16 bit
3. Int - 32 bit
4. Long - 64 bit
5. Float - 32 bit
6. Double - 64 bit

```kotlin
val myByte: Byte = 10
val mySHort: Short = 125
val myLong: Long = 100L // L is used to specify long value
val myDouble: Double = 100.50

// we can also use underscore in numeric values
val hundredThousand = 100_000 // this will print 100000
val oneMillion = 1_000_000 // this will print 1000000 

```

##### Arrays

In Kotlin we declare array like this

```kotlin
val myNumberArray = arrayOf(1,2,3,4)
val myStringArray = arrayOf("Cat", "Dog", "Cow")
```
Also we can use intArrayOf(), doubleArrayOf(), charArrayOf(). 


##### Type Conversions

> Unlike Java, kotlin doesn't support implicit conversion from smaller type to longer type. For example Int cannot be assigned to Long or Double. 
```kotlin
var myInt = 100
var myLong: Long = myInt // Compile Error
```

> However, Every number type contains helper funtions that can to used to explicitly convert one type to another


* toByte()
* toShort()
* toInt()
* toLong()
* toFloat() 

Example: 

```kotlin
var myInt = 100
var myLong: Long = myInt.toLong() 
var myString: String = myInt.toString()
```
######  [Implicit vs Explicit](https://www.quora.com/What-is-meant-by-implicit-and-explicit-in-programming)



##### Control Flow

###### IF Statement
```kotlin
var n = 34
if(n % 2 == 0){
    println("$n is even")
}

// this curly braces if optional if if statement contains a single line
if(n % 2 == 0) println("$n is even")

```

###### If as an Expression

In kotlin we ca use as an expression instead of statement. For Example

```kotlin
val a = 32
val b = 53

val max = if (a > b) a else b

// also we can use if else block bodies

val max2 = if (a > b) {
    println("$a is greater then $b")
    a
}else {
    println("$b is greater then $a")
    b
}

```

We have to use else when we are using if as an expression .

In Java we are familiar with switch statement. In kotlin switch statement is known as when statement.
For Example

```kotlin
val value = 20

when(value) {
    20 -> println("value is 20")
    else -> println("value is not 20")
}

// another example

var dayOfweek = 6

when(dayOfweek){
     2, 3, 4, 5, 6 -> println("Working day")
     6, 1 -> println("Week Day")
     else -> println("Invalid Day")
}

```
// range operation

```kotlin
var rangeValue = 5

when(rangeValue) {
   in 1..7 -> printLn("Got number in range")
   !in 15..20 -> println("Number not in 15 and 20")
   else -> println("None of the above")
}

```


Checking weather a variable is certain type

```kotlin
    var x : Any = 6.45
    
    when(x) {
        is Int -> println("$x is integer")
        is String -> println("$x is String")
        !is Double -> println("$x is not Double")
        else -> println("None Of the above")
    }
```


when as if , else-if example

```kotlin
var number = 20
when{
      number < 0 -> println("Number is Less then 0")
      number % 2 == 0 -> println("Number is Even")
      number < 50 -> println("Number is less then 50")
    }

```

while and do-while loop

```kotlin
    var x = 1
    while (x <=5){
        println("$x")
        x++
    }
    
    // do-while loop is similar as while except it test the condition at the end of the loop
    do {
        println("$x")
        x++
    }while (x <= 5)
    
```

for loop

```kotlin
// Iterating through a range

for(value in 1..10){
    print("$value ")
}


// Iteration through an array

val myArray = intArrayOf(2,3,4,5,6)

for(number in myArray){
    print("$number ")
}

```
 > Every array in kotlin has a property called indices (indices is plural from index) which returns a range of valid indices of the array
 . We can iterate over the indices of the array and retrieve each array element using its index
 
 
 ```kotlin
 
 var primeNumbers = intArrayOf(2, 3, 4, 7 ,11)
 
 for(index in primeNumbers.indices) {
    println("At ${index+1} value is : ${primeNumbers[index]}")
 }
 
 ```


##### Nullable Type And Null Safety in kotlin

> I call it my billion-dollar mistake. It was the invention of the null reference in 1965. At that time, I was designing the first comprehensive type system for references in an object oriented language (ALGOL W). My goal was to ensure that all use of references should be absolutely safe, with checking performed automatically by the compiler.
But I couldn’t resist the temptation to put in a null reference, simply because it was so easy to implement. This has led to innumerable errors, vulnerabilities, and system crashes, which have probably caused a billion dollars of pain and damage in the last forty years.
-Sir Tony Hoare, The inventor of null reference

In Kotlin the compiler detect nullpointexception at compile time. All variables in kotlin are by default non-nullable. 
So the below code will throw error ar compilation time

```kotlin
    var gretting: String = "Hello World"
    gretting = null // compilation error
    
    // to allow null values we have to do it like this
    
    var gretting: String? = "Hello World"
    gretting = null
```
Adding a null check

```kotlin
val nullableName: String? = "Rashel"

if(nullableName != null){
    
}else {
    
}

// also we can do this
nullableName?.toUpperCase()

// this is same as
if(nullableName != null){
    // print name
}else
    null
    
// So we will get null if variable is null

``` 


To perform an operation only if the value is not null , we can do like this

```kotlin
    var nullableName: String? = null
    nullableName?.let {
        //print name
     }
```

Alos we want to declare default or other value if the variable is null, we can use Elvis operator ( ?: )

```kotlin
    var nullableName: String? = null
    val name = nullableName ?: "Rashel" // this will assign default name Rashel
```


##### Function

using vararg in function parameter 

```kotlin
    fun myVarargExample(vararg values:Int ): Int {
        var sum = 0
        
        for(value in values){
            sum = sum + value
        }
        
        return value
    }
    
    // we can call this function like this
    
    myVarargExample(2,3,4,5) // this will return 14
    
    // but if we have a variable of type array then we have to pass it like this
    var myArray = intArrayOf(2,3,4,5)
    
    myVarArgExample(*myArray) // this will print 14
```

In koltin we can have nested function . Nested function can use top lavel function variables

```kotlin

    fun myNestedFunctionExample( num1: Int,  num2: Int): Int{
    
        if(num1 <= 1){
            throw IllegalArgumentException("Value 1 cant be less then or equal to 0")
        }
        
        if(num2 <= 0){
            throw IllegalArgumentException("Value 2 cant be less then or equal to 0")
        }
        
        fun calculate() {
            val agv: Int = (num1 + num2) /2
            return avg
        }
        
        return calculate()
        
    }
    
```

##### infix function in kotlin

Before learning infix function we should know extention function . An extion function is a member funtion of a class that is defined outside of a class
Althrough it is a member funtion , it cannot access the private members. For example

```kotlin
    // lets first create a calss
    class Hero {
        var power: String = ""
    }
    
    
    // now from our main function we can add extention function like this
    
    fun main() {
        val myHero = Helo()
        myHero.setPower("Jump Hight")
        myHero.showPower()
        
    }
    
    fun Hero.setPower(p: String){
        power = p
    }
    
    fun Hero.showPower() {
        println(power)
    }
```


infix funtion imporves readability of code. To Create an infix funtion the function should be

1. A member function or an extention function only. So it should be part of a class
2. It can take only one parameter. It cannot take 0 parameter. 

SO the syntex for infix function is

#### object functionname parameter

So we can chnage the extention function of our hero class like this. 

```kotlin
infix fun Hero.setPower(p : String){
    power = p
}

// and call from main function like this

myHero setPower "New Power"
 
 ```



##### Class and Constructor 

In Kotlin every secondary constructor must call the primary constructor,  either directly or indirectly via another 
secondary constructor

```kotlin

class MyFirstClass(var firstName: String, var lastName: String) {

    var age: Int? = null

    var phoneNumber: String? = null


    constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {
        this.age = if (age > 0) age else throw IllegalArgumentException("Age must be greater then 0")
    }

    constructor(firstName: String, lastName: String, age: Int, phoneNumber: String) : this(firstName, lastName, age) {
        this.phoneNumber =
            if (phoneNumber != null) phoneNumber else throw IllegalArgumentException("Provide Phone NUmber")
    }
}


fun main() {
    var myClass = MyFirstClass("EA", "Rashel")
    var myClass2 = MyFirstClass("EA", "Rashel", 20)
    var myClass3 = MyFirstClass("EA", "Rashel", 20, "0179900...")
}

```


## References
1. [Callicoder](https://www.callicoder.com/categories/kotlin/)
2. [Coding In Flow](https://www.youtube.com/playlist?list=PLrnPJCHvNZuAIbejjZA1kGfLeA8ZpICB2)
3. [Kotlinlang](https://kotlinlang.org/docs/reference/)