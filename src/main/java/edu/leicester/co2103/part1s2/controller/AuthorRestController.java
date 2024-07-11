package edu.leicester.co2103.part1s2.controller;


import edu.leicester.co2103.part1s2.domain.Author;
import edu.leicester.co2103.part1s2.repo.AuthorRepository;
import edu.leicester.co2103.part1s2.repo.BookRepository;
import edu.leicester.co2103.part1s2.repo.ErrorInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/authors")
public class AuthorRestController {

    private final AuthorRepository authorRepo;

    private final BookRepository bookRepo;

    public AuthorRestController(AuthorRepository authorRepo, BookRepository bookRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
    }

    // The list of Authors
    @GetMapping
    public ResponseEntity<?> endpoint1() {
        List<Author> result = authorRepo.findAll();
        if (result.isEmpty()) {
            return new ResponseEntity<>(new ErrorInfo("No authors found"),HttpStatus.NOT_FOUND); // Return HTTP 404 if the author does not exist
        }
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    //To create a specific author
    @PostMapping
    public ResponseEntity<?> endpoint2(@RequestBody Author author) {
        if (authorRepo.existsById(author.getId())) {
            return new ResponseEntity<>(new ErrorInfo("Author " + author.getId() + " already exists"), HttpStatus.CONFLICT); // Return HTTP 409 if the author the same is created twice
        }
        authorRepo.save(author);
        return new ResponseEntity<>(author, HttpStatus.OK);
    }


    //Find and retrieve a specific author from the List
    @GetMapping("/{id}")
    public ResponseEntity<?> endpoint3(@PathVariable("id") long id) {
        if (authorRepo.findById(id).isPresent()) {
            return new ResponseEntity<>(authorRepo.findById(id).get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(new ErrorInfo("Author not found"), HttpStatus.NOT_FOUND); // Return HTTP 404 if the author does not exist

    }

    //To Update a certain Author
    @PutMapping("/{id}")
    public ResponseEntity<?> endpoint4(@PathVariable("id") long id, @RequestBody Author newAuthor) {
        if (authorRepo.findById(id).isPresent()) {
            Author existingAuthor = authorRepo.findById(id).get();
            existingAuthor.setName(newAuthor.getName());
            existingAuthor.setBirthyear(newAuthor.getBirthyear());
            existingAuthor.setNationality(newAuthor.getNationality());
            existingAuthor.getBooks().clear();
            existingAuthor.getBooks().addAll(newAuthor.getBooks());
            authorRepo.save(existingAuthor);
            return new ResponseEntity<>(existingAuthor, HttpStatus.OK);
        }
        return new ResponseEntity<>(new ErrorInfo("Author not updated"), HttpStatus.NOT_FOUND);
    }

    //Delete Specific Author
    @DeleteMapping("/{id}")
    public ResponseEntity<?> endpoint5(@PathVariable("id") long id) {
        if (authorRepo.existsById(id)) {
            authorRepo.deleteById(id);  // This line actually performs the deletion
            return new ResponseEntity<>(new ErrorInfo("Author deleted"),HttpStatus.OK);  // Return HTTP 200 if successful
        }
        return new ResponseEntity<>(new ErrorInfo("Author not deleted"), HttpStatus.NOT_FOUND);  // Return HTTP 404 if the author does not exist
    }

    //The List All Books Written By a Specific Author
    @GetMapping("/{id}/books")
    public ResponseEntity<?> endpoint6(@PathVariable("id") long id) {
        if (authorRepo.findById(id).isPresent()) {
            return new ResponseEntity<>(authorRepo.findById(id).get().getBooks(), HttpStatus.OK);
        }
        return new ResponseEntity<>(new ErrorInfo("Books by this author not found"),HttpStatus.NOT_FOUND);
    }
}
