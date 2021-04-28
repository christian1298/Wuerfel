/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wuerfel.model;


import java.util.logging.Logger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.SubmissionPublisher;
import wuerfel.util.OhmLogger;

/**
 *
 * @author Christian
 */
public class DataModel implements Runnable
{
  private static Logger lg = OhmLogger.getLogger();
  
  private int val;
  private SubmissionPublisher<Integer> iPublisher;
  private ExecutorService eService;
  private volatile boolean running;
  
  public DataModel()
  {
    running = false;
    eService = Executors.newSingleThreadExecutor();
    iPublisher = new SubmissionPublisher<>();
    
  }
  
  public void addSubscription(Subscriber<Integer> subscriber)
  {
    iPublisher.subscribe(subscriber);
  }

  public synchronized void start()
  {
    running = true;
    lg.info("Start");
    // LSG 3 \\
    notifyAll();
    // LSG 3 \\
    
    eService.submit(this);
  }
  
  public synchronized void stop()
  {
    running = false;
    lg.info("Stop");
    // LSG 3 \\
    notifyAll();
    // LSG 3 \\
  }
  
  @Override
  public void run()
  {
    /**
     * LSG 1
     */
//    while(true)
//    {
//      try{
//        Thread.sleep(10);
//      }
//      catch(InterruptedException e){
//        System.out.println(e);
//      }
//      System.out.println(String.valueOf(val));
//      val = (val % 6) + 1;
//      if(running)
//      iPublisher.submit(val);
//    }
    
    /**
     * LSG 2
     */  
//    while(running){
//      try
//      {
//        Thread.sleep(10);
//      }
//      catch(InterruptedException e){
//        System.out.println(e);
//      }
//      System.out.println(String.valueOf(val));
//      val = (val % 6) + 1;
//      iPublisher.submit(val);
//    }
    
    
    /**
     * LSG 3
     */
//    while(true)
//    {
//      synchronized(this)
//      {
//      while(!running)
//      {
//        try
//        {
//          this.wait();
//        }
//        catch(InterruptedException e)
//        {
//          System.out.println(e);
//        }
//      }
//      }
//      try
//      {
//        Thread.sleep(10);
//      }
//      catch(InterruptedException e)
//      {
//        System.out.println(e);
//      }
//      val = (val % 6) + 1;
//      iPublisher.submit(val);
//    }
    
    
  }
}
