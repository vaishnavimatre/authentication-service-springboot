create database shopmanagement3;
use shopmanagement3;

use shopping_cart_management;
create table User5(UserName varchar(17),loginName varchar(40),Password varchar(18),userRole Varchar(18));
insert into User5 values('Vaishnavi','vaishnavimatre8@gmail.com','Matre@123','abc');
insert into User2 values('Vaishii','Matre','123','abc');
insert into User2 values('a','b','c','d');
select * from User;
select * from User3;
select * from User2;
select * from User1  where loginName=' b' and password=123;

select * from user3 where UserName ='Vaishnavi';
alter User  password ;

use shopping_cart_management;
create table productt1(productname varchar(17),productID varchar(20),price varchar(20),Quantity varchar(20),category varchar(18));
insert into productt1 values('shampoo',101,1,10,'dailyeseential');
select * from productt1;

create database shopping_cart_management4;
use shopping_cart_management4;
create table User6(UserName varchar(40),loginName varchar(40),Password varchar(40),userRole Varchar(40));
select * from User5;
insert into User6 values('Vaishnavi','vaishnaviMatre8@gmail.com','Matre@123','abc');
 select* from user5 where UserName='Vaishnavi';
 select * from user5 where UserName='Vaishnavi';create table Product2(productName varchar(20),ProductId int,Quantity varchar(20),Price int,Category varchar(20));
 insert into Productt1 values('shampoo',101,'100gm',1,'dailyessential');
create database shoping_cart_managementt;
 
use shoping_cart_managementt;
//create table User(UserName varchar


create database shopping_cart_management4;
use shopping_cart_management4;
create table booking(CustomerName varchar(40),Contact varchar(40),Room_rate varchar(40),Total_Days Varchar(40), Room_no Varchar(40),Booking_date Varchar(40));
insert into booking values('Vaishnavi',8766098860,2000,2,102,'12-2-23');
insert into booking values('Mahesh',8766881690,2000,2,102,'12-2-23');
select * from booking;

create database directory_service_db;
use directory_service_db;
select * from Users;

create database authentication_service_db;
use authentication_service_db;
show Tables;
select * from Users;

create database client_activation_service_db;
use client_activation_service_db;
show Tables;
select * from client;
insert into client values(5,'client21','','2024-03-12','matre','vaish','lalita','omka','12-2-23');
select * from client_activation_table;
insert into client_activation_table values('2023-12-01 00:00:01.000000','kd','vaish','lalita','omkar','22');

create database product_service;
use product_service;
show Tables;
select * from Products;

create database order_service;
use order_service;
show Tables;
select * from Orders;

create database eventmanagement;
use eventmanagement;
show Tables;
select * from Events;

create database event_management_services;
use  event_management_services;
create table Venue(VenueName varchar(50),VenuePlace varchar(50),VenueContact varchar(50));
show Tables;
select * from events;
insert into  Organizers values('Mahesh','vaish','lalita','omkar');
select * from users;
select * from organizers;

create database event_management;
use  event_management;
show Tables;
select * from users;


create database abc;
use abc;
create table organizer_info(eventname varchar(50),eventcost varchar(50),fooditemname varchar(50),fooditemcost varchar(50));


insert into  users_info values('Mahesh','vaish','abc');


create database notification_service_db;
use notification_service_db;
show tables;
select * from notification;
create database authentication_service_db;
use authentication_service_db;
show tables;
select * from users1;
create database customer_service_db;
use customer_service_db;
