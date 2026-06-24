    --  data.sql is a SQL script file that Spring Boot executes automatically
    --  during application  startup to insert initial data into the database.
    -- Application Starts -> Database Connected -> Tables Created -> data.sql Executes -> Records Inserted

    INSERT INTO employees(id, name, dept, age)
    VALUES
        (1, 'Usaid', 'IT', 21);

    INSERT INTO employees
    (id, name, dept, age)
    VALUES
        (2, 'John', 'HR', 30);

    INSERT INTO employees
    (id, name, dept, age)
    VALUES
        (3, 'Alice', 'Finance', 28);

    INSERT INTO employees
    (id, name, dept, age)
    VALUES
        (4, 'David', 'Admin', 35);

    INSERT INTO employees
    (id, name, dept, age)
    VALUES
        (5, 'Emma', 'Testing', 25);