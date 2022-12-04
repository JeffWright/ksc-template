import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.prompt
import com.github.ajalt.clikt.parameters.options.required
import dev.jtbw.scriptutils.Store
import dev.jtbw.scriptutils.div
import dev.jtbw.scriptutils.`~`

fun main(args: Array<String>) {
  KscCommand().main(args)
}


class KscCommand : CliktCommand() {
  val scriptName: String by argument("script")

  val kscDir by lazy { `~` / ".ksc" }
  val scriptRepo by lazy { kscDir / scriptName }

  override fun run() {
    println("hello world")
    println("script = ${scriptName}")

    if(!kscDir.exists()) {
      kscDir.mkdirs()
    }

    if(scriptRepo.exists()) {
      println("$scriptRepo exists, executing!")
    } else {
      println("Cloning into $scriptRepo")
    }
  }
}