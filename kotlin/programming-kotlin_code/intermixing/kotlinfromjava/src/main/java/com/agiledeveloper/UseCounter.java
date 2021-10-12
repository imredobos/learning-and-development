/***
 * Excerpted from "Programming Kotlin",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/vskotlin for more book information.
***/
package com.agiledeveloper;
                         
import kotlin.jvm.functions.Function1;

public class UseCounter {
  public static void main(String[] args) {
    Counter counter = new Counter(1);
    
    System.out.println(counter.plus(counter)); //Counter(value=2)
    //within the main method of UseCounter...
    Counter counter0 = Counter.create();
    System.out.println(counter0); //Counter(value=0)

  System.out.println(counter.map(ctr -> ctr.plus(ctr))); //Counter(value=2)

  try {
    counter.readFile("blah");
  } catch(java.io.FileNotFoundException ex) {
    System.out.println("File not found");
  }
  

  System.out.println(counter.add(3));
  System.out.println(counter.add());
                
/*
  System.out.println(com.agiledeveloper.CounterKt.createCounter());
*/

  System.out.println(com.agiledeveloper.CounterTop.createCounter());

  }
}
