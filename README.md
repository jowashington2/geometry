Geometry Project

Overview

This project implements a Java application for managing 2D and 3D geometric shapes. It demonstrates key principles of object-oriented programming, including abstraction, inheritance, and encapsulation. The application also includes a custom LinkedList class for storing shapes and a REPL (Read-Eval-Print Loop) interface for user interaction.

Features

Shape Classes:

2D Shapes: Rectangle, Circle, Triangle (inherit from Geometry2D)

3D Shapes: Sphere, Triangular Prism (inherit from Geometry3D)

LinkedList Implementation:

Dynamic storage for 2D and 3D shapes.

Methods to add, remove, find, and display shapes.

REPL Interface:

Provides an interactive console for users to manage shapes.

Supports adding, removing, finding, and printing shapes.

Extensible Design:

Easily add new shapes with minimal changes.

Class Design

Abstract Classes:

Geometry2D for all 2D shapes with an abstract getArea() method.

Geometry3D for all 3D shapes with an abstract getVolume() method.

Derived Classes:

Rectangle, Circle, Triangle (2D)

Sphere, Triangular Prism (3D)

LinkedList Class:

Custom implementation to manage geometric shapes dynamically.

Use Cases

Educational Tool: Demonstrates object-oriented programming principles in Java.

Geometry Software: Useful for area and volume calculations.

Prototype Tool: Serves as a foundation for graphical or simulation-based applications.
