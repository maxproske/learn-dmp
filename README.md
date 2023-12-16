# learn-dmp

DMP is a distributed, high-availability Decision Management application.

This is an experiment to see if the Grimoire plugin for Gippity can help effectively learn a technology stack that is outside of my comfort zone.

- **Frontend:** Angular (http://localhost:4200)
- **Backend:** Java with Spring Boot and JAP (http://localhost:8080/locations)
  - **ORM**: JPA
- **Database:** ~~Oracle Database~~ Postgres
- **Containerization:** Docker
- **Orchestration & High Availability:** Kubernetes
- **Rules Engine:** IBM ILOG/ODM
- **Data Grid:** Pivotal Gemfire Grid
- **AI/ML Component:** Python-based models or Java-based frameworks (like DL4J, or integrate with an external AI service)

## Getting Started

```sh
docker compose up --build

docker compose watch
```

Visit http://localhost:4200/