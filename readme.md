An SBT example project to demonstrate sbt assembly warnings

    $ sbt assembly
    ...
    [info] Including from cache: slf4j-api-1.7.20.jar
    [info] Including from cache: logback-classic-1.1.7.jar
    [info] Including from cache: logback-core-1.1.7.jar
    [info] Including from cache: scala-library-2.11.7.jar
    [info] Checking every *.class/*.jar file's SHA-1.
    [info] Merging files...
    [warn] Merging 'META-INF\MANIFEST.MF' with strategy 'discard'
    [warn] Merging 'META-INF\maven\ch.qos.logback\logback-classic\pom.properties' with strategy 'discard'
    [warn] Merging 'META-INF\maven\ch.qos.logback\logback-classic\pom.xml' with strategy 'discard'
    [warn] Merging 'META-INF\maven\ch.qos.logback\logback-core\pom.properties' with strategy 'discard'
    [warn] Merging 'META-INF\maven\ch.qos.logback\logback-core\pom.xml' with strategy 'discard'
    [warn] Merging 'META-INF\maven\org.slf4j\slf4j-api\pom.properties' with strategy 'discard'
    [warn] Merging 'META-INF\maven\org.slf4j\slf4j-api\pom.xml' with strategy 'discard'
    [warn] Strategy 'discard' was applied to 7 files
    [info] Packaging C:\Users\npw\tmp\sbt-assembly-example\target\scala-2.11\sbt-asm-test-assembly-0.1.jar ...
    [info] Done packaging.
    [success] Total time: 10 s, completed 15-Jul-2016 14:10:57
