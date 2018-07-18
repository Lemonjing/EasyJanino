## EasyJanino

Janino is a super-small, super-fast Java compiler.

Janino can not only compile a set of source files to a set of class files like JAVAC, but also compile a Java expression, block, class body or source file in memory, load the bytecode and execute it directly in the same JVM.

scala优先编译

mvn clean scala:compile install -Dmaven.test.skip=true -Ponline
