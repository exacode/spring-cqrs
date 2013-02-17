package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QTriggeredUpdateColumns is a Querydsl query type for QTriggeredUpdateColumns
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QTriggeredUpdateColumns extends com.mysema.query.sql.RelationalPathBase<QTriggeredUpdateColumns> {

    private static final long serialVersionUID = 1744856833;

    public static final QTriggeredUpdateColumns triggeredUpdateColumns = new QTriggeredUpdateColumns("triggered_update_columns");

    public final SimplePath<Object> eventObjectCatalog = createSimple("event_object_catalog", Object.class);

    public final SimplePath<Object> eventObjectColumn = createSimple("event_object_column", Object.class);

    public final SimplePath<Object> eventObjectSchema = createSimple("event_object_schema", Object.class);

    public final SimplePath<Object> eventObjectTable = createSimple("event_object_table", Object.class);

    public final SimplePath<Object> triggerCatalog = createSimple("trigger_catalog", Object.class);

    public final SimplePath<Object> triggerName = createSimple("trigger_name", Object.class);

    public final SimplePath<Object> triggerSchema = createSimple("trigger_schema", Object.class);

    public QTriggeredUpdateColumns(String variable) {
        super(QTriggeredUpdateColumns.class, forVariable(variable), "information_schema", "triggered_update_columns");
    }

    @SuppressWarnings("all")
    public QTriggeredUpdateColumns(Path<? extends QTriggeredUpdateColumns> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "triggered_update_columns");
    }

    public QTriggeredUpdateColumns(PathMetadata<?> metadata) {
        super(QTriggeredUpdateColumns.class, metadata, "information_schema", "triggered_update_columns");
    }

}

