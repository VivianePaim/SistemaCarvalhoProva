/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.VccFornecedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Viviane
 */
public class VccControllerFornecedor extends AbstractTableModel {

    private List lstFornecedor;

    public void setList(List lstFornecedor) {
        this.lstFornecedor = lstFornecedor;
    }

    public VccFornecedor getBean(int rowIndex){
        return (VccFornecedor) lstFornecedor.get(rowIndex);
    }
    @Override
    public int getRowCount() {
        return lstFornecedor.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VccFornecedor fornecedor = (VccFornecedor) lstFornecedor.get(rowIndex);
        if (columnIndex == 0) {
            return fornecedor.getVccIdFornecedor();
        } else if (columnIndex == 1) {
            return fornecedor.getVccNome();
        } else if (columnIndex == 2) {
            return fornecedor.getVccCnpj();
        } else if (columnIndex == 3) {
            return fornecedor.getVccEmail();
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
            return "CNPJ";
        } else if (columnIndex == 3) {
            return "EMAIL";
        }
        return "";
    }
}
