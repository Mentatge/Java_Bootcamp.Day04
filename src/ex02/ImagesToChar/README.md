To build the application, follow these steps:

1. Compile the Java code:
   javac -cp lib/JCDP-2.0.1.jar:lib/jcommander-1.78.jar  src/java/edu/school21/printer/*/*.java -d ./target

2. Copy resources to jar folder:
   cp -R src/resources target/.

4. Move JAR files:
   cd target && jar xf ../lib/jcommander-1.78.jar && jar xf ../lib/JCDP-2.0.1.jar && cd ..

5. Create jar file:
   jar cfm ./target/images-to-chars-printer.jar src/manifest.txt -C target .

6. Run apllication:
   java -jar target/images-to-chars-printer.jar --white=RED --black=GREEN
