package com.spikixi.jpa;

import com.spikixi.jpa.Entidades.Resources.Video;
import com.spikixi.jpa.repositorios.AuthorRopository;
import com.spikixi.jpa.repositorios.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {
    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(AuthorRopository repository, VideoRepository videoRepository) {
        return args -> {
            /*var a = Author.builder()
                          .firstName("kixi")
                          .lastName("moto")
                          .age(25)
                          .email("teste@email.com")
                          .createdAt(LocalDateTime.now())
                          .lastModifiedAt(LocalDateTime.now())
                          .build();
            repository.save(a);*/
            var video = Video.builder()
                             .name("Abc")
                             .length(1234)
                             .build();
            videoRepository.save(video);
        };
    }
}
