val names = listOf("Pam", "Pat", "Paul", "Paula")

names.find { fun(name: String): Boolean { return name.length == 5 } } //ERROR
)
