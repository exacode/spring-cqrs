package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QForeignServers is a Querydsl query type for QForeignServers
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QForeignServers extends com.mysema.query.sql.RelationalPathBase<QForeignServers> {

    private static final long serialVersionUID = 686838112;

    public static final QForeignServers foreignServers = new QForeignServers("foreign_servers");

    public final SimplePath<Object> authorizationIdentifier = createSimple("authorization_identifier", Object.class);

    public final SimplePath<Object> foreignDataWrapperCatalog = createSimple("foreign_data_wrapper_catalog", Object.class);

    public final SimplePath<Object> foreignDataWrapperName = createSimple("foreign_data_wrapper_name", Object.class);

    public final SimplePath<Object> foreignServerCatalog = createSimple("foreign_server_catalog", Object.class);

    public final SimplePath<Object> foreignServerName = createSimple("foreign_server_name", Object.class);

    public final SimplePath<Object> foreignServerType = createSimple("foreign_server_type", Object.class);

    public final SimplePath<Object> foreignServerVersion = createSimple("foreign_server_version", Object.class);

    public QForeignServers(String variable) {
        super(QForeignServers.class, forVariable(variable), "information_schema", "foreign_servers");
    }

    @SuppressWarnings("all")
    public QForeignServers(Path<? extends QForeignServers> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "foreign_servers");
    }

    public QForeignServers(PathMetadata<?> metadata) {
        super(QForeignServers.class, metadata, "information_schema", "foreign_servers");
    }

}

