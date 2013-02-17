package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgForeignServerOidIndex is a Querydsl query type for QPgForeignServerOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgForeignServerOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgForeignServerOidIndex> {

    private static final long serialVersionUID = -652571900;

    public static final QPgForeignServerOidIndex pgForeignServerOidIndex = new QPgForeignServerOidIndex("pg_foreign_server_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgForeignServerOidIndex(String variable) {
        super(QPgForeignServerOidIndex.class, forVariable(variable), "pg_catalog", "pg_foreign_server_oid_index");
    }

    @SuppressWarnings("all")
    public QPgForeignServerOidIndex(Path<? extends QPgForeignServerOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_foreign_server_oid_index");
    }

    public QPgForeignServerOidIndex(PathMetadata<?> metadata) {
        super(QPgForeignServerOidIndex.class, metadata, "pg_catalog", "pg_foreign_server_oid_index");
    }

}

