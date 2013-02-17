package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QUserMappings is a Querydsl query type for QUserMappings
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QUserMappings extends com.mysema.query.sql.RelationalPathBase<QUserMappings> {

    private static final long serialVersionUID = 768388756;

    public static final QUserMappings userMappings = new QUserMappings("user_mappings");

    public final SimplePath<Object> authorizationIdentifier = createSimple("authorization_identifier", Object.class);

    public final SimplePath<Object> foreignServerCatalog = createSimple("foreign_server_catalog", Object.class);

    public final SimplePath<Object> foreignServerName = createSimple("foreign_server_name", Object.class);

    public QUserMappings(String variable) {
        super(QUserMappings.class, forVariable(variable), "information_schema", "user_mappings");
    }

    @SuppressWarnings("all")
    public QUserMappings(Path<? extends QUserMappings> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "user_mappings");
    }

    public QUserMappings(PathMetadata<?> metadata) {
        super(QUserMappings.class, metadata, "information_schema", "user_mappings");
    }

}

