package se.systementor.supershoppen1.shop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Arrays;
import java.util.List;


@Entity
public class UserAccount {
    private String email;
    private String password;
    private String rolesCsv;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    public UserAccount() {
        super();
    }

    public UserAccount(String email, String password, String rolesCsv) {
        super();
        this.email = email;
        this.password = password;
        this.rolesCsv = rolesCsv;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getEmail()
    {
        return email;
    }
    public String getPassword()
    {
        return password;
    }

    public String getRolesCsv()
    {
        return rolesCsv;
    }

    public void SetRolesCsv(String value)
    {
        rolesCsv = value;
    }


    public List<String> getRoles() 
    {
        String[] elements = rolesCsv.split(","); // step two : convert String array to list of String
        return Arrays.asList(elements);
    }
  
}
