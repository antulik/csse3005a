INSERT INTO Tour VALUES (
	0001, '5 Nights in Paris', 'Sample the food and wine of magical Paris.',
	1899.95, 6
);

INSERT INTO Tour VALUES (
	0002, 'Australia Zoo', 'Experience the reef and rainforest in Cairns.',
	349.95, 4
);

INSERT INTO Tour VALUES (
	0003, 'The Milford Track', 'Take 5 days off for this world famous guided hike.',
	1790.00, 5
);

INSERT INTO Tour VALUES (
	0004, 'The Rock', 'The most electrifying rock in world entertainment.',
	1899.95, 2
);

INSERT INTO Tour VALUES (
	0005, 'Egyptian Wonders', 'Rameses, Tutankhamun, Nefertiti and Cleopatra.',
	1899.95, 6
);

INSERT INTO Tour VALUES (
	0006, 'Big Apple', 'New York at its finest; loud, proud and ugly.',
	2799.95, 9
);

INSERT INTO Tour VALUES (
	0007, 'Pax Romana', 'Take a walking tour of Rome, the eternal city.',
	1899.95, 3
);

INSERT INTO Tour VALUES (
	0008, 'Medieval Europe', 'Prague is Europe''s hidden gem, affordable and beautiful',
	999.95, 6
);

INSERT INTO Tour VALUES (
	0009, 'Stonehenge', 'Take this day tour to the mythical site of the Druids',
	1899.95, 1
);

INSERT INTO Tour VALUES (
	0010, 'Fire and Ice', 'It''s Iceland as you have never seen it before.',
	1299.95, 4
);

INSERT INTO Tour VALUES (
	0011, 'Dostoyevski''s Ruin', 'Fancy a trip to Siberia? We don''t, but you can go.',
	1899.95, 23
);

INSERT INTO Tour VALUES (
	0012, 'Holiday in Cambodia', 'What the heck was Jello Biafra talking about?',
	699.95, 6
);

INSERT INTO Tour VALUES (
	0013, 'Wine Country', 'Bordeaux dans printemps. C''est vraiment bon.',
	1599.95, 8
);

INSERT INTO Tour VALUES (
	0014, 'Eye of the Tiger', 'Who cares about the Declaration when you have Rocky.',
	1999.95, 4
);

INSERT INTO Tour VALUES (
	0015, 'The Odyssey', 'Set off from Piraeus to the Ios and then beautiful Santorini.',
	1099.95, 6
);

INSERT INTO Tour VALUES (
	0016, 'The Last Crusade', 'Starting in Turkey, and finishing in Palestine.',
	1199.95, 15
);

INSERT INTO Tour VALUES (
	0017, 'World Game', 'Catch the 2010 Football World Cup in Johannesburg.',
	2599.95, 30
);

-- Location -----------------------------------------------------------------------

INSERT INTO Location VALUES (
	0001, 'Sydney', 104254545.0154535434, 2043244235.0145435
);

INSERT INTO Location VALUES (
	0002, 'Brisbane', 1045435345.054353453452, 2053453.024332423
);

INSERT INTO Location VALUES (
	0003, 'NewYork', 10234522.03890001233333, 205435435.0334234234
);

INSERT INTO Location VALUES (
	0004, 'Perth', 10890444.04890403890, 202342342.04432423423
);

-- TourLocation -----------------------------------------------------------------------

INSERT INTO TourLocation VALUES (
	0001, 0001
);

INSERT INTO TourLocation VALUES (
	0002, 0002
);

INSERT INTO TourLocation VALUES (
	0003, 0003
);

--INSERT INTO TourLocation VALUES (
--	0004, 0004
--);

-- Activity -----------------------------------------------------------------------

INSERT INTO Activity VALUES (
	0001, 'Jump'
);

INSERT INTO Activity VALUES (
	0002, 'Run'
);

INSERT INTO Activity VALUES (
	0003, 'Hide'
);

INSERT INTO Activity VALUES (
	0004, 'Seek'
);

-- TourActivity -----------------------------------------------------------------------

INSERT INTO TourActivity VALUES (
	0001, 0001
);

INSERT INTO TourActivity VALUES (
	0002, 0002
);

INSERT INTO TourActivity VALUES (
	0003, 0003
);

INSERT INTO TourActivity VALUES (
	0004, 0004
);

-- AccountUser -----------------------------------------------------------------------

INSERT INTO AccountUser VALUES (
	0001, 'user1', ORA_HASH('passsword1'), 'admin1'
);

INSERT INTO AccountUser VALUES (
	0002, 'user2', ORA_HASH('passsword2'), 'admin2'
);

INSERT INTO AccountUser VALUES (
	0003, 'user3', ORA_HASH('passsword3'), 'operator1'
);

INSERT INTO AccountUser VALUES (
	0004, 'user4', ORA_HASH('passsword4'), 'operator2'
);

INSERT INTO AccountUser VALUES (
	0005, 'user5', ORA_HASH('passsword5'), 'operator3'
);

INSERT INTO AccountUser VALUES (
	0006, 'user6', ORA_HASH('passsword6'), 'operator4'
);

INSERT INTO AccountUser VALUES (
	0007, 'user7', ORA_HASH('passsword7'), 'operator5'
);

INSERT INTO AccountUser VALUES (
	0008, 'user8', ORA_HASH('passsword8'), 'operator6'
);

-- TourOperator -----------------------------------------------------------------------

INSERT INTO TourOperator VALUES (
	0003, 'company3', TO_DATE('20201213', 'YYYYMMDD'), 'operator0003@company3.com' 
);

INSERT INTO TourOperator VALUES (
	0004, 'company4', TO_DATE('20201214', 'YYYYMMDD'), 'operator0004@company4.com' 
);

INSERT INTO TourOperator VALUES (
	0005, 'company5', TO_DATE('20201215', 'YYYYMMDD'), 'operator0005@company5.com' 
);

INSERT INTO TourOperator VALUES (
	0006, 'company6', TO_DATE('20201216', 'YYYYMMDD'), 'operator0006@company6.com' 
);

INSERT INTO TourOperator VALUES (
	0007, 'company7', TO_DATE('20201217', 'YYYYMMDD'), 'operator0007@company7.com' 
);

INSERT INTO TourOperator VALUES (
	0008, 'company8', TO_DATE('20201218', 'YYYYMMDD'), 'operator0008@company8.com' 
);

-- ListedTour -----------------------------------------------------------------------

INSERT INTO ListedTour VALUES (
	0001, 0003, 0001, TO_DATE('20100511', 'YYYYMMDD'), TO_DATE('20101211', 'YYYYMMDD')  
);

INSERT INTO ListedTour VALUES (
	0002, 0003, 0002, TO_DATE('20100512', 'YYYYMMDD'), TO_DATE('20101212', 'YYYYMMDD')  
);

INSERT INTO ListedTour VALUES (
	0003, 0004, 0003, TO_DATE('20100513', 'YYYYMMDD'), TO_DATE('20101213', 'YYYYMMDD')  
);

INSERT INTO ListedTour VALUES (
	0004, 0004, 0004, TO_DATE('20100514', 'YYYYMMDD'), TO_DATE('20101214', 'YYYYMMDD')  
);

INSERT INTO ListedTour VALUES (
	0005, 0005, 0005, TO_DATE('20100515', 'YYYYMMDD'), TO_DATE('20101215', 'YYYYMMDD')  
);

INSERT INTO ListedTour VALUES (
	0006, 0005, 0006, TO_DATE('20100516', 'YYYYMMDD'), TO_DATE('20101216', 'YYYYMMDD')  
);

INSERT INTO ListedTour VALUES (
	0007, 0005, 0007, TO_DATE('20100517', 'YYYYMMDD'), TO_DATE('20101217', 'YYYYMMDD')  
);

INSERT INTO ListedTour VALUES (
	0008, 0006, 0008, TO_DATE('20100518', 'YYYYMMDD'), TO_DATE('20101218', 'YYYYMMDD')  
);

-- TourDate -----------------------------------------------------------------------

INSERT INTO TourDate VALUES (
	0001, 0001, TO_DATE('20100511', 'YYYYMMDD'), TO_DATE('20101211', 'YYYYMMDD')  
);

INSERT INTO TourDate VALUES (
	0002, 0002, TO_DATE('20100512', 'YYYYMMDD'), TO_DATE('20101212', 'YYYYMMDD')  
);

INSERT INTO TourDate VALUES (
	0003, 0003, TO_DATE('20100513', 'YYYYMMDD'), TO_DATE('20101213', 'YYYYMMDD')  
);

INSERT INTO TourDate VALUES (
	0004, 0004, TO_DATE('20100514', 'YYYYMMDD'), TO_DATE('20101214', 'YYYYMMDD')  
);

INSERT INTO TourDate VALUES (
	0005, 0005, TO_DATE('20100515', 'YYYYMMDD'), TO_DATE('20101215', 'YYYYMMDD')  
);

INSERT INTO TourDate VALUES (
	0006, 0006, TO_DATE('20100516', 'YYYYMMDD'), TO_DATE('20101216', 'YYYYMMDD')  
);

INSERT INTO TourDate VALUES (
	0007, 0007, TO_DATE('20100517', 'YYYYMMDD'), TO_DATE('20101217', 'YYYYMMDD')  
);

INSERT INTO TourDate VALUES (
	0008, 0008, TO_DATE('20100518', 'YYYYMMDD'), TO_DATE('20101218', 'YYYYMMDD')  
);

-- Image -----------------------------------------------------------------------

INSERT INTO Image VALUES (
	0001, 0001, 'http://localhost/image0001.jpg'
);

INSERT INTO Image VALUES (
	0002, 0002, 'http://localhost/image0002.jpg'
);

INSERT INTO Image VALUES (
	0003, 0003, 'http://localhost/image0003.jpg'
);

INSERT INTO Image VALUES (
	0004, 0004, 'http://localhost/image0004.jpg'
);

-- MonthlyFee -----------------------------------------------------------------------

INSERT INTO MonthlyFee VALUES (
	0001, '01', 101.50, 2010
);

INSERT INTO MonthlyFee VALUES (
	0002, '02', 102.50, 2010
);

INSERT INTO MonthlyFee VALUES (
	0003, '03', 103.50, 2010
);

INSERT INTO MonthlyFee VALUES (
	0004, '04', 104.50, 2010
);

INSERT INTO MonthlyFee VALUES (
	0005, '05', 105.50, 2010
);

INSERT INTO MonthlyFee VALUES (
	0006, '06', 106.50, 2010
);

INSERT INTO MonthlyFee VALUES (
	0007, '07', 107.50, 2010
);

INSERT INTO MonthlyFee VALUES (
	0008, '08', 108.50, 2010
);

INSERT INTO MonthlyFee VALUES (
	0009, '09', 109.50, 2010
);

INSERT INTO MonthlyFee VALUES (
	0010, '10', 110.50, 2010
);

INSERT INTO MonthlyFee VALUES (
	0011, '11', 111.50, 2010
);

INSERT INTO MonthlyFee VALUES (
	0012, '12', 112.50, 2010
);

COMMIT;