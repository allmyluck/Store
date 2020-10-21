package company.store.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Roles", schema = "Store")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "role_name")
    private String role_name;

    @OneToMany(mappedBy = "Roles")
    private Set<User> users;
}
