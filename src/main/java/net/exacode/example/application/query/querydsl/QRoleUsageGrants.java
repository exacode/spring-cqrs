package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QRoleUsageGrants is a Querydsl query type for QRoleUsageGrants
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QRoleUsageGrants extends com.mysema.query.sql.RelationalPathBase<QRoleUsageGrants> {

    private static final long serialVersionUID = -1301855554;

    public static final QRoleUsageGrants roleUsageGrants = new QRoleUsageGrants("role_usage_grants");

    public final SimplePath<Object> grantee = createSimple("grantee", Object.class);

    public final SimplePath<Object> grantor = createSimple("grantor", Object.class);

    public final SimplePath<Object> isGrantable = createSimple("is_grantable", Object.class);

    public final SimplePath<Object> objectCatalog = createSimple("object_catalog", Object.class);

    public final SimplePath<Object> objectName = createSimple("object_name", Object.class);

    public final SimplePath<Object> objectSchema = createSimple("object_schema", Object.class);

    public final SimplePath<Object> objectType = createSimple("object_type", Object.class);

    public final SimplePath<Object> privilegeType = createSimple("privilege_type", Object.class);

    public QRoleUsageGrants(String variable) {
        super(QRoleUsageGrants.class, forVariable(variable), "information_schema", "role_usage_grants");
    }

    @SuppressWarnings("all")
    public QRoleUsageGrants(Path<? extends QRoleUsageGrants> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "role_usage_grants");
    }

    public QRoleUsageGrants(PathMetadata<?> metadata) {
        super(QRoleUsageGrants.class, metadata, "information_schema", "role_usage_grants");
    }

}

