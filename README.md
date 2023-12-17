# learn-dmp

DMP is a distributed, high-availability Decision Management application.

This is an experiment to see if the Grimoire plugin for Gippity can help effectively learn a technology stack that is outside of my comfort zone.

- **Frontend:** Angular
- **Backend:** Java with Spring Boot and JAP
  - **ORM**: JPA
- **Database:** ~~Oracle Database~~ Postgres
- **Containerization:** Docker
- **Orchestration & High Availability:** Kubernetes
- **Rules Engine:** IBM ILOG/ODM
- **Caching:** ~~Pivotal GemFire~~ Apache Geode
- **AI/ML Component:** mlp, xgb, kmeans etc. Python-based models or Java-based frameworks (like DL4J, or integrate with an external AI service)
- **Testing Framework:** Rest Assure or Selenium. JUnit, Mockito, or EasyMock.

## Getting Started

1. Build app
```sh
docker compose up --build --remove-orphans
```

2. (Optional) Rebuild app on changes
```sh
docker compose watch
```

3. Visit frontend: http://localhost:4200
4. Visit backend: http://localhost:8080/locations

Stop all running containers
```
docker kill $(docker ps -aq) && docker rm $(docker ps -aq)
```

## About

**IBM ILOG/ODM** is a comprehensive business rules management system that allows you to externalize business logic from your application code.
- 

**Pivotal GemFire Grid** is a distributed, in-memory, key-value store (database) that manages low-latency, real-time transactions (eg. for IoT sensors, transactions). https://tanzu.vmware.com/content/videos/the-world-of-vmware-gemfire
- Most databases run on a single node. GemFire can scale in-memory out.
- Huge peak loads. Everytime you used your credit card, it passes through a Gemfire database.
- Helps make yes/no choices.
- A **region** is like a table
- The open source version of Pivotal GemFire is **Apache Geode**