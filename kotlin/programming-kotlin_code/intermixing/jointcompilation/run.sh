#---
# Excerpted from "Programming Kotlin",
# published by The Pragmatic Bookshelf.
# Copyrights apply to this code. It may not be used to create training material,
# courses, books, articles, and the like. Contact us if you are in doubt.
# We make no guarantees that this code is fit for any purpose.
# Visit http://www.pragmaticprogrammer.com/titles/vskotlin for more book information.
#---
kotlinc-jvm -d classes \
  src/main/kotlin/com/agiledeveloper/joint/*.kt \
  src/main/java/com/agiledeveloper/joint/*.java

javac -d classes -classpath classes \
  src/main/java/com/agiledeveloper/joint/*.java

kotlin -classpath classes com.agiledeveloper.joint.App

java -classpath classes:$KOTLIN_PATH/lib/kotlin-stdlib.jar \
  com.agiledeveloper.joint.App

/bin/rm -rf classes
