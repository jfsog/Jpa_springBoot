package com.spikixi.jpa.Entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@NamedQuery(
        name = "Author.findByNamedQuery", query = "select a from Author a where a.age>= :age"
)
@NamedQuery(
        name = "Author.updateByNamedQuery", query = "update Author a set a.age = :age"
)
public class Author extends BaseEntity {
    //    @Id
//    @GeneratedValue
//            (
//            strategy = GenerationType.TABLE,
//            generator = "author_id_gen"
//            generator = "author_sequecence"
//    )
//    @SequenceGenerator(
//            name = "author_sequecence",
//            sequenceName = "author_sequecence",
//            allocationSize = 1
//    )
//    @TableGenerator(
//            name = "author_id_gen",
//            table = "id_generator",
//            pkColumnName = "id_name",
//            valueColumnName = "id_value",
//            allocationSize = 1
//    )
//    private Integer id;
//    @Column(
//            name = "f_name",
//            length = 50
//    )
    private String firstName;
    private String lastName;
    @Column(
            unique = true, nullable = false
    )
    private String email;
    private Integer age;
    //    @Column(
//            updatable = false,
//            nullable = false
//    )
//    private LocalDateTime createdAt;
//    @Column(
//            insertable = false
//    )
//    private LocalDateTime lastModified;
    @ManyToMany(mappedBy = "authors", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Course> courses;
}
