package com.spikixi.jpa;

import com.spikixi.jpa.Entidades.Author;
import com.spikixi.jpa.repositorios.AuthorRopository;
import com.spikixi.jpa.repositorios.VideoRepository;
import com.spikixi.jpa.specification.AuthorSpecification;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.domain.Specification;

@SpringBootApplication
public class JpaApplication {
    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(AuthorRopository repository, VideoRepository videoRepository) {
        return args -> {
//            for (int i = 0; i < 50; i++) {
//                var fk = new Faker();
//                var author = Author.builder()
//                                   .firstName(fk.name().firstName())
//                                   .lastName(fk.name().lastName())
//                                   .age(fk.number().numberBetween(18, 80))
//                                   .email(fk.name().username() + i + "@gmail.com")
//                                   .createdAt(LocalDateTime.now())
//                                   .lastModifiedAt(LocalDateTime.now())
//                                   .build();
//                repository.save(author);
//            }
//            repository.updateAuthor(-1,50);
//            repository.updateallAuthorsAges(101);
//            repository.findByid(1).
//            var author = Author.builder()
//                               .id(1)
//                               .firstName("Felipe")
//                               .lastName("Souza")
//                               .age(25)
//                               .email("teste@gmail.com")
//                               .createdAt(LocalDateTime.now())
//                               .lastModifiedAt(LocalDateTime.now())
//                               .build();
//            repository.save(author);
//            repository.findByNamedQuery(60).forEach(System.out::println);
//            repository.updateByNamedQuery(12);
            Specification<Author> spec = Specification.where(AuthorSpecification.hasAge(53))
                                                      .or(AuthorSpecification.firstNameLike("Ro"));
            repository.findAll(spec).forEach(System.out::println);
        };
    }
}
