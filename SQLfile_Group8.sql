IF  EXISTS (SELECT name FROM sys.databases WHERE name = N'EcommerceData')
DROP DATABASE [EcommerceData]
GO
CREATE DATABASE EcommerceData
GO


USE [EcommerceData]
GO

CREATE TABLE [dbo].[Admin]
(
  [AID] [nvarchar](50) NOT NULL,
  [AName] [nvarchar](50) NOT NULL,
  [Email] [nvarchar](100) NOT NULL,
  [Password] [nvarchar](50) NOT NULL,
  PRIMARY KEY ([AID])
);

CREATE TABLE [dbo].[Customer]
(
  [CID] [nvarchar](50) NOT NULL,
  [UID] [nvarchar](50) NOT NULL,
  [Address] [nvarchar](50) NOT NULL,
  [Phone] [nvarchar](12) NOT NULL,
  [BAccount] [nvarchar](50) NOT NULL,
  [BName] [nvarchar](50) NOT NULL,
  [CPassword] [nvarchar](50) NOT NULL,
  [CName] [nvarchar](50) NOT NULL,
  [AID] [nvarchar](50) NOT NULL,
  PRIMARY KEY ([CID]),
  FOREIGN KEY ([AID]) REFERENCES [Admin]([AID]),
  UNIQUE ([UID])
);

CREATE TABLE [dbo].[Seller]
(
  [SID] [nvarchar](50) NOT NULL,
  [SName] [nvarchar](50) NOT NULL,
  [SPassword] [nvarchar](100) NOT NULL,
  [AID] [nvarchar](50) NOT NULL,
  PRIMARY KEY ([SID]),
  FOREIGN KEY ([AID]) REFERENCES [Admin]([AID])
);

CREATE TABLE [dbo].[Product]
(
  [PID] [nvarchar](50) NOT NULL,
  [PName] [nvarchar](50) NOT NULL,
  [Quantity] [int] NOT NULL,
  [Price] [int] NOT NULL,
  PRIMARY KEY ([PID])
);

CREATE TABLE [dbo].[Sells]
(
  [PID] [nvarchar](50) NOT NULL,
  [SID] [nvarchar](50) NOT NULL,
  PRIMARY KEY ([PID], [SID]),
  FOREIGN KEY ([PID]) REFERENCES [Product]([PID]),
  FOREIGN KEY ([SID]) REFERENCES [Seller]([SID])
);

CREATE TABLE [dbo].[Order]
(
  [OID] [nvarchar](50) NOT NULL,
  [DeliveryFee] [int] NOT NULL,
  [TransactionDate] [int] NOT NULL,
  [AID] [nvarchar](50) NOT NULL,
  [CID] [nvarchar](50) NOT NULL,
  [SID] [nvarchar](50) NOT NULL,
  PRIMARY KEY ([OID]),
  FOREIGN KEY ([CID]) REFERENCES [Customer]([CID]),
  FOREIGN KEY ([SID]) REFERENCES [Seller]([SID]),
  FOREIGN KEY ([AID]) REFERENCES [Admin]([AID])
);

CREATE TABLE [dbo].[OrderItems]
(
  [ItemNo] [int] NOT NULL,
  [Quantity] [int] NOT NULL,
  [PID] [nvarchar](50) NOT NULL,
  [OID] [nvarchar](50) NOT NULL,
  PRIMARY KEY ([ItemNo]),
  FOREIGN KEY ([PID]) REFERENCES [Product]([PID]),
  FOREIGN KEY ([OID]) REFERENCES [Order]([OID])
);

CREATE TABLE [dbo].[Searchs]
(
  [CID] [nvarchar](50) NOT NULL,
  [PID] [nvarchar](50) NOT NULL,
  PRIMARY KEY ([CID], [PID]),
  FOREIGN KEY ([CID]) REFERENCES [Customer]([CID]),
  FOREIGN KEY ([PID]) REFERENCES [Product]([PID])
);

--Admin
INSERT INTO [dbo].[Admin] ([AID], [AName], [Email], [Password]) VALUES 
('A01', 'PDM Project', 'PDMProject@email.com','login1');

--Customer
INSERT INTO [dbo].[Customer] ([CName], [CID], [UID], [Address], [Phone], [BAccount], [BName], [CPassword], [AID]) VALUES
('John Doe', 'C01', 'U01', '123 Main St, Anytown, USA', '1234567890', '11110000', 'Bank A', 'pass1', 'A01'),
('Jane Smith', 'C02', 'U02', '456 Oak Ave, Smallville, USA', '2345678901', '22220000', 'Bank B', 'pass2', 'A01'),
('Jim Brown', 'C03', 'U03', '789 Pine Rd, Lakeview, USA', '3456789012', '33330000', 'Bank C', 'pass3', 'A01'),
('Jill Johnson', 'C04', 'U04', '321 Elm St, Metropolis, USA', '4567890123', '44440000', 'Bank D', 'pass4', 'A01'),
('Jack Davis', 'C05', 'U05', '654 Maple Ave, Pleasantville, USA', '5678901234', '55550000', 'Bank E', 'pass5', 'A01'),
('Alice Williams', 'C06', 'U06', '987 Cedar Rd, Riverview, USA', '6789012345', '66660000', 'Bank F', 'pass6', 'A01'),
('Bob Martin', 'C07', 'U07', '147 Willow St, Hilltop, USA', '7890123456', '77770000', 'Bank G', 'pass7', 'A01'),
('Charlie Thompson', 'C08', 'U08', '258 Poplar Ave, Seaside, USA', '8901234567', '88880000', 'Bank H', 'pass8', 'A01'),
('Diana Garcia', 'C09', 'U09', '369 Birch Rd, Forestview, USA', '9012345678', '99990000', 'Bank I', 'pass9', 'A01'),
('Ethan Martinez', 'C10', 'U10', '963 Spruce St, Valleyview, USA', '1234567890', '00001111', 'Bank J', 'pass10', 'A01');

--Seller
INSERT INTO [dbo].[Seller] ([SID], [SName], [SPassword], [AID]) VALUES
('S01', 'Oliver Wilson', 'password1', 'A01'),
('S02', 'Sophia Taylor', 'password2', 'A01'),
('S03', 'Mason Moore', 'password3', 'A01'),
('S04', 'Ava Anderson', 'password4', 'A01'),
('S05', 'Liam Thomas', 'password5', 'A01'),
('S06', 'Mia Jackson', 'password6', 'A01'),
('S07', 'Lucas Martin', 'password7', 'A01'),
('S08', 'Emma Thompson', 'password8', 'A01'),
('S09', 'Noah Garcia', 'password9', 'A01'),
('S10', 'Isabella Martinez', 'password10', 'A01');

--Product
INSERT INTO [dbo].[Product] ([PID], [PName], [Quantity], [Price]) VALUES
('P100001', 'Apple', 50, 15),
('P100002', 'Banana', 100, 30),
('P100003', 'Cherry', 200, 45),
('P100004', 'Date', 150, 25),
('P100005', 'Elderberry', 75, 40),
('P100006', 'Fig', 60, 35),
('P100007', 'Grape', 120, 20),
('P100008', 'Honeydew', 80, 50),
('P100009', 'Iceberg Lettuce', 90, 10),
('P100010', 'Jackfruit', 70, 45),
('P100011', 'Kiwi', 110, 30),
('P100012', 'Lemon', 130, 40),
('P100013', 'Mango', 140, 15),
('P100014', 'Nectarine', 150, 35),
('P100015', 'Orange', 160, 20);

--Order
INSERT INTO [dbo].[Order] ([OID], [DeliveryFee], [TransactionDate], [AID], [CID], [SID]) VALUES
('O10001', 10, 20231130, 'A01', 'C02', 'S07'),
('O10002', 15, 20231130, 'A01', 'C03', 'S06'),
('O10003', 20, 20231130, 'A01', 'C04', 'S06'),
('O10004', 25, 20231130, 'A01', 'C05', 'S01'),
('O10005', 30, 20231130, 'A01', 'C06', 'S03'),
('O10006', 35, 20231130, 'A01', 'C07', 'S02'),
('O10007', 40, 20231130, 'A01', 'C08', 'S09'),
('O10008', 45, 20231130, 'A01', 'C02', 'S08'),
('O10009', 50, 20231130, 'A01', 'C03', 'S07'),
('O10010', 55, 20231130, 'A01', 'C04', 'S06'),
('O10011', 60, 20231130, 'A01', 'C05', 'S01'),
('O10012', 65, 20231130, 'A01', 'C06', 'S05'),
('O10013', 70, 20231130, 'A01', 'C09', 'S04'),
('O10014', 75, 20231130, 'A01', 'C10', 'S03'),
('O10015', 80, 20231130, 'A01', 'C02', 'S02'),
('O10016', 85, 20231130, 'A01', 'C03', 'S10'),
('O10017', 90, 20231130, 'A01', 'C04', 'S09'),
('O10018', 95, 20231130, 'A01', 'C07', 'S08'),
('O10019', 100, 20231130, 'A01', 'C08', 'S07'),
('O10020', 105, 20231130, 'A01', 'C03', 'S06'),
('O10021', 110, 20231130, 'A01', 'C02', 'S05'),
('O10022', 115, 20231130, 'A01', 'C01', 'S04'),
('O10023', 120, 20231130, 'A01', 'C09', 'S03'),
('O10024', 125, 20231130, 'A01', 'C10', 'S02'),
('O10025', 130, 20231130, 'A01', 'C02', 'S01');

--OrderItems
INSERT INTO [dbo].[OrderItems] ([ItemNo], [Quantity], [PID], [OID]) VALUES
(1001, 150, 'P100001', 'O10001'),
(1002, 300, 'P100002', 'O10002'),
(1003, 450, 'P100003', 'O10003'),
(1004, 600, 'P100004', 'O10004'),
(1005, 750, 'P100005', 'O10005'),
(1006, 900, 'P100006', 'O10006'),
(1007, 1050, 'P100007', 'O10007'),
(1008, 1200, 'P100008', 'O10008'),
(1009, 1350, 'P100009', 'O10009'),
(1010, 1500, 'P100010', 'O10010'),
(1011, 150, 'P100011', 'O10011'),
(1012, 300, 'P100012', 'O10012'),
(1013, 450, 'P100013', 'O10013'),
(1014, 600, 'P100014', 'O10014'),
(1015, 750, 'P100015', 'O10015'),
(1016, 900, 'P100006', 'O10016'),
(1017, 1050, 'P100007', 'O10017'),
(1018, 1200, 'P100008', 'O10018'),
(1019, 1350, 'P100009', 'O10019'),
(1020, 1500, 'P100010', 'O10020'),
(1021, 900, 'P100006', 'O10021'),
(1022, 1050, 'P100007', 'O10022'),
(1023, 1200, 'P100008', 'O10023'),
(1024, 1350, 'P100009', 'O10024'),
(1025, 1500, 'P100010', 'O10025');

--Searchs
INSERT INTO [dbo].[Searchs] ([CID], [PID]) VALUES
('C01', 'P100001'),
('C02', 'P100002'),
('C03', 'P100003'),
('C04', 'P100004'),
('C05', 'P100005'),
('C06', 'P100006'),
('C07', 'P100007'),
('C08', 'P100008'),
('C09', 'P100009'),
('C10', 'P100010'),
('C10', 'P100001'),
('C08', 'P100002'),
('C06', 'P100003'),
('C02', 'P100005'),
('C01', 'P100006'),
('C03', 'P100007'),
('C07', 'P100008'),
('C05', 'P100009'),
('C09', 'P100010');

--Sells
INSERT INTO [dbo].[Sells] ([SID], [PID]) VALUES
('S01', 'P100001'),
('S02', 'P100002'),
('S03', 'P100003'),
('S04', 'P100004'),
('S05', 'P100005'),
('S06', 'P100006'),
('S07', 'P100007'),
('S08', 'P100008'),
('S09', 'P100009'),
('S10', 'P100010'),
('S02', 'P100001'),
('S04', 'P100002'),
('S06', 'P100003'),
('S08', 'P100004'),
('S10', 'P100005'),
('S01', 'P100006'),
('S03', 'P100007'),
('S07', 'P100008'),
('S07', 'P100009'),
('S09', 'P100010');