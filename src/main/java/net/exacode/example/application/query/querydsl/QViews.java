package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QViews is a Querydsl query type for QViews
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QViews extends com.mysema.query.sql.RelationalPathBase<QViews> {

    private static final long serialVersionUID = 1552008874;

    public static final QViews views = new QViews("views");

    public final SimplePath<Object> checkOption = createSimple("check_option", Object.class);

    public final SimplePath<Object> isInsertableInto = createSimple("is_insertable_into", Object.class);

    public final SimplePath<Object> isTriggerDeletable = createSimple("is_trigger_deletable", Object.class);

    public final SimplePath<Object> isTriggerInsertableInto = createSimple("is_trigger_insertable_into", Object.class);

    public final SimplePath<Object> isTriggerUpdatable = createSimple("is_trigger_updatable", Object.class);

    public final SimplePath<Object> isUpdatable = createSimple("is_updatable", Object.class);

    public final SimplePath<Object> tableCatalog = createSimple("table_catalog", Object.class);

    public final SimplePath<Object> tableName = createSimple("table_name", Object.class);

    public final SimplePath<Object> tableSchema = createSimple("table_schema", Object.class);

    public final SimplePath<Object> viewDefinition = createSimple("view_definition", Object.class);

    public QViews(String variable) {
        super(QViews.class, forVariable(variable), "information_schema", "views");
    }

    @SuppressWarnings("all")
    public QViews(Path<? extends QViews> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "views");
    }

    public QViews(PathMetadata<?> metadata) {
        super(QViews.class, metadata, "information_schema", "views");
    }

}

