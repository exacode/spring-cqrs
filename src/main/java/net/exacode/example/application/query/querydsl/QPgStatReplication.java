package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgStatReplication is a Querydsl query type for QPgStatReplication
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgStatReplication extends com.mysema.query.sql.RelationalPathBase<QPgStatReplication> {

    private static final long serialVersionUID = -1706853347;

    public static final QPgStatReplication pgStatReplication = new QPgStatReplication("pg_stat_replication");

    public final StringPath applicationName = createString("application_name");

    public final DateTimePath<java.sql.Timestamp> backendStart = createDateTime("backend_start", java.sql.Timestamp.class);

    public final SimplePath<Object> clientAddr = createSimple("client_addr", Object.class);

    public final StringPath clientHostname = createString("client_hostname");

    public final NumberPath<Integer> clientPort = createNumber("client_port", Integer.class);

    public final StringPath flushLocation = createString("flush_location");

    public final NumberPath<Integer> procpid = createNumber("procpid", Integer.class);

    public final StringPath replayLocation = createString("replay_location");

    public final StringPath sentLocation = createString("sent_location");

    public final StringPath state = createString("state");

    public final NumberPath<Integer> syncPriority = createNumber("sync_priority", Integer.class);

    public final StringPath syncState = createString("sync_state");

    public final StringPath usename = createString("usename");

    public final NumberPath<Long> usesysid = createNumber("usesysid", Long.class);

    public final StringPath writeLocation = createString("write_location");

    public QPgStatReplication(String variable) {
        super(QPgStatReplication.class, forVariable(variable), "pg_catalog", "pg_stat_replication");
    }

    @SuppressWarnings("all")
    public QPgStatReplication(Path<? extends QPgStatReplication> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_stat_replication");
    }

    public QPgStatReplication(PathMetadata<?> metadata) {
        super(QPgStatReplication.class, metadata, "pg_catalog", "pg_stat_replication");
    }

}

