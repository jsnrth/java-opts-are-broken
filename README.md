# JAVA_OPTS breaks the docker container

Providing a `JAVA_OPTS` environment variable to a docker container is broken -- I get an error.

```
$ sbt docker:publishLocal
$ docker run -p 9090:9090 -e 'JAVA_OPTS="-Dhttp.port=9090"' java-opts-are-broken:1.0.0
Error: Could not find or load main class "-Dhttp.port=9090"
```
