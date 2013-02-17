package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QViewRoutineUsage is a Querydsl query type for QViewRoutineUsage
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QViewRoutineUsage extends com.mysema.query.sql.RelationalPathBase<QViewRoutineUsage> {

    private static final long serialVersionUID = 1746558150;

    public static final QViewRoutineUsage viewRoutineUsage = new QViewRoutineUsage("view_routine_usage");

    public final SimplePath<Object> specificCatalog = createSimple("specific_catalog", Object.class);

    public final SimplePath<Object> specificName = createSimple("specific_name", Object.class);

    public final SimplePath<Object> specificSchema = createSimple("specific_schema", Object.class);

    public final SimplePath<Object> tableCatalog = createSimple("table_catalog", Object.class);

    public final SimplePath<Object> tableName = createSimple("table_name", Object.class);

    public final SimplePath<Object> tableSchema = createSimple("table_schema", Object.class);

    public QViewRoutineUsage(String variable) {
        super(QViewRoutineUsage.class, forVariable(variable), "information_schema", "view_routine_usage");
    }

    @SuppressWarnings("all")
    public QViewRoutineUsage(Path<? extends QViewRoutineUsage> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "view_routine_usage");
    }

    public QViewRoutineUsage(PathMetadata<?> metadata) {
        super(QViewRoutineUsage.class, metadata, "information_schema", "view_routine_usage");
    }

}

