package diosecurity.security;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

public class JWTObject {
    private String subject; //nome de usuario
    private Date issuedAt; //data de criação do token
    private Date expiration; //data de expiração do token
    private List<String> roles; //perfis de acesso

    //getters n setters

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public Date getIssuedAt() {
        return issuedAt;
    }
    public void setIssuedAt(Date issuedAt) {
        this.issuedAt = issuedAt;
    }
    public Date getExpiration() {
        return expiration;
    }
    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }
    public List<String> getRoles() {
        return roles;
    }
    public void setRoles(String... roles) {
        this.roles = Arrays.asList(roles);
    }

    
    
}
