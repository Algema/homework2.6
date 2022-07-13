package pro.sky.java.course2.homework2_6;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus (value = HttpStatus.FOUND , reason = "уже есть такой сотрудник")
public class EmployeeAlreadyAddedException extends RuntimeException{

    public EmployeeAlreadyAddedException(String message) {
        super(message);
    }
    //уже есть такой сотрудник
}
