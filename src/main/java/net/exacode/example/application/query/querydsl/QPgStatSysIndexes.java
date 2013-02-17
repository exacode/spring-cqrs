package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgStatSysIndexes is a Querydsl query type for QPgStatSysIndexes
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgStatSysIndexes extends com.mysema.query.sql.RelationalPathBase<QPgStatSysIndexes> {

    private static final long serialVersionUID = 117083906;

    public static final QPgStatSysIndexes pgStatSysIndexes = new QPgStatSysIndexes("pg_stat_sys_indexes");

    public final NumberPath<Long> idxScan = createNumber("idx_scan", Long.class);

    public final NumberPath<Long> idxTupFetch = createNumber("idx_tup_fetch", Long.class);

    public final NumberPath<Long> idxTupRead = createNumber("idx_tup_read", Long.class);

    public final NumberPath<Long> indexrelid = createNumber("indexrelid", Long.class);

    public final StringPath indexrelname = createString("indexrelname");

    public final NumberPath<Long> relid = createNumber("relid", Long.class);

    public final StringPath relname = createString("relname");

    public final StringPath schemaname = createString("schemaname");

    public QPgStatSysIndexes(String variable) {
        super(QPgStatSysIndexes.class, forVariable(variable), "pg_catalog", "pg_stat_sys_indexes");
    }

    @SuppressWarnings("all")
    public QPgStatSysIndexes(Path<? extends QPgStatSysIndexes> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_stat_sys_indexes");
    }

    public QPgStatSysIndexes(PathMetadata<?> metadata) {
        super(QPgStatSysIndexes.class, metadata, "pg_catalog", "pg_stat_sys_indexes");
    }

}

