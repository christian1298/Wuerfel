/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wuerfel;

import wuerfel.controller.Adapter;
import wuerfel.controller.StartStopController;
import wuerfel.model.DataModel;
import wuerfel.view.View;


/**
 *
 * @author Christian
 */
public class Start 
{
  public Start()
  {
  View view = new View();
  DataModel model = new DataModel();
  Adapter adapter = new Adapter(model, view);
  adapter.onSubscription();
  StartStopController con = new StartStopController(model,view);
  con.RegisterEvents();
  view.setVisible(true);
  }

  public static void main(String[] args) 
  {
    new Start();
  }

}
