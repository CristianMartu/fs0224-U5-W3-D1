package cristianmartucci.U5_W3_D1.controllers;

import cristianmartucci.U5_W3_D1.payloads.logins.EmployeeLoginDTO;
import cristianmartucci.U5_W3_D1.payloads.logins.EmployeeLoginResponseDTO;
import cristianmartucci.U5_W3_D1.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public EmployeeLoginResponseDTO login(@RequestBody EmployeeLoginDTO employeeLoginDTO){
        return new EmployeeLoginResponseDTO(this.authService.authGenerateToken(employeeLoginDTO));
    }
}
