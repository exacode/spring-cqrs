package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgTsDictOidIndex is a Querydsl query type for QPgTsDictOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgTsDictOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgTsDictOidIndex> {

    private static final long serialVersionUID = 53920568;

    public static final QPgTsDictOidIndex pgTsDictOidIndex = new QPgTsDictOidIndex("pg_ts_dict_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgTsDictOidIndex(String variable) {
        super(QPgTsDictOidIndex.class, forVariable(variable), "pg_catalog", "pg_ts_dict_oid_index");
    }

    @SuppressWarnings("all")
    public QPgTsDictOidIndex(Path<? extends QPgTsDictOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_ts_dict_oid_index");
    }

    public QPgTsDictOidIndex(PathMetadata<?> metadata) {
        super(QPgTsDictOidIndex.class, metadata, "pg_catalog", "pg_ts_dict_oid_index");
    }

}

