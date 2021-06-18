/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.CnpjDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import modelo.CnpjVO;

/**
 *
 * @author Camila_Camera
 */
public class CnpjServicos {
    public void cadastrarCnpj(CnpjVO cVO) throws SQLException{
        CnpjDAO cnpjDAO = DAOFactory.getCnpjDAO();
        cnpjDAO.cadastrarCnpj(cVO);
    }
}
