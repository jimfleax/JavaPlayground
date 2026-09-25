# Arrays in Java

Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

## Declare an Array
To declare an array, define the variable type with square brackets:
```java
String[] cars;
```

## Initialize an Array
You can initialize it by placing values in a comma-separated list, inside curly braces:
```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
int[] myNum = {10, 20, 30, 40};
```

## Access the Elements of an Array
You can access an array element by referring to the index number. Array indexes start with `0`.
```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]); // Outputs Volvo
```

## Change an Array Element
To change the value of a specific element, refer to the index number:
```java
cars[0] = "Opel";
```

## Array Length
To find out how many elements an array has, use the `length` property:
```java
System.out.println(cars.length); // Outputs 4
```

## Loop Through an Array
You can loop through the array elements with the `for` loop, and use the `length` property to specify how many times the loop should run.
```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (int i = 0; i < cars.length; i++) {
  System.out.println(cars[i]);
}
```
