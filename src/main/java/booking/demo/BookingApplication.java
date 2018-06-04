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
		bookRepository.save(new Book(null,"tata","stephen","1987","http://ekladata.com/V3CrUYtMpL4pYfvoQGX_df8Nq4A.png","english",1234,300,10.50,"elias"));
		bookRepository.save(new Book(null,"tonton","stephen","1987","http://blog.lesoir.be/jour-apres-jour/2008/09/18/m%E2%80%99enfin-gaston-lagaffe-s%E2%80%99anime/","english",12345,300,10.50,"elias"));
		bookRepository.save(new Book(null,"quiqui","stephen","1987","http://lemontageenimage.centerblog.net/600-Gaston-Lagaffe-Salut","english",123456,300,10.50,"elias"));

	bookRepository.findAll().forEach(p->System.out.println(p.getTitle()));

	}
}
