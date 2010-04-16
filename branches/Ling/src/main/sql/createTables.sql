--5CREATE TABLE Tour (
--	tourID NUMBER PRIMARY KEY,
--	tourName VARCHAR2(30),
--	tourDesc VARCHAR2(256),
--	price NUMBER(7,2),
--	totalDays NUMBER
--);

CREATE TABLE Tour (
	tour_ID NUMBER PRIMARY KEY,
	tour_Name VARCHAR2(30),
	tour_Desc VARCHAR2(256),
	price NUMBER(7,2),
	total_Days NUMBER
);

CREATE TABLE Location (
	location_ID NUMBER PRIMARY KEY,
	location_Name VARCHAR2(256),
	--change binary_double to number
	latitude NUMBER,
	longitude NUMBER
);

CREATE TABLE TourLocation (
	location_ID NUMBER references Location(location_ID),
	tour_ID NUMBER references Tour(tour_ID),
	PRIMARY KEY (location_ID, tour_ID)
);

CREATE TABLE Activity (
	activity_ID NUMBER PRIMARY KEY,
	activity_Name VARCHAR2(256)
);

CREATE TABLE TourActivity (
	activity_ID NUMBER, 
	tour_ID NUMBER references Activity(activity_ID),
	PRIMARY KEY (activity_ID, tour_ID)
);

CREATE TABLE AccountUser (
	user_ID NUMBER PRIMARY KEY,
	user_Name VARCHAR2(30),
	password VARCHAR2(256),
	user_Type VARCHAR2(30)
);

CREATE TABLE TourOperator (
	operator_ID NUMBER PRIMARY KEY, 
	company_Info VARCHAR2(256),
	membership_Expire DATE,	
	email VARCHAR2(256),
	FOREIGN KEY (operator_ID) REFERENCES AccountUser(user_ID)ON DELETE CASCADE 
);

CREATE TABLE ListedTour (
	list_ID NUMBER PRIMARY KEY,
	operator_ID NUMBER references TourOperator(operator_ID),
	tour_ID NUMBER references Tour(tour_ID),
	listed_From DATE,
	listed_Until DATE
);

CREATE TABLE TourDate(
	date_ID NUMBER PRIMARY KEY,
	tour_ID NUMBER references Tour(tour_ID),
	start_Date DATE,
	finish_Date DATE
);

CREATE TABLE Image (
	image_ID NUMBER PRIMARY KEY,
	tour_ID NUMBER references Tour(tour_ID),
	image_URL VARCHAR2(256)
);

CREATE TABLE MonthlyFee (
	fee_ID NUMBER PRIMARY KEY,
	month NUMBER(2),
	fee NUMBER(7,2),
	year NUMBER
);


COMMIT;