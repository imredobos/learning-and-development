/***
 * Excerpted from "Programming Kotlin",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/vskotlin for more book information.
***/
package com.agiledeveloper;

import java.util.List;
import static java.util.stream.Collectors.toList;

public class JavaClass {
  public int getZero() { return 0; }

  public List<String> convertToUpper(List<String> names) {
    return names.stream()
      .map(String::toUpperCase)
      .collect(toList());
  }
  public void suspend() {
    System.out.println("suspending...");
  }

  public String when() {
    return "Now!";
  }
}
