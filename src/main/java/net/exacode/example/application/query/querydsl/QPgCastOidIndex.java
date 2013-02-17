package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgCastOidIndex is a Querydsl query type for QPgCastOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgCastOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgCastOidIndex> {

    private static final long serialVersionUID = -801879966;

    public static final QPgCastOidIndex pgCastOidIndex = new QPgCastOidIndex("pg_cast_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgCastOidIndex(String variable) {
        super(QPgCastOidIndex.class, forVariable(variable), "pg_catalog", "pg_cast_oid_index");
    }

    @SuppressWarnings("all")
    public QPgCastOidIndex(Path<? extends QPgCastOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_cast_oid_index");
    }

    public QPgCastOidIndex(PathMetadata<?> metadata) {
        super(QPgCastOidIndex.class, metadata, "pg_catalog", "pg_cast_oid_index");
    }

}

