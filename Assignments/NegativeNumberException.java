package Assignments;
    public class NegativeNumberException extends Exception {
        // Constructor with no parameters
        public NegativeNumberException() {
            super("Negative Number Not Allowed!");
        }

        // Constructor with a single parameter of type String
        public NegativeNumberException(String message) {
            super(message);
        }
    }

