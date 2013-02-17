package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QCheckConstraintRoutineUsage is a Querydsl query type for QCheckConstraintRoutineUsage
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QCheckConstraintRoutineUsage extends com.mysema.query.sql.RelationalPathBase<QCheckConstraintRoutineUsage> {

    private static final long serialVersionUID = -588398562;

    public static final QCheckConstraintRoutineUsage checkConstraintRoutineUsage = new QCheckConstraintRoutineUsage("check_constraint_routine_usage");

    public final SimplePath<Object> constraintCatalog = createSimple("constraint_catalog", Object.class);

    public final SimplePath<Object> constraintName = createSimple("constraint_name", Object.class);

    public final SimplePath<Object> constraintSchema = createSimple("constraint_schema", Object.class);

    public final SimplePath<Object> specificCatalog = createSimple("specific_catalog", Object.class);

    public final SimplePath<Object> specificName = createSimple("specific_name", Object.class);

    public final SimplePath<Object> specificSchema = createSimple("specific_schema", Object.class);

    public QCheckConstraintRoutineUsage(String variable) {
        super(QCheckConstraintRoutineUsage.class, forVariable(variable), "information_schema", "check_constraint_routine_usage");
    }

    @SuppressWarnings("all")
    public QCheckConstraintRoutineUsage(Path<? extends QCheckConstraintRoutineUsage> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "check_constraint_routine_usage");
    }

    public QCheckConstraintRoutineUsage(PathMetadata<?> metadata) {
        super(QCheckConstraintRoutineUsage.class, metadata, "information_schema", "check_constraint_routine_usage");
    }

}

