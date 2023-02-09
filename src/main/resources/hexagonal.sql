CREATE TABLE IF NOT EXISTS customer(
    id INTEGER NOT NULL PRIMARY KEY ,
    name TEXT NOT NULL,
    country TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS orders(
    id INTEGER NOT NULL PRIMARY KEY,
    customerId TEXT NOT NULL,
    total NUMERIC(10,2) NOT NULL
);