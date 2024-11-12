# Conventional1

## Context

**Domain of Application:** Landmark maintenance management.

### Structure

![Structure](/docs/structure.png)

<sub>*_(Image obtained via NetBeans just for explanation. Don't worry if you're using another IDE)_</sub>

There are 3 packages: **controller**, **dao**, and **model**.
- In the **controller** package, there is the **Conventional1** class. This is the controller class for business logic methods.
- In the **dao** package are the classes **LandmarkDAO** and **MaintenanceDAO**. These are interfaces that are used by the QueryBuilder to generate queries to the databases.
- In the **model** package, there are the **Landmark** and **Maintenance** classes. 

There is 1 test package: **tests**.
- In the **tests** package, there are the classes **Conventional1Test** and **IntegrationTest**, responsible for unit and integration tests.

### Landmarks

In the context of this example, landmarks are points of interest in a location. For example, Aqueduct of Segovia, Temple of Jupiter, Pompeii Ruins, etc. Below is a view of the landmarks table with a small number of tuples for illustration.

![Table](/docs/table.png)

The class **model.Landmark** maps the **landmark** table from the **experiment** database stored in PostgreSQL using JPA.

The attributes of the table are intuitive.
- name: name of the landmark
- inauguration: approximate year of inauguration
- location: name of the city where the landmark is located
- designer: architect designer
- category: landmark category, for example, statues, castles, towers, fountains, museums, etc

<sub>*_(The data used in this experiment were generated randomly. Although inspired by real data, they do not reflect accurate information. It is for experimental purposes only.)_</sub>

### Maintenances

In the context of this example, maintenances reports record information about services performed on a landmark. Example, restoration, cleaning, reinforcement, etc. Below is a view of the maintenance collection with a small number of documents for illustration.

![Collection](/docs/collection.png)

The class **model.Maintenance** maps the **maintenance** collection from the **experiment** database stored in MongoDB using Morphia ODM.

The properties of the collection are intuitive.
- landmark: name of the landmark where the maintenance services were performed
- type: type of maintenance performed. Example, restoration, cleaning, reinforcement, etc
- initialization: start date of the execution of maintenance services
- finalization: end date of the execution of maintenance services
- company: company that performed the services
- costs: cost of maintenance services performed

<sub>*_(The data used in this experiment were generated randomly. Although inspired by real data, they do not reflect accurate information. It is for experimental purposes only.)_</sub>

## Task

🎯 **Obtain the total costs of all maintenance performed on all landmarks in a given location.**

### Steps

**1.** Download the project source code and open it with your preferred IDE. If prompt grant remote access to the Java process and/or your IDE.
⏬ [Download here!](https://codeload.github.com/PolyglotExperiment/Conventional1/zip/refs/heads/main) or `git clone https://github.com/PolyglotExperiment/Conventional1.git`

**2.** Run the tests for the project. You must have **3** failed tests. The failing tests are related to the method **sumCostsByLocation(String location)** in the class **controller.Conventional1**.

![Tests](/docs/tests.png)

**3.** Once you're ready to start, **⏰⏰⏰ NOTE THE START TIME ⏰⏰⏰**.
- To ensure the tests pass, you must appropriately implement the **sumCostsByLocation(String location) method, using the Conventional Approach** with independent DAOs.
- All packages and classes allow you to modify their code. However, prevent modifying any of the current tests.

**4.** **⏰⏰⏰ NOTE THE END TIME ⏰⏰⏰**.

**5.** Please send email the whole project code (Conventional1) as a _zip_, _tar.gz_, rar, or _7z_ file to **fernando.opc@gmail.com**. To prevent attachment issues on some email servers, run `mvn clean` or manually delete the `target` and `.git` folder. If you have troubles with email attachments, send only the Java classes that you modified.
  
> [!WARNING]
> Do not alter any of the existing tests.
> 
> Don't forget to **NOTE the START and END times** of your coding.
