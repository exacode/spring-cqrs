package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgAuthidOidIndex is a Querydsl query type for QPgAuthidOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgAuthidOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgAuthidOidIndex> {

    private static final long serialVersionUID = 1856167718;

    public static final QPgAuthidOidIndex pgAuthidOidIndex = new QPgAuthidOidIndex("pg_authid_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgAuthidOidIndex(String variable) {
        super(QPgAuthidOidIndex.class, forVariable(variable), "pg_catalog", "pg_authid_oid_index");
    }

    @SuppressWarnings("all")
    public QPgAuthidOidIndex(Path<? extends QPgAuthidOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_authid_oid_index");
    }

    public QPgAuthidOidIndex(PathMetadata<?> metadata) {
        super(QPgAuthidOidIndex.class, metadata, "pg_catalog", "pg_authid_oid_index");
    }

}

