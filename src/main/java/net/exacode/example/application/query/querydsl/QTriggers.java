package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QTriggers is a Querydsl query type for QTriggers
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QTriggers extends com.mysema.query.sql.RelationalPathBase<QTriggers> {

    private static final long serialVersionUID = 879852543;

    public static final QTriggers triggers = new QTriggers("triggers");

    public final SimplePath<Object> actionCondition = createSimple("action_condition", Object.class);

    public final SimplePath<Object> actionOrder = createSimple("action_order", Object.class);

    public final SimplePath<Object> actionOrientation = createSimple("action_orientation", Object.class);

    public final SimplePath<Object> actionReferenceNewRow = createSimple("action_reference_new_row", Object.class);

    public final SimplePath<Object> actionReferenceNewTable = createSimple("action_reference_new_table", Object.class);

    public final SimplePath<Object> actionReferenceOldRow = createSimple("action_reference_old_row", Object.class);

    public final SimplePath<Object> actionReferenceOldTable = createSimple("action_reference_old_table", Object.class);

    public final SimplePath<Object> actionStatement = createSimple("action_statement", Object.class);

    public final SimplePath<Object> actionTiming = createSimple("action_timing", Object.class);

    public final SimplePath<Object> created = createSimple("created", Object.class);

    public final SimplePath<Object> eventManipulation = createSimple("event_manipulation", Object.class);

    public final SimplePath<Object> eventObjectCatalog = createSimple("event_object_catalog", Object.class);

    public final SimplePath<Object> eventObjectSchema = createSimple("event_object_schema", Object.class);

    public final SimplePath<Object> eventObjectTable = createSimple("event_object_table", Object.class);

    public final SimplePath<Object> triggerCatalog = createSimple("trigger_catalog", Object.class);

    public final SimplePath<Object> triggerName = createSimple("trigger_name", Object.class);

    public final SimplePath<Object> triggerSchema = createSimple("trigger_schema", Object.class);

    public QTriggers(String variable) {
        super(QTriggers.class, forVariable(variable), "information_schema", "triggers");
    }

    @SuppressWarnings("all")
    public QTriggers(Path<? extends QTriggers> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "triggers");
    }

    public QTriggers(PathMetadata<?> metadata) {
        super(QTriggers.class, metadata, "information_schema", "triggers");
    }

}

