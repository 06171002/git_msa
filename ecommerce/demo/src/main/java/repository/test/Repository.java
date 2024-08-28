package repository.test;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface Repository<T> {

    void save(T t) throws SQLException;
//    List<T> findAll() throws SQLException;
    Optional<T> findById(Long id) throws SQLException;
    void deleteById(Long id) throws SQLException;

//    void update() throws SQLException;


}
