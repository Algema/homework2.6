package pro.sky.java.course2.homework2_6;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST,reason = "переполнен")

public class EmployeeStorageIsFullException extends RuntimeException{
    public EmployeeStorageIsFullException(String message) {
        super(message);
    }
    // переполнен
}

