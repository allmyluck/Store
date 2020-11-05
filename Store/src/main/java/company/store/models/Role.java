package company.store.models;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "roles", schema = "Store")
public class Role implements GrantedAuthority {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "user_id")
    private int user_id;

    @Column(name = "role_name")
    private String role_name;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id",insertable = false, updatable = false, nullable = false)
    private User user;

    @Override
    public String getAuthority() {
        return role_name;
    }
}
