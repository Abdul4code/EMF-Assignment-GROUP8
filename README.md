# EMF-Assignment-GROUP8
EMF Assignment for Model Driven Engineering at the University Of L'Aquila.

## Assignment Tasks
##### Task 1: Define the Metamodel
Objective: Create a metamodel representing your domain using Emfatic or EMF. <br>
Requirements:
    Number of Metaclasses:
        9 for a 2-member group.
        12 for a 3-member group.
    Must include:
        Inheritance (e.g., subclasses).
        Relationships:
            Containment (e.g., parent-child structures).
            Non-containment.
            Opposites (optional).
        Enumeration types and attributes for diversity.
        Each metaclass must have:
            At least one attribute or reference.
            No isolated or singleton metaclasses.

##### Task 2: Generate APIs and Plugins
Objective: Use the metamodel to create a genmodel file and generate the following:
- Java APIs for the model.
- dit and editor plugin projects for interacting with the model.

##### Task 3: Implement Plugin Functionalities
Objective: Develop a plugin project to manage the model. Include these functionalities: <br>
- Create: Allow users to define new instances based on the metamodel.
- Serialize: Save the models to a persistent format (e.g., XML, XMI).
- Load: Retrieve serialized models.
- Validate: Check the models against constraints defined in the metamodel.

##### Task 4: Instantiate the Metamodel
Objective: Create two concrete model instances based on the metamodel. <br>
Ensure that:
        - Every concept (metaclass) in the metamodel is instantiated.
        - The models reflect the relationships, constraints, and structure defined in Task 1.

##### Task 5: Define OCL/EVL Constraints, Operations, and Derived Fields <br>
Objective: Use OCL or EVL/EOL to define rules and derived values: <br>
    - Constraints:
        3 constraints to validate the models (e.g., ensuring uniqueness, attribute ranges, or logical consistency).
    - Operations:
        2 operations (custom logic to be applied to the model, e.g., calculations or transformations).
    - Derived Fields (for OCL):
        2 fields derived dynamically based on other model attributes.

## Domain of Choice
The domain for this metamodel is a university system. This domain encompasses the organizational, academic, and administrative aspects involved in the functioning of a university. The metamodel is designed to represent key entities within a university, such as students, staff, departments, academic programs, and physical infrastructure, along with their relationships and attributes.



