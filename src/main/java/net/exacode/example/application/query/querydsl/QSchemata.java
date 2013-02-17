package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QSchemata is a Querydsl query type for QSchemata
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QSchemata extends com.mysema.query.sql.RelationalPathBase<QSchemata> {

    private static final long serialVersionUID = -1320912366;

    public static final QSchemata schemata = new QSchemata("schemata");

    public final SimplePath<Object> catalogName = createSimple("catalog_name", Object.class);

    public final SimplePath<Object> defaultCharacterSetCatalog = createSimple("default_character_set_catalog", Object.class);

    public final SimplePath<Object> defaultCharacterSetName = createSimple("default_character_set_name", Object.class);

    public final SimplePath<Object> defaultCharacterSetSchema = createSimple("default_character_set_schema", Object.class);

    public final SimplePath<Object> schemaName = createSimple("schema_name", Object.class);

    public final SimplePath<Object> schemaOwner = createSimple("schema_owner", Object.class);

    public final SimplePath<Object> sqlPath = createSimple("sql_path", Object.class);

    public QSchemata(String variable) {
        super(QSchemata.class, forVariable(variable), "information_schema", "schemata");
    }

    @SuppressWarnings("all")
    public QSchemata(Path<? extends QSchemata> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "schemata");
    }

    public QSchemata(PathMetadata<?> metadata) {
        super(QSchemata.class, metadata, "information_schema", "schemata");
    }

}

