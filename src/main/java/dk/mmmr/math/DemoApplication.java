package dk.mmmr.math;

import dk.mmmr.math.util.FileUtility;
import dk.mmmr.math.util.Stopwatch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(DemoApplication.class, args);

        FileUtility fileUtility = new FileUtility();
        String[] stringArr = fileUtility.toStringArray("data/shakespeare-complete-works.txt","[^A-Za-z']+");
        System.out.println(stringArr.length);
       

    }

}
