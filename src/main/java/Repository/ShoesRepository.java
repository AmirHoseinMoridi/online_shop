package Repository;

import Base.Repository.Impl.BaseSalableRepositoryImpl;
import Entity.Shoes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ShoesRepository extends BaseSalableRepositoryImpl<Shoes> {
    public ShoesRepository(Connection connection) {
        super(connection);
    }
    @Override
    protected List<String> getInsertColumnNames() {
        List<String> columnNames = super.getInsertColumnNames();
        columnNames.add(Shoes.SIZE);
        return columnNames;
    }

    @Override
    protected void fillPrepStatementForSave(PreparedStatement preparedStatement, Shoes shoes) throws SQLException {
        //super.fillPrepStatementForSave(preparedStatement, shoes);
        preparedStatement.setInt(3,shoes.getSize());
    }
}
