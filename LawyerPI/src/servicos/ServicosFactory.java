/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 *
 * @author Camila_Camera
 */
public class ServicosFactory {
    private static LoginUsuarioServicos luserServicos = new LoginUsuarioServicos();
    public static LoginUsuarioServicos getLoginUsuarioServicos() {
        return luserServicos;
    }
    
    private static CadastroUsuarioServicos caduserServicos = new CadastroUsuarioServicos();
    public static CadastroUsuarioServicos getCadastroUsuarioServicos() {
        return caduserServicos;
    }
    
    private static CnpjServicos cnpjServicos = new CnpjServicos();
    public static CnpjServicos getCnpjServicos() {
        return cnpjServicos;
    }
    
    private static CpfServicos cpfServicos = new CpfServicos();
    public static CpfServicos getCpfServicos() {
        return cpfServicos;
    }
    
    private static PerfilUsuarioServicos perfilServicos = new PerfilUsuarioServicos();
    public static PerfilUsuarioServicos getPerfilUsuarioServicos() {
        return perfilServicos;
    }
    
    private static PreCadastroServicos pcadServicos = new PreCadastroServicos();
    public static PreCadastroServicos getPreCadastroServicos() {
        return pcadServicos;
    }
    
}
