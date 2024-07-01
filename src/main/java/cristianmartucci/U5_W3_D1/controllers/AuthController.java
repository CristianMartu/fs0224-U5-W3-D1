package cristianmartucci.U5_W3_D1.controllers;

import cristianmartucci.U5_W3_D1.payloads.logins.EmployeeLoginDTO;
import cristianmartucci.U5_W3_D1.payloads.logins.EmployeeLoginResponseDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @PostMapping("/login")
    public EmployeeLoginResponseDTO login(@RequestBody EmployeeLoginDTO employeeLoginDTO){
        return new EmployeeLoginResponseDTO()
    }
}
