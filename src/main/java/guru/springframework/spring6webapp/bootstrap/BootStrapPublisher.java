package guru.springframework.spring6webapp.bootstrap;

import guru.springframework.spring6webapp.domain.Publisher;
import guru.springframework.spring6webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapPublisher implements CommandLineRunner {

    private final PublisherRepository publisherRepository;

    public BootStrapPublisher(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher amazon = new Publisher();
        amazon.setPublisherName("Amazon");
        amazon.setAddress("Amazon Address");
        amazon.setCity("Amazon City");
        amazon.setState("Amazon State");
        amazon.setZip("Amazon Zip");

        Publisher amazonSaved = publisherRepository.save(amazon);

        System.out.println("Started in Bootstrap Publisher");
        System.out.println("Publisher Count: " + publisherRepository.count());

    }
}
