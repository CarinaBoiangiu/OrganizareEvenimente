CREATE TABLE evenimente (
                            id BIGINT NOT NULL AUTO_INCREMENT,
                            denumirea VARCHAR(25) NOT NULL,
                            locatie VARCHAR(25) NOT NULL,
                            data DATE,
                            timp TIME,
                            pret FLOAT,
                            PRIMARY KEY (id)
);
-- data.sql

-- 1. Concert Rock
INSERT INTO evenimente (id, denumirea, locatie, data, timp, pret) VALUES (
                                                                             1,
                                                                             'Concert Phoenix',
                                                                             'M2',
                                                                             '2024-04-19',
                                                                             '20:30:00',
                                                                             100.00
                                                                         );

-- 2. Alt Concert
INSERT INTO evenimente (id, denumirea, locatie, data, timp, pret) VALUES (
                                                                             2,
                                                                             'Concert Cargo',
                                                                             'Sala Olimpia',
                                                                             '2024-03-18',
                                                                             '19:00:00',
                                                                             40.00
                                                                         );

-- 3. Piesă de Teatru
INSERT INTO evenimente (id, denumirea, locatie, data, timp, pret) VALUES (
                                                                             3,
                                                                             'O noapte furtunoasa',
                                                                             'Teatrul National',
                                                                             '2023-09-25',
                                                                             '19:00:00',
                                                                             60.00
                                                                         );

-- 4. Altă Piesă de Teatru
INSERT INTO evenimente (id, denumirea, locatie, data, timp, pret) VALUES (
                                                                             4,
                                                                             'O scrisoare pierduta',
                                                                             'Teatrul National',
                                                                             '2023-08-20',
                                                                             '19:00:00',
                                                                             50.00
                                                                         );