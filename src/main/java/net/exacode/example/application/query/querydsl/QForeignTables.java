package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QForeignTables is a Querydsl query type for QForeignTables
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QForeignTables extends com.mysema.query.sql.RelationalPathBase<QForeignTables> {

    private static final long serialVersionUID = -1477415787;

    public static final QForeignTables foreignTables = new QForeignTables("foreign_tables");

    public final SimplePath<Object> foreignServerCatalog = createSimple("foreign_server_catalog", Object.class);

    public final SimplePath<Object> foreignServerName = createSimple("foreign_server_name", Object.class);

    public final SimplePath<Object> foreignTableCatalog = createSimple("foreign_table_catalog", Object.class);

    public final StringPath foreignTableName = createString("foreign_table_name");

    public final StringPath foreignTableSchema = createString("foreign_table_schema");

    public QForeignTables(String variable) {
        super(QForeignTables.class, forVariable(variable), "information_schema", "foreign_tables");
    }

    @SuppressWarnings("all")
    public QForeignTables(Path<? extends QForeignTables> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "foreign_tables");
    }

    public QForeignTables(PathMetadata<?> metadata) {
        super(QForeignTables.class, metadata, "information_schema", "foreign_tables");
    }

}

