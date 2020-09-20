package be.trakk.blog.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "comment")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idComment;

    @Column(nullable = false)
    String subject;

    @Column()
    @CreationTimestamp
    Instant created;

    @Column()
    @UpdateTimestamp
    Instant modified;

    // Associations
}
