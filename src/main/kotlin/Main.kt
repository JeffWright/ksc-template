import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.options.flag
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.required
import java.io.File

fun main(args: Array<String>) = Script(args)
  // If you want Clikt to process your args, uncomment this line:
  .main(args)

  // If you don't, uncomment this line:
  //.run()

class Script(val args: Array<String>) : CliktCommand() {
  /**
   * Reads from either stdin if available, or from the file named by the first argument Errors &
   * exits if neither is available
   */
  val linesFromStdinOrFileArg: Sequence<String> by lazy { kscript.text.resolveArgFile(args) }

  val linesFromStdin: Sequence<String> by lazy { kscript.text.stdin }

  // Clikt args examples:
  /*
  val file by argument()
  val from: String by option().required()
  val to: String by option().required()
  val dryRun: Boolean by option().flag()
   */

  override fun run() {
    println("running kscript-lite script!")
    TODO("Implement Script!")
  }

}
