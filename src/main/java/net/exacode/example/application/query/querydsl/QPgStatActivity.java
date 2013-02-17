package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgStatActivity is a Querydsl query type for QPgStatActivity
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgStatActivity extends com.mysema.query.sql.RelationalPathBase<QPgStatActivity> {

    private static final long serialVersionUID = 1551648862;

    public static final QPgStatActivity pgStatActivity = new QPgStatActivity("pg_stat_activity");

    public final StringPath applicationName = createString("application_name");

    public final DateTimePath<java.sql.Timestamp> backendStart = createDateTime("backend_start", java.sql.Timestamp.class);

    public final SimplePath<Object> clientAddr = createSimple("client_addr", Object.class);

    public final StringPath clientHostname = createString("client_hostname");

    public final NumberPath<Integer> clientPort = createNumber("client_port", Integer.class);

    public final StringPath currentQuery = createString("current_query");

    public final NumberPath<Long> datid = createNumber("datid", Long.class);

    public final StringPath datname = createString("datname");

    public final NumberPath<Integer> procpid = createNumber("procpid", Integer.class);

    public final DateTimePath<java.sql.Timestamp> queryStart = createDateTime("query_start", java.sql.Timestamp.class);

    public final StringPath usename = createString("usename");

    public final NumberPath<Long> usesysid = createNumber("usesysid", Long.class);

    public final BooleanPath waiting = createBoolean("waiting");

    public final DateTimePath<java.sql.Timestamp> xactStart = createDateTime("xact_start", java.sql.Timestamp.class);

    public QPgStatActivity(String variable) {
        super(QPgStatActivity.class, forVariable(variable), "pg_catalog", "pg_stat_activity");
    }

    @SuppressWarnings("all")
    public QPgStatActivity(Path<? extends QPgStatActivity> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_stat_activity");
    }

    public QPgStatActivity(PathMetadata<?> metadata) {
        super(QPgStatActivity.class, metadata, "pg_catalog", "pg_stat_activity");
    }

}

