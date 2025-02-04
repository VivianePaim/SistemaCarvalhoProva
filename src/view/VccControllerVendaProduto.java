/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.VccVendasProdutos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Viviane
 */
public class VccControllerVendaProduto extends AbstractTableModel {

    private List lstVendaProduto;

    public void setList(List lstVendaProduto) {
        this.lstVendaProduto = lstVendaProduto;
        this.fireTableDataChanged();
    }

    public void addBean(VccVendasProdutos vccVendasProdutos) {
        this.lstVendaProduto.add(vccVendasProdutos);
        this.fireTableDataChanged();
    }

    public void removeBean(VccVendasProdutos vccVendasProdutos) {
        this.lstVendaProduto.remove(vccVendasProdutos);
        this.fireTableDataChanged();
    }

    public VccVendasProdutos getBean(int rowIndex) {
        return (VccVendasProdutos) lstVendaProduto.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstVendaProduto.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VccVendasProdutos vccVendasProdutos = (VccVendasProdutos) lstVendaProduto.get(rowIndex);
        if (columnIndex == 0) {
            return vccVendasProdutos.getIdVccVendasProdutos();
        } else if (columnIndex == 1) {
            return vccVendasProdutos.getVccData();
        } else if (columnIndex == 2) {
            return vccVendasProdutos.getVccProdutos();
        } else if (columnIndex == 3) {
            return vccVendasProdutos.getVccTotal();
        }
        return null;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        } else if (columnIndex == 1) {
            return "DATA";
        } else if (columnIndex == 2) {
            return "PRODUTO";
        } else if (columnIndex == 3) {
            return "TOTAL";
        }
        return "";
    }
}
