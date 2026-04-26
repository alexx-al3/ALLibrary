package Main;

import com.allibrary.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        try (Connection conn = ConnectionFactory.getConnection()) {

            if (conn != null && !conn.isClosed()) {
                System.out.println(" Conectado com sucesso ao MySQL!");
            }

        } catch (SQLException e) {
            System.out.println(" Erro ao conectar:");
            e.printStackTrace();
        }
    }
}

