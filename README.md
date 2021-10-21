## Stats

|                             | API Response Time  | Memory Footprint Approx (%) | WarmUp Time (Startup time) |
|-----------------------------|--------------------|-----------------------------|---------------------------|
|                             |                    |                             | 
| Spring  JVM based App       |   20ms             |  5.8%                       |  3.912  |  
| Spring Native Compiled App  |   13ms             |  1.2%                       | 1.399  |


## Production

```bash
gradlew bootBuildImage

docker-compose up
```

## Local

```bash
docker run --name mariadb-local -e MYSQL_ROOT_PASSWORD=root -e MYSQL_USER=medisoftuser -e MYSQL_PASSWORD=medisoft987 -e MYSQL_DATABASE=patientdb -p 3310:3306 -d mariadb:10.6
```

```bash
gradlew bootRun
```