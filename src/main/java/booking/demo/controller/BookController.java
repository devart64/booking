package booking.demo.controller;

import booking.demo.dao.BookRepository;
import booking.demo.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(value = "/books")
    public String index(Model model) {
        List<Book> books = bookRepository.findAll();
        model.addAttribute("listBooks", books);
        return "books";
    }
}
