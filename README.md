# Air Quality Monitoring API
A Spring Boot REST API for monitoring air quality across multiple stations and pollutants. The application uses PostgreSQL to store measurements and provides endpoints to retrieve the latest and all air quality data. This project is ideal for integration with visualization tools like Power BI or custom dashboards.
## Features
- Spring Boot REST API with Maven
- PostgreSQL database with schema and sample data
- Endpoints to fetch latest measurements and all measurements
- Well-structured code with `controller`, `model`, and `repository` packages
- Easy setup and reproducible development environment
## Prerequisites
- Java 17
- Maven
- PostgreSQL 18 (or compatible)
- Optional: Postman or any API testing tool
## Getting Started
Clone the repository: `git clone https://github.com/MarcosDevlocal/air-quality-monitoring-api.git && cd air-quality-monitoring-api`. 

Create the PostgreSQL database: `createdb -U postgres air_quality_db`. 

Restore the database dump: `psql -U postgres -d air_quality_db -f sql/air_quality_full.sql`.

Configure database connection by editing `src/main/resources/application.yml`
with your PostgreSQL credentials: 
```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/air_quality_db
    username: postgres
    password: postgres
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate:
        format_sql: true
```
Run the application: mvn spring-boot:run. The API will start on http://localhost:8080.

## API Endpoints
Get latest 100 measurements:
GET /api/measurements/latest

Get all measurements: 
GET /api/measurements/all

Example Response
```yaml
[
  {
    "id": 1,
    "station": { "id": 1, "name": "Centro" },
    "pollutant": { "id": 1, "name": "PM2.5", "unit": "µg/m³" },
    "value": 12.5,
    "measuredAt": "2025-12-21T08:00:00+01:00"
  },
  ...
]
```
## Project Structure
``` yaml
src/
├─ main/
│  ├─ java/com/marcos/airquality/
│  │  ├─ controller/       <-- REST controllers
│  │  ├─ model/            <-- JPA entities
│  │  └─ repository/       <-- Spring Data repositories
│  └─ resources/
│      └─ application.yml  <-- configuration
sql/
├─ air_quality_full.sql     <-- complete database dump
pom.xml                     <-- Maven configuration
```

