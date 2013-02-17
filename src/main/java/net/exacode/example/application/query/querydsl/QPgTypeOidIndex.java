package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgTypeOidIndex is a Querydsl query type for QPgTypeOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgTypeOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgTypeOidIndex> {

    private static final long serialVersionUID = -1148047011;

    public static final QPgTypeOidIndex pgTypeOidIndex = new QPgTypeOidIndex("pg_type_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgTypeOidIndex(String variable) {
        super(QPgTypeOidIndex.class, forVariable(variable), "pg_catalog", "pg_type_oid_index");
    }

    @SuppressWarnings("all")
    public QPgTypeOidIndex(Path<? extends QPgTypeOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_type_oid_index");
    }

    public QPgTypeOidIndex(PathMetadata<?> metadata) {
        super(QPgTypeOidIndex.class, metadata, "pg_catalog", "pg_type_oid_index");
    }

}

