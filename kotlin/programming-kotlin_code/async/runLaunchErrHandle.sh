#---
# Excerpted from "Programming Kotlin",
# published by The Pragmatic Bookshelf.
# Copyrights apply to this code. It may not be used to create training material,
# courses, books, articles, and the like. Contact us if you are in doubt.
# We make no guarantees that this code is fit for any purpose.
# Visit http://www.pragmaticprogrammer.com/titles/vskotlin for more book information.
#---
mkdir -p classes
kotlinc-jvm -classpath /opt/kotlin/kotlinx-coroutines-core-1.2.2.jar:/opt/kotlin/klaxon-5.0.2.jar -d classes *.kt
kotlin -classpath classes:/opt/kotlin/kotlinx-coroutines-core-1.2.2.jar:/opt/kotlin/klaxon-5.0.2.jar LaunchErrHandleKt
/bin/rm -rf classes
