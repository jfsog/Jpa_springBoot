package com.spikixi.jpa.specification;

import com.spikixi.jpa.Entidades.Author;
import org.springframework.data.jpa.domain.Specification;

public class AuthorSpecification {
    public static Specification<Author> hasAge(int age) {
        return (r, q, b) -> age < 0 ? null : b.equal(r.get("age"), age);
    }
    public static Specification<Author> firstNameLike(String firstName) {
        return (r, q, b) -> firstName == null ? null : b.like(r.get("firstName"), "%" + firstName + "%");
    }
}
