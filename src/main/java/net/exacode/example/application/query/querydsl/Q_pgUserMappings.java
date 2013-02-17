package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * Q_pgUserMappings is a Querydsl query type for Q_pgUserMappings
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class Q_pgUserMappings extends com.mysema.query.sql.RelationalPathBase<Q_pgUserMappings> {

    private static final long serialVersionUID = -713374366;

    public static final Q_pgUserMappings PgUserMappings = new Q_pgUserMappings("_pg_user_mappings");

    public final SimplePath<Object> authorizationIdentifier = createSimple("authorization_identifier", Object.class);

    public final SimplePath<Object> foreignServerCatalog = createSimple("foreign_server_catalog", Object.class);

    public final SimplePath<Object> foreignServerName = createSimple("foreign_server_name", Object.class);

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public final SimplePath<Object> srvowner = createSimple("srvowner", Object.class);

    public final SimplePath<Object[]> umoptions = createSimple("umoptions", Object[].class);

    public final NumberPath<Long> umuser = createNumber("umuser", Long.class);

    public Q_pgUserMappings(String variable) {
        super(Q_pgUserMappings.class, forVariable(variable), "information_schema", "_pg_user_mappings");
    }

    @SuppressWarnings("all")
    public Q_pgUserMappings(Path<? extends Q_pgUserMappings> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "_pg_user_mappings");
    }

    public Q_pgUserMappings(PathMetadata<?> metadata) {
        super(Q_pgUserMappings.class, metadata, "information_schema", "_pg_user_mappings");
    }

}

