package pro.sky.java.course2.homework2_6;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
   // private static Employee [ ] allEmployee = new Employee[10];
    private static List <Employee> allEmployee=new ArrayList<>();
    //private  static int numbers;
    public  EmployeeService (){

        allEmployee.add(new Employee( "Frolova","Katya"));
        allEmployee.add( new Employee("Fisher","Katya"));
        allEmployee.add( new Employee("Fric","Katya"));
        allEmployee.add( new Employee("Flower","Katya"));
        allEmployee.add( new Employee("Feet","Katya"));
        allEmployee.add( new Employee("Ivanov", "Ivan"));
        //numbers=6;
    }

    public static List <Employee>  findAll(){
        return allEmployee;
    }

    public static Employee addEmployee(String firstName,String lastName) {
        Employee newEmployee = new Employee(lastName,firstName);
        if (firstName == null || lastName == null) {
            System.out.println("отсутсвует первый или второй параметр");
            return null;
//        } else if (numbers == allEmployee.length) {
//           throw new EmployeeStorageIsFullException("массив переполнен");
        } else if (allEmployee.contains(newEmployee)) {
            throw new EmployeeAlreadyAddedException("такой уже есть");
        } else {
            // for (int i = 0; i < allEmployee.size(); i++) {
            //    if (allEmployee.get(i) == null) {
            allEmployee.add(newEmployee);
            //numbers++;
            //     break;
            // }
        }
    //}
        return newEmployee;
    }
//    private static boolean check (String firstName,String lastName){
//        for (int i = 0; i < allEmployee.length; i++) {
//            if (allEmployee[i]!=null && allEmployee[i].getFirstName().equals(firstName) && allEmployee[i].getLastName().equals(lastName)) {
//                return true;
//            }
//        }
//        return false;
//    }

    public static Employee findEmployee (String firstName,String lastName){
        Employee findEmployee = new Employee(lastName,firstName);
        if(firstName == null || lastName == null) {
            System.out.println("отсутсвует первый и/или второй параметр");
            return null;
        }else if ( !allEmployee.contains(findEmployee)) {
            throw new EmployeeNotFoundException("сотрудник не найден");
        } else {
            //System.out.println(findEmployee);
            return  findEmployee;
        }
    }

    public static Employee removeEmployee(String firstName,String lastName){
        Employee removeEmployee = new Employee(lastName,firstName);
        if(firstName == null || lastName == null) {
            System.out.println("отсутсвует первый или второй параметр");
            return null;
        }else if (!allEmployee.contains(removeEmployee)) {
            throw new EmployeeNotFoundException("сотрудник не найден");
        } else {
           // for (int i = 0; i < allEmployee.size(); i++) {
            //    if (allEmployee.get(i).getFirstName().equals(firstName) && allEmployee.get(i).getLastName().equals(lastName)){
                    allEmployee.remove(removeEmployee);
                   // numbers--;
                   // break;
                }
    //}
            return  removeEmployee;
        }
    }


//}











