package company.store.models;

import javax.persistence.*;

@Entity
@Table(name = "Images", schema = "Store")
public class Image {
    @Id
    @Column(name = "id")
    private int id;

    @Lob
    @Column(name = "image", columnDefinition="BLOB")
    private byte[] image;
    //(insertable = false, updatable = false), it's not the responsibility of the Image entity to create or update a post.
    // (nullable), Post always not null
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id",insertable = false, updatable = false, nullable = false)
    private Post post;


//...
}
