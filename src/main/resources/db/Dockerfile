FROM liquibase/liquibase

COPY changelog/*.yaml /liquibase/changelog/db/changelog/
#COPY changelog/sql/*.sql /liquibase/changelog/db/changelog/sql/

COPY genLiquibaseProps.sh /liquibase/
COPY genLiquibaseProps.sh /usr/local/bin/

RUN mkdir -m777 -p /liquibase/config

CMD [ "sh", "-c", "genLiquibaseProps.sh && docker-entrypoint.sh --defaultsFile config/liquibase.properties update" ]