package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgLargeobjectMetadataOidIndex is a Querydsl query type for QPgLargeobjectMetadataOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgLargeobjectMetadataOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgLargeobjectMetadataOidIndex> {

    private static final long serialVersionUID = 1557315478;

    public static final QPgLargeobjectMetadataOidIndex pgLargeobjectMetadataOidIndex = new QPgLargeobjectMetadataOidIndex("pg_largeobject_metadata_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgLargeobjectMetadataOidIndex(String variable) {
        super(QPgLargeobjectMetadataOidIndex.class, forVariable(variable), "pg_catalog", "pg_largeobject_metadata_oid_index");
    }

    @SuppressWarnings("all")
    public QPgLargeobjectMetadataOidIndex(Path<? extends QPgLargeobjectMetadataOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_largeobject_metadata_oid_index");
    }

    public QPgLargeobjectMetadataOidIndex(PathMetadata<?> metadata) {
        super(QPgLargeobjectMetadataOidIndex.class, metadata, "pg_catalog", "pg_largeobject_metadata_oid_index");
    }

}

