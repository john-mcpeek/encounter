FROM liquibase/liquibase

COPY changelog/*.yaml /liquibase/changelog/db/changelog/
#COPY changelog/sql/*.sql /liquibase/changelog/db/changelog/sql/

COPY --chown=liquibase:liquibase genLiquibaseProps.sh /liquibase/

RUN chmod +x /liquibase/genLiquibaseProps.sh &&\
    mkdir -m777 -p /liquibase/config

CMD [ "sh", "-c", "./genLiquibaseProps.sh && docker-entrypoint.sh --defaultsFile config/liquibase.properties update" ]