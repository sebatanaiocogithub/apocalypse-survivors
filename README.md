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
		404	When a survivor with a given survivorId does not exist.
/survivor/survivorId	DELETE	204	Delete a survivor with a given survivorId.

API first
Endpoint	HTTP method	Status	Description
/api/survivors/{survivorId}/
Report-contamination	GET	200	Get contamination report by Id


API first
Endpoint	HTTP method	Status	Description
/api/calculatePercentage/
infectedSurvivors	GET	200	Percentage of infected survivors.
/api/calculatePercentage/
nonInfectedSurvivors	GET	200	Percentage of non infected survivors.
/survivors/infectedSurvivors	GET	200	List of infected survivors
/survivors/nonInfectedSurvivors	GET	200	List of non-infected survivors
/robots	GET	200	List of robots
/robots/category/{Land}	GET	200	List of land robots
/robots/category/{Flying}	Get	200	List of flying robots


