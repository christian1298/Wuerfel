/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wuerfel.view;

/**
 *
 * @author Christian
 */
public class View extends javax.swing.JPanel
{

  /**
   * Creates new form view
   */
  public View()
  {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {

    jPanel1 = new javax.swing.JPanel();
    btnStart = new javax.swing.JButton();
    btnStop = new javax.swing.JButton();
    lblText = new javax.swing.JLabel();

    setLayout(new java.awt.BorderLayout());

    btnStart.setText("Start");
    jPanel1.add(btnStart);

    btnStop.setText("Stop");
    jPanel1.add(btnStop);

    add(jPanel1, java.awt.BorderLayout.PAGE_START);

    lblText.setFont(new java.awt.Font("Dialog", 0, 120)); // NOI18N
    lblText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblText.setText("1");
    add(lblText, java.awt.BorderLayout.CENTER);
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnStart;
  private javax.swing.JButton btnStop;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel lblText;
  // End of variables declaration//GEN-END:variables
}
