package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgEnumOidIndex is a Querydsl query type for QPgEnumOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgEnumOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgEnumOidIndex> {

    private static final long serialVersionUID = 1239973924;

    public static final QPgEnumOidIndex pgEnumOidIndex = new QPgEnumOidIndex("pg_enum_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgEnumOidIndex(String variable) {
        super(QPgEnumOidIndex.class, forVariable(variable), "pg_catalog", "pg_enum_oid_index");
    }

    @SuppressWarnings("all")
    public QPgEnumOidIndex(Path<? extends QPgEnumOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_enum_oid_index");
    }

    public QPgEnumOidIndex(PathMetadata<?> metadata) {
        super(QPgEnumOidIndex.class, metadata, "pg_catalog", "pg_enum_oid_index");
    }

}

