/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wuerfel.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import wuerfel.model.DataModel;
import wuerfel.view.View;

/**
 *
 * @author Christian
 */
public class StartStopController implements ActionListener
{
  private View view;
  private DataModel model;
  
  public StartStopController(DataModel model,View view)
  {
    this.view = view;
    this.model = model;
  }
  
  public void RegisterEvents()
  {
    view.getBtnStart().addActionListener(this);
    view.getBtnStop().addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource() == view.getBtnStart())
    {
      model.start();
    }
    else
    {
      model.stop();
    }
  }
}
