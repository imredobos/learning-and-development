#---
# Excerpted from "Programming Kotlin",
# published by The Pragmatic Bookshelf.
# Copyrights apply to this code. It may not be used to create training material,
# courses, books, articles, and the like. Contact us if you are in doubt.
# We make no guarantees that this code is fit for any purpose.
# Visit http://www.pragmaticprogrammer.com/titles/vskotlin for more book information.
#---
kotlinc-jvm -d classes src/main/kotlin/com/agiledeveloper/Counter.kt
kotlinc-jvm -classpath classes -script usecounter.kts
echo ""
javac -d classes -classpath classes:$KOTLIN_PATH/lib/kotlin-stdlib.jar \
  src/main/java/com/agiledeveloper/UseCounter.java
java -classpath classes:$KOTLIN_PATH/lib/kotlin-stdlib.jar \
  com.agiledeveloper.UseCounter
/bin/rm -rf classes
