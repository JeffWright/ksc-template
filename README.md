## What is this?
This simple utility lets you write kotlin scripts in your IDE of choice, then run them from the terminal.  Basically, it enables workflows like this:

```
cat somefile.txt | grep foo | ~/my-kotlin/script/run > output.txt
```


## How to Use:

### Create a new script
1. Clone this repository, write whatever script you want in [Main.kt](src/main/kotlin/Main.kt).
2. use the included `run` bash script, which will (behind the scenes)
   3. Build your script into a jar
   4. Run that jar
   5. forward arguments and stdin given to `run` to your kotlin code

### Or use with an existing repository
Just copy `run` into your own repository.  It makes some assumptions, but can easily be modified.
   
## Doesn't kscript exist already?

Yes, and it has many more features than this.  But if you just want to write "regular" Kotlin, you 
don't want to mess around with wacky file annotations, and you want your scripts to be IntelliJ
projects instead of just files, this approach might be for you.

