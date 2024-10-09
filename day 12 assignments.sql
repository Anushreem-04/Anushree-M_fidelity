create table Customers (
    customer_id varchar(10) primary key,
    customer_name varchar(50),
    address varchar(100),
    phone_number varchar(15),
    email varchar(50)
);

create table Hotel_details (
    hotel_id int primary key,
    hotel_name varchar(20),
    hotel_type varchar(20),
    rating decimal(3,1)
);

ceate table Delivery_partners (
    partner_id int primary key,
    partner_name varchar(50),
    phone_number varchar(15),
    rating decimal(3,1)
);
select*from Delivery_partners;

create table Orders (
    order_id int primary key,
    customer_id varchar(10),
    hotel_id int,
    order_date date,
    order_amount decimal(10,2),
    foreign key (customer_id) references Customers(customer_id),
    foreign key (hotel_id) references Hotel_details(hotel_id)
);
insert into Customers values
('CUST1001', 'Doe', '123 Main St', '1234567890', 'doe@gmail.com'),
('CUST1002', 'Smitha', '456 Elm St', '2345678901', 'smitha@yahoo.com'),
('CUST1003', 'John', '789 Oak St', '3456789012', 'john@gmail.com'),
('CUST1004', 'Arun', '321 Pine St', '4567890123', 'arun@yahoo.com');

insert into Hotel_details values
(1, 'A2B', 'VEG', 4.5),
(2, 'McDonalds', 'NON-VEG', 4.2),
(3, 'Dominos', 'NON-VEG', 4.0),
(4, 'KFC', 'NON-VEG', 2.8);

insert into Delivery_partners values
(101, 'Mahesh', '5678901234', 4.7),
(102, 'Sandy', '6789012345', 4.2),
(103, 'Tom', '7890123456', 3.9),
(104, 'Anand', '8901234567', 4.5);

insert into Orders values
(1, 'CUST1001', 1, '2019-05-10', 500.00),
(2, 'CUST1002', 2, '2019-05-11', 750.00),
(3, 'CUST1003', 3, '2019-05-12', 600.00),
(4, 'CUST1004', 4, '2019-06-01', 800.00),
(5, 'CUST1001', 2, '2019-06-02', 700.00),
(6, 'CUST1002', 3, '2019-06-03', 550.00),
(7, 'CUST1003', 1, '2019-06-04', 450.00);

select * from Orders;

select partner_id, partner_name, phone_number
from Delivery_partners
where rating between 3 and 5
order by partner_id;

select *from Customers;

update Customers
set phone_number = '9876543210'
where customer_id = 'CUST1004';

select customer_id, customer_name, address, phone_number
from Customers
where email like '%@gmail.com'
order by customer_id;

alter table Customers
alter column customer_id type int using customer_id::int;

alter table Hotel_Details
rename column Rating to Hotel_Rating;
select*from Hotel_Details;

select concat(hotel_name, ' is a ', hotel_type, ' hotel') as HOTEL_INFO
from Hotel_details
order by HOTEL_INFO desc;

select h.hotel_id, h.hotel_name, count(*) as NO_OF_ORDERS
from Hotel_details h
join Orders o on h.hotel_id = o.hotel_id
group by h.hotel_id, h.hotel_name
having count(*) > 5
order by h.hotel_id asc;

SELECT DISTINCT h.hotel_id, h.hotel_name, h.hotel_type
FROM Hotel_details h
LEFT JOIN Orders o ON h.hotel_id = o.hotel_id AND TO_CHAR(o.order_date, 'YYYY-MM') = '2019-05'
WHERE o.order_id IS NULL
ORDER BY h.hotel_id ASC;

SELECT o.order_id, c.customer_name, h.hotel_name, o.order_amount
FROM Orders o
JOIN Customers c ON o.customer_id = c.customer_id
JOIN Hotel_details h ON o.hotel_id = h.hotel_id
ORDER BY o.order_id ASC;

CREATE TABLE PIZZA (
    pizza_id INT PRIMARY KEY,
    pizza_type VARCHAR(20),
    amount DECIMAL(10,2)
);

UPDATE PIZZA
SET amount = amount * 0.97
WHERE pizza_type = 'Extra Large';

select* from PIZZA;

CREATE TABLE IF NOT EXISTS salesman (
    salesman_id INT PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS new_orders (
    order_id INT PRIMARY KEY,
    order_date DATE,
    amount DECIMAL(10, 2),
    salesman_id INT,
    FOREIGN KEY (salesman_id) REFERENCES salesman(salesman_id)
);

CREATE TABLE IF NOT EXISTS Supplier (
    supplier_id INT PRIMARY KEY,
    supplier_name VARCHAR(50)
);

ALTER TABLE Supplier
ADD CONSTRAINT check_supplier_name CHECK (LENGTH(supplier_name) > 0);

SELECT * FROM Supplier;