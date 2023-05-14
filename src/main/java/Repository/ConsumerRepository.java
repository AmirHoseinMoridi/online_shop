package Repository;

import Base.Repository.Impl.BaseUserRepositoryImpl;
import Entity.Consumer;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class ConsumerRepository extends BaseUserRepositoryImpl<Consumer> {

    public ConsumerRepository(Connection connection) {
        super(connection);
    }

    @Override
    protected List<String> getInsertColumnNames() {
        List<String> columnNames = super.getInsertColumnNames();
        columnNames.add(Consumer.DATE_OF_LOG_IN);
        return columnNames;
    }

    @Override
    protected void fillPrepStatementForSave(PreparedStatement preparedStatement, Consumer consumer) throws SQLException {
        super.fillPrepStatementForSave(preparedStatement, consumer);
        preparedStatement.setDate(7, (Date) consumer.getDateOfLogIn());
    }
}
