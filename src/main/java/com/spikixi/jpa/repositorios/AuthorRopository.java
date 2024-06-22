package com.spikixi.jpa.repositorios;

import com.spikixi.jpa.Entidades.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthorRopository extends JpaRepository<Author, Integer>, JpaSpecificationExecutor<Author> {
    List<Author> findByNamedQuery(@Param("age") int age);
    List<Author> findAllByFirstName(String firstName);
    List<Author> findAllByFirstNameIgnoreCase(String firstName);
    List<Author> findAllByFirstNameContainingIgnoreCase(String firstName);
    List<Author> findAllByFirstNameStartsWithIgnoreCase(String firstName);
    List<Author> findAllByFirstNameEndsWithIgnoreCase(String firstName);
    List<Author> findAllByFirstNameInIgnoreCase(List<String> firstNames);
    @Modifying
    @Transactional
    @Query("update Author a set a.age = :age where a.id = :id")
    void updateAuthor(int age, int id);
    @Modifying
    @Transactional
    @Query("update Author a set a.age = :age")
    void updateAllAuthorsAges(int age);
    @Modifying
    @Transactional
    void updateByNamedQuery(@Param("age") int age);
}
