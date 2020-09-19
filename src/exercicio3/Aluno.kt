package exercicio3

data class Aluno(val numeroDeAluno: Int, val nome:String) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Aluno

        if (numeroDeAluno != other.numeroDeAluno) return false

        return true
    }
}