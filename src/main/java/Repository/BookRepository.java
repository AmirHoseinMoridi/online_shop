package Repository;

import Base.Repository.Impl.BaseSalableRepositoryImpl;
import Entity.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class BookRepository extends BaseSalableRepositoryImpl<Book> {

    public BookRepository(Connection connection) {
        super(connection);
    }

    @Override
    protected List<String> getInsertColumnNames() {
        List<String> columnNames = super.getInsertColumnNames();
        columnNames.add(Book.AUTHOR);
        return columnNames;
    }

    @Override
    protected void fillPrepStatementForSave(PreparedStatement preparedStatement, Book book) throws SQLException {
        super.fillPrepStatementForSave(preparedStatement, book);
        preparedStatement.setString(3,book.getAuthor());
    }
}
