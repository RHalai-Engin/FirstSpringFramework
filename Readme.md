Spring framework - version 6 and above | Spring boot 3 | Java 17
Previously --> Spring 5 | Spring boot 2 | Java 8
Spring boot --> opiniated framework which works on top another framework

If the project is created without spring boot and only using spring framework,
then it is called a spring standable project. (That means we won't get features
of spring boot which necessary in today's world)

Spring boot provides functions like:
1. Auto configuration 
2. TomCat as a server
3. Dependency version resolver

Spring framework provides functions like:
1. IOC -> Inversion of control
   when we provide the control of a Beans/Objects to the framework, it is called
    Inversion of Control
2. DI -> Dependency Injection

Lifecycle of Object/Bean
Creation of Object/Bean -> Control of Object -> Finalize / Garbage collection
--> Init and destroy (BEFORE AND AFTER) methods are part of Bean/Object life cycle

# Before and after method
After Method - This method is executed right after object/bean creation
Before method - This method is executed right before garbage collection/object deletion
// We have annotation available in java for after and before methods

# Scope of a Bean
Default scope of a Bean is Singleton
There are four types of scopes of a bean
1. Singleton
2. Request
3. Prototype - Everytime we ask, this scope is going to give you a different bean/object reference
4. Session

# SPEL -> Spring Expressional Language
FLAT FILE(IN XML) -> Any file that's not encrypted is FLAT file
Example of SPEL in xml as shown below
Declare a variable in class, for eg= Interger id;
XML appropriate TAG, SYNTAX OF SPEL = #{whatever logic you would like apply as given example}
<constructor-arg name="id" value="#{new java.util.Random().nextInt()*1000}"></constructor-arg>
