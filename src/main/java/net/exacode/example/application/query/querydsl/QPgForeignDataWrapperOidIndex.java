package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgForeignDataWrapperOidIndex is a Querydsl query type for QPgForeignDataWrapperOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgForeignDataWrapperOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgForeignDataWrapperOidIndex> {

    private static final long serialVersionUID = 1171075064;

    public static final QPgForeignDataWrapperOidIndex pgForeignDataWrapperOidIndex = new QPgForeignDataWrapperOidIndex("pg_foreign_data_wrapper_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgForeignDataWrapperOidIndex(String variable) {
        super(QPgForeignDataWrapperOidIndex.class, forVariable(variable), "pg_catalog", "pg_foreign_data_wrapper_oid_index");
    }

    @SuppressWarnings("all")
    public QPgForeignDataWrapperOidIndex(Path<? extends QPgForeignDataWrapperOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_foreign_data_wrapper_oid_index");
    }

    public QPgForeignDataWrapperOidIndex(PathMetadata<?> metadata) {
        super(QPgForeignDataWrapperOidIndex.class, metadata, "pg_catalog", "pg_foreign_data_wrapper_oid_index");
    }

}

