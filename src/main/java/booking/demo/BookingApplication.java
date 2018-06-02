package booking.demo;

import booking.demo.dao.BookRepository;
import booking.demo.entities.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BookingApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(BookingApplication.class, args);
		BookRepository bookRepository = applicationContext.getBean(BookRepository.class);
		bookRepository.save(new Book(null,"toto","stephen","1987","english",123,300,10.50,"elias"));
		bookRepository.save(new Book(null,"tata","stephen","1987","english",1234,300,10.50,"elias"));
		bookRepository.save(new Book(null,"tonton","stephen","1987","english",12345,300,10.50,"elias"));
		bookRepository.save(new Book(null,"quiqui","stephen","1987","english",123456,300,10.50,"elias"));

	bookRepository.findAll().forEach(p->System.out.println(p.getTitle()));
	}
}
