/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.CpfDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import modelo.CpfVO;

/**
 *
 * @author Camila_Camera
 */
public class CpfServicos {
    public void cadastrarCpf(CpfVO fVO) throws SQLException{
        CpfDAO cpfDAO = DAOFactory.getCpfDAO();
        cpfDAO.cadastrarCpf(fVO);
    }
}
