import com.agiledeveloper.delegates.beingpolite

var comment: String by beingpolite("Some nice message")
println(comment)

comment = "This is stupid"
println(comment)

println("comment is of length: ${comment.length}")
