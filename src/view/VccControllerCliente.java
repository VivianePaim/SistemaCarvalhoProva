/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.VccCliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Viviane
 */
public class VccControllerCliente extends AbstractTableModel {

    private List lstCliente;

    public void setList(List lstCliente) {
        this.lstCliente = lstCliente;
    }

    public VccCliente getBean(int rowIndex){
        return (VccCliente) lstCliente.get(rowIndex);
    }
    @Override
    public int getRowCount() {
        return lstCliente.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VccCliente cliente = (VccCliente) lstCliente.get(rowIndex);
        if (columnIndex == 0) {
            return cliente.getVccIdCliente();
        } else if (columnIndex == 1) {
            return cliente.getVccNome();
        } else if (columnIndex == 2) {
            return cliente.getVccCpf();
        } else if (columnIndex == 3) {
            return cliente.getVccRg();
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
            return "RG";
        }
        return "";
    }
}
