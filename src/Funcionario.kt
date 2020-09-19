data class Funcionario(val nome: String, val numeroDeRegistro: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Funcionario

        if (numeroDeRegistro != other.numeroDeRegistro) return false

        return true
    }

}

fun main() {
    val func1 = Funcionario("maria", 1)
    val func2 = Funcionario("joao", 2)
    val func3 = Funcionario("jose", 3)
    val func4 = Funcionario("pedro", 4)

    val lista = mutableListOf(func1, func2, func3, func4)

    val novoFunc = Funcionario("rodrigo", 2)

    println(lista.contains(novoFunc))
}