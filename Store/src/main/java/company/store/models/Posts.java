package company.store.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Posts", schema = "Store")
public class Posts {
    @Column(name = "user_id")
    private int userId;

    @Column(name = "title")
    private String title; // 256


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private int imageId;


    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private int price;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datetime")
    private String dateTime;

    @OneToMany(fetch = FetchType.LAZY ,mappedBy = "Posts")
    private Set<Images> images;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "image_id", nullable = false)
    private Users user;

    //...
}
