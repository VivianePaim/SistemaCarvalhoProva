/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.VccVenda;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Viviane
 */
public class VccControllerVenda extends AbstractTableModel {

    private List lstVenda;

    public void setList(List lstVenda) {
        this.lstVenda = lstVenda;
    }

    public VccVenda getBean(int rowIndex){
        return (VccVenda) lstVenda.get(rowIndex);
    }
    @Override
    public int getRowCount() {
        return lstVenda.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VccVenda venda = (VccVenda) lstVenda.get(rowIndex);
        if (columnIndex == 0) {
            return venda.getIdVccVenda();
        } else if (columnIndex == 1) {
            return venda.getVccCliente();
        } else if (columnIndex == 2) {
            return venda.getVccFornecedor();
        } else if (columnIndex == 3) {
            return venda.getVccDataVenda();
        }
        return null;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        } else if (columnIndex == 1) {
            return "CLIENTE";
        } else if (columnIndex == 2) {
            return "FORNECEDOR";
        } else if (columnIndex == 3) {
            return "DATA VENDA";
        }
        return "";
    }
}
