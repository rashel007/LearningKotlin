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
 






## References
1. [Callicoder](https://www.callicoder.com/kotlin-variables-data-types/)
2. [Coding In Flow](https://www.youtube.com/playlist?list=PLrnPJCHvNZuAIbejjZA1kGfLeA8ZpICB2)
3. [Kotlinlang](https://kotlinlang.org/docs/reference/)