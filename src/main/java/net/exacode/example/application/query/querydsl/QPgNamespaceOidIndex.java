package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgNamespaceOidIndex is a Querydsl query type for QPgNamespaceOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgNamespaceOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgNamespaceOidIndex> {

    private static final long serialVersionUID = -1619240536;

    public static final QPgNamespaceOidIndex pgNamespaceOidIndex = new QPgNamespaceOidIndex("pg_namespace_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgNamespaceOidIndex(String variable) {
        super(QPgNamespaceOidIndex.class, forVariable(variable), "pg_catalog", "pg_namespace_oid_index");
    }

    @SuppressWarnings("all")
    public QPgNamespaceOidIndex(Path<? extends QPgNamespaceOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_namespace_oid_index");
    }

    public QPgNamespaceOidIndex(PathMetadata<?> metadata) {
        super(QPgNamespaceOidIndex.class, metadata, "pg_catalog", "pg_namespace_oid_index");
    }

}

