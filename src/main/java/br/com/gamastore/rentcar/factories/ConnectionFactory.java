package br.com.gamastore.rentcar.factories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.sql.DataSource;

public class ConnectionFactory {

	private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("loja");

	public static EntityManager getEntityManager() {
		return FACTORY.createEntityManager();
	}

	public static Connection getConnection() {
		// ComboPooleDataSource comboPooleDataSource

		// JdbcDataSource dataSource = new JdbcDataSource();
		// dataSource.setURL();
		// dataSource.

		// DataSource dataSource = comboPooleDataSource;

		try {
			return DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}

//package br.com.caelum.jdbc;
//import java.sql.Connection;
//import java.sql.DriverManager;
//public class ConnectionFactory { public Connection getConnectio() { try { return DriverManager.getConnection( "jdbc:mysql://localhost/fj21?useTimezone=true&serverTimezone=UTC", "root", "123456big"); } catch (Exception e) { throw new RuntimeException(e); } } } 
