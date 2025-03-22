package day10_training;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.LongFunction;
import java.util.function.Predicate;

/*
 * The list of functional interfaces defined in java.util.Function package.

Interface & Description

1
BiConsumer<T,U>
It is an operation that accepts two input arguments, and returns no result.

2
BiFunction<T,U,R>
It is a function that accepts two arguments and produces a result.

3
BinaryOperator<T>
Represents an operation upon two operands of the same type, producing a result of the same type as the operands.

4
BiPredicate<T,U>
Represents a predicate (Boolean-valued function) of two arguments.

5
BooleanSupplier
Represents a supplier of Boolean-valued results.

6
Consumer<T>
It is an operation that accepts a single input argument and returns no result.

7
DoubleBinaryOperator
Represents an operation upon two double-valued operands and producing a double-valued result.

8
DoubleConsumer
It is an operation that accepts a single double-valued argument and returns no result.

9
DoubleFunction<R>
Represents a function that accepts a double-valued argument and produces a result.

10
DoublePredicate
Represents a predicate (Boolean-valued function) of one double-valued argument.

11
DoubleSupplier
Represents a supplier of double-valued results.

12
DoubleToIntFunction
Represents a function that accepts a double-valued argument and produces an int-valued result.

13
DoubleToLongFunction
Represents a function that accepts a double-valued argument and produces a long-valued result.

14
DoubleUnaryOperator
Represents an operation on a single double-valued operand that produces a double-valued result.

15
Function<T,R>
Represents a function that accepts one argument and produces a result.

16
IntBinaryOperator
Represents an operation upon two int-valued operands and produces an int-valued result.

17
IntConsumer
Represents an operation that accepts a single int-valued argument and returns no result.

18
IntFunction<R>
Represents a function that accepts an int-valued argument and produces a result.

19
IntPredicate
Represents a predicate (Boolean-valued function) of one int-valued argument.

20
IntSupplier
Represents a supplier of int-valued results.

21
IntToDoubleFunction
Represents a function that accepts an int-valued argument and produces a double-valued result.

22
IntToLongFunction
Represents a function that accepts an int-valued argument and produces a long-valued result.

23
IntUnaryOperator
Represents an operation on a single int-valued operand that produces an int-valued result.

24
LongBinaryOperator
Represents an operation upon two long-valued operands and produces a long-valued result.

25
LongConsumer
Represents an operation that accepts a single long-valued argument and returns no result.

26
LongFunction<R>
Represents a function that accepts a long-valued argument and produces a result.

27
LongPredicate
Represents a predicate (Boolean-valued function) of one long-valued argument.

28
LongSupplier
Represents a supplier of long-valued results.

29
LongToDoubleFunction
Represents a function that accepts a long-valued argument and produces a double-valued result.

30
LongToIntFunction
Represents a function that accepts a long-valued argument and produces an int-valued result.

31
LongUnaryOperator
Represents an operation on a single long-valued operand that produces a long-valued result.

32
ObjDoubleConsumer<T>
Represents an operation that accepts an object-valued and a double-valued argument, and returns no result.

33
ObjIntConsumer<T>
Represents an operation that accepts an object-valued and an int-valued argument, and returns no result.

34
ObjLongConsumer<T>
Represents an operation that accepts an object-valued and a long-valued argument, and returns no result.

35
Predicate<T>
Represents a predicate (Boolean-valued function) of one argument.

36
Supplier<T>
Represents a supplier of results.

37
ToDoubleBiFunction<T,U>
It is a function that accepts two arguments and produces a double-valued result.

38
ToDoubleFunction<T>
It is a function that produces a double-valued result.

39
ToIntBiFunction<T,U>
It is a function that accepts two arguments and produces an int-valued result.

40
ToIntFunction<T>
It is a function that produces an int-valued result.

41
ToLongBiFunction<T,U>
It is a function that accepts two arguments and produces a long-valued result.

42
ToLongFunction<T>
It is a function that produces a long-valued result.

43
UnaryOperator<T>
It is an operation on a single operand that produces a result of the same type as its operand.


 */

public class BuiltInFunctionalInterfacesDemo
{
	  static Boolean checkAge(int age)
	  {  
	        if(age>17)  
	            return true;  
	        else 
	        	return false;  
	    }  
	  static void printMessage(String name){  
	        System.out.println("Hello "+name);  
	    }  
	    static void printValue(int val){  
	        System.out.println(val);  
	    }  
	public static void main(String[] args) 
	{
        LongFunction<Integer> longFuncObj1 = i1 -> (int) i1 * 10;
        LongFunction<Boolean> longFuncObj2 = i2 -> i2 > 12;
        
        System.out.println("Double of 5: " + longFuncObj1.apply(50L));
        System.out.println("Is number 2 smaller than 5?: " + longFuncObj2.apply(5L));

        // takes two Integers and return an Integer
        BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
        Integer result = func.apply(2, 3);
        System.out.println(result); // 5

        // take two Integers and return an Double
        BiFunction<Integer, Integer, Double> func2 = (x1, x2) -> Math.pow(x1, x2);
        Double result2 = func2.apply(2, 4);
        System.out.println(result2);    // 16.0

        // take two Integers and return a List<Integer>
        BiFunction<Integer, Integer, List<Integer>> func3 = (x1, x2) -> Arrays.asList(x1 + x2);
        List<Integer> result3 = func3.apply(2, 3);
        System.out.println(result3);
        
        DoubleConsumer squareGenerator = (num4) -> System.out.println(num4*num4);
        squareGenerator.accept(3L);
        
        Predicate<Integer> pr = a -> (a > 18); // Creating predicate  
        System.out.println(pr.test(10));    // Calling Predicate method    
	
     // Using Predicate interface(This function expect an input but produces a boolean value as an output. As it is a functional interface, it can be used assignment target for lambda expression or method //reference.)  
        Predicate<Integer> predicate =  BuiltInFunctionalInterfacesDemo::checkAge;  
        // Calling Predicate method  
        boolean result31 = predicate.test(25);  
        System.out.println(result31); 
        
        // Referring method to String type Consumer interface   
        Consumer<String> consumer1 = BuiltInFunctionalInterfacesDemo::printMessage;  
        consumer1.accept("Thananya");   // Calling Consumer method  
        // Referring method to Integer type Consumer interface  
        Consumer<Integer> consumer2 = BuiltInFunctionalInterfacesDemo::printValue;  
        consumer2.accept(12);   // Calling Consumer method  
        
        
	}
}
