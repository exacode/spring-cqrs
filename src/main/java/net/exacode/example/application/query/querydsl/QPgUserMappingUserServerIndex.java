package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgUserMappingUserServerIndex is a Querydsl query type for QPgUserMappingUserServerIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgUserMappingUserServerIndex extends com.mysema.query.sql.RelationalPathBase<QPgUserMappingUserServerIndex> {

    private static final long serialVersionUID = 1280771356;

    public static final QPgUserMappingUserServerIndex pgUserMappingUserServerIndex = new QPgUserMappingUserServerIndex("pg_user_mapping_user_server_index");

    public final NumberPath<Long> umserver = createNumber("umserver", Long.class);

    public final NumberPath<Long> umuser = createNumber("umuser", Long.class);

    public QPgUserMappingUserServerIndex(String variable) {
        super(QPgUserMappingUserServerIndex.class, forVariable(variable), "pg_catalog", "pg_user_mapping_user_server_index");
    }

    @SuppressWarnings("all")
    public QPgUserMappingUserServerIndex(Path<? extends QPgUserMappingUserServerIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_user_mapping_user_server_index");
    }

    public QPgUserMappingUserServerIndex(PathMetadata<?> metadata) {
        super(QPgUserMappingUserServerIndex.class, metadata, "pg_catalog", "pg_user_mapping_user_server_index");
    }

}

