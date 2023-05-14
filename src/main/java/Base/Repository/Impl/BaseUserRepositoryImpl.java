package Base.Repository.Impl;

import Base.Entity.BaseUser;
import Base.Repository.BaseUserRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BaseUserRepositoryImpl<T extends BaseUser>
    extends BaseRepositoryImpl<T,Integer>
implements BaseUserRepository<T> {


    public BaseUserRepositoryImpl(Connection connection) {
        super(connection);
    }

    @Override
    protected String getEntityTableName() {
        return BaseUser.TABLE_NAME;
    }

    @Override
    protected Integer getIdFromResultSet(PreparedStatement preparedStatement) throws SQLException {
        ResultSet resultSet = preparedStatement.getGeneratedKeys();
        resultSet.next();
        return resultSet.getInt("id");
    }

    @Override
    protected List<String> getInsertColumnNames() {
        List<String> columnNames = new ArrayList<>();
        columnNames.add(BaseUser.FIRST_NAME);
        columnNames.add(BaseUser.LAST_NAME);
        columnNames.add(BaseUser.USERNAME);
        columnNames.add(BaseUser.PASSWORD);
        columnNames.add(BaseUser.AGE);
        columnNames.add(BaseUser.USER_TYPE);
        return columnNames;
    }

    @Override
    protected void fillPrepStatementForSave(PreparedStatement preparedStatement, T t) throws SQLException {
        preparedStatement.setString(1,t.getFirsName());
        preparedStatement.setString(2,t.getLastName());
        preparedStatement.setString(3,t.getUserName());
        preparedStatement.setString(4,t.getPassword());
        preparedStatement.setInt(5,t.getAge());
        preparedStatement.setString(6,t.getUserType().name());
    }

    @Override
    public T findByUserName(String userName) {
        //TODO
        return null;
    }
}
