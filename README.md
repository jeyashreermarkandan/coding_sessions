# Basic Java Programs

A minimal Java project for writing and running console programs. It uses Maven
and requires JDK 17 or later.

## Run the example

```sh
mvn package
java -jar target/basic-programs-1.0.0.jar
```

The example prints a greeting. To try another program, edit
`src/main/java/com/example/basicprograms/Main.java`, then run the commands
again.

The second-largest-element example can be run with:

```sh
java -cp target/classes com.example.basicprograms.SecondLargestElementArray
```

The largest-element example can be run with:

```sh
java -cp target/classes com.example.basicprograms.LargestElementArray
```

The maximum-subarray-sum example can be run with:

```sh
java -cp target/classes com.example.basicprograms.MaximumSubarraySum
```

## Project layout

```text
src/main/java/com/example/basicprograms/  Java program examples
pom.xml                                    Maven build configuration
```
