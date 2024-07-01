package cristianmartucci.U5_W3_D1.security;


import cristianmartucci.U5_W3_D1.entities.Employee;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JWTTools {
    @Value("${jwt.secret}")
    private String secret;

    public String createToken(Employee employee){
        return Jwts.builder()
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24 * 20))
                .subject(String.valueOf(employee.getEmployeeId()))
                .signWith(Keys.hmacShaKeyFor(secret.getBytes()))
                .compact();
    }
}
