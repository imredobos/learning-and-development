#---
# Excerpted from "Programming Kotlin",
# published by The Pragmatic Bookshelf.
# Copyrights apply to this code. It may not be used to create training material,
# courses, books, articles, and the like. Contact us if you are in doubt.
# We make no guarantees that this code is fit for any purpose.
# Visit http://www.pragmaticprogrammer.com/titles/vskotlin for more book information.
#---
mkdir -p classes
kotlinc-jvm -d classes \
  -classpath /opt/kotlin/kotlinx-coroutines-core-1.2.2.jar \
  Compute.kt UseCompute.kt
pushd classes > /dev/null
javap -c Compute | grep public | grep compute 
popd > /dev/null
/bin/rm -rf classes
