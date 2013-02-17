package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * Q_pgForeignServers is a Querydsl query type for Q_pgForeignServers
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class Q_pgForeignServers extends com.mysema.query.sql.RelationalPathBase<Q_pgForeignServers> {

    private static final long serialVersionUID = -1653347154;

    public static final Q_pgForeignServers PgForeignServers = new Q_pgForeignServers("_pg_foreign_servers");

    public final SimplePath<Object> authorizationIdentifier = createSimple("authorization_identifier", Object.class);

    public final SimplePath<Object> foreignDataWrapperCatalog = createSimple("foreign_data_wrapper_catalog", Object.class);

    public final SimplePath<Object> foreignDataWrapperName = createSimple("foreign_data_wrapper_name", Object.class);

    public final SimplePath<Object> foreignServerCatalog = createSimple("foreign_server_catalog", Object.class);

    public final SimplePath<Object> foreignServerName = createSimple("foreign_server_name", Object.class);

    public final SimplePath<Object> foreignServerType = createSimple("foreign_server_type", Object.class);

    public final SimplePath<Object> foreignServerVersion = createSimple("foreign_server_version", Object.class);

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public final SimplePath<Object[]> srvoptions = createSimple("srvoptions", Object[].class);

    public Q_pgForeignServers(String variable) {
        super(Q_pgForeignServers.class, forVariable(variable), "information_schema", "_pg_foreign_servers");
    }

    @SuppressWarnings("all")
    public Q_pgForeignServers(Path<? extends Q_pgForeignServers> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "_pg_foreign_servers");
    }

    public Q_pgForeignServers(PathMetadata<?> metadata) {
        super(Q_pgForeignServers.class, metadata, "information_schema", "_pg_foreign_servers");
    }

}

