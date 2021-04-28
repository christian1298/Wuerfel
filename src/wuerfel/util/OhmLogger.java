/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wuerfel.util;

import java.util.logging.*;

/**
 *
 * @author Christian
 */
public class OhmLogger 
{
  private static Logger lg = null;
  private OhmLogger()
  {
  }
  
  public static Logger getLogger()
  {
    if(lg == null)
    {
      lg = Logger.getLogger("OhmLogger");
      initLogger();
    }
    return lg;
  }
  
  private static void initLogger()
  {
    //FileHandler fh = new Filehandler();
    // Einstellungen in Properties-Datei LOG_FILE="/tmp/log.txt"
    ConsoleHandler ch = new ConsoleHandler();
    ch.setFormatter(new OhmFormatter());
    lg.addHandler(ch);
    lg.setUseParentHandlers(false);
  }
}

class OhmFormatter extends SimpleFormatter
{
  public String format(LogRecord record)
  {
    String logLine = "";
    logLine += String.format("%tF",record.getMillis());
    logLine += " " + record.getLevel();
    logLine += " " + record.getSourceClassName();
    logLine += " " + record.getSourceMethodName();
    logLine += " " + record.getMessage();
    
    
    
    logLine += "\n";
    return logLine;
  }
}
