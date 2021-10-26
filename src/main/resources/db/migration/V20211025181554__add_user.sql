CREATE TABLE songlib.user (
      "user_id" serial NOT NULL,
      "name" VARCHAR(255) NOT NULL,
      "email" VARCHAR NOT NULL,
      CONSTRAINT "pk_user" PRIMARY KEY (user_id)
) WITH (
      OIDS=FALSE
    );

CREATE TABLE songlib.role (
      "role_id" serial NOT NULL,
      "role" VARCHAR(255) NOT NULL,
      CONSTRAINT "pk_role" PRIMARY KEY (role_id)
) WITH (
      OIDS=FALSE
    );