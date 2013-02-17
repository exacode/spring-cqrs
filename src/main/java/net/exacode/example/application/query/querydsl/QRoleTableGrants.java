package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QRoleTableGrants is a Querydsl query type for QRoleTableGrants
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QRoleTableGrants extends com.mysema.query.sql.RelationalPathBase<QRoleTableGrants> {

    private static final long serialVersionUID = -1945965781;

    public static final QRoleTableGrants roleTableGrants = new QRoleTableGrants("role_table_grants");

    public final SimplePath<Object> grantee = createSimple("grantee", Object.class);

    public final SimplePath<Object> grantor = createSimple("grantor", Object.class);

    public final SimplePath<Object> isGrantable = createSimple("is_grantable", Object.class);

    public final SimplePath<Object> privilegeType = createSimple("privilege_type", Object.class);

    public final SimplePath<Object> tableCatalog = createSimple("table_catalog", Object.class);

    public final SimplePath<Object> tableName = createSimple("table_name", Object.class);

    public final SimplePath<Object> tableSchema = createSimple("table_schema", Object.class);

    public final SimplePath<Object> withHierarchy = createSimple("with_hierarchy", Object.class);

    public QRoleTableGrants(String variable) {
        super(QRoleTableGrants.class, forVariable(variable), "information_schema", "role_table_grants");
    }

    @SuppressWarnings("all")
    public QRoleTableGrants(Path<? extends QRoleTableGrants> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "role_table_grants");
    }

    public QRoleTableGrants(PathMetadata<?> metadata) {
        super(QRoleTableGrants.class, metadata, "information_schema", "role_table_grants");
    }

}

