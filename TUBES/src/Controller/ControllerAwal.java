s/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DatabaseLogin;
import Model.Petugas;
import View.Awal;
import View.login;
import View.viewAdmin;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;

/**
 *
 * @author YAHYA
 */
public class ControllerAwal implements ActionListener {
    private Awal first;
    
    public ControllerAwal() {
        first=new Awal();
        first.addActionListener(this);
        first.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();
        if (source.equals(first.getbLogin())) {
            ControllerApp log=new ControllerApp();
        }
        
    }
    
}
