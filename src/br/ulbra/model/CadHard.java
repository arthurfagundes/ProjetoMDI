/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur Fagundes
 */
public class CadHard {
    public static List<Hardware> bdHar;
    public CadHard() {
        //construtor
        bdHar = new ArrayList();
    }
    public void salvar(Hardware har) {
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente salvar o periférico " + har.getNome() + "?",
                "Confirme", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            bdHar.add(har);
            JOptionPane.showMessageDialog(null, "Hardware Salvo com Sucesso!", "Confirmação",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Armazenamento cancelado", "Cancelado",
                    JOptionPane.WARNING_MESSAGE);
        }

    }
    
    public void editar(int indice, Hardware hard){
        bdHar.set(indice, hard);
        JOptionPane.showMessageDialog(null ,"Registro modificado com Sucesso!!");
    }
    
    public void excluir(int indice){
        if(JOptionPane.showConfirmDialog(null, "Apagar registro?", "Eliminar registro", JOptionPane.YES_NO_OPTION ) == JOptionPane.YES_OPTION)
        {
            bdHar.remove(indice);
            JOptionPane.showMessageDialog(null, "Registro eliminado com sucesso");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Operação cancelada");
        }
        

    }

}
