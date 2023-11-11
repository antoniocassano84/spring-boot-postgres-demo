# spring-boot-postgres-demo
#
this is based on this tutorial: https://hackernoon.com/using-postgres-effectively-in-spring-boot-applications
#
Commands to run on a terminal to setup postgres DB:
#
psql -U postgres
#
create user antonio with password 'antonio';
#
create database antoniodb owner antonio;
#
\c antoniodb antonio;
