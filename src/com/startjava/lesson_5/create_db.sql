-- create database and table

CREATE DATABASE fandom;

\c fandom;

CREATE TABLE jaegers (
    id           SERIAL PRIMARY KEY,
    model_name   TEXT,
    mark         TEXT,
    height       REAL,
    weight       REAL,
    status       TEXT,
    origin       TEXT,
    launch       DATE,
    kaiju_kill   INTEGER
);
