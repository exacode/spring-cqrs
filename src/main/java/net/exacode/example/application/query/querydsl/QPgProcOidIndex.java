package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgProcOidIndex is a Querydsl query type for QPgProcOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgProcOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgProcOidIndex> {

    private static final long serialVersionUID = 1840802169;

    public static final QPgProcOidIndex pgProcOidIndex = new QPgProcOidIndex("pg_proc_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgProcOidIndex(String variable) {
        super(QPgProcOidIndex.class, forVariable(variable), "pg_catalog", "pg_proc_oid_index");
    }

    @SuppressWarnings("all")
    public QPgProcOidIndex(Path<? extends QPgProcOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_proc_oid_index");
    }

    public QPgProcOidIndex(PathMetadata<?> metadata) {
        super(QPgProcOidIndex.class, metadata, "pg_catalog", "pg_proc_oid_index");
    }

}

