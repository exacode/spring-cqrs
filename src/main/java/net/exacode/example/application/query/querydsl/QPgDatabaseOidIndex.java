package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgDatabaseOidIndex is a Querydsl query type for QPgDatabaseOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgDatabaseOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgDatabaseOidIndex> {

    private static final long serialVersionUID = -2065564386;

    public static final QPgDatabaseOidIndex pgDatabaseOidIndex = new QPgDatabaseOidIndex("pg_database_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgDatabaseOidIndex(String variable) {
        super(QPgDatabaseOidIndex.class, forVariable(variable), "pg_catalog", "pg_database_oid_index");
    }

    @SuppressWarnings("all")
    public QPgDatabaseOidIndex(Path<? extends QPgDatabaseOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_database_oid_index");
    }

    public QPgDatabaseOidIndex(PathMetadata<?> metadata) {
        super(QPgDatabaseOidIndex.class, metadata, "pg_catalog", "pg_database_oid_index");
    }

}

