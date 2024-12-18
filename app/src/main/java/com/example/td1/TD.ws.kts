println("Les dofus")

fun greetings(name: String = "Craqueleur") {
    return println("Salut $name, ton nom fait ${name.length} caractères")
}

greetings(name = "kiku")