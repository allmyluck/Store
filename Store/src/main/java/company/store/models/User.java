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

    @OneToMany(mappedBy = "user")
    private Set<Post> posts;

    @OneToMany(mappedBy = "user")
    private Set<Role> roles;
    //...
}
