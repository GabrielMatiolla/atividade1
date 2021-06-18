/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.CnpjVO;
import persistencia.Conexao;
/**
 *
 * @author Camila_Camera
 */
public class CnpjDAO {
    public void cadastrarCnpj(CnpjVO cVO) throws SQLException{
        //Busca conexão com o banco de dados
        Connection con = Conexao.getConexao();
        //cria um objeto "stat" responsável por enviar os comandos de banco do Java para serem sexdcutados dentro do BD
        Statement stat = con.createStatement();
        try{
            String sql;//String que receberá o comando SQL
            
            sql = "insert into CNPJ"
                    +"values'"+cVO.getCnpj()+"'";
            //executa o comando que guardamos dentro da String sql
            stat.execute(sql);
        }catch(SQLException e){
            throw new SQLException("Erro ao inserir número de documento!");
        }finally{
            stat.close();
            con.close();
        }
        
    }
}
