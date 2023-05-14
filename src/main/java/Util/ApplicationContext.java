package Util;

import DataBase.DataBaseConnection;
import Repository.BookRepository;
import Repository.ConsumerRepository;
import Repository.ProducerRepository;
import Repository.ShoesRepository;
import Service.BookService;
import Service.ConsumerService;
import Service.ProducerService;
import Service.ShoesService;

public class ApplicationContext {
    private static BookRepository bookRepository;
    private static BookService bookService;
    private static ConsumerRepository consumerRepository;
    private static ConsumerService consumerService;
    private static ProducerRepository producerRepository;
    private static ProducerService producerService;
    private static ShoesRepository shoesRepository;
    private static ShoesService shoesService;

    private static BookRepository getBookRepository() {
        if (bookRepository == null) {
            bookRepository =
                    new BookRepository(
                            DataBaseConnection.getConnection()
                    );
        }
        return bookRepository;
    }

    public static BookService getBookService() {
        if (bookService == null) {
            bookService =
                    new BookService(getBookRepository());
        }
        return bookService;
    }

    private static ConsumerRepository getConsumerRepository() {
        if (consumerRepository == null) {
            consumerRepository =
                    new ConsumerRepository(
                            DataBaseConnection.getConnection()
                    );
        }
        return consumerRepository;
    }

    public static ConsumerService getConsumerService() {
        if (consumerService == null) {
            consumerService = new ConsumerService(
                    getConsumerRepository()
            );
        }
        return consumerService;
    }

    private static ProducerRepository getProducerRepository() {
        if (producerRepository == null) {
            producerRepository =
                    new ProducerRepository(
                            DataBaseConnection.getConnection()
                    );
        }
        return producerRepository;
    }

    public static ProducerService getProducerService() {
        if (producerService == null) {
            producerService =
                    new ProducerService(
                            getProducerRepository()
                    );
        }
        return producerService;
    }

    private static ShoesRepository getShoesRepository() {
        if (shoesRepository == null) {
            shoesRepository =
                    new ShoesRepository(
                            DataBaseConnection.getConnection()
                    );
        }
        return shoesRepository;
    }

    public static ShoesService getShoesService() {
        if (shoesService == null) {
            shoesService =
                    new ShoesService(
                            getShoesRepository()
                    );
        }
        return shoesService;
    }
}
