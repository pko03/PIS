import java.io.File

val filesHere = (new File("/Users/pko03/Documents/SampleFiles/")).listFiles()

for(file <- filesHere) println(file)

for(file <- filesHere if(file.getName.endsWith(".docx"))) println(file)

for(i <- 1 to 4) println("Iteration" + i)

for(i <- 1 until 4) println("Iteration" + i)

def fileLines(file: java.io.File) = {
  scala.io.Source.fromFile(file).getLines().length
}
def countLines() ={
  for(file <- filesHere
      if(file.getName.endsWith(".txt"));
      line <- fileLines(file))
    println(line)
}
