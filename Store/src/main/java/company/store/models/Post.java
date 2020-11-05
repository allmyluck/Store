package company.store.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "posts", schema = "Store")
public class Post {
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
    @Column(name = "dateTime")
    private java.util.Date dateTime;

    @OneToMany(fetch = FetchType.LAZY ,mappedBy = "post")
    private Set<Image> images;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id",insertable = false, updatable = false, nullable = false)
    private User user;

    //...
}
