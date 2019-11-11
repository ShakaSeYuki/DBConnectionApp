package app.connection.db;

import org.springframework.data.jpa.repository.JpaRepository;

import app.connection.db.dbConnection;
 
public interface dbConnectionDao extends JpaRepository <dbConnection, Integer> {
 
}
