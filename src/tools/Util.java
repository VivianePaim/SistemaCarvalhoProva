/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
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
                ((JComboBox<?>) c).setSelectedIndex(0);
            } else if (c instanceof JCheckBox) {
                ((JCheckBox) c).setSelected(false);
            }
        }
    }
}
