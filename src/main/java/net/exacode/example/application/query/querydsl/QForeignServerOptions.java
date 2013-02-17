package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QForeignServerOptions is a Querydsl query type for QForeignServerOptions
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QForeignServerOptions extends com.mysema.query.sql.RelationalPathBase<QForeignServerOptions> {

    private static final long serialVersionUID = -1185396309;

    public static final QForeignServerOptions foreignServerOptions = new QForeignServerOptions("foreign_server_options");

    public final SimplePath<Object> foreignServerCatalog = createSimple("foreign_server_catalog", Object.class);

    public final SimplePath<Object> foreignServerName = createSimple("foreign_server_name", Object.class);

    public final SimplePath<Object> optionName = createSimple("option_name", Object.class);

    public final SimplePath<Object> optionValue = createSimple("option_value", Object.class);

    public QForeignServerOptions(String variable) {
        super(QForeignServerOptions.class, forVariable(variable), "information_schema", "foreign_server_options");
    }

    @SuppressWarnings("all")
    public QForeignServerOptions(Path<? extends QForeignServerOptions> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "foreign_server_options");
    }

    public QForeignServerOptions(PathMetadata<?> metadata) {
        super(QForeignServerOptions.class, metadata, "information_schema", "foreign_server_options");
    }

}

