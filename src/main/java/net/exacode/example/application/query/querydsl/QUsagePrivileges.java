package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QUsagePrivileges is a Querydsl query type for QUsagePrivileges
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QUsagePrivileges extends com.mysema.query.sql.RelationalPathBase<QUsagePrivileges> {

    private static final long serialVersionUID = 1690105247;

    public static final QUsagePrivileges usagePrivileges = new QUsagePrivileges("usage_privileges");

    public final SimplePath<Object> grantee = createSimple("grantee", Object.class);

    public final SimplePath<Object> grantor = createSimple("grantor", Object.class);

    public final SimplePath<Object> isGrantable = createSimple("is_grantable", Object.class);

    public final SimplePath<Object> objectCatalog = createSimple("object_catalog", Object.class);

    public final SimplePath<Object> objectName = createSimple("object_name", Object.class);

    public final SimplePath<Object> objectSchema = createSimple("object_schema", Object.class);

    public final SimplePath<Object> objectType = createSimple("object_type", Object.class);

    public final SimplePath<Object> privilegeType = createSimple("privilege_type", Object.class);

    public QUsagePrivileges(String variable) {
        super(QUsagePrivileges.class, forVariable(variable), "information_schema", "usage_privileges");
    }

    @SuppressWarnings("all")
    public QUsagePrivileges(Path<? extends QUsagePrivileges> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "usage_privileges");
    }

    public QUsagePrivileges(PathMetadata<?> metadata) {
        super(QUsagePrivileges.class, metadata, "information_schema", "usage_privileges");
    }

}

