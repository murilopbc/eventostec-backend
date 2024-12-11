CREATE TABLE event (
    id CHAR(36) PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    description VARCHAR(400) NOT NULL,
    img_url VARCHAR(250) NOT NULL,
    event_url VARCHAR(250) NOT NULL,
    date DATETIME NOT NULL,
    remote BOOLEAN NOT NULL
);

CREATE TABLE coupon (
    id CHAR(36) PRIMARY KEY,
    code VARCHAR(100) NOT NULL,
    discount INT NOT NULL,
    valid DATETIME NOT NULL,
    event_id CHAR(36),
    FOREIGN KEY (event_id) REFERENCES event(id) ON DELETE CASCADE
);

CREATE TABLE address (
    id CHAR(36) PRIMARY KEY,
    city VARCHAR(100) NOT NULL,
    uf CHAR(2) NOT NULL,
    event_id CHAR(36),
    FOREIGN KEY (event_id) REFERENCES event(id) ON DELETE CASCADE
);
