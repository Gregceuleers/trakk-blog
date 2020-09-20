package be.trakk.blog.entities;

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
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idUser;

    @Column(nullable = false)
    String firstname;

    @Column(nullable = false)
    String lastname;

    @Column(nullable = false, columnDefinition = "DATETIME(6)")
    Instant birthday;

    @Column(nullable = false)
    String email;

    @Column()
    @CreationTimestamp
    Instant created;

    @Column()
    @UpdateTimestamp
    Instant modified;

    @Column(columnDefinition = "TEXT")
    String avatar;

    @Column()
    Boolean active;

    // Associations

}
