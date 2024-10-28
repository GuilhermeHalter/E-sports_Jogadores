package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JogadoresCRUD {
    Connection conect = null;

    public void connectionDB() {
        conect = ConexaoMySQL.getConexaoMySQL();
    }

    // <----------CREATES---------->

    public void createJogadoresVeteranos(JogadoresVeteranos e) {
        String sql = "insert into jogadoresVeteranos values (?,?,?,?)";
        try {
            PreparedStatement pst;
            pst = conect.prepareStatement(sql);
            pst.setInt(1, e.getId());
            pst.setString(2, e.getNome());
            pst.setInt(3, e.getAnoTreino());
            pst.setFloat(4, e.getSalario());
            pst.executeUpdate();
            System.out.println("Jogador Cadastrado");
        } catch (SQLException ex) {
            System.out.println("Jogador Nao Cadastrado " + ex);
        }
    }

    public void createJogadoresTrainees(JogadoresTrainees e) {
        String sql = "insert into jogadoresTrainees values (?,?,?,?)";
        try {
            PreparedStatement pst;
            pst = conect.prepareStatement(sql);
            pst.setInt(1, e.getId());
            pst.setString(2, e.getNome());
            pst.setInt(3, e.getAnoTreino());
            pst.setFloat(4, e.getSalario());
            pst.executeUpdate();
            System.out.println("Jogador Cadastrado");
        } catch (SQLException ex) {
            System.out.println("Jogador Nao Cadastrado " + ex);
        }
    }

    // <----------READ---------->

    public void readJogadoresVeteranos() {
        String sql = "SELECT id, nome, ano_treino, salario FROM jogadoresVeteranos";
        try {
            PreparedStatement pst;
            pst = conect.prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            while(rst.next()) {
                int codigo = rst.getInt("id");
                String nome = rst.getString(2);
                int anoTreino = rst.getInt(3);
                float salario = rst.getFloat(4);
                System.out.printf("ID Jogador: %d Nome: %s Anos de treino: %d Salario: %f \n",codigo, nome, anoTreino, salario);
            }
        } catch (SQLException se) {
            System.out.println("Erro ao Consultar Jogador " + se);
        }
    }

    public void readJogadoresTrainees() {
        String sql = "SELECT id, nome, ano_treino, salario FROM jogadoresTrainees";
        try {
            PreparedStatement pst;
            pst = conect.prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            while(rst.next()) {
                int codigo = rst.getInt("id");
                String nome = rst.getString(2);
                int anoTreino = rst.getInt(3);
                float salario = rst.getFloat(4);
                System.out.printf("ID Jogador: %d Nome: %s Anos de treino: %d Salario: %f \n",codigo, nome, anoTreino, salario);
            }
        } catch (SQLException se) {
            System.out.println("Erro ao Consultar Jogador " + se);
        }
    }

    // <----------UPDATE---------->

    public void upadateJogadoresVeteranos( String nomeJogador, int anoTreinoJogador, float salarioJogador,int idJogador) {
        String sql = "UPDATE jogadoresVeteranos SET nome = ?, ano_treino = ?, salario = ? WHERE id = ?";
        try {
            PreparedStatement pst;
            pst = conect.prepareStatement(sql);
            pst.setString(1, nomeJogador);
            pst.setInt(2, anoTreinoJogador);
            pst.setFloat(3, salarioJogador);
            pst.setInt(4, idJogador);
            int ret = pst.executeUpdate();

            if(ret > 0){
                System.out.println(String.format("Linhas afetadas %d", ret));
                System.out.printf("Registro alterado: %s %s %s",nomeJogador, anoTreinoJogador, salarioJogador);
            }else{
                System.out.println("Não foi possível alterar o Registro do Jogador");
            }
        }catch (SQLException se) {
            System.out.println("Erro ao Atualizar Jogador " + se);
        }
    }


    public void upadateJogadoresTrainees( String nomeJogador, int anoTreinoJogador, float salarioJogador,int idJogador) {
        String sql = "UPDATE jogadoresTrainees SET nome = ?, ano_treino = ?, salario = ? WHERE id = ?";
        try {
            PreparedStatement pst;
            pst = conect.prepareStatement(sql);
            pst.setString(1, nomeJogador);
            pst.setInt(2, anoTreinoJogador);
            pst.setFloat(3, salarioJogador);
            pst.setInt(4, idJogador);
            int ret = pst.executeUpdate();

            if(ret > 0){
                System.out.println(String.format("Linhas afetadas %d", ret));
                System.out.printf("Registro alterado: %s %s %s",nomeJogador, anoTreinoJogador, salarioJogador);
            }else{
                System.out.println("Não foi possível alterar o Registro do Jogador");
            }
        }catch (SQLException se) {
            System.out.println("Erro ao Atualizar Jogador " + se);
        }
    }

    // <----------DELETE---------->

    public void deleteJogadoresVeteranos(int idJogador) {
        String sql = "DELETE FROM jogadoresVeteranos WHERE id = ?";
        try {
            PreparedStatement pst;
            pst = conect.prepareStatement(sql);
            pst.setInt(1, idJogador);

            int ret = pst.executeUpdate();
            if(ret > 0){
                System.out.printf("Jogador Excluido: %d: ",idJogador);
            }else{
                System.out.println("Não foi possível Excluir o Registro do Jogador");
            }
        } catch (SQLException se) {
            System.out.println("Erro em Excluir Jogador " + se);
        }
    }

    public void deleteJogadoresTrainees(int idJogador) {
        String sql = "DELETE FROM jogadoresTrainees WHERE id = ?";
        try {
            PreparedStatement pst;
            pst = conect.prepareStatement(sql);
            pst.setInt(1, idJogador);

            int ret = pst.executeUpdate();
            if(ret > 0){
                System.out.printf("Jogador Excluido: %d: ",idJogador);
            }else{
                System.out.println("Não foi possível Excluir o Registro do Jogador");
            }
        } catch (SQLException se) {
            System.out.println("Erro em Excluir Jogador " + se);
        }
    }

}
