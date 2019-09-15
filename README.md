Quarkus with support for GraalVM, Open JDK 11 og Open JDK 8

Make sure you have the right java version in `pom.xml`.

```diff
- GraalVM 19.2.0.1 is built on jdk 8. 
``` 

Build first with `mvn package` for java 11 and 8, or build with 
`mvn package -Pnative -Dnative-image.docker-build=true` for native compilation (using GraalVM).

Use one of the Dockerfiles to bundle with the correct JDK

`docker build -f src/main/docker/Dockerfile.native -t tordly/quarkus-native .`

`docker build -f src/main/docker/Dockerfile.jdk11 -t tordly/quarkus-jdk11 .`

`docker build -f src/main/docker/Dockerfile.jdk8 -t tordly/quarkus-jdk8 .`

Run the app with `docker run -i --rm -p 8080:8080 quarkus/quarkus-native`
