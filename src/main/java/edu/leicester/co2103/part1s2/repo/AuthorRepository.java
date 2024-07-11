package edu.leicester.co2103.part1s2.repo;

import edu.leicester.co2103.part1s2.domain.Author;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    List<Author>findAll();
}
