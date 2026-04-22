# Java-Vehicule-Management

## Overview
An academic project demonstrating the core principles of Object-Oriented Programming (OOP) in Java. The system manages different types of vehicles and simulates real-time consumption tracking using concurrent programming

## Key Technical Concepts
 **Inheritance & Polymorphism**: Implementation of an abstract `Vehicule` class with specialized `Voiture` and `Moto` subclasses
 **Multithreading**: Use of the `Runnable` interface to simulate parallel real-time tracking of multiple vehicles via Threads.
 **Exception Handling**: Creation of custom exceptions (`VitesseInvalideException`) to ensure robust data validation.
 **Collections & Sorting**: Efficient data management using the `ArrayList` API and the `Comparable` interface to sort vehicles by performance.

## Project Structure
- `Vehicule.java`: Abstract base class defining the core attributes and methods.
- `Moto.java` & `Voiture.java`: Specialized subclasses implementing specific behaviors.
- `SuiviVehicule.java`: Logic for multithreaded simulation and tracking.
- `VitesseInvalideException.java`: Custom error handling for business logic validation.
- `Test.java`: Main entry point to run the simulation and display results.

