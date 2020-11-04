package company.store.models;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Roles", schema = "Store")
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "role_name")
    private String role_name;

    @OneToMany(mappedBy = "role")
    private Set<User> users;

    @Override
    public String getAuthority() {
        return role_name;
    }
}
