package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QRoleRoutineGrants is a Querydsl query type for QRoleRoutineGrants
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QRoleRoutineGrants extends com.mysema.query.sql.RelationalPathBase<QRoleRoutineGrants> {

    private static final long serialVersionUID = 493542945;

    public static final QRoleRoutineGrants roleRoutineGrants = new QRoleRoutineGrants("role_routine_grants");

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

    public QRoleRoutineGrants(String variable) {
        super(QRoleRoutineGrants.class, forVariable(variable), "information_schema", "role_routine_grants");
    }

    @SuppressWarnings("all")
    public QRoleRoutineGrants(Path<? extends QRoleRoutineGrants> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "role_routine_grants");
    }

    public QRoleRoutineGrants(PathMetadata<?> metadata) {
        super(QRoleRoutineGrants.class, metadata, "information_schema", "role_routine_grants");
    }

}

