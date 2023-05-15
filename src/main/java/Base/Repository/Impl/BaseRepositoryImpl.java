package Base.Repository.Impl;

import Base.Entity.BaseEntity;
import Base.Repository.BaseRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public abstract class BaseRepositoryImpl<T extends BaseEntity<ID>, ID> implements BaseRepository<T, ID> {
    protected final Connection connection;

    public BaseRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    public static final String INSERT_QUERY_TEMPLATE =
            "INSERT INTO %s(%s) VALUES(%s)";

    public ID sava(T t) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                generateInsertQuery(),
                Statement.RETURN_GENERATED_KEYS
        );
        fillPrepStatementForSave(preparedStatement,t);
        preparedStatement.executeUpdate();
        return getIdFromResultSet(preparedStatement);
    }

    @Override
    public T findById(ID id) {
        // TODO
        return null;
    }

    @Override
    public List<T> findAll() {
        // TODO
        return null;
    }

    @Override
    public boolean deleteById(ID id) {
        // TODO
        return false;
    }

    protected String generateInsertQuery() {
        List<String> columnNames = getInsertColumnNames();

        return String.format(
                INSERT_QUERY_TEMPLATE,
                getEntityTableName(),
                String.join(",", columnNames),
                generateQuestionMarkForInsertQuery(columnNames.size())
        );
    }

    protected String generateQuestionMarkForInsertQuery(int length) {
        String result = "";
        for (int i = 0; i < length; i++) {
            if (i == length - 1) {
                result = result.concat("?");
            } else {
                result = result.concat("?,");
            }
        }
        return result;
    }

    protected abstract String getEntityTableName();

    protected abstract ID getIdFromResultSet(PreparedStatement preparedStatement) throws SQLException;

    protected abstract List<String> getInsertColumnNames();
    protected abstract void fillPrepStatementForSave(PreparedStatement preparedStatement,
                                                     T t) throws SQLException;

}
