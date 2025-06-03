package Activities;

//CustomException.java
public class CustomExceptions extends Exception {
 private String message;

 // Constructor that initializes the message
 public CustomExceptions(String message) {
     this.message = message;
 }

 // Override getMessage() to return the custom message
 @Override
 public String getMessage() {
     return message;
 }
}
