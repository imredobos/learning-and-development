#---
# Excerpted from "Programming Kotlin",
# published by The Pragmatic Bookshelf.
# Copyrights apply to this code. It may not be used to create training material,
# courses, books, articles, and the like. Contact us if you are in doubt.
# We make no guarantees that this code is fit for any purpose.
# Visit http://www.pragmaticprogrammer.com/titles/vskotlin for more book information.
#---
export PATH=/opt/kotlin/native/kotlin-native-macos-1.3.31/bin:$PATH
npm install
jsinterop -target wasm32 -pkg kotlinx.interop.wasm.dom
kotlinc-native -target wasm32 check.kt -library nativelib -o check
