import com.agiledeveloper.delegates.PoliteString

var comment: String by PoliteString("Some nice message")
println(comment)

comment = "This is stupid"
println(comment)

println("comment is of length: ${comment.length}")