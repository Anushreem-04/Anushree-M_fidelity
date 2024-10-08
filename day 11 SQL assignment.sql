create table tblShippers(ShipperID int primary key,CompanyName varchar(25) unique not null);
insert into tblShippers (ShipperID, CompanyName)
values(1, 'FastTrack Shipping'),(2, 'Speedy Delivery');
select*from tblShippers;

create table tblCustomers(CustomerID int primary key,
CompanyName varchar(25),
City varchar(23),
Region varchar(23),
Country varchar(25) default 'Canada');
insert into tblCustomers (CustomerID, CompanyName, City, Region)
values(1, 'ABC Corp', 'Toronto', 'east' ),
(2, 'XYZ Inc.','Vancouver', 'west' );
select*from tblCustomers;
drop table tblOrders;
create table tblOrders (OrderID int primary key,   
CustomerID int references tblCustomers(CustomerID) ON DELETE CASCADE,    
EmployeeID INT,               
OrderDate DATE,    
ShippedDate DATE CHECK (ShippedDate > OrderDate));
insert into tblOrders (OrderID, CustomerID, EmployeeID, OrderDate, ShippedDate)
VALUES(11, 1, 101, '2024-09-05', '2024-09-01' ),
(12, 2, 102, '2024-09-03', '2024-09-02');
select * from tblOrders;

create table tblOrderDetails(OrderID int references tblOrders(OrderID) ON DELETE CASCADE,        
UnitPrice DECIMAL(10, 2) NOT NULL,    
Quantity INT CHECK (Quantity > 0), 
PRIMARY KEY (OrderID));
INSERT INTO tblOrderDetails (OrderID, UnitPrice, Quantity)
VALUES(11, 1500.00, 0),
(12, 800.00, 0);
select * from tblOrderDetails;
