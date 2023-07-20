package sample.java.project;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

public class HelloWorld {

    public static void main(final String[] args) {
        System.out.println("Hello World");
        testMethod();
    }
    public static void testMethod(){
          System.out.println("Test Method");
    }

}
