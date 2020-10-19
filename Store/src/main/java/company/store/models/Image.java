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

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id", nullable = false)
    private Post post;

    //...
}
