# learn-dmp

DMP is a distributed, high-availability Decision Management application.

This is an experiment to see if the Grimoire plugin for Gippity can help effectively learn a technology stack that is outside of my comfort zone.

- **Frontend:** AngularJS 17
- **Backend:** Java 17 with Spring Boot
- **Database:** Apache Geode ~~Oracle Database~~ ~~Postgres~~
- **Caching:** Apache Geode ~~Pivotal GemFire~~
- **Rules Engine:** IBM ODM
- **Containerization:** Docker
- **Orchestration & High Availability:** Kubernetes
- **AI/ML Component:** mlp, xgb, kmeans etc. Python-based models or Java-based frameworks (like DL4J, or integrate with an external AI service)
- **Testing Framework:** Rest Assure or Selenium. JUnit, Mockito, or EasyMock.

## Getting Started

1. Build app
```sh
docker compose up --build --remove-orphans
```

2. (Optional) Rebuild on changes
```sh
docker compose watch
```

3. Visit IBM ODM Decision Center: **http://localhost:9060**

> Admin user: odmAdmin / odmAdmin
> Business User: rtsUser1 / rtsUser1

4. Visit Angular frontend: **http://localhost:4200**
5. Visit Spring Boot backend: **http://localhost:8080**
