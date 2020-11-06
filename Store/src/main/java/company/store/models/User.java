package company.store.models;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users", schema = "Store")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int user_id;

    @Column(name = "name")
    private String name; // 256

    @Column(name = "password")
    private String password; // 30

    @Column(name = "code_country")
    private String codeCountry; // 10

    @Column(name = "number")
    private String number; // 15

    @Column(name = "role_name")
    private String role_name;

    @OneToMany(mappedBy = "user")
    private Set<Post> posts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }
//...

}
