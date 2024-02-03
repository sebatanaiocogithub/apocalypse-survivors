# apocalypse-survivors
Apocalypse Survivor Specification
Survivor review app

JDBC URL
jdbc:postgresql://localhost:5432/survivors 
IDE
•	Spring | Tools 
•	Download IntelliJ IDEA – The Leading Java and Kotlin IDE (jetbrains.com) 
Database
PostgreSQL
Query tool
Postman


API first
Endpoint	HTTP method	Status	Description
/survivors	GET	200	Get all the survivors
/survivors	POST	201	Create a new survivor.
/survivors/survivorId	GET	200	Get a survivor with a given survivorId.
			
/survivors/survivorId	PUT	200	Update a survivor location of the given survivorId.

API first
Endpoint	HTTP method	Status	Description
/api/survivors/{survivorId}/
Report-contamination	GET	200	Get contamination report by Id

API first
Endpoint	HTTP method	Status	Description
/api/infectedPercentage	GET	200	Percentage of infected and non
infected  survivors.
/survivors/infected	GET	200	List of infected survivors
/survivors/nonInfected	GET	200	List of non-infected survivors
/robots	GET	200	List of robots
/robots/land	GET	200	List of land robots
/robots/flying	Get	200	List of flying robots



