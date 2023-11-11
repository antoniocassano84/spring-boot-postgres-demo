# spring-boot-postgres-demo
##

Commands to run on a terminal to setup postgres DB:
##
psql -U postgres
##
create user antonio with password 'antonio';
##
create database antoniodb owner antonio;
##
\c antoniodb antonio;
