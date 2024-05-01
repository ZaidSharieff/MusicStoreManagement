package com.zaid.musicstoremanagement.services;

import com.zaid.musicstoremanagement.dtos.EmployeePatchRequest;
import com.zaid.musicstoremanagement.models.Department;
import com.zaid.musicstoremanagement.models.Employee;
import com.zaid.musicstoremanagement.models.Role;
import com.zaid.musicstoremanagement.repositories.DepartmentRepository;
import com.zaid.musicstoremanagement.repositories.EmployeeRepository;
import com.zaid.musicstoremanagement.repositories.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("EmployeeService")
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;
    private final RoleRepository roleRepository;

    public EmployeeService(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository, RoleRepository roleRepository)
    {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
        this.roleRepository = roleRepository;
    }

    public Employee createEmployee(Employee employee)
    {
        Department department = employee.getDepartment();
        Department existingDepartment = departmentRepository.findByName(department.getName());
        if (existingDepartment == null)
        {
            existingDepartment = departmentRepository.save(department);
        }
        employee.setDepartment(existingDepartment);

        Role role = employee.getRole();
        Role existingRole = roleRepository.findByName(role.getName());
        if (existingRole == null)
        {
            existingRole = roleRepository.save(role);
        }
        employee.setRole(existingRole);

        return employeeRepository.save(employee);
    }

    public Employee getEmployeeById(Long id)
    {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        if (employeeOptional.isEmpty()) {
            //throw exception
        }

        return employeeOptional.get();
    }

    public Employee replaceEmployee(Long id, Employee employee)
    {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if (optionalEmployee.isEmpty())
        {
            //throw exception
        }
        Employee existingEmployee = optionalEmployee.get();
        existingEmployee.setName(employee.getName());

        Department department = employee.getDepartment();
        Department existingDepartment = departmentRepository.findByName(department.getName());
        if (existingDepartment == null)
        {
            existingDepartment = departmentRepository.save(department);
        }
        existingEmployee.setDepartment(existingDepartment);

        Role role = employee.getRole();
        Role existingRole = roleRepository.findByName(role.getName());
        if (existingRole == null)
        {
            existingRole = roleRepository.save(role);
        }
        existingEmployee.setRole(existingRole);

        existingEmployee.setEmail(employee.getEmail());

        return employeeRepository.save(existingEmployee);
    }

    public Employee updateEmployee(Long id, EmployeePatchRequest patchRequest)
    {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if (optionalEmployee.isEmpty())
        {
            //throw exception
        }

        Employee existingEmployee = optionalEmployee.get();
        if (patchRequest.getName() != null) {
            existingEmployee.setName(patchRequest.getName());
        }
        if (patchRequest.getEmail() != null) {
            existingEmployee.setEmail(patchRequest.getEmail());
        }

        return employeeRepository.save(existingEmployee);
    }


    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
