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


In Kotlin variables are declared with var or val. var is mutable , that means we can chnage the value any time. And val is immutable
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
