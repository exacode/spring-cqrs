package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgUserMappingOidIndex is a Querydsl query type for QPgUserMappingOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgUserMappingOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgUserMappingOidIndex> {

    private static final long serialVersionUID = -1566119536;

    public static final QPgUserMappingOidIndex pgUserMappingOidIndex = new QPgUserMappingOidIndex("pg_user_mapping_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgUserMappingOidIndex(String variable) {
        super(QPgUserMappingOidIndex.class, forVariable(variable), "pg_catalog", "pg_user_mapping_oid_index");
    }

    @SuppressWarnings("all")
    public QPgUserMappingOidIndex(Path<? extends QPgUserMappingOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_user_mapping_oid_index");
    }

    public QPgUserMappingOidIndex(PathMetadata<?> metadata) {
        super(QPgUserMappingOidIndex.class, metadata, "pg_catalog", "pg_user_mapping_oid_index");
    }

}

