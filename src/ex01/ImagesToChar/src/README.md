To build the application, follow these five steps:

1. Mark the src/java as Root

2. Compile the Java code:
   javac -d ./target src/java/edu/school21/printer/*/*.java

3. Copy resources to jar folder
   cp -R src/resources target/.

4. Create the JAR file:
   jar cmvf src/manifest.txt ./target/images-to-chars-printer.jar -C target/ . 
// -C src/resources можно попробовать с таким флагом но у меня не работает(

5. Run the application:
   java -jar target/images-to-chars-printer.jar . 0 target/resources/it.bmp 
   (you can change last to characters "." or/and "0" to any other characters and file)