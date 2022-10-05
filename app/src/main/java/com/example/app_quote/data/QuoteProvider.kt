package com.example.app_quote.data

import com.example.app_quote.domain.model.QuoteModel

class QuoteProvider {
    companion object {

        fun random(): QuoteModel {
            val position = (0..11).random()
            return quotes[position]
        }

        private val quotes = listOf(
            QuoteModel(
                quote = """La mejor forma de obtener información correcta de los foros de 
                    |Usenet es enviar algo incorrecto y esperar las correcciones""".trimMargin(),
                author = "Matthew Austern"
            ),
            QuoteModel(
                quote = """No temo a los ordenadores; lo que temo es quedarme sin ellos""",
                author = "Isaac Asimov"
            ),
            QuoteModel(
                quote = """Pienso que los virus informáticos muestran la naturaleza humana: 
                    |la única forma de vida que hemos creado hasta el momento es puramente destructiva""".trimMargin(),
                author = "Stephen Hawking"
            ),
            QuoteModel(
                quote = """Una vez un ordenador me venció jugando al ajedrez, pero no me opuso 
                    |resistencia cuando pasamos al kick boxing""".trimMargin(),
                author = "Emo Philips"
            ),
            QuoteModel(
                quote = "Los estándares son siempre obsoletos. Eso es lo que los hace estándares",
                author = "Alan Bennett"
            ),
            QuoteModel(
                quote = """El hardware es lo que hace a una máquina rápida; el software es lo que 
                    |hace que una máquina rápida se vuelva lenta""".trimMargin(),
                author = "Craig Bruce"
            ),
            QuoteModel(
                quote = """En la actualidad nos hacen creer que ayudar a un amigo es moralmente
                    |equivalente a atacar un barco. Te llaman pirata""".trimMargin(),
                author = "Richard Stallman"
            ),
            QuoteModel(
                quote = """Si piensas que la tecnología puede solucionar tus problemas de seguridad,
                     |está claro que ni entiendes los problemas ni entiendes la tecnología""".trimMargin(),
                author = "Bruce Schneier"),
            QuoteModel(
                quote = "Hablar es fácil. Muéstrame el código.",
                author = "Linus Torvalds"),
            QuoteModel(
                quote = """Enseñar a los niños el uso de software libre en las escuelas, 
                    |formará individuos con sentido de libertad""".trimMargin(),
                author = "Richard Stallman"
            ),
            QuoteModel(
                quote = "El mejor lugar para estudiar es el ITVO",
                author = "Academia de Informatica y Tics"),
            QuoteModel(
                quote = "El respeto al derecho ajeno es la paz",
                author = "Benito Juárez García")
        )
    }
}

