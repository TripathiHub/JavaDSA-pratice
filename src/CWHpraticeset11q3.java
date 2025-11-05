package com.company;
 abstract class telephone{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnect();
}
class smarttelephone extends telephone{
     public void ring(){
         System.out.println("ringing");
     }
     public void lift(){
         System.out.println("lifted");
     }
     public void disconnect(){
         System.out.println("disconnected");
     }
     public void video4k(){
         System.out.println("recording in 4k");
     }
}
public class CWHpraticeset11q3
{
    public static void main(String[] args) {
       smarttelephone sm= new smarttelephone();
       telephone tp= new smarttelephone();
       sm.ring();
       sm.disconnect();
       sm.video4k();
       sm.lift();
      // tp.video4k(); not allowed
    }
}
