package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgStatioSysIndexes is a Querydsl query type for QPgStatioSysIndexes
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgStatioSysIndexes extends com.mysema.query.sql.RelationalPathBase<QPgStatioSysIndexes> {

    private static final long serialVersionUID = -806468376;

    public static final QPgStatioSysIndexes pgStatioSysIndexes = new QPgStatioSysIndexes("pg_statio_sys_indexes");

    public final NumberPath<Long> idxBlksHit = createNumber("idx_blks_hit", Long.class);

    public final NumberPath<Long> idxBlksRead = createNumber("idx_blks_read", Long.class);

    public final NumberPath<Long> indexrelid = createNumber("indexrelid", Long.class);

    public final StringPath indexrelname = createString("indexrelname");

    public final NumberPath<Long> relid = createNumber("relid", Long.class);

    public final StringPath relname = createString("relname");

    public final StringPath schemaname = createString("schemaname");

    public QPgStatioSysIndexes(String variable) {
        super(QPgStatioSysIndexes.class, forVariable(variable), "pg_catalog", "pg_statio_sys_indexes");
    }

    @SuppressWarnings("all")
    public QPgStatioSysIndexes(Path<? extends QPgStatioSysIndexes> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_statio_sys_indexes");
    }

    public QPgStatioSysIndexes(PathMetadata<?> metadata) {
        super(QPgStatioSysIndexes.class, metadata, "pg_catalog", "pg_statio_sys_indexes");
    }

}

