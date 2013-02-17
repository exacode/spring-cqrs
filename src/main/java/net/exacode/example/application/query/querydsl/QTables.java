package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QTables is a Querydsl query type for QTables
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QTables extends com.mysema.query.sql.RelationalPathBase<QTables> {

    private static final long serialVersionUID = 802888105;

    public static final QTables tables = new QTables("tables");

    public final SimplePath<Object> commitAction = createSimple("commit_action", Object.class);

    public final SimplePath<Object> isInsertableInto = createSimple("is_insertable_into", Object.class);

    public final SimplePath<Object> isTyped = createSimple("is_typed", Object.class);

    public final SimplePath<Object> referenceGeneration = createSimple("reference_generation", Object.class);

    public final SimplePath<Object> selfReferencingColumnName = createSimple("self_referencing_column_name", Object.class);

    public final SimplePath<Object> tableCatalog = createSimple("table_catalog", Object.class);

    public final SimplePath<Object> tableName = createSimple("table_name", Object.class);

    public final SimplePath<Object> tableSchema = createSimple("table_schema", Object.class);

    public final SimplePath<Object> tableType = createSimple("table_type", Object.class);

    public final SimplePath<Object> userDefinedTypeCatalog = createSimple("user_defined_type_catalog", Object.class);

    public final SimplePath<Object> userDefinedTypeName = createSimple("user_defined_type_name", Object.class);

    public final SimplePath<Object> userDefinedTypeSchema = createSimple("user_defined_type_schema", Object.class);

    public QTables(String variable) {
        super(QTables.class, forVariable(variable), "information_schema", "tables");
    }

    @SuppressWarnings("all")
    public QTables(Path<? extends QTables> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "tables");
    }

    public QTables(PathMetadata<?> metadata) {
        super(QTables.class, metadata, "information_schema", "tables");
    }

}

