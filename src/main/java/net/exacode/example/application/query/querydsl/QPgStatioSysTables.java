package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgStatioSysTables is a Querydsl query type for QPgStatioSysTables
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgStatioSysTables extends com.mysema.query.sql.RelationalPathBase<QPgStatioSysTables> {

    private static final long serialVersionUID = -138795651;

    public static final QPgStatioSysTables pgStatioSysTables = new QPgStatioSysTables("pg_statio_sys_tables");

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

    public QPgStatioSysTables(String variable) {
        super(QPgStatioSysTables.class, forVariable(variable), "pg_catalog", "pg_statio_sys_tables");
    }

    @SuppressWarnings("all")
    public QPgStatioSysTables(Path<? extends QPgStatioSysTables> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_statio_sys_tables");
    }

    public QPgStatioSysTables(PathMetadata<?> metadata) {
        super(QPgStatioSysTables.class, metadata, "pg_catalog", "pg_statio_sys_tables");
    }

}

