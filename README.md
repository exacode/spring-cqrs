# Example of cqrs application module

Process of changing table/model structure:
* Create sql script that do what you want
* Update entities
* Update database with Flyway mechanism
* Update meta models (Query Meta Model, Write Meta Model) by QueryDSL maven plugin

Dependencies:
* *Flyway* - is used as database migration tool.
* *QueryDSL* - is used as a tool for type safe SQL-like queries.

## Write stack
Uses Hibernate and jpa-querydsl.

## Read stack
Uses sql-querydsl with spring-jdbc-extension.

## Database migration with Flyway
* After project is deployed on server, database is automatically initialized and upgreaded. There is no need to use command tool.
* If you want to manually upgread the database. Use command tool: 
	
	mvn -Pdb-tools initialize flyway:init
	mvn -Pdb-tools initialize flyway:migrate

## Generating Query Meta Model
Query meta model is generated from tables from database.
It is is generated to src/main/java location, so there is no need to generate automatically by IDE or to generate it during integration tests on hudson.

	mvn -Pdb-tools initialize com.mysema.querydsl:querydsl-maven-plugin:export
	

### Generating Command Meta Model
Command Meta Model is generated from JPA entities. It is automatically generated during compile phase to target/generated-sources/querydsljpa directory.

	mvn compile
