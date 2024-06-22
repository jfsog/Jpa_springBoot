package com.spikixi.jpa.repositorios;

import com.spikixi.jpa.Entidades.Author;
import jakarta.persistence.Basic;
import jakarta.persistence.FetchType;
import org.hibernate.annotations.Fetch;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRopository extends JpaRepository<Author,Integer> {
    List<Author>  findAllByFirstName(String firstName);
    List<Author>  findAllByFirstNameIgnoreCase(String firstName);
    List<Author>  findAllByFirstNameContainingIgnoreCase(String firstName);
    List<Author>  findAllByFirstNameStartsWithIgnoreCase(String firstName);
    List<Author>  findAllByFirstNameEndsWithIgnoreCase(String firstName);
    List<Author>  findAllByFirstNameInIgnoreCase(List<String> firstNames);
}
