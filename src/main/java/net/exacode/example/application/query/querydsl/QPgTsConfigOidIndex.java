package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgTsConfigOidIndex is a Querydsl query type for QPgTsConfigOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgTsConfigOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgTsConfigOidIndex> {

    private static final long serialVersionUID = -1583757244;

    public static final QPgTsConfigOidIndex pgTsConfigOidIndex = new QPgTsConfigOidIndex("pg_ts_config_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgTsConfigOidIndex(String variable) {
        super(QPgTsConfigOidIndex.class, forVariable(variable), "pg_catalog", "pg_ts_config_oid_index");
    }

    @SuppressWarnings("all")
    public QPgTsConfigOidIndex(Path<? extends QPgTsConfigOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_ts_config_oid_index");
    }

    public QPgTsConfigOidIndex(PathMetadata<?> metadata) {
        super(QPgTsConfigOidIndex.class, metadata, "pg_catalog", "pg_ts_config_oid_index");
    }

}

