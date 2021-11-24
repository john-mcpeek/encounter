FROM liquibase/liquibase

COPY *.yaml /liquibase/changelog/db/changelog/
#COPY sql/*.sql /liquibase/changelog/db/changelog/sql
COPY genProps.sh /liquibase/

ENTRYPOINT [ "sh", "-c", "genProps.sh && docker-entrypoint.sh --defaultsFile liquibase.properties update"]