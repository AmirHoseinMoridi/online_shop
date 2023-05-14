package Service;

import Base.Entity.BaseSalable;
import Base.Repository.BaseSalableRepository;
import Base.Repository.Impl.BaseSalableRepositoryImpl;
import Base.Service.Impl.BaseSalableServiceImpl;
import Entity.Book;
import Repository.BookRepository;

import java.sql.Connection;

public class BookService
        extends BaseSalableServiceImpl<Book, BookRepository> {


    public BookService(BookRepository repository) {
        super(repository);
    }
}
