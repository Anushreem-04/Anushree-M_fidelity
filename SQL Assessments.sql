CREATE TABLE Worker (
    worker_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    salary INT,
    joining_date DATE,
    department VARCHAR(50)
);


INSERT INTO Worker (worker_id, first_name, last_name, salary, joining_date, department) VALUES
(1, 'Monika', 'Arora', 100000, '2020-02-14', 'HR'),
(2, 'Niharika', 'Verma', 80000, '2011-02-14', 'Admin'),
(3, 'Vishal', 'Singhal', 300000, '2020-02-14', 'HR'),
(4, 'Amitabh', 'Singh', 500000, '2020-02-14', 'Admin'),
(5, 'Vivek', 'Bhati', 500000, '2011-06-14', 'Admin'),
(6, 'Vipul', 'Diwan', 200000, '2011-06-14', 'Account'),
(7, 'Satish', 'Kumar', 75000, '2020-01-14', 'Account'),
(8, 'Geetika', 'Chauhan', 90000, '2011-04-14', 'Admin');

SELECT * FROM Worker;


CREATE TABLE Bonus (
    worker_ref_id INT,
    bonus_amount INT,
    bonus_date DATE,
    FOREIGN KEY (worker_ref_id) REFERENCES Worker(worker_id)
);


INSERT INTO Bonus (worker_ref_id, bonus_amount, bonus_date) VALUES
(1, 5000, '2020-02-16'),
(2, 3000, '2011-06-16'),
(3, 4000, '2020-02-16'),
(1, 4500, '2020-02-16'),
(2, 3500, '2011-02-16'),
(4, 4500, '2020-02-16'),
(5, 3500, '2011-02-16');
SELECT * FROM Bonus;

CREATE TABLE Title (
    worker_ref_id INT,
    worker_title VARCHAR(50),
    affected_from DATE,
    FOREIGN KEY (worker_ref_id) REFERENCES Worker(worker_id)
);


INSERT INTO Title (worker_ref_id, worker_title, affected_from) VALUES
(1, 'Manager', '2016-02-20'),
(2, 'Executive', '2016-06-11'),
(3, 'Executive', '2016-06-11'),
(4, 'Assistant Manager', '2016-06-11'),
(5, 'Executive', '2016-06-11'),
(6, 'Lead', '2016-06-11'),
(7, 'Executive', '2016-06-11'),
(8, 'Lead', '2016-06-11');

SELECT * FROM Title;

SELECT w.first_name, w.salary, t.worker_title
FROM Worker w
INNER JOIN Title t ON w.worker_id = t.worker_ref_id;

CREATE OR REPLACE FUNCTION get_worker_count_by_nth_highest_salary(n INT) 
RETURNS INTEGER AS $$
DECLARE
    nth_highest_salary INT;
BEGIN
    -- Get the nth highest salary
    SELECT DISTINCT salary INTO nth_highest_salary 
    FROM Worker 
    ORDER BY salary DESC 
    OFFSET n-1 LIMIT 1;

    -- Return the count of workers with that nth highest salary
    RETURN (SELECT COUNT(*) FROM Worker WHERE salary = nth_highest_salary);
END;
$$ LANGUAGE plpgsql;

-- To get the count of workers with the 1st highest salary
SELECT get_worker_count_by_nth_highest_salary(1);



