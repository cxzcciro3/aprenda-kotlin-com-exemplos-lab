// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(var nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
    fun imprimirInformacoes() {
    println("Nome da formação: $nome")
    println("Nível: $nivel")
    println("Conteúdos educacionais:")
    conteudos.forEach { println("- ${it.nome} (Duração: ${it.duracao} horas)") }
    println("Lista de inscritos:")
    inscritos.forEach { println("- ${it.nome}") }
}
}

//Esse código cria 5 usuários, 5 conteúdos e 3 formações, matricula os usuários nas formações correspondentes e 
//imprime as informações de cada formação, incluindo seus conteúdos educacionais e a lista de inscritos em cada uma.

fun main() {
    // Criando usuários
	val usuario1 = Usuario("João")
	val usuario2 = Usuario("Maria")
	val usuario3 = Usuario("Pedro")
	val usuario4 = Usuario("Ana")
	val usuario5 = Usuario("Lucas")

    // Criando conteúdos educacionais
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 5)
    val conteudo2 = ConteudoEducacional("Classes e objetos", 8)
    val conteudo3 = ConteudoEducacional("Lambda expressions", 4)
    val conteudo4 = ConteudoEducacional("Coleções", 6)
    val conteudo5 = ConteudoEducacional("Testes automatizados", 3)

    // Criando formações
    val formacao1 = Formacao("Kotlin Básico", listOf(conteudo1, conteudo2), Nivel.BASICO)
    val formacao2 = Formacao("Kotlin Intermediário", listOf(conteudo2, conteudo3, conteudo4), Nivel.INTERMEDIARIO)
    val formacao3 = Formacao("Kotlin Avançado", listOf(conteudo3, conteudo4, conteudo5), Nivel.AVANCADO)

    // Matriculando usuários nas formações
    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)
    formacao1.matricular(usuario3)
    formacao2.matricular(usuario2)
    formacao2.matricular(usuario4)
    formacao3.matricular(usuario3)
    formacao3.matricular(usuario4)
    formacao3.matricular(usuario5)

    // Imprimindo informações das formações
    formacao1.imprimirInformacoes()
    println()
    formacao2.imprimirInformacoes()
    println()
    formacao3.imprimirInformacoes()
}
