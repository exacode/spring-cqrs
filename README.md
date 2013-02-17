# Example of cqrs application module #

## Database and query meta model ##

Process of changing table/model structure:
* Create sql script that do what you want
* Update database with Flyway mechanism
* Update Query Meta Model by JOOQ maven plugin

Dependencies:
* *Flyway* - is used as database migration tool.
* *JOOQ* - is used as a query builder mechanism. Query meta model is used by JOOQ is generated from database tables. 

### Database migration with Flyway ###
* After project is deployed on server, database is automatically initialized and upgreaded. There is no need to use command tool.
* If you want to manually upgread the database. Use command tool: 
	
	mvn -Pdb-tools initialize flyway:init
	mvn -Pdb-tools initialize flyway:migrate

### Generating JOOQ - Query Meta Model ### 
* Meta model is generated to src/main/java location so there is no need to generate automatically by IDE

	mvn -Pdb-tools initialize org.jooq:jooq-codegen-maven:generate
	

### Database and Query Meta Model in single command ### 
Update database and Update Query Meta Model steps can be invoked from single command:

	mvn -Pdb-tools process-resources
