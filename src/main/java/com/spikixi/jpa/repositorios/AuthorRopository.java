package com.spikixi.jpa.repositorios;

import com.spikixi.jpa.Entidades.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRopository extends JpaRepository<Author,Integer> {
}
