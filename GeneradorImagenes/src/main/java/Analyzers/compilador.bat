java -jar "jflex-full-1.8.2 .jar" LexicoCapas.flex
java -jar java-cup-11b.jar -parser ParserCapas -symbols sym ParserCapas.cup
java -jar "jflex-full-1.8.2 .jar" LexicoImagenes.flex
java -jar java-cup-11b.jar -parser ParserImagenes -symbols sym2 ParserImagenes.cup
java -jar "jflex-full-1.8.2 .jar" LexicoUsuarios.flex
java -jar java-cup-11b.jar -parser ParserUsuarios -symbols sym3 ParserUsuarios.cup