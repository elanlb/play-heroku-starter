#!/bin/bash

sbt compile stage

# export DATABASE_URL="jdbc:postgresql://localhost:5432/superinboxlocal"

heroku local -f local/Procfile.local web