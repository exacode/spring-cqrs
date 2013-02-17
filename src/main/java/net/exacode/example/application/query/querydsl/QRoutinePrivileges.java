package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QRoutinePrivileges is a Querydsl query type for QRoutinePrivileges
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QRoutinePrivileges extends com.mysema.query.sql.RelationalPathBase<QRoutinePrivileges> {

    private static final long serialVersionUID = 731064834;

    public static final QRoutinePrivileges routinePrivileges = new QRoutinePrivileges("routine_privileges");

    public final SimplePath<Object> grantee = createSimple("grantee", Object.class);

    public final SimplePath<Object> grantor = createSimple("grantor", Object.class);

    public final SimplePath<Object> isGrantable = createSimple("is_grantable", Object.class);

    public final SimplePath<Object> privilegeType = createSimple("privilege_type", Object.class);

    public final SimplePath<Object> routineCatalog = createSimple("routine_catalog", Object.class);

    public final SimplePath<Object> routineName = createSimple("routine_name", Object.class);

    public final SimplePath<Object> routineSchema = createSimple("routine_schema", Object.class);

    public final SimplePath<Object> specificCatalog = createSimple("specific_catalog", Object.class);

    public final SimplePath<Object> specificName = createSimple("specific_name", Object.class);

    public final SimplePath<Object> specificSchema = createSimple("specific_schema", Object.class);

    public QRoutinePrivileges(String variable) {
        super(QRoutinePrivileges.class, forVariable(variable), "information_schema", "routine_privileges");
    }

    @SuppressWarnings("all")
    public QRoutinePrivileges(Path<? extends QRoutinePrivileges> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "routine_privileges");
    }

    public QRoutinePrivileges(PathMetadata<?> metadata) {
        super(QRoutinePrivileges.class, metadata, "information_schema", "routine_privileges");
    }

}

