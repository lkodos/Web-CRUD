DROP TABLE IF EXISTS employees;

CREATE TABLE IF NOT EXISTS employees
(
    id            BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    first_name    VARCHAR(20),
    last_name     VARCHAR(20),
    pat_name      VARCHAR(20),
    phone         VARCHAR(20),
    department_id INT
);