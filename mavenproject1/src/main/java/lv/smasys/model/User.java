package lv.smasys.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable {

//Student Id number
    @Id
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;
    
    @Column(name = "enabled" ,columnDefinition="tinyint(1) default 1")
    private boolean enabled;


    public User() {
       
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        
    }
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
