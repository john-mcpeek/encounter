#!/usr/bin/env bash

set -e
#set -v

if [[ -f "/liquibase/config/auth_token" ]]; then
  export PASSWORD=$(</liquibase/config/auth_token)
fi

if [[ ! -v PASSWORD ]]; then
  echo "PASSWORD not set"
fi

if [[ ! -v DB_OWNER ]]; then
  echo "DB_OWNER not set"
fi

if [[ ! -v DB_HOST ]]; then
  echo "DB_HOST not set"
fi

if [[ ! -v DB_PORT ]]; then
  echo "DB_PORT not set"
fi

if [[ ! -v DB_NAME ]]; then
  echo "DB_NAME not set"
fi

echo "username: ${DB_OWNER}" > /liquibase/liquibase.properties
echo "password: ${PASSWORD}" >> /liquibase/liquibase.properties
echo "url: jdbc:postgresql://${DB_HOST}:${DB_PORT}/${DB_NAME}?sslmode=require" >> /liquibase/liquibase.properties
echo "contexts: ${DB_CONTEXT}" >> /liquibase/liquibase.properties
echo "classpath: /liquibase/changelog" >> /liquibase/liquibase.properties
echo "changeLogFile: db/changelog/db.changelog-master.yaml" >> /liquibase/liquibase.properties