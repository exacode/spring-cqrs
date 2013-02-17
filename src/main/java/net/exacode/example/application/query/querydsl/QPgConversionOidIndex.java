package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgConversionOidIndex is a Querydsl query type for QPgConversionOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgConversionOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgConversionOidIndex> {

    private static final long serialVersionUID = -775062791;

    public static final QPgConversionOidIndex pgConversionOidIndex = new QPgConversionOidIndex("pg_conversion_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgConversionOidIndex(String variable) {
        super(QPgConversionOidIndex.class, forVariable(variable), "pg_catalog", "pg_conversion_oid_index");
    }

    @SuppressWarnings("all")
    public QPgConversionOidIndex(Path<? extends QPgConversionOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_conversion_oid_index");
    }

    public QPgConversionOidIndex(PathMetadata<?> metadata) {
        super(QPgConversionOidIndex.class, metadata, "pg_catalog", "pg_conversion_oid_index");
    }

}

