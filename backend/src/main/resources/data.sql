CREATE TABLE IF NOT EXISTS users (
  id INTEGER AUTO_INCREMENT  PRIMARY KEY,
  username VARCHAR(255) NOT NULL,
  password VARCHAR(8) NOT NULL
);

INSERT INTO users (id, username, password) VALUES (1, 'admin','admin');

CREATE TABLE IF NOT EXISTS roles (
  id INTEGER AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(255) NOT NULL
);

INSERT INTO roles (id, name) VALUES (1, 'Admin');
INSERT INTO roles (id, name) VALUES (2, 'User');
