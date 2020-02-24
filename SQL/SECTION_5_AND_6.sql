-- SECTION 5 AND SECTION 6
-- CRUD 
--1.CREATE
	CREATE DATABASE ANIMALS;
	USE ANIMALS;
	CREATE TABLE CATS( 
		 CAT_ID INT NOT NULL AUTO_INCREMENT, 
		 NAME   VARCHAR(100), 
		 BREED  VARCHAR(100), 
		 AGE    INT, 
		 PRIMARY KEY (CAT_ID)
		 ); 
	-- INSERT QUERY IN A TEXT AND RUN TEXT.SQL 
	INSERT INTO cats(name, breed, age) 
	VALUES ('Ringo', 'Tabby', 4),
		   ('Cindy', 'Maine Coon', 10),
		   ('Dumbledore', 'Maine Coon', 11),
		   ('Egg', 'Persian', 4),
		   ('Misty', 'Tabby', 13),
		   ('George Michael', 'Ragdoll', 9),
		   ('Jackson', 'Sphynx', 7);
		  -- COMMAND TO RUN QUERY
	SOURCE C:\Users\chinna\Desktop\SQL\TEST.sql -- or
	SOURCE Desktop\SQL\TEST.sql

--2. READ
	SELECT * FROM CATS;
	-- ONLY CAT NAMES
	SELECT NAME FROM CATS;
	--ONLY CATS AGES
	SELECT AGE FROM CATS;
	--NAMES AND AGES OF CATS
	SELECT NAME,AGE FROM CATS;
	-- DISPLAY WHERE AGE =4
	SELECT * FROM CATS WHERE AGE=4;
	-- DISPLAY WHERE NAME=EGG
	SELECT * FROM cats WHERE name='Egg';
	
		-- Rapid Fire Exercises
		--1.DISPLAY ONLY CAT_ID
		SELECT CAT_ID FROM CATS;
		--2.DISPLAY NAME AND BREED
		SELECT NAME,BREED FROM CATS;
		--3.DISPLAY NAME,AGE WHERE TABBY CATS
		SELECT NAME,AGE FROM CATS WHERE BREED="TABBY";
		--4.DISPLAY CAT_ID AND AGE WHERE CAT_ID=AGE
		SELECT CAT_ID,AGE FROM CATS WHERE CAT_ID=AGE;
		-- Aliases -->Easier to read results 
		SELECT CAT_ID AS ID,NAME FROM CATS;

--3.UPDATE
	UPDATE CATS SET BREED='SHORTHAIR' 
			WHERE BREED='TABBY';
	UPDATE CATS SET AGE=14 
			WHERE NAME='MISTY';
			
	-- ASSIGNMENT
		--1.Change Jackson's name to "Jack"
		UPDATE CATS SET NAME="Jack"
			WHERE NAME="Jackson";
		--2.Change Ringo's breed to "British Shorthair"
		UPDATE CATS SET BREED="British Shorthair"
			WHERE NAME="Ringo";
		--3.Update both Maine Coons' ages to be 12
			UPDATE CATS SET AGE=12
				WHERE BREED="Maine Coons";
		--4.UPDATE NAME COLUMN AS ROSE
			UPDATE CATS SET NAME="ROSE";
--4.DELETE
	DELETE FROM CATS WHERE NAME='Egg';
	DELETE FROM CATS;
	-- ASSIGNMENT
	--1.DELETE all 4 year old cats
	DELETE FROM CATS WHERE AGE=4;
	--2.DELETE cats whose age is the same as their cat_id
	DELETE FORM CATS WHERE AGE=CAT_ID;
	--3.DELETE all cats
	DELETE FROM CATS;
	
	DROP DATABASE ANIMALS;
-- NEW TEST
--1.Create a new database shirts_db
	CREATE DATABASE SHIRTS_DB;
	USE SHIRTS_DB;
--2.Create a new table shirts
	CREATE TABLE SHIRTS(
	SHIRT_ID INT NOT NULL AUTO_INCREMENT,
	ARTICLE VARCHAR(30),
	COLOR VARCHAR(30),
	SHIRT_SIZE VARCHAR(10),
	LAST_WORN INT,
	PRIMARY KEY(SHIRT_ID));
/* INSERT THE DATA
shirt_id	article			color	shirt_size	last_worn
	1		t-shirt			white		S		10
	2		t-shirt			green		S		200
	3		polo shirt   	black		M		10
	4		tank top	    blue		S		50
	5		t-shirt	        pink		S		0
	6		polo shirt   	red			M		5
	7		tank top	    white		S		200
	8		tank top	    blue		M		15   */
	INSERT INTO SHIRTS(ARTICLE,COLOR,SHIRT_SIZE,LAST_WORN)
			VALUES('t-shirt', 'white', 'S', 10),
				('t-shirt', 'green', 'S', 200),
				('polo shirt', 'black', 'M', 10),
				('tank top', 'blue', 'S', 50),
				('t-shirt', 'pink', 'S', 0),
				('polo shirt', 'red', 'M', 5),
				('tank top', 'white', 'S', 200),
				('tank top', 'blue', 'M', 15);
--4.Get All That Data In There With a single line
	SELECT * FROM SHIRTS;
--5.Add A New Shirt-->Purple polo shirt, size M last worn 50 days ago
	INSERT INTO SHIRTS(ARTICLE,COLOR,SHIRT_SIZE,LAST_WORN) 
						VALUES("polo shirt","Purple","M",50);
--6.SELECT all shirts-->But Only Print Out Article and Color
	SELECT ARTICLE,COLOR FROM SHIRTS;
--7.SELECT all medium shirts-->Print Out Everything But shirt_id
	SELECT ARTICLE,COLOR,SHIRT_SIZE,LAST_WORN FROM SHIRTS WHERE SHIRT_SIZE="M";
--8.Update all polo shirts-->Change their size to L
	UPDATE SHIRTS SET SHIRT_SIZE="L"
		WHERE ARTICLE="POLO SHIRT";
--9.Update the shirt last worn 15 days ago-->Change last_worn to 0
	UPDATE SHIRTS SET LAST_WORN=0
		WHERE LAST_WORN>15;
--10.Update all white shirts-->Change size to 'XS' and color to 'off white'
	UPDATE SHIRTS SET SHIRT_SIZE="XS",COLOR="OFF WHITE"
		WHERE COLOR="WHITE";
--11.Delete all old shirts-->Last worn 200 days ago
	DELETE FROM SHIRTS WHERE LAST_WORN>15
--12.Delete all tank tops-->Your tastes have changed...
	DELETE FROM SHIRTS WHERE  ARTICLE="TANK TOP";
--13.Delete all shirts
	DELETE FROM SHIRT WHERE ARTICLE IS NOT NULL; -- OR
	DELETE FROM SHIRTS;
--14.Drop the entire shirts table
	DROP TABLE SHIRTS;
	