DROP TABLE IF EXISTS songlib.user, songlib.genre, songlib.role, songlib.song, songlib.artist CASCADE;

CREATE TABLE songlib.artist
(
    id SERIAL PRIMARY KEY,
    artist_name VARCHAR(128) NOT NULL
);

CREATE TABLE songlib.genre
(
    id SERIAL PRIMARY KEY ,
    genre VARCHAR(128) NOT NULL UNIQUE
);

CREATE TABLE songlib.song
(
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    artist_id INTEGER references songlib.artist(id),
    genre_id INTEGER references songlib.genre(id)
);

CREATE TABLE songlib.user
(
    id SERIAL PRIMARY KEY ,
    name VARCHAR(255) NOT NULL,
    email VARCHAR NOT NULL,
    created_at TIMESTAMPTZ NOT NULL DEFAULT now()
);

CREATE TABLE songlib.role
(
    id SERIAL PRIMARY KEY ,
    role VARCHAR(255) NOT NULL
);

INSERT INTO songlib.role
VALUES
(1, 'admin'),
(2, 'user');

CREATE TABLE songlib.user_role
(
    id      SERIAL PRIMARY KEY,
    user_id INT NOT NULL
        REFERENCES songlib.user (id),
    role_id INT NOT NULL
        REFERENCES songlib.role (id)
);
