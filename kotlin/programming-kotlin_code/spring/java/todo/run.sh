#---
# Excerpted from "Programming Kotlin",
# published by The Pragmatic Bookshelf.
# Copyrights apply to this code. It may not be used to create training material,
# courses, books, articles, and the like. Contact us if you are in doubt.
# We make no guarantees that this code is fit for any purpose.
# Visit http://www.pragmaticprogrammer.com/titles/vskotlin for more book information.
#---
curl -w "\n" -X GET http://localhost:8080/task
echo ""
curl -w "\n" -X POST \
  -H "Content-Type: application/json" \
  -d '{"description": "write code"}' http://localhost:8080/task
curl -w "\n" -X POST \
  -H "Content-Type: application/json" \
  -d '{"description": "test"}' http://localhost:8080/task
echo ""
curl -w "\n" -X GET http://localhost:8080/task
echo ""
curl -w "\n" -X DELETE http://localhost:8080/task/1
curl -w "\n" -X DELETE http://localhost:8080/task/10
echo ""
curl -w "\n" -X GET http://localhost:8080/task
