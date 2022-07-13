package pro.sky.java.course2.homework2_6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {              // http://localhost:8080/employee/add?firstName=Ivan&lastName=Ivanov
  private final  EmployeeService employeeService;

  public EmployeeController(EmployeeService employeeService){
      this.employeeService=employeeService;
  }

    @GetMapping(path = "/add")
    public Employee add (@RequestParam (value = "firstName",required = false) String userName,
                         @RequestParam (value = "lastName",required = false) String userSurname){
        return EmployeeService.addEmployee(userName,userSurname);
    }

    @GetMapping(path = "/find")
    public Employee find  (@RequestParam ("firstName") String userName,
                           @RequestParam ("lastName") String userSurname){
        return EmployeeService.findEmployee(userName,userSurname);
    }

    @GetMapping(path = "/remove")
    public Employee remove (@RequestParam ("firstName") String userName,
                            @RequestParam ("lastName") String userSurname){
        return EmployeeService.removeEmployee(userName,userSurname);
   }

    @GetMapping(path = "/findall")
    public List<Employee> findAll (){
        return EmployeeService.findAll();
}
}



























