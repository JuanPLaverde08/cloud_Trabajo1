# Spring Project Manager - Parcial Cloud

[API is live here](https://cloud-taller-1.herokuapp.com/)

Postman suit can be used to understand the routing and the contracts
Spring boot API used to create projects, tasks and handling it's state

The API is documented within the [Postman Suite](https://github.com/JuanPLaverde08/cloud_Trabajo1/blob/master/Taller_cloud_1.postman_collection.json)

## Requirements

To run the project is necesary to have the heroku cli installed or using a local enviroment

### With heroku cli

#### Requirements
- Heroku CLI
- Gradle

```bash
gradle build
heroku local web
```

Then visit [localhost:5000](http://localhost:5000)

### With a local environment

#### Requirements
- JDK (8 / 11)
- Gradle

```bash
gradle build

// Unix
./gradlew bootRun

// Windows
.\gradlew bootRun
```

Then visit [localhost:8080](http://localhost:8080)

## Authors
- Nicolas Macias
- Juan Pablo Laverde
- Andres Lopez

Computación en la nube

2021

