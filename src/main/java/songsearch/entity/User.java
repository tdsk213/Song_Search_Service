package songsearch.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Getter
@Setter
public class User {

    @Id
    @SequenceGenerator(name = "user_id_seq_generator",
            sequenceName = "user_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "user_id_seq_generator")
    private Integer id;

    private String email;

    private String name;

    @CreationTimestamp
    private Instant createdAt;

    public User() { }

    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }
}
