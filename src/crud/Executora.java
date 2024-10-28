package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Executora {

    public static void main(String[] args) {
        Connection conect = null;
        conect = ConexaoMySQL.getConexaoMySQL();

    }

}
