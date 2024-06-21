package com.spikixi.jpa.Entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "AUTHOR_TBL")
public class Author {
    @Id
    @GeneratedValue
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
    private Integer id;
    @Column(
            name = "f_name",
            length = 50
    )
    private String fristName;
    private String lastName;
    @Column(
            unique = true,
            nullable = false
    )
    private String email;
    private Integer age;
    @Column(
            updatable = false,
            nullable = false
    )
    private LocalDateTime createdAt;
    @Column(
            nullable = false,
            insertable = false
    )
    private LocalDateTime lastModified;
}
