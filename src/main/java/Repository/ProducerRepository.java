package Repository;

import Base.Repository.Impl.BaseUserRepositoryImpl;
import Entity.Producer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ProducerRepository extends BaseUserRepositoryImpl<Producer> {

    public ProducerRepository(Connection connection) {
        super(connection);
    }
    @Override
    protected List<String> getInsertColumnNames() {
        List<String> columnNames = super.getInsertColumnNames();
        columnNames.add(Producer.PRODUCER_RANK);
        return columnNames;
    }

    @Override
    protected void fillPrepStatementForSave(PreparedStatement preparedStatement, Producer producer) throws SQLException {
       super.fillPrepStatementForSave(preparedStatement, producer);
        preparedStatement.setString(7,producer.getProducerRank().name());
    }

}
