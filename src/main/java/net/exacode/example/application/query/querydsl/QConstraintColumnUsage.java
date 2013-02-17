package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QConstraintColumnUsage is a Querydsl query type for QConstraintColumnUsage
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QConstraintColumnUsage extends com.mysema.query.sql.RelationalPathBase<QConstraintColumnUsage> {

    private static final long serialVersionUID = 1909082634;

    public static final QConstraintColumnUsage constraintColumnUsage = new QConstraintColumnUsage("constraint_column_usage");

    public final SimplePath<Object> columnName = createSimple("column_name", Object.class);

    public final SimplePath<Object> constraintCatalog = createSimple("constraint_catalog", Object.class);

    public final SimplePath<Object> constraintName = createSimple("constraint_name", Object.class);

    public final SimplePath<Object> constraintSchema = createSimple("constraint_schema", Object.class);

    public final SimplePath<Object> tableCatalog = createSimple("table_catalog", Object.class);

    public final SimplePath<Object> tableName = createSimple("table_name", Object.class);

    public final SimplePath<Object> tableSchema = createSimple("table_schema", Object.class);

    public QConstraintColumnUsage(String variable) {
        super(QConstraintColumnUsage.class, forVariable(variable), "information_schema", "constraint_column_usage");
    }

    @SuppressWarnings("all")
    public QConstraintColumnUsage(Path<? extends QConstraintColumnUsage> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "constraint_column_usage");
    }

    public QConstraintColumnUsage(PathMetadata<?> metadata) {
        super(QConstraintColumnUsage.class, metadata, "information_schema", "constraint_column_usage");
    }

}

