package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QUserMappingOptions is a Querydsl query type for QUserMappingOptions
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QUserMappingOptions extends com.mysema.query.sql.RelationalPathBase<QUserMappingOptions> {

    private static final long serialVersionUID = 192868319;

    public static final QUserMappingOptions userMappingOptions = new QUserMappingOptions("user_mapping_options");

    public final SimplePath<Object> authorizationIdentifier = createSimple("authorization_identifier", Object.class);

    public final SimplePath<Object> foreignServerCatalog = createSimple("foreign_server_catalog", Object.class);

    public final SimplePath<Object> foreignServerName = createSimple("foreign_server_name", Object.class);

    public final SimplePath<Object> optionName = createSimple("option_name", Object.class);

    public final SimplePath<Object> optionValue = createSimple("option_value", Object.class);

    public QUserMappingOptions(String variable) {
        super(QUserMappingOptions.class, forVariable(variable), "information_schema", "user_mapping_options");
    }

    @SuppressWarnings("all")
    public QUserMappingOptions(Path<? extends QUserMappingOptions> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "user_mapping_options");
    }

    public QUserMappingOptions(PathMetadata<?> metadata) {
        super(QUserMappingOptions.class, metadata, "information_schema", "user_mapping_options");
    }

}

