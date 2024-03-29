/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.CadastroUsuarioVO;
import persistencia.Conexao;

/**
 *
 * @author Camila_Camera
 */
public class CadastroUsuarioDAO {
    public void cadastrarUsuario(CadastroUsuarioVO cVO) throws SQLException{
      
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        try{
                
            String sql;
            sql = "insert into cadastro_usuario_cliente(id_usuario, nome, genero, pessoa_fisica, pessoa_juridica, cnpj_usuario, cpf_usuario, rg_usuario, data_nascimento, telefone1, telefone2, residencia, trabalho, cep, cidade, estado, endereco, bairro_endereco, numero_endereco, complemento_endereco)" 
                  + "values (null, '" + cVO.getNome()+"','"+cVO.getGenero()+"','"+cVO.getPessoaFisica()+"','"+cVO.getPessoaJuridica()+"','"+cVO.getCnpj()+"','"+cVO.getCpf()+"','"+cVO.getRgUsuario()+"','"+cVO.getDataNascimento()+"',"
                  +cVO.getTelefone1()+"','"+cVO.getTelefone2()+"','"+cVO.getResidencia()+"','"+cVO.getTrabalho()+"',"+cVO.getCep()+",'"+cVO.getCidade()+"','"+cVO.getEstado()+"','"+cVO.getEndereco()+"','"+cVO.getBairro()+"',"+cVO.getNumeroEndereco()+","+cVO.getComplemento()+")";
       
            stat.execute(sql);
        }catch(SQLException e){
            throw new SQLException("Erro ao cadastrar usuário!");
        }finally{
            con.close();
        }
                    
        }
     public ArrayList<CadastroUsuarioVO> buscar() throws SQLException{
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        try{
            String sql;
            sql = "select * from cadastro_usuario_cliente";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<CadastroUsuarioVO> cda = new ArrayList<>();
            
            while(rs.next()){
                CadastroUsuarioVO c = new CadastroUsuarioVO();
                c.setIdUsuario( rs.getInt("id_usuario"));
                c.setTelefone1(rs.getString("telefone1"));
                c.setTelefone2(rs.getString("telefone2"));
                c.setNome(rs.getString("nome"));
                c.setBairro(rs.getString("bairro_endereco"));
                c.setGenero(rs.getString("genero"));
                c.setCidade(rs.getString("cidade"));
                c.setEstado(rs.getString("estado"));
                c.setDataNascimento(rs.getString("data_nascimento"));
                c.setRgUsuario(rs.getString("rg_usuario"));
                c.setCnpj(rs.getString("cnpj"));
                c.setCpf(rs.getString("cpf"));
                c.setCep( rs.getInt("cep"));
                c.setComplemento(rs.getInt("complemente_endereco"));
                c.setNumeroEndereco(rs.getInt("numero_endereco"));
                c.setPessoaFisica(rs.getString("pessoa_fisica"));
                c.setPessoaJuridica(rs.getString("pessoa_juridica"));
                c.setTrabalho(rs.getString("trabalho"));
                c.setResidencia(rs.getString("residencia"));
                
                cda.add(c);
        }
            return cda;
}
        catch(SQLException e){
            throw  new SQLException("Erro ao buscar dados no banco"+e.getMessage());
             }finally{
            stat.close();
            con.close();
        }
     } public void deletarUsuario(int idUsuarioCliente) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement sta = con.createStatement();
        try{ String sql;
            sql="delete from cadastro_usuario_cliente where id_usuario = "+idUsuarioCliente;
            sta.execute(sql);
        }catch(SQLException e ){
            throw  new SQLException("Erro ao excluir dados no banco"+e.getMessage());
        }finally{
            sta.close();
            con.close();
        }
        
    } 
    
}

