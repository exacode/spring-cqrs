package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgStatBgwriter is a Querydsl query type for QPgStatBgwriter
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgStatBgwriter extends com.mysema.query.sql.RelationalPathBase<QPgStatBgwriter> {

    private static final long serialVersionUID = -1651638713;

    public static final QPgStatBgwriter pgStatBgwriter = new QPgStatBgwriter("pg_stat_bgwriter");

    public final NumberPath<Long> buffersAlloc = createNumber("buffers_alloc", Long.class);

    public final NumberPath<Long> buffersBackend = createNumber("buffers_backend", Long.class);

    public final NumberPath<Long> buffersBackendFsync = createNumber("buffers_backend_fsync", Long.class);

    public final NumberPath<Long> buffersCheckpoint = createNumber("buffers_checkpoint", Long.class);

    public final NumberPath<Long> buffersClean = createNumber("buffers_clean", Long.class);

    public final NumberPath<Long> checkpointsReq = createNumber("checkpoints_req", Long.class);

    public final NumberPath<Long> checkpointsTimed = createNumber("checkpoints_timed", Long.class);

    public final NumberPath<Long> maxwrittenClean = createNumber("maxwritten_clean", Long.class);

    public final DateTimePath<java.sql.Timestamp> statsReset = createDateTime("stats_reset", java.sql.Timestamp.class);

    public QPgStatBgwriter(String variable) {
        super(QPgStatBgwriter.class, forVariable(variable), "pg_catalog", "pg_stat_bgwriter");
    }

    @SuppressWarnings("all")
    public QPgStatBgwriter(Path<? extends QPgStatBgwriter> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_stat_bgwriter");
    }

    public QPgStatBgwriter(PathMetadata<?> metadata) {
        super(QPgStatBgwriter.class, metadata, "pg_catalog", "pg_stat_bgwriter");
    }

}

