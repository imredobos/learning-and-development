val builder = ProcessBuilder("git", "help")
builder.redirectOutput(ProcessBuilder.Redirect.INHERIT)
builder.start()
