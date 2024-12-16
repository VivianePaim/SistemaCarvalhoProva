/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.VccUsuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Viviane
 */
public class VccControllerUsuarios extends AbstractTableModel {

    private List lstUsuario;

    public void setList(List lstUsuario) {
        this.lstUsuario = lstUsuario;
    }

    public VccUsuario getBean(int rowIndex){
        return (VccUsuario) lstUsuario.get(rowIndex);
    }
    @Override
    public int getRowCount() {
        return lstUsuario.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VccUsuario usuario = (VccUsuario) lstUsuario.get(rowIndex);
        if (columnIndex == 0) {
            return usuario.getVccIdUsuario();
        } else if (columnIndex == 1) {
            return usuario.getVccNome();
        } else if (columnIndex == 2) {
            return usuario.getVccCpf();
        } else if (columnIndex == 3) {
            return usuario.getVccDataNasc();
        }
        return null;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        } else if (columnIndex == 1) {
            return "NOME";
        } else if (columnIndex == 2) {
            return "CPF";
        } else if (columnIndex == 3) {
            return "DATA NASCIMENTO";
        }
        return "";
    }
}
