package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgExtensionOidIndex is a Querydsl query type for QPgExtensionOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgExtensionOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgExtensionOidIndex> {

    private static final long serialVersionUID = 1109589132;

    public static final QPgExtensionOidIndex pgExtensionOidIndex = new QPgExtensionOidIndex("pg_extension_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgExtensionOidIndex(String variable) {
        super(QPgExtensionOidIndex.class, forVariable(variable), "pg_catalog", "pg_extension_oid_index");
    }

    @SuppressWarnings("all")
    public QPgExtensionOidIndex(Path<? extends QPgExtensionOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_extension_oid_index");
    }

    public QPgExtensionOidIndex(PathMetadata<?> metadata) {
        super(QPgExtensionOidIndex.class, metadata, "pg_catalog", "pg_extension_oid_index");
    }

}

