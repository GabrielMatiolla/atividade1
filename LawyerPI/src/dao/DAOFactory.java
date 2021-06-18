/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
/**
 *
 * @author Camila_Camera
 */
public class DAOFactory {
    private static LoginUsuarioDAO luserDAO = new LoginUsuarioDAO();
    private static CadastroUsuarioDAO caduserDAO = new CadastroUsuarioDAO();
    private static CnpjDAO cnpjDAO = new CnpjDAO();
    private static CpfDAO cpfDAO = new CpfDAO();
    private static PerfilUsuarioDAO puserDAO = new PerfilUsuarioDAO();
    private static PreCadastroDAO pcaduserDAO = new PreCadastroDAO();
    

    public static LoginUsuarioDAO getLoginUsuarioDAO(){
        return luserDAO;
    }
    
    public static CadastroUsuarioDAO getCadastroUsuarioDAO(){
        return caduserDAO;
    }
    
    public static CnpjDAO getCnpjDAO(){
        return cnpjDAO;
    }
    
    public static CpfDAO getCpfDAO(){
        return cpfDAO;
    }
    
    public static PerfilUsuarioDAO getPerfilUsuarioDAO(){
        return puserDAO;
    }
    
     public static PreCadastroDAO getPreCadastroDAO(){
        return pcaduserDAO;
    }

}
