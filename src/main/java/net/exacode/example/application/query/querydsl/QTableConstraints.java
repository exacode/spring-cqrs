package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QTableConstraints is a Querydsl query type for QTableConstraints
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QTableConstraints extends com.mysema.query.sql.RelationalPathBase<QTableConstraints> {

    private static final long serialVersionUID = 460512204;

    public static final QTableConstraints tableConstraints = new QTableConstraints("table_constraints");

    public final SimplePath<Object> constraintCatalog = createSimple("constraint_catalog", Object.class);

    public final SimplePath<Object> constraintName = createSimple("constraint_name", Object.class);

    public final SimplePath<Object> constraintSchema = createSimple("constraint_schema", Object.class);

    public final SimplePath<Object> constraintType = createSimple("constraint_type", Object.class);

    public final SimplePath<Object> initiallyDeferred = createSimple("initially_deferred", Object.class);

    public final SimplePath<Object> isDeferrable = createSimple("is_deferrable", Object.class);

    public final SimplePath<Object> tableCatalog = createSimple("table_catalog", Object.class);

    public final SimplePath<Object> tableName = createSimple("table_name", Object.class);

    public final SimplePath<Object> tableSchema = createSimple("table_schema", Object.class);

    public QTableConstraints(String variable) {
        super(QTableConstraints.class, forVariable(variable), "information_schema", "table_constraints");
    }

    @SuppressWarnings("all")
    public QTableConstraints(Path<? extends QTableConstraints> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "table_constraints");
    }

    public QTableConstraints(PathMetadata<?> metadata) {
        super(QTableConstraints.class, metadata, "information_schema", "table_constraints");
    }

}

