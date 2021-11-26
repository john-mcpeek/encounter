FROM liquibase/liquibase

COPY changelog/*.yaml /liquibase/changelog/db/changelog/
#COPY changelog/sql/*.sql /liquibase/changelog/db/changelog/sql/

COPY genProps.sh /liquibase/
COPY genProps.sh /usr/local/bin/

RUN mkdir -m777 -p /liquibase/config

CMD [ "sh", "-c", "genProps.sh && docker-entrypoint.sh --defaultsFile config/liquibase.properties update" ]