/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanfields.beans;

import java.io.*; 
/**
 *
 * @author Mathekga M. Emmanuel
 */
public class MathBean implements Serializable{
    
    private long arga; 
    private long argb;
    
    public MathBean(){}
    
    public long getArga(){
        return arga; 
    }
       
    public long getArgb(){
        return argb; 
    }
    
    public void setArga(long arga){
         this.arga = arga; 
    }
    
     public void setArgb(long argb){
         this.argb = argb; 
    }
    
     
     public long add()
     {
         return (arga  + argb);
     }
     
      public long subtract()
     {
         return (arga  - argb);
     }
      
       public long multiply()
     {
         return (arga  * argb);
     }
       
      public long divide()
     {
         if(argb == 0){ return 0;} 
         else {return (arga  / argb);}
     } 
        
      public long modulus()
     {  
          if(argb == 0){ return 0;} 
          else{ return (arga  % argb);}
     }
}
