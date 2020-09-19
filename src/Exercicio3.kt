import exercicio3.Aluno

fun main() {
    val listaAlunos = listOf<Aluno>(Aluno(1, "Luiz"), Aluno(2, "Matheus"))

    val alunaThamires = Aluno(1, "Thamires")

    print(listaAlunos.contains(alunaThamires))
}