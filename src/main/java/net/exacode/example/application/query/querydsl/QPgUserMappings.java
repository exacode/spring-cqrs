package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgUserMappings is a Querydsl query type for QPgUserMappings
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgUserMappings extends com.mysema.query.sql.RelationalPathBase<QPgUserMappings> {

    private static final long serialVersionUID = -303901397;

    public static final QPgUserMappings pgUserMappings = new QPgUserMappings("pg_user_mappings");

    public final NumberPath<Long> srvid = createNumber("srvid", Long.class);

    public final StringPath srvname = createString("srvname");

    public final NumberPath<Long> umid = createNumber("umid", Long.class);

    public final SimplePath<Object[]> umoptions = createSimple("umoptions", Object[].class);

    public final NumberPath<Long> umuser = createNumber("umuser", Long.class);

    public final StringPath usename = createString("usename");

    public QPgUserMappings(String variable) {
        super(QPgUserMappings.class, forVariable(variable), "pg_catalog", "pg_user_mappings");
    }

    @SuppressWarnings("all")
    public QPgUserMappings(Path<? extends QPgUserMappings> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_user_mappings");
    }

    public QPgUserMappings(PathMetadata<?> metadata) {
        super(QPgUserMappings.class, metadata, "pg_catalog", "pg_user_mappings");
    }

}

