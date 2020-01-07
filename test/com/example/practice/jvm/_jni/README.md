# Very simple Java JNI demo

## create JNI bindings
` javac -h /path-to-project/test/com/example/practice/jvm/_jni/ Hello.java`

## compile c
`gcc -I"/opt/java11/include/" -I"/opt/java11/include/linux" -lc -shared -o libDisplay.so Display.c`

## compile java
`javac Display.java`

## run test
`java -Djava.library.path=. Display`

## clean 
`rm Display.h libDisplay.so Display.class`

