CREATE TABLE songlib.song (
	"song_id" serial NOT NULL,
	"title" VARCHAR(255) NOT NULL,
	"artist" VARCHAR(128),
	"genre" VARCHAR(128),
	CONSTRAINT "pk_song" PRIMARY KEY (song_id)
) WITH (
  OIDS=FALSE
);

CREATE TABLE songlib.artist (
	"artist_id" serial NOT NULL,
	"artist_name" VARCHAR(128) NOT NULL UNIQUE,
	CONSTRAINT "pk_artist" PRIMARY KEY ("artist_id")
) WITH (
  OIDS=FALSE
);

CREATE TABLE songlib.genre (
	"genre_id" serial NOT NULL,
	"genre" VARCHAR(128) NOT NULL UNIQUE,
	CONSTRAINT "pk_genre" PRIMARY KEY ("genre_id")
) WITH (
  OIDS=FALSE
);


ALTER TABLE songlib.song ADD CONSTRAINT "fk_artist" FOREIGN KEY (artist) REFERENCES songlib.artist(artist_name);
ALTER TABLE songlib.song ADD CONSTRAINT "fk_genre" FOREIGN KEY (genre) REFERENCES songlib.genre(genre);

