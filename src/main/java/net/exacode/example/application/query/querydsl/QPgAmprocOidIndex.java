package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgAmprocOidIndex is a Querydsl query type for QPgAmprocOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgAmprocOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgAmprocOidIndex> {

    private static final long serialVersionUID = -769177371;

    public static final QPgAmprocOidIndex pgAmprocOidIndex = new QPgAmprocOidIndex("pg_amproc_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgAmprocOidIndex(String variable) {
        super(QPgAmprocOidIndex.class, forVariable(variable), "pg_catalog", "pg_amproc_oid_index");
    }

    @SuppressWarnings("all")
    public QPgAmprocOidIndex(Path<? extends QPgAmprocOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_amproc_oid_index");
    }

    public QPgAmprocOidIndex(PathMetadata<?> metadata) {
        super(QPgAmprocOidIndex.class, metadata, "pg_catalog", "pg_amproc_oid_index");
    }

}

