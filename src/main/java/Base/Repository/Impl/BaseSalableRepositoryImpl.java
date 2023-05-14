package Base.Repository.Impl;

import Base.Entity.BaseSalable;
import Base.Repository.BaseSalableRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BaseSalableRepositoryImpl<T extends BaseSalable>
        extends BaseRepositoryImpl<T,Long>
        implements BaseSalableRepository<T>{



    public BaseSalableRepositoryImpl(Connection connection) {
        super(connection);
    }

    @Override
    protected String getEntityTableName() {
        return BaseSalable.TABLE_NAME;
    }

    @Override
    protected Long getIdFromResultSet(PreparedStatement preparedStatement) throws SQLException {
        ResultSet resultSet = preparedStatement.getGeneratedKeys();
        resultSet.next();
        return resultSet.getLong("id");
    }

    @Override
    protected List<String> getInsertColumnNames() {
        List<String> columnNames = new ArrayList<>();
        columnNames.add(BaseSalable.NAME);
        columnNames.add(BaseSalable.PRICE);
        return columnNames;
    }

    @Override
    protected void fillPrepStatementForSave(PreparedStatement preparedStatement, T t) throws SQLException {
        preparedStatement.setString(1,t.getName());
        preparedStatement.setDouble(2,t.getPrice());
    }

    @Override
    public T findByName(String name) {
        //TODO
        return null;
    }
}
