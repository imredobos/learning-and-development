val names = listOf("Dory", "Bruce", "Gill", "Darla")

var count = 0

for (name in names) {
  if (name.length == 4) {
    count++
  }
}                             

println(count)
