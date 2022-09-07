package com.example.SeptJavaSpring.jpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("saveEmployee")
    public String saveEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Employee saved...";
    }

    @GetMapping("getEmployee/{id}")
    public Employee getEmpById(@PathVariable(value = "id" )Integer id){
        return employeeRepository.getById(id);

    }

    @GetMapping("getEmployeeOpt/{id}")
    public Optional<Employee> getEmpByIdOpt(@PathVariable(value = "id")Integer id){
        return employeeRepository.findById(id);
    }
    @GetMapping("getEmpByIdAndName")
    public Employee getEmpByIdAndName(@RequestParam("id")Integer id,
                                      @RequestParam("name")String name){
        return employeeRepository.findByIdAndName(id,name);
    }

    @GetMapping("getEmpByIdOrName")
    public List<Employee> getEmpByIdOrName(@RequestParam("id")Integer id,
                                           @RequestParam("name")String name){
        return employeeRepository.findByIdOrName(id,name);
    }

    @GetMapping("getNameStartingWith")
    public List<Employee> getNameStartingWith(@RequestParam("name")String name){
        return employeeRepository.findByNameStartingWith(name);
    }

    @GetMapping("getNameEndingWith")
    public List<Employee> getNameEndingWith(@RequestParam("name")String name){
        return employeeRepository.findByNameEndingWith(name);
    }

    @PutMapping("updateEmployee")
    public String updateEmployee(@RequestBody Employee employee){

        Employee obj = employeeRepository.getById(employee.getId());
        obj.setAddress(employee.getAddress());
        obj.setName(employee.getName());
        employeeRepository.save(obj);
        return "updated...";
    }
//    @DeleteMapping("deleteEmployee/{id}")
//    public String deleteEmployee(@PathVariable(value="id") Integer id){
//
//        Employee obj = employeeRepository.getById(id);
//        employeeRepository.delete(obj);
//        return "deleted employee "+obj.getId();
//    }

    @DeleteMapping("deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable(value="id") Integer id){
        employeeRepository.deleteById(id);
        return "deleted employee ";
    }
}
