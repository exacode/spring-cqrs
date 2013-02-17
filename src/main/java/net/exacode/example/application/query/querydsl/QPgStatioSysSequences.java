package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgStatioSysSequences is a Querydsl query type for QPgStatioSysSequences
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgStatioSysSequences extends com.mysema.query.sql.RelationalPathBase<QPgStatioSysSequences> {

    private static final long serialVersionUID = 2066293434;

    public static final QPgStatioSysSequences pgStatioSysSequences = new QPgStatioSysSequences("pg_statio_sys_sequences");

    public final NumberPath<Long> blksHit = createNumber("blks_hit", Long.class);

    public final NumberPath<Long> blksRead = createNumber("blks_read", Long.class);

    public final NumberPath<Long> relid = createNumber("relid", Long.class);

    public final StringPath relname = createString("relname");

    public final StringPath schemaname = createString("schemaname");

    public QPgStatioSysSequences(String variable) {
        super(QPgStatioSysSequences.class, forVariable(variable), "pg_catalog", "pg_statio_sys_sequences");
    }

    @SuppressWarnings("all")
    public QPgStatioSysSequences(Path<? extends QPgStatioSysSequences> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_statio_sys_sequences");
    }

    public QPgStatioSysSequences(PathMetadata<?> metadata) {
        super(QPgStatioSysSequences.class, metadata, "pg_catalog", "pg_statio_sys_sequences");
    }

}

