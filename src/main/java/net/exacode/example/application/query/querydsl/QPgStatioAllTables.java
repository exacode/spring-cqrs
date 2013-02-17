package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgStatioAllTables is a Querydsl query type for QPgStatioAllTables
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgStatioAllTables extends com.mysema.query.sql.RelationalPathBase<QPgStatioAllTables> {

    private static final long serialVersionUID = -768642735;

    public static final QPgStatioAllTables pgStatioAllTables = new QPgStatioAllTables("pg_statio_all_tables");

    public final NumberPath<Long> heapBlksHit = createNumber("heap_blks_hit", Long.class);

    public final NumberPath<Long> heapBlksRead = createNumber("heap_blks_read", Long.class);

    public final NumberPath<Long> idxBlksHit = createNumber("idx_blks_hit", Long.class);

    public final NumberPath<Long> idxBlksRead = createNumber("idx_blks_read", Long.class);

    public final NumberPath<Long> relid = createNumber("relid", Long.class);

    public final StringPath relname = createString("relname");

    public final StringPath schemaname = createString("schemaname");

    public final NumberPath<Long> tidxBlksHit = createNumber("tidx_blks_hit", Long.class);

    public final NumberPath<Long> tidxBlksRead = createNumber("tidx_blks_read", Long.class);

    public final NumberPath<Long> toastBlksHit = createNumber("toast_blks_hit", Long.class);

    public final NumberPath<Long> toastBlksRead = createNumber("toast_blks_read", Long.class);

    public QPgStatioAllTables(String variable) {
        super(QPgStatioAllTables.class, forVariable(variable), "pg_catalog", "pg_statio_all_tables");
    }

    @SuppressWarnings("all")
    public QPgStatioAllTables(Path<? extends QPgStatioAllTables> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_statio_all_tables");
    }

    public QPgStatioAllTables(PathMetadata<?> metadata) {
        super(QPgStatioAllTables.class, metadata, "pg_catalog", "pg_statio_all_tables");
    }

}

