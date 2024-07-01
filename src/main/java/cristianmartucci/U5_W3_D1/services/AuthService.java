package cristianmartucci.U5_W3_D1.services;

import cristianmartucci.U5_W3_D1.entities.Employee;
import cristianmartucci.U5_W3_D1.payloads.employees.EmployeeDTO;
import cristianmartucci.U5_W3_D1.payloads.logins.EmployeeLoginDTO;
import cristianmartucci.U5_W3_D1.security.JWTTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private JWTTools jwtTools;

    @Autowired
    private EmployeeService employeeService;

    public String authGenerateToken(EmployeeLoginDTO employeeLoginDTO){
        Employee employee = this.employeeService.findByEmail(employeeLoginDTO.email());

    }
}
