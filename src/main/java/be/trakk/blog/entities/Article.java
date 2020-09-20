package be.trakk.blog.entities;

import be.trakk.blog.models.enumeration.Tag;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "blog_user")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idArticle;

    @Column(nullable = false)
    String title;

    @Column(nullable = false)
    String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    Tag tag;

    @Column()
    @CreationTimestamp
    Instant created;

    @Column()
    @UpdateTimestamp
    Instant modified;

    // Associations

}
