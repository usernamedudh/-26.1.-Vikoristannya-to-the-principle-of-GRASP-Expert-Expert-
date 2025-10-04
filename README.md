
# Simple GRASP Expert Demo

This is a small Java Maven project demonstrating the GRASP "Expert" principle.

## Description
The project implements a minimal example where the responsibility for storing and providing a user's address belongs to the `User` class (the Expert). The `Address` class holds address data, and `Main` demonstrates creating a `User`, assigning an `Address`, and printing it.

## What was implemented
- Class `User` with a private `Address` field, `setAddress()` and `getAddress()` methods.
- Class `Address` with basic address fields and `toString()` for readable output.
- Class `Main` that creates `User` and `Address`, sets the address on the user, and prints it.

## Project structure
- `src/main/java/org/example/app/Main.java`  
- `src/main/java/org/example/app/User.java`  
- `src/main/java/org/example/app/Address.java`

## Build and run
Build the project:
```
mvn compile
```
Run (using the Maven Exec plugin or run the main class directly):
```
mvn exec:java -Dexec.mainClass="org.example.app.Main"
```
or after packaging:
```
mvn package
java -cp target/<artifact>-<version>.jar org.example.app.Main
```

## Purpose
A concise educational example showing how to assign responsibilities to the class that is the expert on the required information.
