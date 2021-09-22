DROP DATABASE IF EXISTS workClothesDB;

CREATE DATABASE /*IF NOT EXISTS*/ workClothesDB;

USE workClothesDB;

CREATE TABLE IF NOT EXISTS workers (
	worker_name VARCHAR(50),
    position ENUM ('office worker',
		'mechanic',
		'electrician',
		'maintenance',
		'indoor worker',
        'unknown'),
	t_shirt_size VARCHAR(50),
    sweater_size VARCHAR(50),
	vest_size VARCHAR(50),
    jacket_size VARCHAR(50),
    trousers_size INT(50),
    shorts_size INT(50),
    safety_boots_size INT(50),
	PRIMARY KEY(worker_name)
    );
    
INSERT INTO workers(worker_name, position, t_shirt_size, sweater_size, 
vest_size, jacket_size, trousers_size, shorts_size, safety_boots_size) VALUES 
	('Varga György', 'mechanic', 'L', 'L', 'L', 'L', 53, 53, 43),
    ('Bakonya Zsolt', 'mechanic', 'XXXL', 'XXXL', 'XXXL', 'XXXL', 62, 62, 46),
    ('Forgony Ádám', 'mechanic', 'M', 'M', 'M', 'L', 48, 48, 42),
    ('Hegyesi Árpád', 'electrician', 'L', 'L', 'XL', 'XL', 56, 56, 42);
    
    SELECT * FROM workers;
    