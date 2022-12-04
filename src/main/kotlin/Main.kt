import com.github.ajalt.clikt.core.CliktCommand

fun main(args: Array<String>) = Script(args).run()

class Script(args: Array<String>) : CliktCommand() {
  /**
   * Reads from either stdin if available, or from the file named by the first argument Errors &
   * exits if neither is available
   */
  val linesFromStdinOrFileArg: Sequence<String> by lazy { kscript.text.resolveArgFile(args) }

  val linesFromStdin: Sequence<String> by lazy { kscript.text.stdin }

  override fun run() {
    println("running kscript-lite script!")
    TODO("Implement Script!")
  }
}
