package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QKeyColumnUsage is a Querydsl query type for QKeyColumnUsage
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QKeyColumnUsage extends com.mysema.query.sql.RelationalPathBase<QKeyColumnUsage> {

    private static final long serialVersionUID = -1812111536;

    public static final QKeyColumnUsage keyColumnUsage = new QKeyColumnUsage("key_column_usage");

    public final SimplePath<Object> columnName = createSimple("column_name", Object.class);

    public final SimplePath<Object> constraintCatalog = createSimple("constraint_catalog", Object.class);

    public final SimplePath<Object> constraintName = createSimple("constraint_name", Object.class);

    public final SimplePath<Object> constraintSchema = createSimple("constraint_schema", Object.class);

    public final SimplePath<Object> ordinalPosition = createSimple("ordinal_position", Object.class);

    public final SimplePath<Object> positionInUniqueConstraint = createSimple("position_in_unique_constraint", Object.class);

    public final SimplePath<Object> tableCatalog = createSimple("table_catalog", Object.class);

    public final SimplePath<Object> tableName = createSimple("table_name", Object.class);

    public final SimplePath<Object> tableSchema = createSimple("table_schema", Object.class);

    public QKeyColumnUsage(String variable) {
        super(QKeyColumnUsage.class, forVariable(variable), "information_schema", "key_column_usage");
    }

    @SuppressWarnings("all")
    public QKeyColumnUsage(Path<? extends QKeyColumnUsage> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "key_column_usage");
    }

    public QKeyColumnUsage(PathMetadata<?> metadata) {
        super(QKeyColumnUsage.class, metadata, "information_schema", "key_column_usage");
    }

}

