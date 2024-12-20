/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Util {

    public static void habilitar(boolean valor, JComponent... comp) {
        for (int i = 0; i < comp.length; i++) {
            comp[i].setEnabled(valor);

        }

    }

    public static void limpar(JComponent... comp) {
        for (JComponent c : comp) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            } else if (c instanceof JComboBox) {
                ((JComboBox<?>) c).setSelectedIndex(-1);
            } else if (c instanceof JCheckBox) {
                ((JCheckBox) c).setSelected(false);
            }
        }
    }

    public static int strToInt(String cad) {
        return Integer.parseInt(cad);
    }

    public static String intToStr(int num) {
        return String.valueOf(num);
    }

    public static double strToDouble(String cad) {
        return Double.parseDouble(cad);
    }

    public static String doubleToStr(double num) {
        return String.valueOf(num);
    }

    public static Date strToDate(String cad) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dataConvertida = new Date(dateFormat.parse(cad).getTime());
        return dataConvertida;
    }

    public static String dateToStr(Date data) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(data);
    }

    public static void mostrar(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

   public static boolean perguntar(String mensagem, String titulo) {
        int resp = JOptionPane.showConfirmDialog(null, mensagem, titulo, JOptionPane.YES_OPTION);
        return resp == JOptionPane.YES_OPTION;
    }
}
