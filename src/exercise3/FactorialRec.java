package exercise3;

// Exercise 3.1
//public class FactorialRec {
//  public static void main(String[] args) { // Frame for reading a value
//    if (args.length > 0) {      // from the command line
//      FactorialIter f = new FactorialIter(Integer.parseInt(args[0]));
//    } else {
//      System.out.println("use syntax: java FactorialRec n");
//    }
//  }
//
//  public FactorialRec(long n) { // Printing out the result
//    System.out.println(n + "! = " + factorial(n));
//  }
//
//  private long factorial(long n) { // recursive algorithm
//    if (n == 1) return 1;
//    else
//      return n * factorial(n - 1);
//  }
//}


// Exercise 3.2 => Validity checks
//public class FactorialRec {
//  public static void main(String[] args) { // Frame for reading a value
//    // Size validation check
//    if (args.length == 1) {            // from the command line
//      // Range check
//      if (Integer.parseInt(args[0]) < 0) {
//        System.out.println("Negative number is not accepted");
//      }
//      // Range check
//      else if (Integer.parseInt(args[0]) > 12) {
//        System.out.println("The factorial number should be not greater than 12");
//      } else {
//        FactorialRec f = new FactorialRec(Integer.parseInt(args[0]));
//      }
//    } else {
//      System.out.println("Introduce only one argument");
//    }
//  }
//
//  public FactorialRec(int n) { // Printing out the result
//    System.out.println(n + "! = " + factorial(n));
//  }
//
//  private int factorial(int n) { // recursive algorithm
//    if (n == 1) return 1;
//    else return n * factorial(n - 1);
//  }
//}


// Exercise 3.3
//public class FactorialRec {
//  public static void main(String[] args) throws NumberOutOfRangeException, TooManyArgumentsException {
//
//    int number;
//    // Validity check
//    try {
//      number = Integer.parseInt(args[0]);
//    } catch (Exception e) {
//      throw new NumberFormatException(e.getMessage());
//    }
//
//    // Size validation checks
//    if (args.length != 1) {
//      throw new TooManyArgumentsException("Argument should be only one digit");
//    }
//
//    // Range Check
//    if (number < 0 || number > 12) {
//      throw new NumberOutOfRangeException("Input number from 0 to 12");
//    } else {
//      FactorialRec f = new FactorialRec(number);
//    }
//  }
//
//  public FactorialRec(int n) { // Printing out the result
//    System.out.println(n + "! = " + factorial(n));
//  }
//
//  private int factorial(int n) { // recursive algorithm
//    if (n == 1) return 1;
//    else {
//      return n * factorial(n - 1);
//    }
//  }
//}


// Example 3.3
//public class FactorialRec {
//  public static void main(String[] args) { // Frame for reading a value
//    // String Exception
//    try {
//      // Size check
//      if (args.length == 1) {            // from the command line
//        // Range check
//        if (Integer.parseInt(args[0]) < 0) {
//          throw new IllegalArgumentException("Parameter must be a non-negative number");
//        }
//        // Range check
//        else if (Integer.parseInt(args[0]) > 12) {
//          throw new IllegalArgumentException("Number greater than 12 is not acceptable");
//        } else {
//          FactorialRec f = new FactorialRec(Integer.parseInt(args[0]));
//        }
//      } else {
//        System.out.println("Supply only one argument");
//      }
//    } catch (Exception exception) {
//      System.out.println("Argument must be a numeric value");
//    }
//  }
//
//  public FactorialRec(int n) { // Printing out the result
//    System.out.println(n + "! = " + factorial(n));
//  }
//
//  private int factorial(int n) { // recursive algorithm
//    if (n == 1) return 1;
//    else {
//      return n * factorial(n - 1);
//    }
//  }
//}


// Exercise 3.3 - Adjusted
//public class FactorialRec {
//  public static void main(String[] args) {
//    try {
//      int number;
//      // Validity check
//      try {
//        number = Integer.parseInt(args[0]);
//      } catch (Exception e) {
//        throw new NumberFormatException(e.getMessage());
//      }
//
//      // Size validation checks
//      if (args.length != 1) {
//        System.out.println("Argument should be only one digit.");
//        return;
//      }
//
//      // Range Check
//      if (number < 0) {
//        throw new IllegalArgumentException("Parameter must be a non-negative number");
//      } else if (number > 12) {
//        throw new IllegalArgumentException("Number greater than 12 is not acceptable");
//      } else {
//        FactorialRec f = new FactorialRec(number);
//      }
//    } catch (Exception e) {
//      System.out.println(e.getMessage());
//    }
//
//  }
//
//  public FactorialRec(int n) { // Printing out the result
//    System.out.println(n + "! = " + factorial(n));
//  }
//
//  private int factorial(int n) { // recursive algorithm
//    if (n == 1) return 1;
//    else {
//      return n * factorial(n - 1);
//    }
//  }
//}


// Exercise 3.4
//public class FactorialRec {
//  public static void main(String[] args) {
//    try {
//      long number;
//      // Validity check
//      try {
//        number = Integer.parseInt(args[0]);
//      } catch (Exception e) {
//        throw new NumberFormatException(e.getMessage());
//      }
//
//      // Size validation checks
//      if (args.length != 1) {
//        System.out.println("Argument should be only one digit.");
//        return;
//      }
//
//      // Range Check
//      if (number < 0) {
//        throw new IllegalArgumentException("Parameter must be a non-negative number");
//      } else if (number > 20) {
//        throw new IllegalArgumentException("Number greater than 20 is not acceptable");
//      } else {
//        FactorialRec f = new FactorialRec(number);
//      }
//    } catch (Exception e) {
//      System.out.println(e.getMessage());
//    }
//
//  }
//
//  public FactorialRec(long n) { // Printing out the result
//    System.out.println(n + "! = " + factorial(n));
//  }
//
//  private long factorial(long n) { // recursive algorithm
//    if (n == 1) return 1;
//    else {
//      return n * factorial(n - 1);
//    }
//  }
//}


// Exercise 3.5
//public class FactorialRec {
//  public static void main(String[] args) {
//
//    final long LOWER_BOUND = 0;
//    final long UPPER_BOUND = 20;
//
//    try {
//      long number;
//      // Validity check
//      try {
//        number = Integer.parseInt(args[0]);
//      } catch (Exception e) {
//        throw new NumberFormatException(e.getMessage());
//      }
//
//      // Size validation checks
//      if (args.length != 1) {
//        System.out.println("Argument should be only one digit.");
//        return;
//      }
//
//      // Range Check
//      if (number < LOWER_BOUND) {
//        throw new IllegalArgumentException("Parameter must be a non-negative number");
//      } else if (UPPER_BOUND > 20) {
//        throw new IllegalArgumentException("Number greater than 20 is not acceptable");
//      } else {
//        FactorialRec f = new FactorialRec(number);
//      }
//    } catch (Exception e) {
//      System.out.println(e.getMessage());
//    }
//
//  }
//
//  public FactorialRec(long n) { // Printing out the result
//    System.out.println(n + "! = " + factorial(n));
//  }
//
//  private long factorial(long n) { // recursive algorithm
//    if (n == 1) return 1;
//    else {
//      return n * factorial(n - 1);
//    }
//  }
//}


// Exercise 3.3 - Exception Handling
//public class FactorialRec {
//  public static void main(String[] args) {
//    try {
//      FactorialExample f = new FactorialExample(args);
//    } catch (Exception e) {
//      System.out.println(e.getMessage());
//    }
//  }
//
//  public FactorialRec(String[] input) throws TooManyArgumentsException, NotANumberException, NumberOutOfRangeException, EmptyInputException {
//    int number;
//    // Size Validation Check
//    if (input.length == 0) {
//      throw new EmptyInputException("You should provide one argument");
//    } else if (input.length > 1) {
//      throw new TooManyArgumentsException("Argument should be only one digit");
//    } else {
//      try {
//        number = Integer.parseInt(input[0]);
//      } catch (Exception exception) {
//        throw new NotANumberException("Argument must be a numeric value");
//      }
//      // Range Check
//      if (number < 0 || number > 12) {
//        throw new NumberOutOfRangeException("Input number from 0 to 12");
//      } else {
//        System.out.println(number + "! = " + factorial(number));
//      }
//    }
//  }
//
//
//  private int factorial(int n) { // recursive algorithm
//    if (n == 1) return 1;
//    else {
//      return n * factorial(n - 1);
//    }
//  }
//}

// Exercise 3.4 - Extending the calculation range
//public class FactorialRec {
//  public static void main(String[] args) {
//    try {
//      FactorialRec f = new FactorialRec(args);
//    } catch (Exception e) {
//      System.out.println(e.getMessage());
//    }
//  }
//
//  public FactorialRec(String[] input) throws ManyArgumentsException, NotANumberException, NumberOutOfRangeException, EmptyInputException {
//    long number;
//    // Size Validation Check
//    if (input.length == 0) {
//      throw new EmptyInputException("You should provide one argument");
//    } else if (input.length > 1) {
//      throw new ManyArgumentsException("Argument should be only one digit");
//    } else {
//      try {
//        number = Integer.parseInt(input[0]);
//      } catch (Exception exception) {
//        throw new NotANumberException("Argument must be a numeric value");
//      }
//      // Range Check
//      if (number < 0) {
//        throw new NumberOutOfRangeException("Parameter must be a non-negative number");
//      }
//      // Range Check
//      if (number > 20) {
//        throw new NumberOutOfRangeException("Number greater than 20 is not acceptable");
//      } else {
//        System.out.println(number + "! = " + factorial(number));
//      }
//    }
//  }
//
//
//  private long factorial(long n) { // recursive algorithm
//    if (n == 1) return 1;
//    else {
//      return n * factorial(n - 1);
//    }
//  }
//}

//==================================================================================
//==================================================================================
//==================================================================================
// Final Version


// Exercise 3.1 - Analysis of algorithms, simple test
//public class FactorialRec {
//  public static void main(String[] args) { // Frame for reading a value
//    if (args.length > 0) {      // from the command line
//      FactorialRec f = new FactorialRec(Integer.parseInt(args[0]));
//    } else
//      System.out.println("use syntax: java FactorialRec n");
//  }
//
//  public FactorialRec(int n) { // Printing out the result
//    System.out.println(n + "! = " + factorial(n));
//  }
//
//  private int factorial(int n) { // recursive algorithm
//    if (n == 1) return 1;
//    else
//      return n * factorial(n - 1);
//  }
//}

// Exercise 3.2 - Validity Checks
//public class FactorialRec {
//  public static void main(String[] args) { // Frame for reading a value
//    // Check number of arguments
//    if (args.length == 1) {
//      // Regular expression to check if number is negative and
//      if (String.valueOf(args[0].matches("[0-9]+")) == "false") {
//        System.out.println("The argument should be a positive number");
//        return;
//      }
//
//      if (Integer.parseInt(args[0]) < 0) {
//        System.out.println("Parameter must be a non-negative number");
//      }
//      // Range check => if number is greater than 12
//      else if (Integer.parseInt(args[0]) > 12) {
//        System.out.println("The factorial number should be not greater than 12");
//      } else {
//        FactorialRec f = new FactorialRec(Integer.parseInt(args[0]));
//
//        FactorialRec f1 = new FactorialRec(1);
//        FactorialRec f2 = new FactorialRec(10);
//        FactorialRec f3 = new FactorialRec(21);
//        System.out.println(f1);
//        System.out.println(f2);
//        System.out.println(f3);
//
//      }
//    } else {
//      System.out.println("Introduce only one argument");
//    }
//  }
//
//  public FactorialRec(int n) { // Printing out the result
//    System.out.println(n + "! = " + factorial(n));
//  }
//
//  private int factorial(int n) { // recursive algorithm
//    if (n == 1) return 1;
//    else return n * factorial(n - 1);
//  }
//}


// Exercise 3.3 - Exception Handling
//public class FactorialRec {
//  public static void main(String[] args) {
//    try {
//      FactorialRec f = new FactorialRec(args);
//    } catch (Exception e) {
//      System.out.println(e.getMessage());
//    }
//  }
//
//  public FactorialRec(String[] input) throws ManyArgumentsException, NotNumberException, NumberOutOfRangeException, EmptyInputException {
//    int number;
//    // Size Validation Check
//    if (input.length == 0) {
//      throw new EmptyInputException("You should introduce one argument");
//    } else if (input.length > 1) {
//      throw new ManyArgumentsException("Too many arguments given. Please introduce only one argument.");
//    } else {
//      try {
//        number = Integer.parseInt(input[0]);
//      } catch (Exception exception) {
//        throw new NotNumberException("Argument must be a numeric value");
//      }
//      // Range Check
//      if (number < 0) {
//        throw new NumberOutOfRangeException("Argument must be a non-negative number");
//      }
//      // Range Check
//      if (number > 12) {
//        throw new NumberOutOfRangeException("Argument must be a number less or equal to 12");
//      } else {
//        System.out.println(number + "! = " + factorial(number));
//      }
//    }
//  }
//
//
//  private int factorial(int n) { // recursive algorithm
//    if (n == 1) return 1;
//    else {
//      return n * factorial(n - 1);
//    }
//  }
//}


// Exercise 3.4 - Extending the calculation range by using a different result type
//public class FactorialRec {
//  public static void main(String[] args) {
//    try {
//      FactorialRec f = new FactorialRec(args);
//    } catch (Exception e) {
//      System.out.println(e.getMessage());
//    }
//  }
//
//  public FactorialRec(String[] input) throws ManyArgumentsException, NotNumberException, NumberOutOfRangeException, EmptyInputException {
//    long number;
//    // Size Validation Check
//    if (input.length == 0) {
//      throw new EmptyInputException("You should provide one argument");
//    } else if (input.length > 1) {
//      throw new ManyArgumentsException("Too many arguments given. Please introduce only one argument");
//    } else {
//      try {
//        number = Integer.parseInt(input[0]);
//      } catch (Exception exception) {
//        throw new NotNumberException("Argument must be a numeric value");
//      }
//      // Range Check
//      if (number < 0) {
//        throw new NumberOutOfRangeException("Argument must be a non-negative number");
//      }
//      // Range Check
//      if (number > 20) {
//        throw new NumberOutOfRangeException("Argument must be a number less or equal to 20");
//      } else {
//        System.out.println(number + "! = " + factorial(number));
//      }
//    }
//  }
//
//
//  private long factorial(long n) { // recursive algorithm
//    if (n == 1) return 1;
//    else {
//      return n * factorial(n - 1);
//    }
//  }
//}


import exercise3.exceptions.EmptyInputException;
import exercise3.exceptions.ManyArgumentsException;
import exercise3.exceptions.NotNumberException;
import exercise3.exceptions.NumberOutOfRangeException;

// Exercise 3.5 - Using symbolic constants
public class FactorialRec {
  final static long UPPER_BOUND = 20;

  public static void main(String[] args) {
    try {
      FactorialRec f = new FactorialRec(args);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public FactorialRec(String[] input) throws ManyArgumentsException, NotNumberException, NumberOutOfRangeException, EmptyInputException {
    long number;
    // Size Validation Check
    if (input.length == 0) {
      throw new EmptyInputException("You should provide one argument");
    } else if (input.length > 1) {
      throw new ManyArgumentsException("Argument should be only one digit");
    } else {
      try {
        number = Integer.parseInt(input[0]);
      } catch (Exception exception) {
        throw new NotNumberException("Argument must be a numeric value");
      }
      // Range Check
      if (number < 0) {
        throw new NumberOutOfRangeException("Parameter must be a non-negative number");
      }
      // Range Check
      if (number > UPPER_BOUND) {
        throw new NumberOutOfRangeException("Parameter must be a number less or equal to " + UPPER_BOUND);
      } else {
        System.out.println(number + "! = " + factorial(number));
      }
    }
  }


  private long factorial(long n) { // recursive algorithm
    if (n == 1) return 1;
    else {
      return n * factorial(n - 1);
    }
  }
}

