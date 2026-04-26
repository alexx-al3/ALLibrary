package scr.com.allibrary.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String URL =
        "jdbc:postgresql://db.wozwfhzjaafudukrlkln.supabase.co:5432/postgres?sslmode=require";

    private static final String USER = "postgres";
    private static final String PASSWORD = "bancodedadosalex";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexão com o banco de dados", e);
        }
    }
}