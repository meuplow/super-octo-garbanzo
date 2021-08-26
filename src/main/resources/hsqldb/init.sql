DROP TABLE addresses IF EXISTS;

CREATE TABLE addresses (
  id INTEGER IDENTITY PRIMARY KEY,
  zip VARCHAR(30),
  public_place VARCHAR(30),
  complement VARCHAR(30),
  district VARCHAR(30),
  city VARCHAR(30),
  federative_unit VARCHAR(30),
  ibge VARCHAR(30),
  gia VARCHAR(30),
  ddd VARCHAR(30),
  siafi VARCHAR(30)
);