/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.VccProdutos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Viviane
 */
public class VccControllerProdutos extends AbstractTableModel {

    private List lstProdutos;

    public void setList(List lstProdutos) {
        this.lstProdutos = lstProdutos;
    }

    public VccProdutos getBean(int rowIndex){
        return (VccProdutos) lstProdutos.get(rowIndex);
    }
    @Override
    public int getRowCount() {
        return lstProdutos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VccProdutos fornecedor = (VccProdutos) lstProdutos.get(rowIndex);
        if (columnIndex == 0) {
            return fornecedor.getVccIdProdutos();
        } else if (columnIndex == 1) {
            return fornecedor.getVccNome();
        } else if (columnIndex == 2) {
            return fornecedor.getVccDataFabricacao();
        } else if (columnIndex == 3) {
            return fornecedor.getVccEstoque();
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
            return "DATA DE FABRICAÇÃO";
        } else if (columnIndex == 3) {
            return "Estoque";
        }
        return "";
    }
}
