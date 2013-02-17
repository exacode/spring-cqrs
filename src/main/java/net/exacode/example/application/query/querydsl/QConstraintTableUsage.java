package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QConstraintTableUsage is a Querydsl query type for QConstraintTableUsage
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QConstraintTableUsage extends com.mysema.query.sql.RelationalPathBase<QConstraintTableUsage> {

    private static final long serialVersionUID = 99113076;

    public static final QConstraintTableUsage constraintTableUsage = new QConstraintTableUsage("constraint_table_usage");

    public final SimplePath<Object> constraintCatalog = createSimple("constraint_catalog", Object.class);

    public final SimplePath<Object> constraintName = createSimple("constraint_name", Object.class);

    public final SimplePath<Object> constraintSchema = createSimple("constraint_schema", Object.class);

    public final SimplePath<Object> tableCatalog = createSimple("table_catalog", Object.class);

    public final SimplePath<Object> tableName = createSimple("table_name", Object.class);

    public final SimplePath<Object> tableSchema = createSimple("table_schema", Object.class);

    public QConstraintTableUsage(String variable) {
        super(QConstraintTableUsage.class, forVariable(variable), "information_schema", "constraint_table_usage");
    }

    @SuppressWarnings("all")
    public QConstraintTableUsage(Path<? extends QConstraintTableUsage> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "constraint_table_usage");
    }

    public QConstraintTableUsage(PathMetadata<?> metadata) {
        super(QConstraintTableUsage.class, metadata, "information_schema", "constraint_table_usage");
    }

}

