package company.store.models;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Users", schema = "Store")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "role_id")
    private int role_id;

    @Column(name = "name")
    private String name; // 256

    @Column(name = "code_country")
    private String codeCountry; // 10

    @Column(name = "number")
    private String number; // 15

    @OneToMany(mappedBy = "user")
    private Set<Post> posts;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id",insertable = false, updatable = false, nullable = false)
    private Role role;

    //...
}
