/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wuerfel.controller;

import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Subscriber;
import wuerfel.model.DataModel;
import wuerfel.view.View;

/**
 *
 * @author Christian
 */
public class Adapter implements Subscriber<Integer>
{
  private Flow.Subscription subscription;
  private DataModel model;
  private View view;
  public Adapter( DataModel model, View view)
  {
    this.model = model;
    this.view = view;
  }

  public void onSubscription()
  {
    model.addSubscription(this);
  }
  
  @Override
  public void onSubscribe(Flow.Subscription subscription)
  {
    this.subscription = subscription;
    subscription.request(1);
  }

  @Override
  public void onError(Throwable thrwbl)
  {
  }

  @Override
  public void onComplete()
  {
  }

  @Override
  public void onNext(Integer item)
  {
    view.getLblText().setText(String.valueOf(item));
    subscription.request(1);
  }
}
